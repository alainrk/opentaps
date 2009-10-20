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
 * Auto generated base entity FacilityLocation.
 */
@javax.persistence.Entity
@Table(name="FACILITY_LOCATION")
public class FacilityLocation extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityId", "FACILITY_ID");
        fields.put("locationSeqId", "LOCATION_SEQ_ID");
        fields.put("locationTypeEnumId", "LOCATION_TYPE_ENUM_ID");
        fields.put("areaId", "AREA_ID");
        fields.put("aisleId", "AISLE_ID");
        fields.put("sectionId", "SECTION_ID");
        fields.put("levelId", "LEVEL_ID");
        fields.put("positionId", "POSITION_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FacilityLocation", fields);
}
  public static enum Fields implements EntityFieldInterface<FacilityLocation> {
    facilityId("facilityId"),
    locationSeqId("locationSeqId"),
    locationTypeEnumId("locationTypeEnumId"),
    areaId("areaId"),
    aisleId("aisleId"),
    sectionId("sectionId"),
    levelId("levelId"),
    positionId("positionId"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.FacilityLocationPkBridge.class)
     private FacilityLocationPk id = new FacilityLocationPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>FacilityLocationPk</code>
     */
      public FacilityLocationPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>FacilityLocationPk</code> value to set
    */   
      public void setId(FacilityLocationPk id) {
         this.id = id;
      }
   @Column(name="LOCATION_TYPE_ENUM_ID")
   private String locationTypeEnumId;
   @Column(name="AREA_ID")
   private String areaId;
   @Column(name="AISLE_ID")
   private String aisleId;
   @Column(name="SECTION_ID")
   private String sectionId;
   @Column(name="LEVEL_ID")
   private String levelId;
   @Column(name="POSITION_ID")
   private String positionId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Facility facility = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="LOCATION_TYPE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration typeEnumeration = null;
   private transient List<FacilityLocationGeoPoint> facilityLocationGeoPoints = null;
   private transient List<FixedAsset> locatedAtFixedAssets = null;
   private transient List<InventoryItem> inventoryItems = null;
   private transient List<InventoryTransfer> inventoryTransfers = null;
   private transient List<InventoryTransfer> toInventoryTransfers = null;
   private transient List<ProductFacilityLocation> productFacilityLocations = null;

  /**
   * Default constructor.
   */
  public FacilityLocation() {
      super();
      this.baseEntityName = "FacilityLocation";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("facilityId");this.primaryKeyNames.add("locationSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityId");this.allFieldsNames.add("locationSeqId");this.allFieldsNames.add("locationTypeEnumId");this.allFieldsNames.add("areaId");this.allFieldsNames.add("aisleId");this.allFieldsNames.add("sectionId");this.allFieldsNames.add("levelId");this.allFieldsNames.add("positionId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FacilityLocation(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        id.setFacilityId(facilityId);
    }
    /**
     * Auto generated value setter.
     * @param locationSeqId the locationSeqId to set
     */
    public void setLocationSeqId(String locationSeqId) {
        id.setLocationSeqId(locationSeqId);
    }
    /**
     * Auto generated value setter.
     * @param locationTypeEnumId the locationTypeEnumId to set
     */
    public void setLocationTypeEnumId(String locationTypeEnumId) {
        this.locationTypeEnumId = locationTypeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param areaId the areaId to set
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
    /**
     * Auto generated value setter.
     * @param aisleId the aisleId to set
     */
    public void setAisleId(String aisleId) {
        this.aisleId = aisleId;
    }
    /**
     * Auto generated value setter.
     * @param sectionId the sectionId to set
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }
    /**
     * Auto generated value setter.
     * @param levelId the levelId to set
     */
    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }
    /**
     * Auto generated value setter.
     * @param positionId the positionId to set
     */
    public void setPositionId(String positionId) {
        this.positionId = positionId;
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
    public String getFacilityId() {
        return this.id.getFacilityId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLocationSeqId() {
        return this.id.getLocationSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLocationTypeEnumId() {
        return this.locationTypeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAreaId() {
        return this.areaId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAisleId() {
        return this.aisleId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSectionId() {
        return this.sectionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLevelId() {
        return this.levelId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPositionId() {
        return this.positionId;
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
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>Facility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getFacility() throws RepositoryException {
        if (this.facility == null) {
            this.facility = getRelatedOne(Facility.class, "Facility");
        }
        return this.facility;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>TypeEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getTypeEnumeration() throws RepositoryException {
        if (this.typeEnumeration == null) {
            this.typeEnumeration = getRelatedOne(Enumeration.class, "TypeEnumeration");
        }
        return this.typeEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>FacilityLocationGeoPoint</code> by the relation named <code>FacilityLocationGeoPoint</code>.
     * @return the list of <code>FacilityLocationGeoPoint</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityLocationGeoPoint> getFacilityLocationGeoPoints() throws RepositoryException {
        if (this.facilityLocationGeoPoints == null) {
            this.facilityLocationGeoPoints = getRelated(FacilityLocationGeoPoint.class, "FacilityLocationGeoPoint");
        }
        return this.facilityLocationGeoPoints;
    }
    /**
     * Auto generated method that gets the related <code>FixedAsset</code> by the relation named <code>LocatedAtFixedAsset</code>.
     * @return the list of <code>FixedAsset</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FixedAsset> getLocatedAtFixedAssets() throws RepositoryException {
        if (this.locatedAtFixedAssets == null) {
            this.locatedAtFixedAssets = getRelated(FixedAsset.class, "LocatedAtFixedAsset");
        }
        return this.locatedAtFixedAssets;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItem</code> by the relation named <code>InventoryItem</code>.
     * @return the list of <code>InventoryItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItem> getInventoryItems() throws RepositoryException {
        if (this.inventoryItems == null) {
            this.inventoryItems = getRelated(InventoryItem.class, "InventoryItem");
        }
        return this.inventoryItems;
    }
    /**
     * Auto generated method that gets the related <code>InventoryTransfer</code> by the relation named <code>InventoryTransfer</code>.
     * @return the list of <code>InventoryTransfer</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryTransfer> getInventoryTransfers() throws RepositoryException {
        if (this.inventoryTransfers == null) {
            this.inventoryTransfers = getRelated(InventoryTransfer.class, "InventoryTransfer");
        }
        return this.inventoryTransfers;
    }
    /**
     * Auto generated method that gets the related <code>InventoryTransfer</code> by the relation named <code>ToInventoryTransfer</code>.
     * @return the list of <code>InventoryTransfer</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryTransfer> getToInventoryTransfers() throws RepositoryException {
        if (this.toInventoryTransfers == null) {
            this.toInventoryTransfers = getRelated(InventoryTransfer.class, "ToInventoryTransfer");
        }
        return this.toInventoryTransfers;
    }
    /**
     * Auto generated method that gets the related <code>ProductFacilityLocation</code> by the relation named <code>ProductFacilityLocation</code>.
     * @return the list of <code>ProductFacilityLocation</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductFacilityLocation> getProductFacilityLocations() throws RepositoryException {
        if (this.productFacilityLocations == null) {
            this.productFacilityLocations = getRelated(ProductFacilityLocation.class, "ProductFacilityLocation");
        }
        return this.productFacilityLocations;
    }

    /**
     * Auto generated value setter.
     * @param facility the facility to set
    */
    public void setFacility(Facility facility) {
        this.facility = facility;
    }
    /**
     * Auto generated value setter.
     * @param typeEnumeration the typeEnumeration to set
    */
    public void setTypeEnumeration(Enumeration typeEnumeration) {
        this.typeEnumeration = typeEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param facilityLocationGeoPoints the facilityLocationGeoPoints to set
    */
    public void setFacilityLocationGeoPoints(List<FacilityLocationGeoPoint> facilityLocationGeoPoints) {
        this.facilityLocationGeoPoints = facilityLocationGeoPoints;
    }
    /**
     * Auto generated value setter.
     * @param locatedAtFixedAssets the locatedAtFixedAssets to set
    */
    public void setLocatedAtFixedAssets(List<FixedAsset> locatedAtFixedAssets) {
        this.locatedAtFixedAssets = locatedAtFixedAssets;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItems the inventoryItems to set
    */
    public void setInventoryItems(List<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }
    /**
     * Auto generated value setter.
     * @param inventoryTransfers the inventoryTransfers to set
    */
    public void setInventoryTransfers(List<InventoryTransfer> inventoryTransfers) {
        this.inventoryTransfers = inventoryTransfers;
    }
    /**
     * Auto generated value setter.
     * @param toInventoryTransfers the toInventoryTransfers to set
    */
    public void setToInventoryTransfers(List<InventoryTransfer> toInventoryTransfers) {
        this.toInventoryTransfers = toInventoryTransfers;
    }
    /**
     * Auto generated value setter.
     * @param productFacilityLocations the productFacilityLocations to set
    */
    public void setProductFacilityLocations(List<ProductFacilityLocation> productFacilityLocations) {
        this.productFacilityLocations = productFacilityLocations;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFacilityId((String) mapValue.get("facilityId"));
        setLocationSeqId((String) mapValue.get("locationSeqId"));
        setLocationTypeEnumId((String) mapValue.get("locationTypeEnumId"));
        setAreaId((String) mapValue.get("areaId"));
        setAisleId((String) mapValue.get("aisleId"));
        setSectionId((String) mapValue.get("sectionId"));
        setLevelId((String) mapValue.get("levelId"));
        setPositionId((String) mapValue.get("positionId"));
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
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("locationSeqId", getLocationSeqId());
        mapValue.put("locationTypeEnumId", getLocationTypeEnumId());
        mapValue.put("areaId", getAreaId());
        mapValue.put("aisleId", getAisleId());
        mapValue.put("sectionId", getSectionId());
        mapValue.put("levelId", getLevelId());
        mapValue.put("positionId", getPositionId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
