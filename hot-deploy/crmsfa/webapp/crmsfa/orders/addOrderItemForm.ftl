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

<#if shoppingCart.size() != 0>
  <#if hasParty>
    <#assign quoteLink = "<a class='subMenuButton' href='createQuoteFromCart'>${uiLabelMap.CrmSaveAsQuote}</a>" />
    <#assign finalizeLink = "<a class='subMenuButton' href='finalizeOrder?finalizeMode=init'>${uiLabelMap.OpentapsFinalizeOrder}</a>" />
  </#if>
  <#assign newCustomerLink = "<a class='subMenuButton' href='createOrderPartyForm'>${uiLabelMap.CrmCreateNewCustomer}</a>" />
</#if>

<div id="sectionHeaderTitle_orders" class="sectionHeader sectionHeaderTitle">
  <span style="float:left;">${uiLabelMap.OrderOrders}</span>
  <div class="subMenuBar" style="float:right; margin:0.4em">${newCustomerLink?if_exists}${quoteLink?if_exists}${finalizeLink?if_exists}</div>
</div>

<div class="subSectionHeader">
  <div class="subSectionTitle">${uiLabelMap.OrderCreateOrder}</div>
  <div class="subMenuBar"><a class="toggleButton" href="createOrderMainScreen?&amp;useGwt=Y">${uiLabelMap.OpentapsGridView}</a><span class="toggleButtonDisabled">${uiLabelMap.OpentapsFullView}</span></div>
</div>

<form name="addOrderItemForm" method="POST" action="<@ofbizUrl>addOrderItem</@ofbizUrl>" onsubmit="return addOrderItemFormSubmitHandler(document.addOrderItemForm.productId)">

  <table class="fourColumnForm">
    <tr>
      <@displayTitleCell title=uiLabelMap.ProductProductId titleClass="requiredField"/>
      <@inputAutoCompleteProductCell name="productId" errorField="productId" tabIndex="1" />
      <td rowspan="4" valign="top">
        <table>
          <#if tagTypes?has_content>
            <@accountingTagsSelectRows tags=tagTypes tabIndex=7 />
          </#if>
        </table>
      </td>
    </tr>
    <@inputTextRow title=uiLabelMap.CommonQuantity titleClass="requiredField" name="quantity" size=10 default="1" errorField="quantity" tabIndex=2 />
    <@inputDateRow title=uiLabelMap.OrderShipBeforeDate name="shipBeforeDate" errorField="shipBeforeDate" tabIndex=3 calendarTabIndex=4/>
    <@inputTextareaRow title=uiLabelMap.CommonComment name="comments" cols=40 tabIndex=5 />
    <@inputSubmitRow title=uiLabelMap.OrderAddToOrder tabIndex=100 />
  </table>

</form>


<script type="text/javascript">

    // check if product to add has warning and if it has asks user for confirmation
    addOrderItemFormSubmitHandler = function(productIdElement) {
        if ((productIdElement) && (productIdElement.value != "")) {
            productId = productIdElement.value;
            // use AJAX request to get the data
            opentaps.sendRequest(
                        "getProductWarningsDataJSON",
                        {"productId" : productId},
                        function(data) {getProductWarningsDataJSONResponse(productIdElement, data)}
                        );
            return false;
        } else {
            // let the server handle errors
            return true;        
        }
    }

    // from the AJAX response, alert user if product has warning and then submits addOrderItemForm upon confirmation
    getProductWarningsDataJSONResponse = function(productIdElement, warnings) {
        if (warnings.length == 0) {
            document.addOrderItemForm.submit();
        } else {
            warningMessages = '${uiLabelMap.CrmProductWarningConfirmMessage}' + '\n';
            for (i=0; i<warnings.length; i++) {
              idx = i + 1;
              warningMessages = warningMessages +'(' + idx + ')' + ' ' + warnings[i] + '\n';
            }
            opentaps.confirmAction(warningMessages, '', 'addOrderItemForm');
        }       
    }

</script>
