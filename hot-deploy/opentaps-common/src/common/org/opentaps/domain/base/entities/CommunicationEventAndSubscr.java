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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity CommunicationEventAndSubscr.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectCommunicationEventAndSubscrs", query="SELECT SC.SUBSCRIPTION_ID AS \"subscriptionId\",SU.DESCRIPTION AS \"description\",SU.SUBSCRIPTION_RESOURCE_ID AS \"subscriptionResourceId\",SU.COMMUNICATION_EVENT_ID AS \"communicationEventId\",SU.CONTACT_MECH_ID AS \"contactMechId\",SU.ORIGINATED_FROM_PARTY_ID AS \"originatedFromPartyId\",SU.ORIGINATED_FROM_ROLE_TYPE_ID AS \"originatedFromRoleTypeId\",SU.PARTY_ID AS \"partyId\",SU.ROLE_TYPE_ID AS \"roleTypeId\",SU.PARTY_NEED_ID AS \"partyNeedId\",SU.NEED_TYPE_ID AS \"needTypeId\",SU.ORDER_ID AS \"orderId\",SU.ORDER_ITEM_SEQ_ID AS \"orderItemSeqId\",SU.PRODUCT_ID AS \"productId\",SU.PRODUCT_CATEGORY_ID AS \"productCategoryId\",SU.INVENTORY_ITEM_ID AS \"inventoryItemId\",SU.SUBSCRIPTION_TYPE_ID AS \"subscriptionTypeId\",SU.EXTERNAL_SUBSCRIPTION_ID AS \"externalSubscriptionId\",SU.FROM_DATE AS \"fromDate\",SU.THRU_DATE AS \"thruDate\",SU.PURCHASE_FROM_DATE AS \"purchaseFromDate\",SU.PURCHASE_THRU_DATE AS \"purchaseThruDate\",SU.MAX_LIFE_TIME AS \"maxLifeTime\",SU.MAX_LIFE_TIME_UOM_ID AS \"maxLifeTimeUomId\",SU.AVAILABLE_TIME AS \"availableTime\",SU.AVAILABLE_TIME_UOM_ID AS \"availableTimeUomId\",SU.USE_COUNT_LIMIT AS \"useCountLimit\",SU.USE_TIME AS \"useTime\",SU.USE_TIME_UOM_ID AS \"useTimeUomId\",SU.AUTOMATIC_EXTEND AS \"automaticExtend\",SU.CANCL_AUTM_EXT_TIME AS \"canclAutmExtTime\",SU.CANCL_AUTM_EXT_TIME_UOM_ID AS \"canclAutmExtTimeUomId\" FROM SUBSCRIPTION_COMM_EVENT SC INNER JOIN SUBSCRIPTION SU ON SC.SUBSCRIPTION_ID = SU.SUBSCRIPTION_ID", resultSetMapping="CommunicationEventAndSubscrMapping")
@SqlResultSetMapping(name="CommunicationEventAndSubscrMapping", entities={
@EntityResult(entityClass=CommunicationEventAndSubscr.class, fields = {
@FieldResult(name="subscriptionId", column="subscriptionId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="subscriptionResourceId", column="subscriptionResourceId")
,@FieldResult(name="communicationEventId", column="communicationEventId")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="originatedFromPartyId", column="originatedFromPartyId")
,@FieldResult(name="originatedFromRoleTypeId", column="originatedFromRoleTypeId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="partyNeedId", column="partyNeedId")
,@FieldResult(name="needTypeId", column="needTypeId")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderItemSeqId", column="orderItemSeqId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="productCategoryId", column="productCategoryId")
,@FieldResult(name="inventoryItemId", column="inventoryItemId")
,@FieldResult(name="subscriptionTypeId", column="subscriptionTypeId")
,@FieldResult(name="externalSubscriptionId", column="externalSubscriptionId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="purchaseFromDate", column="purchaseFromDate")
,@FieldResult(name="purchaseThruDate", column="purchaseThruDate")
,@FieldResult(name="maxLifeTime", column="maxLifeTime")
,@FieldResult(name="maxLifeTimeUomId", column="maxLifeTimeUomId")
,@FieldResult(name="availableTime", column="availableTime")
,@FieldResult(name="availableTimeUomId", column="availableTimeUomId")
,@FieldResult(name="useCountLimit", column="useCountLimit")
,@FieldResult(name="useTime", column="useTime")
,@FieldResult(name="useTimeUomId", column="useTimeUomId")
,@FieldResult(name="automaticExtend", column="automaticExtend")
,@FieldResult(name="canclAutmExtTime", column="canclAutmExtTime")
,@FieldResult(name="canclAutmExtTimeUomId", column="canclAutmExtTimeUomId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class CommunicationEventAndSubscr extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("subscriptionId", "SC.SUBSCRIPTION_ID");
        fields.put("description", "SU.DESCRIPTION");
        fields.put("subscriptionResourceId", "SU.SUBSCRIPTION_RESOURCE_ID");
        fields.put("communicationEventId", "SU.COMMUNICATION_EVENT_ID");
        fields.put("contactMechId", "SU.CONTACT_MECH_ID");
        fields.put("originatedFromPartyId", "SU.ORIGINATED_FROM_PARTY_ID");
        fields.put("originatedFromRoleTypeId", "SU.ORIGINATED_FROM_ROLE_TYPE_ID");
        fields.put("partyId", "SU.PARTY_ID");
        fields.put("roleTypeId", "SU.ROLE_TYPE_ID");
        fields.put("partyNeedId", "SU.PARTY_NEED_ID");
        fields.put("needTypeId", "SU.NEED_TYPE_ID");
        fields.put("orderId", "SU.ORDER_ID");
        fields.put("orderItemSeqId", "SU.ORDER_ITEM_SEQ_ID");
        fields.put("productId", "SU.PRODUCT_ID");
        fields.put("productCategoryId", "SU.PRODUCT_CATEGORY_ID");
        fields.put("inventoryItemId", "SU.INVENTORY_ITEM_ID");
        fields.put("subscriptionTypeId", "SU.SUBSCRIPTION_TYPE_ID");
        fields.put("externalSubscriptionId", "SU.EXTERNAL_SUBSCRIPTION_ID");
        fields.put("fromDate", "SU.FROM_DATE");
        fields.put("thruDate", "SU.THRU_DATE");
        fields.put("purchaseFromDate", "SU.PURCHASE_FROM_DATE");
        fields.put("purchaseThruDate", "SU.PURCHASE_THRU_DATE");
        fields.put("maxLifeTime", "SU.MAX_LIFE_TIME");
        fields.put("maxLifeTimeUomId", "SU.MAX_LIFE_TIME_UOM_ID");
        fields.put("availableTime", "SU.AVAILABLE_TIME");
        fields.put("availableTimeUomId", "SU.AVAILABLE_TIME_UOM_ID");
        fields.put("useCountLimit", "SU.USE_COUNT_LIMIT");
        fields.put("useTime", "SU.USE_TIME");
        fields.put("useTimeUomId", "SU.USE_TIME_UOM_ID");
        fields.put("automaticExtend", "SU.AUTOMATIC_EXTEND");
        fields.put("canclAutmExtTime", "SU.CANCL_AUTM_EXT_TIME");
        fields.put("canclAutmExtTimeUomId", "SU.CANCL_AUTM_EXT_TIME_UOM_ID");
fieldMapColumns.put("CommunicationEventAndSubscr", fields);
}
  public static enum Fields implements EntityFieldInterface<CommunicationEventAndSubscr> {
    subscriptionId("subscriptionId"),
    description("description"),
    subscriptionResourceId("subscriptionResourceId"),
    communicationEventId("communicationEventId"),
    contactMechId("contactMechId"),
    originatedFromPartyId("originatedFromPartyId"),
    originatedFromRoleTypeId("originatedFromRoleTypeId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    partyNeedId("partyNeedId"),
    needTypeId("needTypeId"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    productId("productId"),
    productCategoryId("productCategoryId"),
    inventoryItemId("inventoryItemId"),
    subscriptionTypeId("subscriptionTypeId"),
    externalSubscriptionId("externalSubscriptionId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    purchaseFromDate("purchaseFromDate"),
    purchaseThruDate("purchaseThruDate"),
    maxLifeTime("maxLifeTime"),
    maxLifeTimeUomId("maxLifeTimeUomId"),
    availableTime("availableTime"),
    availableTimeUomId("availableTimeUomId"),
    useCountLimit("useCountLimit"),
    useTime("useTime"),
    useTimeUomId("useTimeUomId"),
    automaticExtend("automaticExtend"),
    canclAutmExtTime("canclAutmExtTime"),
    canclAutmExtTimeUomId("canclAutmExtTimeUomId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String subscriptionId;
    
   private String description;
    
   private String subscriptionResourceId;
    
   private String communicationEventId;
    
   private String contactMechId;
    
   private String originatedFromPartyId;
    
   private String originatedFromRoleTypeId;
    
   private String partyId;
    
   private String roleTypeId;
    
   private String partyNeedId;
    
   private String needTypeId;
    
   private String orderId;
    
   private String orderItemSeqId;
    
   private String productId;
    
   private String productCategoryId;
    
   private String inventoryItemId;
    
   private String subscriptionTypeId;
    
   private String externalSubscriptionId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private Timestamp purchaseFromDate;
    
   private Timestamp purchaseThruDate;
    
   private Long maxLifeTime;
    
   private String maxLifeTimeUomId;
    
   private Long availableTime;
    
   private String availableTimeUomId;
    
   private Long useCountLimit;
    
   private Long useTime;
    
   private String useTimeUomId;
    
   private String automaticExtend;
    
   private Long canclAutmExtTime;
    
   private String canclAutmExtTimeUomId;

  /**
   * Default constructor.
   */
  public CommunicationEventAndSubscr() {
      super();
      this.baseEntityName = "CommunicationEventAndSubscr";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("subscriptionId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("subscriptionId");this.allFieldsNames.add("description");this.allFieldsNames.add("subscriptionResourceId");this.allFieldsNames.add("communicationEventId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("originatedFromPartyId");this.allFieldsNames.add("originatedFromRoleTypeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("partyNeedId");this.allFieldsNames.add("needTypeId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("productId");this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("subscriptionTypeId");this.allFieldsNames.add("externalSubscriptionId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("purchaseFromDate");this.allFieldsNames.add("purchaseThruDate");this.allFieldsNames.add("maxLifeTime");this.allFieldsNames.add("maxLifeTimeUomId");this.allFieldsNames.add("availableTime");this.allFieldsNames.add("availableTimeUomId");this.allFieldsNames.add("useCountLimit");this.allFieldsNames.add("useTime");this.allFieldsNames.add("useTimeUomId");this.allFieldsNames.add("automaticExtend");this.allFieldsNames.add("canclAutmExtTime");this.allFieldsNames.add("canclAutmExtTimeUomId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CommunicationEventAndSubscr(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param subscriptionId the subscriptionId to set
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param subscriptionResourceId the subscriptionResourceId to set
     */
    public void setSubscriptionResourceId(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId;
    }
    /**
     * Auto generated value setter.
     * @param communicationEventId the communicationEventId to set
     */
    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param originatedFromPartyId the originatedFromPartyId to set
     */
    public void setOriginatedFromPartyId(String originatedFromPartyId) {
        this.originatedFromPartyId = originatedFromPartyId;
    }
    /**
     * Auto generated value setter.
     * @param originatedFromRoleTypeId the originatedFromRoleTypeId to set
     */
    public void setOriginatedFromRoleTypeId(String originatedFromRoleTypeId) {
        this.originatedFromRoleTypeId = originatedFromRoleTypeId;
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
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param partyNeedId the partyNeedId to set
     */
    public void setPartyNeedId(String partyNeedId) {
        this.partyNeedId = partyNeedId;
    }
    /**
     * Auto generated value setter.
     * @param needTypeId the needTypeId to set
     */
    public void setNeedTypeId(String needTypeId) {
        this.needTypeId = needTypeId;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
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
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
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
     * @param subscriptionTypeId the subscriptionTypeId to set
     */
    public void setSubscriptionTypeId(String subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }
    /**
     * Auto generated value setter.
     * @param externalSubscriptionId the externalSubscriptionId to set
     */
    public void setExternalSubscriptionId(String externalSubscriptionId) {
        this.externalSubscriptionId = externalSubscriptionId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param purchaseFromDate the purchaseFromDate to set
     */
    public void setPurchaseFromDate(Timestamp purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }
    /**
     * Auto generated value setter.
     * @param purchaseThruDate the purchaseThruDate to set
     */
    public void setPurchaseThruDate(Timestamp purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }
    /**
     * Auto generated value setter.
     * @param maxLifeTime the maxLifeTime to set
     */
    public void setMaxLifeTime(Long maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }
    /**
     * Auto generated value setter.
     * @param maxLifeTimeUomId the maxLifeTimeUomId to set
     */
    public void setMaxLifeTimeUomId(String maxLifeTimeUomId) {
        this.maxLifeTimeUomId = maxLifeTimeUomId;
    }
    /**
     * Auto generated value setter.
     * @param availableTime the availableTime to set
     */
    public void setAvailableTime(Long availableTime) {
        this.availableTime = availableTime;
    }
    /**
     * Auto generated value setter.
     * @param availableTimeUomId the availableTimeUomId to set
     */
    public void setAvailableTimeUomId(String availableTimeUomId) {
        this.availableTimeUomId = availableTimeUomId;
    }
    /**
     * Auto generated value setter.
     * @param useCountLimit the useCountLimit to set
     */
    public void setUseCountLimit(Long useCountLimit) {
        this.useCountLimit = useCountLimit;
    }
    /**
     * Auto generated value setter.
     * @param useTime the useTime to set
     */
    public void setUseTime(Long useTime) {
        this.useTime = useTime;
    }
    /**
     * Auto generated value setter.
     * @param useTimeUomId the useTimeUomId to set
     */
    public void setUseTimeUomId(String useTimeUomId) {
        this.useTimeUomId = useTimeUomId;
    }
    /**
     * Auto generated value setter.
     * @param automaticExtend the automaticExtend to set
     */
    public void setAutomaticExtend(String automaticExtend) {
        this.automaticExtend = automaticExtend;
    }
    /**
     * Auto generated value setter.
     * @param canclAutmExtTime the canclAutmExtTime to set
     */
    public void setCanclAutmExtTime(Long canclAutmExtTime) {
        this.canclAutmExtTime = canclAutmExtTime;
    }
    /**
     * Auto generated value setter.
     * @param canclAutmExtTimeUomId the canclAutmExtTimeUomId to set
     */
    public void setCanclAutmExtTimeUomId(String canclAutmExtTimeUomId) {
        this.canclAutmExtTimeUomId = canclAutmExtTimeUomId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSubscriptionResourceId() {
        return this.subscriptionResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCommunicationEventId() {
        return this.communicationEventId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOriginatedFromPartyId() {
        return this.originatedFromPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOriginatedFromRoleTypeId() {
        return this.originatedFromRoleTypeId;
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
    public String getRoleTypeId() {
        return this.roleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyNeedId() {
        return this.partyNeedId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNeedTypeId() {
        return this.needTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
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
    public String getProductCategoryId() {
        return this.productCategoryId;
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
    public String getSubscriptionTypeId() {
        return this.subscriptionTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExternalSubscriptionId() {
        return this.externalSubscriptionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPurchaseFromDate() {
        return this.purchaseFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPurchaseThruDate() {
        return this.purchaseThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getMaxLifeTime() {
        return this.maxLifeTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMaxLifeTimeUomId() {
        return this.maxLifeTimeUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getAvailableTime() {
        return this.availableTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAvailableTimeUomId() {
        return this.availableTimeUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getUseCountLimit() {
        return this.useCountLimit;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getUseTime() {
        return this.useTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUseTimeUomId() {
        return this.useTimeUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAutomaticExtend() {
        return this.automaticExtend;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getCanclAutmExtTime() {
        return this.canclAutmExtTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCanclAutmExtTimeUomId() {
        return this.canclAutmExtTimeUomId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSubscriptionId((String) mapValue.get("subscriptionId"));
        setDescription((String) mapValue.get("description"));
        setSubscriptionResourceId((String) mapValue.get("subscriptionResourceId"));
        setCommunicationEventId((String) mapValue.get("communicationEventId"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setOriginatedFromPartyId((String) mapValue.get("originatedFromPartyId"));
        setOriginatedFromRoleTypeId((String) mapValue.get("originatedFromRoleTypeId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setPartyNeedId((String) mapValue.get("partyNeedId"));
        setNeedTypeId((String) mapValue.get("needTypeId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setProductId((String) mapValue.get("productId"));
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setSubscriptionTypeId((String) mapValue.get("subscriptionTypeId"));
        setExternalSubscriptionId((String) mapValue.get("externalSubscriptionId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setPurchaseFromDate((Timestamp) mapValue.get("purchaseFromDate"));
        setPurchaseThruDate((Timestamp) mapValue.get("purchaseThruDate"));
        setMaxLifeTime((Long) mapValue.get("maxLifeTime"));
        setMaxLifeTimeUomId((String) mapValue.get("maxLifeTimeUomId"));
        setAvailableTime((Long) mapValue.get("availableTime"));
        setAvailableTimeUomId((String) mapValue.get("availableTimeUomId"));
        setUseCountLimit((Long) mapValue.get("useCountLimit"));
        setUseTime((Long) mapValue.get("useTime"));
        setUseTimeUomId((String) mapValue.get("useTimeUomId"));
        setAutomaticExtend((String) mapValue.get("automaticExtend"));
        setCanclAutmExtTime((Long) mapValue.get("canclAutmExtTime"));
        setCanclAutmExtTimeUomId((String) mapValue.get("canclAutmExtTimeUomId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("subscriptionId", getSubscriptionId());
        mapValue.put("description", getDescription());
        mapValue.put("subscriptionResourceId", getSubscriptionResourceId());
        mapValue.put("communicationEventId", getCommunicationEventId());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("originatedFromPartyId", getOriginatedFromPartyId());
        mapValue.put("originatedFromRoleTypeId", getOriginatedFromRoleTypeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("partyNeedId", getPartyNeedId());
        mapValue.put("needTypeId", getNeedTypeId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("productId", getProductId());
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("subscriptionTypeId", getSubscriptionTypeId());
        mapValue.put("externalSubscriptionId", getExternalSubscriptionId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("purchaseFromDate", getPurchaseFromDate());
        mapValue.put("purchaseThruDate", getPurchaseThruDate());
        mapValue.put("maxLifeTime", getMaxLifeTime());
        mapValue.put("maxLifeTimeUomId", getMaxLifeTimeUomId());
        mapValue.put("availableTime", getAvailableTime());
        mapValue.put("availableTimeUomId", getAvailableTimeUomId());
        mapValue.put("useCountLimit", getUseCountLimit());
        mapValue.put("useTime", getUseTime());
        mapValue.put("useTimeUomId", getUseTimeUomId());
        mapValue.put("automaticExtend", getAutomaticExtend());
        mapValue.put("canclAutmExtTime", getCanclAutmExtTime());
        mapValue.put("canclAutmExtTimeUomId", getCanclAutmExtTimeUomId());
        return mapValue;
    }


}
