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
 * Auto generated base entity ShipmentItem.
 */
@javax.persistence.Entity
@Table(name="SHIPMENT_ITEM")
public class ShipmentItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("shipmentId", "SHIPMENT_ID");
        fields.put("shipmentItemSeqId", "SHIPMENT_ITEM_SEQ_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("shipmentContentDescription", "SHIPMENT_CONTENT_DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ShipmentItem", fields);
}
  public static enum Fields implements EntityFieldInterface<ShipmentItem> {
    shipmentId("shipmentId"),
    shipmentItemSeqId("shipmentItemSeqId"),
    productId("productId"),
    quantity("quantity"),
    shipmentContentDescription("shipmentContentDescription"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ShipmentItemPkBridge.class)
     private ShipmentItemPk id = new ShipmentItemPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ShipmentItemPk</code>
     */
      public ShipmentItemPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ShipmentItemPk</code> value to set
    */   
      public void setId(ShipmentItemPk id) {
         this.id = id;
      }
   @Column(name="PRODUCT_ID")
   private String productId;
   @Column(name="QUANTITY")
   private BigDecimal quantity;
   @Column(name="SHIPMENT_CONTENT_DESCRIPTION")
   private String shipmentContentDescription;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Shipment shipment = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   private transient List<ItemIssuance> itemIssuances = null;
   private transient List<OrderShipment> orderShipments = null;
   private transient List<ReturnItemShipment> returnItemShipments = null;
   private transient List<ShipmentItemBilling> shipmentItemBillings = null;
   private transient List<ShipmentItemFeature> shipmentItemFeatures = null;
   private transient List<ShipmentPackageContent> shipmentPackageContents = null;
   private transient List<ShippingDocument> shippingDocuments = null;

  /**
   * Default constructor.
   */
  public ShipmentItem() {
      super();
      this.baseEntityName = "ShipmentItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("shipmentId");this.primaryKeyNames.add("shipmentItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("shipmentItemSeqId");this.allFieldsNames.add("productId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("shipmentContentDescription");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ShipmentItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param shipmentId the shipmentId to set
     */
    public void setShipmentId(String shipmentId) {
        id.setShipmentId(shipmentId);
    }
    /**
     * Auto generated value setter.
     * @param shipmentItemSeqId the shipmentItemSeqId to set
     */
    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        id.setShipmentItemSeqId(shipmentItemSeqId);
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
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param shipmentContentDescription the shipmentContentDescription to set
     */
    public void setShipmentContentDescription(String shipmentContentDescription) {
        this.shipmentContentDescription = shipmentContentDescription;
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
    public String getShipmentId() {
        return this.id.getShipmentId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentItemSeqId() {
        return this.id.getShipmentItemSeqId();
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentContentDescription() {
        return this.shipmentContentDescription;
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
     * Auto generated method that gets the related <code>Shipment</code> by the relation named <code>Shipment</code>.
     * @return the <code>Shipment</code>
     * @throws RepositoryException if an error occurs
     */
    public Shipment getShipment() throws RepositoryException {
        if (this.shipment == null) {
            this.shipment = getRelatedOne(Shipment.class, "Shipment");
        }
        return this.shipment;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }
    /**
     * Auto generated method that gets the related <code>ItemIssuance</code> by the relation named <code>ItemIssuance</code>.
     * @return the list of <code>ItemIssuance</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ItemIssuance> getItemIssuances() throws RepositoryException {
        if (this.itemIssuances == null) {
            this.itemIssuances = getRelated(ItemIssuance.class, "ItemIssuance");
        }
        return this.itemIssuances;
    }
    /**
     * Auto generated method that gets the related <code>OrderShipment</code> by the relation named <code>OrderShipment</code>.
     * @return the list of <code>OrderShipment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderShipment> getOrderShipments() throws RepositoryException {
        if (this.orderShipments == null) {
            this.orderShipments = getRelated(OrderShipment.class, "OrderShipment");
        }
        return this.orderShipments;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemShipment</code> by the relation named <code>ReturnItemShipment</code>.
     * @return the list of <code>ReturnItemShipment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItemShipment> getReturnItemShipments() throws RepositoryException {
        if (this.returnItemShipments == null) {
            this.returnItemShipments = getRelated(ReturnItemShipment.class, "ReturnItemShipment");
        }
        return this.returnItemShipments;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentItemBilling</code> by the relation named <code>ShipmentItemBilling</code>.
     * @return the list of <code>ShipmentItemBilling</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShipmentItemBilling> getShipmentItemBillings() throws RepositoryException {
        if (this.shipmentItemBillings == null) {
            this.shipmentItemBillings = getRelated(ShipmentItemBilling.class, "ShipmentItemBilling");
        }
        return this.shipmentItemBillings;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentItemFeature</code> by the relation named <code>ShipmentItemFeature</code>.
     * @return the list of <code>ShipmentItemFeature</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShipmentItemFeature> getShipmentItemFeatures() throws RepositoryException {
        if (this.shipmentItemFeatures == null) {
            this.shipmentItemFeatures = getRelated(ShipmentItemFeature.class, "ShipmentItemFeature");
        }
        return this.shipmentItemFeatures;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentPackageContent</code> by the relation named <code>ShipmentPackageContent</code>.
     * @return the list of <code>ShipmentPackageContent</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShipmentPackageContent> getShipmentPackageContents() throws RepositoryException {
        if (this.shipmentPackageContents == null) {
            this.shipmentPackageContents = getRelated(ShipmentPackageContent.class, "ShipmentPackageContent");
        }
        return this.shipmentPackageContents;
    }
    /**
     * Auto generated method that gets the related <code>ShippingDocument</code> by the relation named <code>ShippingDocument</code>.
     * @return the list of <code>ShippingDocument</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShippingDocument> getShippingDocuments() throws RepositoryException {
        if (this.shippingDocuments == null) {
            this.shippingDocuments = getRelated(ShippingDocument.class, "ShippingDocument");
        }
        return this.shippingDocuments;
    }

    /**
     * Auto generated value setter.
     * @param shipment the shipment to set
    */
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param itemIssuances the itemIssuances to set
    */
    public void setItemIssuances(List<ItemIssuance> itemIssuances) {
        this.itemIssuances = itemIssuances;
    }
    /**
     * Auto generated value setter.
     * @param orderShipments the orderShipments to set
    */
    public void setOrderShipments(List<OrderShipment> orderShipments) {
        this.orderShipments = orderShipments;
    }
    /**
     * Auto generated value setter.
     * @param returnItemShipments the returnItemShipments to set
    */
    public void setReturnItemShipments(List<ReturnItemShipment> returnItemShipments) {
        this.returnItemShipments = returnItemShipments;
    }
    /**
     * Auto generated value setter.
     * @param shipmentItemBillings the shipmentItemBillings to set
    */
    public void setShipmentItemBillings(List<ShipmentItemBilling> shipmentItemBillings) {
        this.shipmentItemBillings = shipmentItemBillings;
    }
    /**
     * Auto generated value setter.
     * @param shipmentItemFeatures the shipmentItemFeatures to set
    */
    public void setShipmentItemFeatures(List<ShipmentItemFeature> shipmentItemFeatures) {
        this.shipmentItemFeatures = shipmentItemFeatures;
    }
    /**
     * Auto generated value setter.
     * @param shipmentPackageContents the shipmentPackageContents to set
    */
    public void setShipmentPackageContents(List<ShipmentPackageContent> shipmentPackageContents) {
        this.shipmentPackageContents = shipmentPackageContents;
    }
    /**
     * Auto generated value setter.
     * @param shippingDocuments the shippingDocuments to set
    */
    public void setShippingDocuments(List<ShippingDocument> shippingDocuments) {
        this.shippingDocuments = shippingDocuments;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setShipmentId((String) mapValue.get("shipmentId"));
        setShipmentItemSeqId((String) mapValue.get("shipmentItemSeqId"));
        setProductId((String) mapValue.get("productId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setShipmentContentDescription((String) mapValue.get("shipmentContentDescription"));
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
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("shipmentItemSeqId", getShipmentItemSeqId());
        mapValue.put("productId", getProductId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("shipmentContentDescription", getShipmentContentDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
