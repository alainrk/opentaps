package org.opentaps.domain.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity AcctgTransAndEntries.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectAcctgTransAndEntriess", query="SELECT ATR.IS_POSTED AS \"isPosted\",ATR.GL_FISCAL_TYPE_ID AS \"glFiscalTypeId\",ATR.ACCTG_TRANS_TYPE_ID AS \"acctgTransTypeId\",ATR.TRANSACTION_DATE AS \"transactionDate\",ATR.DESCRIPTION AS \"description\",ATT.DESCRIPTION AS \"description\",ATR.INVOICE_ID AS \"invoiceId\",ATR.PAYMENT_ID AS \"paymentId\",ATR.SHIPMENT_ID AS \"shipmentId\",ATR.RECEIPT_ID AS \"receiptId\",ATR.INVENTORY_ITEM_ID AS \"inventoryItemId\",ATR.WORK_EFFORT_ID AS \"workEffortId\",ATR.PHYSICAL_INVENTORY_ID AS \"physicalInventoryId\",ATE.ACCTG_TRANS_ID AS \"acctgTransId\",ATE.ACCTG_TRANS_ENTRY_SEQ_ID AS \"acctgTransEntrySeqId\",ATE.GL_ACCOUNT_ID AS \"glAccountId\",ATE.PRODUCT_ID AS \"productId\",ATE.DEBIT_CREDIT_FLAG AS \"debitCreditFlag\",ATE.AMOUNT AS \"amount\",ATE.CURRENCY_UOM_ID AS \"currencyUomId\",ATE.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",GLA.GL_ACCOUNT_TYPE_ID AS \"glAccountTypeId\",GLA.ACCOUNT_CODE AS \"accountCode\",GLA.ACCOUNT_NAME AS \"accountName\",GLAC.GL_ACCOUNT_CLASS_ID AS \"glAccountClassId\",ATE.PARTY_ID AS \"partyId\",ATE.RECONCILE_STATUS_ID AS \"reconcileStatusId\",ATE.ACCTG_TRANS_ENTRY_TYPE_ID AS \"acctgTransEntryTypeId\",ATE.ACCTG_TAG_ENUM_ID1 AS \"acctgTagEnumId1\",ATE.ACCTG_TAG_ENUM_ID2 AS \"acctgTagEnumId2\",ATE.ACCTG_TAG_ENUM_ID3 AS \"acctgTagEnumId3\",ATE.ACCTG_TAG_ENUM_ID4 AS \"acctgTagEnumId4\",ATE.ACCTG_TAG_ENUM_ID5 AS \"acctgTagEnumId5\",ATE.ACCTG_TAG_ENUM_ID6 AS \"acctgTagEnumId6\",ATE.ACCTG_TAG_ENUM_ID7 AS \"acctgTagEnumId7\",ATE.ACCTG_TAG_ENUM_ID8 AS \"acctgTagEnumId8\",ATE.ACCTG_TAG_ENUM_ID9 AS \"acctgTagEnumId9\",ATE.ACCTG_TAG_ENUM_ID10 AS \"acctgTagEnumId10\" FROM ACCTG_TRANS ATR INNER JOIN ACCTG_TRANS_TYPE ATT ON ATR.ACCTG_TRANS_TYPE_ID = ATT.ACCTG_TRANS_TYPE_ID INNER JOIN ACCTG_TRANS_ENTRY ATE ON ATR.ACCTG_TRANS_ID = ATE.ACCTG_TRANS_ID INNER JOIN GL_ACCOUNT GLA ON ATE.GL_ACCOUNT_ID = GLA.GL_ACCOUNT_ID INNER JOIN GL_ACCOUNT_CLASS GLAC ON GLA.GL_ACCOUNT_CLASS_ID = GLAC.GL_ACCOUNT_CLASS_ID", resultSetMapping="AcctgTransAndEntriesMapping")
@SqlResultSetMapping(name="AcctgTransAndEntriesMapping", entities={
@EntityResult(entityClass=AcctgTransAndEntries.class, fields = {
@FieldResult(name="isPosted", column="isPosted")
,@FieldResult(name="glFiscalTypeId", column="glFiscalTypeId")
,@FieldResult(name="acctgTransTypeId", column="acctgTransTypeId")
,@FieldResult(name="transactionDate", column="transactionDate")
,@FieldResult(name="transDescription", column="transDescription")
,@FieldResult(name="transTypeDescription", column="transTypeDescription")
,@FieldResult(name="invoiceId", column="invoiceId")
,@FieldResult(name="paymentId", column="paymentId")
,@FieldResult(name="shipmentId", column="shipmentId")
,@FieldResult(name="receiptId", column="receiptId")
,@FieldResult(name="inventoryItemId", column="inventoryItemId")
,@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="physicalInventoryId", column="physicalInventoryId")
,@FieldResult(name="acctgTransId", column="acctgTransId")
,@FieldResult(name="acctgTransEntrySeqId", column="acctgTransEntrySeqId")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="debitCreditFlag", column="debitCreditFlag")
,@FieldResult(name="amount", column="amount")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="glAccountTypeId", column="glAccountTypeId")
,@FieldResult(name="accountCode", column="accountCode")
,@FieldResult(name="accountName", column="accountName")
,@FieldResult(name="glAccountClassId", column="glAccountClassId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="reconcileStatusId", column="reconcileStatusId")
,@FieldResult(name="acctgTransEntryTypeId", column="acctgTransEntryTypeId")
,@FieldResult(name="acctgTagEnumId1", column="acctgTagEnumId1")
,@FieldResult(name="acctgTagEnumId2", column="acctgTagEnumId2")
,@FieldResult(name="acctgTagEnumId3", column="acctgTagEnumId3")
,@FieldResult(name="acctgTagEnumId4", column="acctgTagEnumId4")
,@FieldResult(name="acctgTagEnumId5", column="acctgTagEnumId5")
,@FieldResult(name="acctgTagEnumId6", column="acctgTagEnumId6")
,@FieldResult(name="acctgTagEnumId7", column="acctgTagEnumId7")
,@FieldResult(name="acctgTagEnumId8", column="acctgTagEnumId8")
,@FieldResult(name="acctgTagEnumId9", column="acctgTagEnumId9")
,@FieldResult(name="acctgTagEnumId10", column="acctgTagEnumId10")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class AcctgTransAndEntries extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("isPosted", "ATR.IS_POSTED");
        fields.put("glFiscalTypeId", "ATR.GL_FISCAL_TYPE_ID");
        fields.put("acctgTransTypeId", "ATR.ACCTG_TRANS_TYPE_ID");
        fields.put("transactionDate", "ATR.TRANSACTION_DATE");
        fields.put("transDescription", "ATR.DESCRIPTION");
        fields.put("transTypeDescription", "ATT.DESCRIPTION");
        fields.put("invoiceId", "ATR.INVOICE_ID");
        fields.put("paymentId", "ATR.PAYMENT_ID");
        fields.put("shipmentId", "ATR.SHIPMENT_ID");
        fields.put("receiptId", "ATR.RECEIPT_ID");
        fields.put("inventoryItemId", "ATR.INVENTORY_ITEM_ID");
        fields.put("workEffortId", "ATR.WORK_EFFORT_ID");
        fields.put("physicalInventoryId", "ATR.PHYSICAL_INVENTORY_ID");
        fields.put("acctgTransId", "ATE.ACCTG_TRANS_ID");
        fields.put("acctgTransEntrySeqId", "ATE.ACCTG_TRANS_ENTRY_SEQ_ID");
        fields.put("glAccountId", "ATE.GL_ACCOUNT_ID");
        fields.put("productId", "ATE.PRODUCT_ID");
        fields.put("debitCreditFlag", "ATE.DEBIT_CREDIT_FLAG");
        fields.put("amount", "ATE.AMOUNT");
        fields.put("currencyUomId", "ATE.CURRENCY_UOM_ID");
        fields.put("organizationPartyId", "ATE.ORGANIZATION_PARTY_ID");
        fields.put("glAccountTypeId", "GLA.GL_ACCOUNT_TYPE_ID");
        fields.put("accountCode", "GLA.ACCOUNT_CODE");
        fields.put("accountName", "GLA.ACCOUNT_NAME");
        fields.put("glAccountClassId", "GLAC.GL_ACCOUNT_CLASS_ID");
        fields.put("partyId", "ATE.PARTY_ID");
        fields.put("reconcileStatusId", "ATE.RECONCILE_STATUS_ID");
        fields.put("acctgTransEntryTypeId", "ATE.ACCTG_TRANS_ENTRY_TYPE_ID");
        fields.put("acctgTagEnumId1", "ATE.ACCTG_TAG_ENUM_ID1");
        fields.put("acctgTagEnumId2", "ATE.ACCTG_TAG_ENUM_ID2");
        fields.put("acctgTagEnumId3", "ATE.ACCTG_TAG_ENUM_ID3");
        fields.put("acctgTagEnumId4", "ATE.ACCTG_TAG_ENUM_ID4");
        fields.put("acctgTagEnumId5", "ATE.ACCTG_TAG_ENUM_ID5");
        fields.put("acctgTagEnumId6", "ATE.ACCTG_TAG_ENUM_ID6");
        fields.put("acctgTagEnumId7", "ATE.ACCTG_TAG_ENUM_ID7");
        fields.put("acctgTagEnumId8", "ATE.ACCTG_TAG_ENUM_ID8");
        fields.put("acctgTagEnumId9", "ATE.ACCTG_TAG_ENUM_ID9");
        fields.put("acctgTagEnumId10", "ATE.ACCTG_TAG_ENUM_ID10");
fieldMapColumns.put("AcctgTransAndEntries", fields);
}
  public static enum Fields implements EntityFieldInterface<AcctgTransAndEntries> {
    isPosted("isPosted"),
    glFiscalTypeId("glFiscalTypeId"),
    acctgTransTypeId("acctgTransTypeId"),
    transactionDate("transactionDate"),
    transDescription("transDescription"),
    transTypeDescription("transTypeDescription"),
    invoiceId("invoiceId"),
    paymentId("paymentId"),
    shipmentId("shipmentId"),
    receiptId("receiptId"),
    inventoryItemId("inventoryItemId"),
    workEffortId("workEffortId"),
    physicalInventoryId("physicalInventoryId"),
    acctgTransId("acctgTransId"),
    acctgTransEntrySeqId("acctgTransEntrySeqId"),
    glAccountId("glAccountId"),
    productId("productId"),
    debitCreditFlag("debitCreditFlag"),
    amount("amount"),
    currencyUomId("currencyUomId"),
    organizationPartyId("organizationPartyId"),
    glAccountTypeId("glAccountTypeId"),
    accountCode("accountCode"),
    accountName("accountName"),
    glAccountClassId("glAccountClassId"),
    partyId("partyId"),
    reconcileStatusId("reconcileStatusId"),
    acctgTransEntryTypeId("acctgTransEntryTypeId"),
    acctgTagEnumId1("acctgTagEnumId1"),
    acctgTagEnumId2("acctgTagEnumId2"),
    acctgTagEnumId3("acctgTagEnumId3"),
    acctgTagEnumId4("acctgTagEnumId4"),
    acctgTagEnumId5("acctgTagEnumId5"),
    acctgTagEnumId6("acctgTagEnumId6"),
    acctgTagEnumId7("acctgTagEnumId7"),
    acctgTagEnumId8("acctgTagEnumId8"),
    acctgTagEnumId9("acctgTagEnumId9"),
    acctgTagEnumId10("acctgTagEnumId10");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String isPosted;
    
   private String glFiscalTypeId;
    
   private String acctgTransTypeId;
    
   private Timestamp transactionDate;
    
   private String transDescription;
    
   private String transTypeDescription;
    
   private String invoiceId;
    
   private String paymentId;
    
   private String shipmentId;
    
   private String receiptId;
    
   private String inventoryItemId;
    
   private String workEffortId;
    
   private String physicalInventoryId;
    @Id
   private String acctgTransId;
    
   private String acctgTransEntrySeqId;
    
   private String glAccountId;
    
   private String productId;
    
   private String debitCreditFlag;
    
   private BigDecimal amount;
    
   private String currencyUomId;
    
   private String organizationPartyId;
    
   private String glAccountTypeId;
    
   private String accountCode;
    
   private String accountName;
    
   private String glAccountClassId;
    
   private String partyId;
    
   private String reconcileStatusId;
    
   private String acctgTransEntryTypeId;
    
   private String acctgTagEnumId1;
    
   private String acctgTagEnumId2;
    
   private String acctgTagEnumId3;
    
   private String acctgTagEnumId4;
    
   private String acctgTagEnumId5;
    
   private String acctgTagEnumId6;
    
   private String acctgTagEnumId7;
    
   private String acctgTagEnumId8;
    
   private String acctgTagEnumId9;
    
   private String acctgTagEnumId10;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount glAccount = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_CLASS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccountClass glAccountClass = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ACCTG_TRANS_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private AcctgTransType acctgTransType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Invoice invoice = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Payment payment = null;

  /**
   * Default constructor.
   */
  public AcctgTransAndEntries() {
      super();
      this.baseEntityName = "AcctgTransAndEntries";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("acctgTransId");this.primaryKeyNames.add("acctgTransEntrySeqId");this.primaryKeyNames.add("glAccountClassId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("isPosted");this.allFieldsNames.add("glFiscalTypeId");this.allFieldsNames.add("acctgTransTypeId");this.allFieldsNames.add("transactionDate");this.allFieldsNames.add("transDescription");this.allFieldsNames.add("transTypeDescription");this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("paymentId");this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("receiptId");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("physicalInventoryId");this.allFieldsNames.add("acctgTransId");this.allFieldsNames.add("acctgTransEntrySeqId");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("productId");this.allFieldsNames.add("debitCreditFlag");this.allFieldsNames.add("amount");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("glAccountTypeId");this.allFieldsNames.add("accountCode");this.allFieldsNames.add("accountName");this.allFieldsNames.add("glAccountClassId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("reconcileStatusId");this.allFieldsNames.add("acctgTransEntryTypeId");this.allFieldsNames.add("acctgTagEnumId1");this.allFieldsNames.add("acctgTagEnumId2");this.allFieldsNames.add("acctgTagEnumId3");this.allFieldsNames.add("acctgTagEnumId4");this.allFieldsNames.add("acctgTagEnumId5");this.allFieldsNames.add("acctgTagEnumId6");this.allFieldsNames.add("acctgTagEnumId7");this.allFieldsNames.add("acctgTagEnumId8");this.allFieldsNames.add("acctgTagEnumId9");this.allFieldsNames.add("acctgTagEnumId10");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AcctgTransAndEntries(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param isPosted the isPosted to set
     */
    public void setIsPosted(String isPosted) {
        this.isPosted = isPosted;
    }
    /**
     * Auto generated value setter.
     * @param glFiscalTypeId the glFiscalTypeId to set
     */
    public void setGlFiscalTypeId(String glFiscalTypeId) {
        this.glFiscalTypeId = glFiscalTypeId;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransTypeId the acctgTransTypeId to set
     */
    public void setAcctgTransTypeId(String acctgTransTypeId) {
        this.acctgTransTypeId = acctgTransTypeId;
    }
    /**
     * Auto generated value setter.
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }
    /**
     * Auto generated value setter.
     * @param transDescription the transDescription to set
     */
    public void setTransDescription(String transDescription) {
        this.transDescription = transDescription;
    }
    /**
     * Auto generated value setter.
     * @param transTypeDescription the transTypeDescription to set
     */
    public void setTransTypeDescription(String transTypeDescription) {
        this.transTypeDescription = transTypeDescription;
    }
    /**
     * Auto generated value setter.
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    /**
     * Auto generated value setter.
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentId the shipmentId to set
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    /**
     * Auto generated value setter.
     * @param receiptId the receiptId to set
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
    /**
     * Auto generated value setter.
     * @param physicalInventoryId the physicalInventoryId to set
     */
    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransId the acctgTransId to set
     */
    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransEntrySeqId the acctgTransEntrySeqId to set
     */
    public void setAcctgTransEntrySeqId(String acctgTransEntrySeqId) {
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
    }
    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param debitCreditFlag the debitCreditFlag to set
     */
    public void setDebitCreditFlag(String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }
    /**
     * Auto generated value setter.
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param glAccountTypeId the glAccountTypeId to set
     */
    public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }
    /**
     * Auto generated value setter.
     * @param accountCode the accountCode to set
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
    /**
     * Auto generated value setter.
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    /**
     * Auto generated value setter.
     * @param glAccountClassId the glAccountClassId to set
     */
    public void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param reconcileStatusId the reconcileStatusId to set
     */
    public void setReconcileStatusId(String reconcileStatusId) {
        this.reconcileStatusId = reconcileStatusId;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransEntryTypeId the acctgTransEntryTypeId to set
     */
    public void setAcctgTransEntryTypeId(String acctgTransEntryTypeId) {
        this.acctgTransEntryTypeId = acctgTransEntryTypeId;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId1 the acctgTagEnumId1 to set
     */
    public void setAcctgTagEnumId1(String acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId2 the acctgTagEnumId2 to set
     */
    public void setAcctgTagEnumId2(String acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId3 the acctgTagEnumId3 to set
     */
    public void setAcctgTagEnumId3(String acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId4 the acctgTagEnumId4 to set
     */
    public void setAcctgTagEnumId4(String acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId5 the acctgTagEnumId5 to set
     */
    public void setAcctgTagEnumId5(String acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId6 the acctgTagEnumId6 to set
     */
    public void setAcctgTagEnumId6(String acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId7 the acctgTagEnumId7 to set
     */
    public void setAcctgTagEnumId7(String acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId8 the acctgTagEnumId8 to set
     */
    public void setAcctgTagEnumId8(String acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId9 the acctgTagEnumId9 to set
     */
    public void setAcctgTagEnumId9(String acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId10 the acctgTagEnumId10 to set
     */
    public void setAcctgTagEnumId10(String acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsPosted() {
        return this.isPosted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlFiscalTypeId() {
        return this.glFiscalTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransTypeId() {
        return this.acctgTransTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTransactionDate() {
        return this.transactionDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTransDescription() {
        return this.transDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTransTypeDescription() {
        return this.transTypeDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceId() {
        return this.invoiceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentId() {
        return this.paymentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentId() {
        return this.shipmentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReceiptId() {
        return this.receiptId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPhysicalInventoryId() {
        return this.physicalInventoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransId() {
        return this.acctgTransId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransEntrySeqId() {
        return this.acctgTransEntrySeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountId() {
        return this.glAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDebitCreditFlag() {
        return this.debitCreditFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountTypeId() {
        return this.glAccountTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountCode() {
        return this.accountCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountClassId() {
        return this.glAccountClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReconcileStatusId() {
        return this.reconcileStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransEntryTypeId() {
        return this.acctgTransEntryTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId1() {
        return this.acctgTagEnumId1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId2() {
        return this.acctgTagEnumId2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId3() {
        return this.acctgTagEnumId3;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId4() {
        return this.acctgTagEnumId4;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId5() {
        return this.acctgTagEnumId5;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId6() {
        return this.acctgTagEnumId6;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId7() {
        return this.acctgTagEnumId7;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId8() {
        return this.acctgTagEnumId8;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId9() {
        return this.acctgTagEnumId9;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId10() {
        return this.acctgTagEnumId10;
    }

    /**
     * Auto generated method that gets the related <code>GlAccount</code> by the relation named <code>GlAccount</code>.
     * @return the <code>GlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccount getGlAccount() throws RepositoryException {
        if (this.glAccount == null) {
            this.glAccount = getRelatedOne(GlAccount.class, "GlAccount");
        }
        return this.glAccount;
    }
    /**
     * Auto generated method that gets the related <code>GlAccountClass</code> by the relation named <code>GlAccountClass</code>.
     * @return the <code>GlAccountClass</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccountClass getGlAccountClass() throws RepositoryException {
        if (this.glAccountClass == null) {
            this.glAccountClass = getRelatedOne(GlAccountClass.class, "GlAccountClass");
        }
        return this.glAccountClass;
    }
    /**
     * Auto generated method that gets the related <code>AcctgTransType</code> by the relation named <code>AcctgTransType</code>.
     * @return the <code>AcctgTransType</code>
     * @throws RepositoryException if an error occurs
     */
    public AcctgTransType getAcctgTransType() throws RepositoryException {
        if (this.acctgTransType == null) {
            this.acctgTransType = getRelatedOne(AcctgTransType.class, "AcctgTransType");
        }
        return this.acctgTransType;
    }
    /**
     * Auto generated method that gets the related <code>Invoice</code> by the relation named <code>Invoice</code>.
     * @return the <code>Invoice</code>
     * @throws RepositoryException if an error occurs
     */
    public Invoice getInvoice() throws RepositoryException {
        if (this.invoice == null) {
            this.invoice = getRelatedOne(Invoice.class, "Invoice");
        }
        return this.invoice;
    }
    /**
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>Payment</code>.
     * @return the <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public Payment getPayment() throws RepositoryException {
        if (this.payment == null) {
            this.payment = getRelatedOne(Payment.class, "Payment");
        }
        return this.payment;
    }

    /**
     * Auto generated value setter.
     * @param glAccount the glAccount to set
    */
    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
    }
    /**
     * Auto generated value setter.
     * @param glAccountClass the glAccountClass to set
    */
    public void setGlAccountClass(GlAccountClass glAccountClass) {
        this.glAccountClass = glAccountClass;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransType the acctgTransType to set
    */
    public void setAcctgTransType(AcctgTransType acctgTransType) {
        this.acctgTransType = acctgTransType;
    }
    /**
     * Auto generated value setter.
     * @param invoice the invoice to set
    */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    /**
     * Auto generated value setter.
     * @param payment the payment to set
    */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setIsPosted((String) mapValue.get("isPosted"));
        setGlFiscalTypeId((String) mapValue.get("glFiscalTypeId"));
        setAcctgTransTypeId((String) mapValue.get("acctgTransTypeId"));
        setTransactionDate((Timestamp) mapValue.get("transactionDate"));
        setTransDescription((String) mapValue.get("transDescription"));
        setTransTypeDescription((String) mapValue.get("transTypeDescription"));
        setInvoiceId((String) mapValue.get("invoiceId"));
        setPaymentId((String) mapValue.get("paymentId"));
        setShipmentId((String) mapValue.get("shipmentId"));
        setReceiptId((String) mapValue.get("receiptId"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setPhysicalInventoryId((String) mapValue.get("physicalInventoryId"));
        setAcctgTransId((String) mapValue.get("acctgTransId"));
        setAcctgTransEntrySeqId((String) mapValue.get("acctgTransEntrySeqId"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setProductId((String) mapValue.get("productId"));
        setDebitCreditFlag((String) mapValue.get("debitCreditFlag"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setGlAccountTypeId((String) mapValue.get("glAccountTypeId"));
        setAccountCode((String) mapValue.get("accountCode"));
        setAccountName((String) mapValue.get("accountName"));
        setGlAccountClassId((String) mapValue.get("glAccountClassId"));
        setPartyId((String) mapValue.get("partyId"));
        setReconcileStatusId((String) mapValue.get("reconcileStatusId"));
        setAcctgTransEntryTypeId((String) mapValue.get("acctgTransEntryTypeId"));
        setAcctgTagEnumId1((String) mapValue.get("acctgTagEnumId1"));
        setAcctgTagEnumId2((String) mapValue.get("acctgTagEnumId2"));
        setAcctgTagEnumId3((String) mapValue.get("acctgTagEnumId3"));
        setAcctgTagEnumId4((String) mapValue.get("acctgTagEnumId4"));
        setAcctgTagEnumId5((String) mapValue.get("acctgTagEnumId5"));
        setAcctgTagEnumId6((String) mapValue.get("acctgTagEnumId6"));
        setAcctgTagEnumId7((String) mapValue.get("acctgTagEnumId7"));
        setAcctgTagEnumId8((String) mapValue.get("acctgTagEnumId8"));
        setAcctgTagEnumId9((String) mapValue.get("acctgTagEnumId9"));
        setAcctgTagEnumId10((String) mapValue.get("acctgTagEnumId10"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("isPosted", getIsPosted());
        mapValue.put("glFiscalTypeId", getGlFiscalTypeId());
        mapValue.put("acctgTransTypeId", getAcctgTransTypeId());
        mapValue.put("transactionDate", getTransactionDate());
        mapValue.put("transDescription", getTransDescription());
        mapValue.put("transTypeDescription", getTransTypeDescription());
        mapValue.put("invoiceId", getInvoiceId());
        mapValue.put("paymentId", getPaymentId());
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("receiptId", getReceiptId());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("physicalInventoryId", getPhysicalInventoryId());
        mapValue.put("acctgTransId", getAcctgTransId());
        mapValue.put("acctgTransEntrySeqId", getAcctgTransEntrySeqId());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("productId", getProductId());
        mapValue.put("debitCreditFlag", getDebitCreditFlag());
        mapValue.put("amount", getAmount());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("glAccountTypeId", getGlAccountTypeId());
        mapValue.put("accountCode", getAccountCode());
        mapValue.put("accountName", getAccountName());
        mapValue.put("glAccountClassId", getGlAccountClassId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("reconcileStatusId", getReconcileStatusId());
        mapValue.put("acctgTransEntryTypeId", getAcctgTransEntryTypeId());
        mapValue.put("acctgTagEnumId1", getAcctgTagEnumId1());
        mapValue.put("acctgTagEnumId2", getAcctgTagEnumId2());
        mapValue.put("acctgTagEnumId3", getAcctgTagEnumId3());
        mapValue.put("acctgTagEnumId4", getAcctgTagEnumId4());
        mapValue.put("acctgTagEnumId5", getAcctgTagEnumId5());
        mapValue.put("acctgTagEnumId6", getAcctgTagEnumId6());
        mapValue.put("acctgTagEnumId7", getAcctgTagEnumId7());
        mapValue.put("acctgTagEnumId8", getAcctgTagEnumId8());
        mapValue.put("acctgTagEnumId9", getAcctgTagEnumId9());
        mapValue.put("acctgTagEnumId10", getAcctgTagEnumId10());
        return mapValue;
    }


}
