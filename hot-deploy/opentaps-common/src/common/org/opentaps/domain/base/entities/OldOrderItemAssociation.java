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
import java.sql.Timestamp;

/**
 * Auto generated base entity OldOrderItemAssociation.
 */
@javax.persistence.Entity
@Table(name="ORDER_ITEM_ASSOCIATION")
public class OldOrderItemAssociation extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("salesOrderId", "SALES_ORDER_ID");
        fields.put("soItemSeqId", "SO_ITEM_SEQ_ID");
        fields.put("purchaseOrderId", "PURCHASE_ORDER_ID");
        fields.put("poItemSeqId", "PO_ITEM_SEQ_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OldOrderItemAssociation", fields);
}
  public static enum Fields implements EntityFieldInterface<OldOrderItemAssociation> {
    salesOrderId("salesOrderId"),
    soItemSeqId("soItemSeqId"),
    purchaseOrderId("purchaseOrderId"),
    poItemSeqId("poItemSeqId"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.OldOrderItemAssociationPkBridge.class)
     private OldOrderItemAssociationPk id = new OldOrderItemAssociationPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OldOrderItemAssociationPk</code>
     */
      public OldOrderItemAssociationPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OldOrderItemAssociationPk</code> value to set
    */   
      public void setId(OldOrderItemAssociationPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SALES_ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader salesOrderHeader = null;
   private transient OrderItem salesOrderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PURCHASE_ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader purchaseOrderHeader = null;
   private transient OrderItem purchaseOrderItem = null;

  /**
   * Default constructor.
   */
  public OldOrderItemAssociation() {
      super();
      this.baseEntityName = "OldOrderItemAssociation";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("salesOrderId");this.primaryKeyNames.add("soItemSeqId");this.primaryKeyNames.add("purchaseOrderId");this.primaryKeyNames.add("poItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("salesOrderId");this.allFieldsNames.add("soItemSeqId");this.allFieldsNames.add("purchaseOrderId");this.allFieldsNames.add("poItemSeqId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OldOrderItemAssociation(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param salesOrderId the salesOrderId to set
     */
    public void setSalesOrderId(String salesOrderId) {
        id.setSalesOrderId(salesOrderId);
    }
    /**
     * Auto generated value setter.
     * @param soItemSeqId the soItemSeqId to set
     */
    public void setSoItemSeqId(String soItemSeqId) {
        id.setSoItemSeqId(soItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param purchaseOrderId the purchaseOrderId to set
     */
    public void setPurchaseOrderId(String purchaseOrderId) {
        id.setPurchaseOrderId(purchaseOrderId);
    }
    /**
     * Auto generated value setter.
     * @param poItemSeqId the poItemSeqId to set
     */
    public void setPoItemSeqId(String poItemSeqId) {
        id.setPoItemSeqId(poItemSeqId);
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
    public String getSalesOrderId() {
        return this.id.getSalesOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSoItemSeqId() {
        return this.id.getSoItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPurchaseOrderId() {
        return this.id.getPurchaseOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPoItemSeqId() {
        return this.id.getPoItemSeqId();
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
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>SalesOrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getSalesOrderHeader() throws RepositoryException {
        if (this.salesOrderHeader == null) {
            this.salesOrderHeader = getRelatedOne(OrderHeader.class, "SalesOrderHeader");
        }
        return this.salesOrderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>SalesOrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getSalesOrderItem() throws RepositoryException {
        if (this.salesOrderItem == null) {
            this.salesOrderItem = getRelatedOne(OrderItem.class, "SalesOrderItem");
        }
        return this.salesOrderItem;
    }
    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>PurchaseOrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getPurchaseOrderHeader() throws RepositoryException {
        if (this.purchaseOrderHeader == null) {
            this.purchaseOrderHeader = getRelatedOne(OrderHeader.class, "PurchaseOrderHeader");
        }
        return this.purchaseOrderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>PurchaseOrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getPurchaseOrderItem() throws RepositoryException {
        if (this.purchaseOrderItem == null) {
            this.purchaseOrderItem = getRelatedOne(OrderItem.class, "PurchaseOrderItem");
        }
        return this.purchaseOrderItem;
    }

    /**
     * Auto generated value setter.
     * @param salesOrderHeader the salesOrderHeader to set
    */
    public void setSalesOrderHeader(OrderHeader salesOrderHeader) {
        this.salesOrderHeader = salesOrderHeader;
    }
    /**
     * Auto generated value setter.
     * @param salesOrderItem the salesOrderItem to set
    */
    public void setSalesOrderItem(OrderItem salesOrderItem) {
        this.salesOrderItem = salesOrderItem;
    }
    /**
     * Auto generated value setter.
     * @param purchaseOrderHeader the purchaseOrderHeader to set
    */
    public void setPurchaseOrderHeader(OrderHeader purchaseOrderHeader) {
        this.purchaseOrderHeader = purchaseOrderHeader;
    }
    /**
     * Auto generated value setter.
     * @param purchaseOrderItem the purchaseOrderItem to set
    */
    public void setPurchaseOrderItem(OrderItem purchaseOrderItem) {
        this.purchaseOrderItem = purchaseOrderItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSalesOrderId((String) mapValue.get("salesOrderId"));
        setSoItemSeqId((String) mapValue.get("soItemSeqId"));
        setPurchaseOrderId((String) mapValue.get("purchaseOrderId"));
        setPoItemSeqId((String) mapValue.get("poItemSeqId"));
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
        mapValue.put("salesOrderId", getSalesOrderId());
        mapValue.put("soItemSeqId", getSoItemSeqId());
        mapValue.put("purchaseOrderId", getPurchaseOrderId());
        mapValue.put("poItemSeqId", getPoItemSeqId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
