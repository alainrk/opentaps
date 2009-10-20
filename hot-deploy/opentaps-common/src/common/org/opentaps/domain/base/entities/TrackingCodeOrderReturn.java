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
 * Auto generated base entity TrackingCodeOrderReturn.
 */
@javax.persistence.Entity
@Table(name="TRACKING_CODE_ORDER_RETURN")
public class TrackingCodeOrderReturn extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("returnId", "RETURN_ID");
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("trackingCodeTypeId", "TRACKING_CODE_TYPE_ID");
        fields.put("trackingCodeId", "TRACKING_CODE_ID");
        fields.put("isBillable", "IS_BILLABLE");
        fields.put("siteId", "SITE_ID");
        fields.put("hasExported", "HAS_EXPORTED");
        fields.put("affiliateReferredTimeStamp", "AFFILIATE_REFERRED_TIME_STAMP");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TrackingCodeOrderReturn", fields);
}
  public static enum Fields implements EntityFieldInterface<TrackingCodeOrderReturn> {
    returnId("returnId"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    trackingCodeTypeId("trackingCodeTypeId"),
    trackingCodeId("trackingCodeId"),
    isBillable("isBillable"),
    siteId("siteId"),
    hasExported("hasExported"),
    affiliateReferredTimeStamp("affiliateReferredTimeStamp"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.TrackingCodeOrderReturnPkBridge.class)
     private TrackingCodeOrderReturnPk id = new TrackingCodeOrderReturnPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>TrackingCodeOrderReturnPk</code>
     */
      public TrackingCodeOrderReturnPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>TrackingCodeOrderReturnPk</code> value to set
    */   
      public void setId(TrackingCodeOrderReturnPk id) {
         this.id = id;
      }
   @Column(name="ORDER_ITEM_SEQ_ID")
   private String orderItemSeqId;
   @Column(name="TRACKING_CODE_ID")
   private String trackingCodeId;
   @Column(name="IS_BILLABLE")
   private String isBillable;
   @Column(name="SITE_ID")
   private String siteId;
   @Column(name="HAS_EXPORTED")
   private String hasExported;
   @Column(name="AFFILIATE_REFERRED_TIME_STAMP")
   private Timestamp affiliateReferredTimeStamp;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReturnHeader returnHeader = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TRACKING_CODE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TrackingCode trackingCode = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TRACKING_CODE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TrackingCodeType trackingCodeType = null;

  /**
   * Default constructor.
   */
  public TrackingCodeOrderReturn() {
      super();
      this.baseEntityName = "TrackingCodeOrderReturn";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("returnId");this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("trackingCodeTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("returnId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("trackingCodeTypeId");this.allFieldsNames.add("trackingCodeId");this.allFieldsNames.add("isBillable");this.allFieldsNames.add("siteId");this.allFieldsNames.add("hasExported");this.allFieldsNames.add("affiliateReferredTimeStamp");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TrackingCodeOrderReturn(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        id.setReturnId(returnId);
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
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param trackingCodeTypeId the trackingCodeTypeId to set
     */
    public void setTrackingCodeTypeId(String trackingCodeTypeId) {
        id.setTrackingCodeTypeId(trackingCodeTypeId);
    }
    /**
     * Auto generated value setter.
     * @param trackingCodeId the trackingCodeId to set
     */
    public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }
    /**
     * Auto generated value setter.
     * @param isBillable the isBillable to set
     */
    public void setIsBillable(String isBillable) {
        this.isBillable = isBillable;
    }
    /**
     * Auto generated value setter.
     * @param siteId the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
    /**
     * Auto generated value setter.
     * @param hasExported the hasExported to set
     */
    public void setHasExported(String hasExported) {
        this.hasExported = hasExported;
    }
    /**
     * Auto generated value setter.
     * @param affiliateReferredTimeStamp the affiliateReferredTimeStamp to set
     */
    public void setAffiliateReferredTimeStamp(Timestamp affiliateReferredTimeStamp) {
        this.affiliateReferredTimeStamp = affiliateReferredTimeStamp;
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
    public String getReturnId() {
        return this.id.getReturnId();
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
        return this.orderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCodeTypeId() {
        return this.id.getTrackingCodeTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCodeId() {
        return this.trackingCodeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsBillable() {
        return this.isBillable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSiteId() {
        return this.siteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasExported() {
        return this.hasExported;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAffiliateReferredTimeStamp() {
        return this.affiliateReferredTimeStamp;
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
     * Auto generated method that gets the related <code>ReturnHeader</code> by the relation named <code>ReturnHeader</code>.
     * @return the <code>ReturnHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnHeader getReturnHeader() throws RepositoryException {
        if (this.returnHeader == null) {
            this.returnHeader = getRelatedOne(ReturnHeader.class, "ReturnHeader");
        }
        return this.returnHeader;
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
     * Auto generated method that gets the related <code>TrackingCode</code> by the relation named <code>TrackingCode</code>.
     * @return the <code>TrackingCode</code>
     * @throws RepositoryException if an error occurs
     */
    public TrackingCode getTrackingCode() throws RepositoryException {
        if (this.trackingCode == null) {
            this.trackingCode = getRelatedOne(TrackingCode.class, "TrackingCode");
        }
        return this.trackingCode;
    }
    /**
     * Auto generated method that gets the related <code>TrackingCodeType</code> by the relation named <code>TrackingCodeType</code>.
     * @return the <code>TrackingCodeType</code>
     * @throws RepositoryException if an error occurs
     */
    public TrackingCodeType getTrackingCodeType() throws RepositoryException {
        if (this.trackingCodeType == null) {
            this.trackingCodeType = getRelatedOne(TrackingCodeType.class, "TrackingCodeType");
        }
        return this.trackingCodeType;
    }

    /**
     * Auto generated value setter.
     * @param returnHeader the returnHeader to set
    */
    public void setReturnHeader(ReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
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
     * @param trackingCode the trackingCode to set
    */
    public void setTrackingCode(TrackingCode trackingCode) {
        this.trackingCode = trackingCode;
    }
    /**
     * Auto generated value setter.
     * @param trackingCodeType the trackingCodeType to set
    */
    public void setTrackingCodeType(TrackingCodeType trackingCodeType) {
        this.trackingCodeType = trackingCodeType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReturnId((String) mapValue.get("returnId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setTrackingCodeTypeId((String) mapValue.get("trackingCodeTypeId"));
        setTrackingCodeId((String) mapValue.get("trackingCodeId"));
        setIsBillable((String) mapValue.get("isBillable"));
        setSiteId((String) mapValue.get("siteId"));
        setHasExported((String) mapValue.get("hasExported"));
        setAffiliateReferredTimeStamp((Timestamp) mapValue.get("affiliateReferredTimeStamp"));
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
        mapValue.put("returnId", getReturnId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("trackingCodeTypeId", getTrackingCodeTypeId());
        mapValue.put("trackingCodeId", getTrackingCodeId());
        mapValue.put("isBillable", getIsBillable());
        mapValue.put("siteId", getSiteId());
        mapValue.put("hasExported", getHasExported());
        mapValue.put("affiliateReferredTimeStamp", getAffiliateReferredTimeStamp());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
