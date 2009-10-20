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
 * Auto generated base entity OrderItemBilling.
 */
@javax.persistence.Entity
@Table(name="ORDER_ITEM_BILLING")
public class OrderItemBilling extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("invoiceId", "INVOICE_ID");
        fields.put("invoiceItemSeqId", "INVOICE_ITEM_SEQ_ID");
        fields.put("itemIssuanceId", "ITEM_ISSUANCE_ID");
        fields.put("shipmentReceiptId", "SHIPMENT_RECEIPT_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("amount", "AMOUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderItemBilling", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderItemBilling> {
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    invoiceId("invoiceId"),
    invoiceItemSeqId("invoiceItemSeqId"),
    itemIssuanceId("itemIssuanceId"),
    shipmentReceiptId("shipmentReceiptId"),
    quantity("quantity"),
    amount("amount"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.OrderItemBillingPkBridge.class)
     private OrderItemBillingPk id = new OrderItemBillingPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OrderItemBillingPk</code>
     */
      public OrderItemBillingPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OrderItemBillingPk</code> value to set
    */   
      public void setId(OrderItemBillingPk id) {
         this.id = id;
      }
   @Column(name="ITEM_ISSUANCE_ID")
   private String itemIssuanceId;
   @Column(name="SHIPMENT_RECEIPT_ID")
   private String shipmentReceiptId;
   @Column(name="QUANTITY")
   private BigDecimal quantity;
   @Column(name="AMOUNT")
   private BigDecimal amount;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   private transient OrderItem orderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Invoice invoice = null;
   private transient InvoiceItem invoiceItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_RECEIPT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ShipmentReceipt shipmentReceipt = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ITEM_ISSUANCE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ItemIssuance itemIssuance = null;

  /**
   * Default constructor.
   */
  public OrderItemBilling() {
      super();
      this.baseEntityName = "OrderItemBilling";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");this.primaryKeyNames.add("invoiceId");this.primaryKeyNames.add("invoiceItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("invoiceItemSeqId");this.allFieldsNames.add("itemIssuanceId");this.allFieldsNames.add("shipmentReceiptId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("amount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderItemBilling(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        id.setOrderId(orderId);
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        id.setOrderItemSeqId(orderItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        id.setInvoiceId(invoiceId);
    }
    /**
     * Auto generated value setter.
     * @param invoiceItemSeqId the invoiceItemSeqId to set
     */
    public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        id.setInvoiceItemSeqId(invoiceItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param itemIssuanceId the itemIssuanceId to set
     */
    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentReceiptId the shipmentReceiptId to set
     */
    public void setShipmentReceiptId(String shipmentReceiptId) {
        this.shipmentReceiptId = shipmentReceiptId;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.id.getOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.id.getOrderItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceId() {
        return this.id.getInvoiceId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceItemSeqId() {
        return this.id.getInvoiceItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemIssuanceId() {
        return this.itemIssuanceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentReceiptId() {
        return this.shipmentReceiptId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>OrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getOrderHeader() throws RepositoryException {
        if (this.orderHeader == null) {
            this.orderHeader = getRelatedOne(OrderHeader.class, "OrderHeader");
        }
        return this.orderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getOrderItem() throws RepositoryException {
        if (this.orderItem == null) {
            this.orderItem = getRelatedOne(OrderItem.class, "OrderItem");
        }
        return this.orderItem;
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
     * Auto generated method that gets the related <code>InvoiceItem</code> by the relation named <code>InvoiceItem</code>.
     * @return the <code>InvoiceItem</code>
     * @throws RepositoryException if an error occurs
     */
    public InvoiceItem getInvoiceItem() throws RepositoryException {
        if (this.invoiceItem == null) {
            this.invoiceItem = getRelatedOne(InvoiceItem.class, "InvoiceItem");
        }
        return this.invoiceItem;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentReceipt</code> by the relation named <code>ShipmentReceipt</code>.
     * @return the <code>ShipmentReceipt</code>
     * @throws RepositoryException if an error occurs
     */
    public ShipmentReceipt getShipmentReceipt() throws RepositoryException {
        if (this.shipmentReceipt == null) {
            this.shipmentReceipt = getRelatedOne(ShipmentReceipt.class, "ShipmentReceipt");
        }
        return this.shipmentReceipt;
    }
    /**
     * Auto generated method that gets the related <code>ItemIssuance</code> by the relation named <code>ItemIssuance</code>.
     * @return the <code>ItemIssuance</code>
     * @throws RepositoryException if an error occurs
     */
    public ItemIssuance getItemIssuance() throws RepositoryException {
        if (this.itemIssuance == null) {
            this.itemIssuance = getRelatedOne(ItemIssuance.class, "ItemIssuance");
        }
        return this.itemIssuance;
    }

    /**
     * Auto generated value setter.
     * @param orderHeader the orderHeader to set
    */
    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
    /**
     * Auto generated value setter.
     * @param orderItem the orderItem to set
    */
    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
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
     * @param invoiceItem the invoiceItem to set
    */
    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }
    /**
     * Auto generated value setter.
     * @param shipmentReceipt the shipmentReceipt to set
    */
    public void setShipmentReceipt(ShipmentReceipt shipmentReceipt) {
        this.shipmentReceipt = shipmentReceipt;
    }
    /**
     * Auto generated value setter.
     * @param itemIssuance the itemIssuance to set
    */
    public void setItemIssuance(ItemIssuance itemIssuance) {
        this.itemIssuance = itemIssuance;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setInvoiceId((String) mapValue.get("invoiceId"));
        setInvoiceItemSeqId((String) mapValue.get("invoiceItemSeqId"));
        setItemIssuanceId((String) mapValue.get("itemIssuanceId"));
        setShipmentReceiptId((String) mapValue.get("shipmentReceiptId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("invoiceId", getInvoiceId());
        mapValue.put("invoiceItemSeqId", getInvoiceItemSeqId());
        mapValue.put("itemIssuanceId", getItemIssuanceId());
        mapValue.put("shipmentReceiptId", getShipmentReceiptId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("amount", getAmount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
