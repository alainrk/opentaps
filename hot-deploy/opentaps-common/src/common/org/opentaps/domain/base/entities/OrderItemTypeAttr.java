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
 * Auto generated base entity OrderItemTypeAttr.
 */
@javax.persistence.Entity
@Table(name="ORDER_ITEM_TYPE_ATTR")
public class OrderItemTypeAttr extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderItemTypeId", "ORDER_ITEM_TYPE_ID");
        fields.put("attrName", "ATTR_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderItemTypeAttr", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderItemTypeAttr> {
    orderItemTypeId("orderItemTypeId"),
    attrName("attrName"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.OrderItemTypeAttrPkBridge.class)
     private OrderItemTypeAttrPk id = new OrderItemTypeAttrPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OrderItemTypeAttrPk</code>
     */
      public OrderItemTypeAttrPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OrderItemTypeAttrPk</code> value to set
    */   
      public void setId(OrderItemTypeAttrPk id) {
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
   @JoinColumn(name="ORDER_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderItemType orderItemType = null;
   private transient List<OrderItemAttribute> orderItemAttributes = null;
   private transient List<OrderItem> orderItems = null;

  /**
   * Default constructor.
   */
  public OrderItemTypeAttr() {
      super();
      this.baseEntityName = "OrderItemTypeAttr";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderItemTypeId");this.primaryKeyNames.add("attrName");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderItemTypeId");this.allFieldsNames.add("attrName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderItemTypeAttr(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderItemTypeId the orderItemTypeId to set
     */
    public void setOrderItemTypeId(String orderItemTypeId) {
        id.setOrderItemTypeId(orderItemTypeId);
    }
    /**
     * Auto generated value setter.
     * @param attrName the attrName to set
     */
    public void setAttrName(String attrName) {
        id.setAttrName(attrName);
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
    public String getOrderItemTypeId() {
        return this.id.getOrderItemTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAttrName() {
        return this.id.getAttrName();
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
     * Auto generated method that gets the related <code>OrderItemType</code> by the relation named <code>OrderItemType</code>.
     * @return the <code>OrderItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemType getOrderItemType() throws RepositoryException {
        if (this.orderItemType == null) {
            this.orderItemType = getRelatedOne(OrderItemType.class, "OrderItemType");
        }
        return this.orderItemType;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemAttribute</code> by the relation named <code>OrderItemAttribute</code>.
     * @return the list of <code>OrderItemAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemAttribute> getOrderItemAttributes() throws RepositoryException {
        if (this.orderItemAttributes == null) {
            this.orderItemAttributes = getRelated(OrderItemAttribute.class, "OrderItemAttribute");
        }
        return this.orderItemAttributes;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the list of <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItem> getOrderItems() throws RepositoryException {
        if (this.orderItems == null) {
            this.orderItems = getRelated(OrderItem.class, "OrderItem");
        }
        return this.orderItems;
    }

    /**
     * Auto generated value setter.
     * @param orderItemType the orderItemType to set
    */
    public void setOrderItemType(OrderItemType orderItemType) {
        this.orderItemType = orderItemType;
    }
    /**
     * Auto generated value setter.
     * @param orderItemAttributes the orderItemAttributes to set
    */
    public void setOrderItemAttributes(List<OrderItemAttribute> orderItemAttributes) {
        this.orderItemAttributes = orderItemAttributes;
    }
    /**
     * Auto generated value setter.
     * @param orderItems the orderItems to set
    */
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderItemTypeId((String) mapValue.get("orderItemTypeId"));
        setAttrName((String) mapValue.get("attrName"));
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
        mapValue.put("orderItemTypeId", getOrderItemTypeId());
        mapValue.put("attrName", getAttrName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
