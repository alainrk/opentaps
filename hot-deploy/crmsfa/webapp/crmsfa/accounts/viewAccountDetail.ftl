<#--
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the Honest Public License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Honest Public License for more details.
 *
 * You should have received a copy of the Honest Public License
 * along with this program; if not, write to Funambol,
 * 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
-->

<@import location="component://opentaps-common/webapp/common/includes/lib/opentapsFormMacros.ftl"/>

<#if hasUpdatePermission?exists>
  <#assign updateLink><a class='subMenuButton' href='updateAccountForm?partyId=${partySummary.partyId}'>${uiLabelMap.CommonEdit}</a></#assign>
</#if>

<div class="subSectionBlock">

<div class="subSectionHeader">
    <div class="subSectionTitle">${uiLabelMap.CrmAccount}
        <#if accountDeactivated?exists><span class="subSectionWarning">${uiLabelMap.CrmAccountDeactivated} ${getLocalizedDate(accountDeactivatedDate, "DATE_TIME")}</span></#if>
    </div>
    <div class="subMenuBar">${updateLink?if_exists}<#if hasDeactivatePermission?exists><@inputConfirm class="subMenuButtonDangerous" href="deactivateAccount?partyId=${partySummary.partyId}" title=uiLabelMap.CrmDeactivateAccount /></#if></div>
</div>

<table class="fourColumnForm">
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmAccountName titleClass="requiredField" />
    <@displayCell text=partySummary.groupName />
    <@displayTitleCell title=uiLabelMap.CrmParentParty />
    <#if parentParty?has_content>
      <@displayLinkCell href="viewAccount?partyId=${parentParty.partyId}" text="${parentParty.groupName} (${parentParty.partyId})" blockClass="fieldWidth50pct"/>
    </#if> 
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmLocalName />
    <@displayCell text=partySummary.groupNameLocal />
    <@displayTitleCell title=uiLabelMap.CrmSiteName />
    <@displayCell text=partySummary.officeSiteName />
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmAnnualRevenue />
    <td><#if partySummary.annualRevenue?exists>
      <#-- using ..Cell gives a right alignment to the content that we do not want here -->
      <@displayCurrency amount=partySummary.annualRevenue currencyUomId=partySummary.currencyUomId />
    </#if></td>
    <@displayTitleCell title=uiLabelMap.CrmPreferredCurrency />
    <@displayCell text=partySummary.currencyUomId />
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmIndustry />
    <@displayEnumerationCell enumId=partySummary.industryEnumId />
    <@displayTitleCell title=uiLabelMap.CrmNumberOfEmployees />
    <@displayCell text=partySummary.numberEmployees />
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmOwnership />
    <@displayEnumerationCell enumId=partySummary.ownershipEnumId />
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmSICCode />
    <@displayCell text=partySummary.sicCode />
    <@displayTitleCell title=uiLabelMap.CrmTickerSymbol />
    <@displayCell text=partySummary.tickerSymbol />
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CommonDescription />
    <td colspan="3" class="tabletext">${partySummary.description?if_exists}</td>
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmImportantNote />
    <td colspan="3" class="tabletext">${partySummary.importantNote?if_exists}</td>
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.PartyClassifications />
    <@displayCell text=partyClassificationGroupsDisplay />
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmDataSources />
    <@displayCell text=dataSourcesAsString />
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmMarketingCampaigns />
    <@displayCell text=marketingCampaignsAsString />
  </tr>
  <tr>
    <@displayTitleCell title=uiLabelMap.CrmPersonResponsibleFor titleClass="requiredField" />
    <#assign responsibleForName><#if responsibleParty?exists>${responsibleParty.firstName?if_exists} ${responsibleParty.lastName?if_exists}<#else>${uiLabelMap.CommonNone}</#if></#assign>
    <td>
      <@display text=responsibleForName />
      <#if hasReassignPermission?default(false)>
        <@flexAreaHeader targetId="ReassignArea" title=uiLabelMap.CrmReassign controlClassOpen="flexAreaControlSimple_open" controlClassClosed="flexAreaControlSimple_closed" />
      </#if>
    </td>
  </tr>
  <#if hasReassignPermission?default(false)>
  <tr>
    <td/>
    <td colspan="2">
      <@flexAreaBody targetId="ReassignArea" style="border:0;margin:0;padding-left:0">
        <form method="post" action="<@ofbizUrl>reassignAccountResponsibleParty?partyId=${partySummary.partyId}</@ofbizUrl>" name="reassign">
          <@inputHidden name="accountPartyId" value="${partySummary.partyId}" />
          <@inputLookup name="newPartyId" lookup="LookupTeamMembers" form="reassign" />
          <@inputSubmit title=uiLabelMap.CrmReassign />
        </form>
      </@flexAreaBody>
    </td>
  </tr>
  </#if>

  <tr>
    <@displayTitleCell title=uiLabelMap.CrmSalesPerYear />
    <td colspan="3" class="tabletext">
      <table>
         <tr>
           <#list salesYear?default([]) as year>
           <td>${uiLabelMap.CrmSales} ${year}</td>
           </#list>
         </tr>
         <tr>
           <#list salesList?default([]) as sales>
           <td><@ofbizCurrency amount=sales.grandTotal?default(0) isoCode=partySummary.currencyUomId/></td>
           </#list>
         </tr>
       </table>
   </td>
  </tr>
  <tr>
   <#assign paymentsReceivedTitle = uiLabelMap.CrmPaymentsReceivedYear + " " + paymentReceivedYear?default("") />
   <@displayTitleCell title=paymentsReceivedTitle />
   <td><@displayCurrency amount=paymentReceived?default({}).amount?default(0) currencyUomId=partySummary.currencyUomId /></td>
  </tr>

</table>

</div>
