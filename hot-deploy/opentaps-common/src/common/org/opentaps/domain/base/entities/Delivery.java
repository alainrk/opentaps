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
 * Auto generated base entity Delivery.
 */
@javax.persistence.Entity
@Table(name="DELIVERY")
public class Delivery extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("deliveryId", "DELIVERY_ID");
        fields.put("originFacilityId", "ORIGIN_FACILITY_ID");
        fields.put("destFacilityId", "DEST_FACILITY_ID");
        fields.put("actualStartDate", "ACTUAL_START_DATE");
        fields.put("actualArrivalDate", "ACTUAL_ARRIVAL_DATE");
        fields.put("estimatedStartDate", "ESTIMATED_START_DATE");
        fields.put("estimatedArrivalDate", "ESTIMATED_ARRIVAL_DATE");
        fields.put("fixedAssetId", "FIXED_ASSET_ID");
        fields.put("startMileage", "START_MILEAGE");
        fields.put("endMileage", "END_MILEAGE");
        fields.put("fuelUsed", "FUEL_USED");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("Delivery", fields);
}
  public static enum Fields implements EntityFieldInterface<Delivery> {
    deliveryId("deliveryId"),
    originFacilityId("originFacilityId"),
    destFacilityId("destFacilityId"),
    actualStartDate("actualStartDate"),
    actualArrivalDate("actualArrivalDate"),
    estimatedStartDate("estimatedStartDate"),
    estimatedArrivalDate("estimatedArrivalDate"),
    fixedAssetId("fixedAssetId"),
    startMileage("startMileage"),
    endMileage("endMileage"),
    fuelUsed("fuelUsed"),
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

   @org.hibernate.annotations.GenericGenerator(name="Delivery_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="Delivery_GEN")
   @Id
   @Column(name="DELIVERY_ID")
   private String deliveryId;
   @Column(name="ORIGIN_FACILITY_ID")
   private String originFacilityId;
   @Column(name="DEST_FACILITY_ID")
   private String destFacilityId;
   @Column(name="ACTUAL_START_DATE")
   private Timestamp actualStartDate;
   @Column(name="ACTUAL_ARRIVAL_DATE")
   private Timestamp actualArrivalDate;
   @Column(name="ESTIMATED_START_DATE")
   private Timestamp estimatedStartDate;
   @Column(name="ESTIMATED_ARRIVAL_DATE")
   private Timestamp estimatedArrivalDate;
   @Column(name="FIXED_ASSET_ID")
   private String fixedAssetId;
   @Column(name="START_MILEAGE")
   private BigDecimal startMileage;
   @Column(name="END_MILEAGE")
   private BigDecimal endMileage;
   @Column(name="FUEL_USED")
   private BigDecimal fuelUsed;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FIXED_ASSET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FixedAsset fixedAsset = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORIGIN_FACILITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Facility originFacility = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="DEST_FACILITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Facility destFacility = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="DELIVERY_ID")
   
   private List<ShipmentRouteSegment> shipmentRouteSegments = null;

  /**
   * Default constructor.
   */
  public Delivery() {
      super();
      this.baseEntityName = "Delivery";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("deliveryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("deliveryId");this.allFieldsNames.add("originFacilityId");this.allFieldsNames.add("destFacilityId");this.allFieldsNames.add("actualStartDate");this.allFieldsNames.add("actualArrivalDate");this.allFieldsNames.add("estimatedStartDate");this.allFieldsNames.add("estimatedArrivalDate");this.allFieldsNames.add("fixedAssetId");this.allFieldsNames.add("startMileage");this.allFieldsNames.add("endMileage");this.allFieldsNames.add("fuelUsed");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public Delivery(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param deliveryId the deliveryId to set
     */
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }
    /**
     * Auto generated value setter.
     * @param originFacilityId the originFacilityId to set
     */
    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }
    /**
     * Auto generated value setter.
     * @param destFacilityId the destFacilityId to set
     */
    public void setDestFacilityId(String destFacilityId) {
        this.destFacilityId = destFacilityId;
    }
    /**
     * Auto generated value setter.
     * @param actualStartDate the actualStartDate to set
     */
    public void setActualStartDate(Timestamp actualStartDate) {
        this.actualStartDate = actualStartDate;
    }
    /**
     * Auto generated value setter.
     * @param actualArrivalDate the actualArrivalDate to set
     */
    public void setActualArrivalDate(Timestamp actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }
    /**
     * Auto generated value setter.
     * @param estimatedStartDate the estimatedStartDate to set
     */
    public void setEstimatedStartDate(Timestamp estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }
    /**
     * Auto generated value setter.
     * @param estimatedArrivalDate the estimatedArrivalDate to set
     */
    public void setEstimatedArrivalDate(Timestamp estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetId the fixedAssetId to set
     */
    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
    /**
     * Auto generated value setter.
     * @param startMileage the startMileage to set
     */
    public void setStartMileage(BigDecimal startMileage) {
        this.startMileage = startMileage;
    }
    /**
     * Auto generated value setter.
     * @param endMileage the endMileage to set
     */
    public void setEndMileage(BigDecimal endMileage) {
        this.endMileage = endMileage;
    }
    /**
     * Auto generated value setter.
     * @param fuelUsed the fuelUsed to set
     */
    public void setFuelUsed(BigDecimal fuelUsed) {
        this.fuelUsed = fuelUsed;
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
    public String getDeliveryId() {
        return this.deliveryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOriginFacilityId() {
        return this.originFacilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDestFacilityId() {
        return this.destFacilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getActualStartDate() {
        return this.actualStartDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getActualArrivalDate() {
        return this.actualArrivalDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEstimatedStartDate() {
        return this.estimatedStartDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEstimatedArrivalDate() {
        return this.estimatedArrivalDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFixedAssetId() {
        return this.fixedAssetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getStartMileage() {
        return this.startMileage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEndMileage() {
        return this.endMileage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getFuelUsed() {
        return this.fuelUsed;
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
     * Auto generated method that gets the related <code>FixedAsset</code> by the relation named <code>FixedAsset</code>.
     * @return the <code>FixedAsset</code>
     * @throws RepositoryException if an error occurs
     */
    public FixedAsset getFixedAsset() throws RepositoryException {
        if (this.fixedAsset == null) {
            this.fixedAsset = getRelatedOne(FixedAsset.class, "FixedAsset");
        }
        return this.fixedAsset;
    }
    /**
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>OriginFacility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getOriginFacility() throws RepositoryException {
        if (this.originFacility == null) {
            this.originFacility = getRelatedOne(Facility.class, "OriginFacility");
        }
        return this.originFacility;
    }
    /**
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>DestFacility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getDestFacility() throws RepositoryException {
        if (this.destFacility == null) {
            this.destFacility = getRelatedOne(Facility.class, "DestFacility");
        }
        return this.destFacility;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentRouteSegment</code> by the relation named <code>ShipmentRouteSegment</code>.
     * @return the list of <code>ShipmentRouteSegment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShipmentRouteSegment> getShipmentRouteSegments() throws RepositoryException {
        if (this.shipmentRouteSegments == null) {
            this.shipmentRouteSegments = getRelated(ShipmentRouteSegment.class, "ShipmentRouteSegment");
        }
        return this.shipmentRouteSegments;
    }

    /**
     * Auto generated value setter.
     * @param fixedAsset the fixedAsset to set
    */
    public void setFixedAsset(FixedAsset fixedAsset) {
        this.fixedAsset = fixedAsset;
    }
    /**
     * Auto generated value setter.
     * @param originFacility the originFacility to set
    */
    public void setOriginFacility(Facility originFacility) {
        this.originFacility = originFacility;
    }
    /**
     * Auto generated value setter.
     * @param destFacility the destFacility to set
    */
    public void setDestFacility(Facility destFacility) {
        this.destFacility = destFacility;
    }
    /**
     * Auto generated value setter.
     * @param shipmentRouteSegments the shipmentRouteSegments to set
    */
    public void setShipmentRouteSegments(List<ShipmentRouteSegment> shipmentRouteSegments) {
        this.shipmentRouteSegments = shipmentRouteSegments;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setDeliveryId((String) mapValue.get("deliveryId"));
        setOriginFacilityId((String) mapValue.get("originFacilityId"));
        setDestFacilityId((String) mapValue.get("destFacilityId"));
        setActualStartDate((Timestamp) mapValue.get("actualStartDate"));
        setActualArrivalDate((Timestamp) mapValue.get("actualArrivalDate"));
        setEstimatedStartDate((Timestamp) mapValue.get("estimatedStartDate"));
        setEstimatedArrivalDate((Timestamp) mapValue.get("estimatedArrivalDate"));
        setFixedAssetId((String) mapValue.get("fixedAssetId"));
        setStartMileage(convertToBigDecimal(mapValue.get("startMileage")));
        setEndMileage(convertToBigDecimal(mapValue.get("endMileage")));
        setFuelUsed(convertToBigDecimal(mapValue.get("fuelUsed")));
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
        mapValue.put("deliveryId", getDeliveryId());
        mapValue.put("originFacilityId", getOriginFacilityId());
        mapValue.put("destFacilityId", getDestFacilityId());
        mapValue.put("actualStartDate", getActualStartDate());
        mapValue.put("actualArrivalDate", getActualArrivalDate());
        mapValue.put("estimatedStartDate", getEstimatedStartDate());
        mapValue.put("estimatedArrivalDate", getEstimatedArrivalDate());
        mapValue.put("fixedAssetId", getFixedAssetId());
        mapValue.put("startMileage", getStartMileage());
        mapValue.put("endMileage", getEndMileage());
        mapValue.put("fuelUsed", getFuelUsed());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
