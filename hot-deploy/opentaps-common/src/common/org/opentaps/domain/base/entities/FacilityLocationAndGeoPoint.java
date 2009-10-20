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
 * Auto generated base entity FacilityLocationAndGeoPoint.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectFacilityLocationAndGeoPoints", query="SELECT FL.FACILITY_ID AS \"facilityId\",FL.LOCATION_SEQ_ID AS \"locationSeqId\",FLGPT.FROM_DATE AS \"fromDate\",FLGPT.THRU_DATE AS \"thruDate\",GPT.GEO_POINT_ID AS \"geoPointId\",GPT.DATA_SOURCE_ID AS \"dataSourceId\",GPT.LATITUDE AS \"latitude\",GPT.LONGITUDE AS \"longitude\",GPT.ELEVATION AS \"elevation\",GPT.ELEVATION_UOM_ID AS \"elevationUomId\",GPT.INFORMATION AS \"information\" FROM FACILITY_LOCATION FL INNER JOIN FACILITY_LOCATION_GEO_POINT FLGPT ON FL.FACILITY_ID = FLGPT.FACILITY_ID AND FL.LOCATION_SEQ_ID = FLGPT.LOCATION_SEQ_ID INNER JOIN GEO_POINT GPT ON FLGPT.GEO_POINT_ID = GPT.GEO_POINT_ID", resultSetMapping="FacilityLocationAndGeoPointMapping")
@SqlResultSetMapping(name="FacilityLocationAndGeoPointMapping", entities={
@EntityResult(entityClass=FacilityLocationAndGeoPoint.class, fields = {
@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="locationSeqId", column="locationSeqId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="geoPointId", column="geoPointId")
,@FieldResult(name="dataSourceId", column="dataSourceId")
,@FieldResult(name="latitude", column="latitude")
,@FieldResult(name="longitude", column="longitude")
,@FieldResult(name="elevation", column="elevation")
,@FieldResult(name="elevationUomId", column="elevationUomId")
,@FieldResult(name="information", column="information")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class FacilityLocationAndGeoPoint extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityId", "FL.FACILITY_ID");
        fields.put("locationSeqId", "FL.LOCATION_SEQ_ID");
        fields.put("fromDate", "FLGPT.FROM_DATE");
        fields.put("thruDate", "FLGPT.THRU_DATE");
        fields.put("geoPointId", "GPT.GEO_POINT_ID");
        fields.put("dataSourceId", "GPT.DATA_SOURCE_ID");
        fields.put("latitude", "GPT.LATITUDE");
        fields.put("longitude", "GPT.LONGITUDE");
        fields.put("elevation", "GPT.ELEVATION");
        fields.put("elevationUomId", "GPT.ELEVATION_UOM_ID");
        fields.put("information", "GPT.INFORMATION");
fieldMapColumns.put("FacilityLocationAndGeoPoint", fields);
}
  public static enum Fields implements EntityFieldInterface<FacilityLocationAndGeoPoint> {
    facilityId("facilityId"),
    locationSeqId("locationSeqId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    geoPointId("geoPointId"),
    dataSourceId("dataSourceId"),
    latitude("latitude"),
    longitude("longitude"),
    elevation("elevation"),
    elevationUomId("elevationUomId"),
    information("information");
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
   private String facilityId;
    
   private String locationSeqId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String geoPointId;
    
   private String dataSourceId;
    
   private BigDecimal latitude;
    
   private BigDecimal longitude;
    
   private BigDecimal elevation;
    
   private String elevationUomId;
    
   private String information;
   private transient List<FacilityLocationGeoPoint> facilityLocationGeoPoints = null;
   private transient FacilityLocation facilityLocation = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GEO_POINT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GeoPoint geoPoint = null;

  /**
   * Default constructor.
   */
  public FacilityLocationAndGeoPoint() {
      super();
      this.baseEntityName = "FacilityLocationAndGeoPoint";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("facilityId");this.primaryKeyNames.add("locationSeqId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("geoPointId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityId");this.allFieldsNames.add("locationSeqId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("geoPointId");this.allFieldsNames.add("dataSourceId");this.allFieldsNames.add("latitude");this.allFieldsNames.add("longitude");this.allFieldsNames.add("elevation");this.allFieldsNames.add("elevationUomId");this.allFieldsNames.add("information");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FacilityLocationAndGeoPoint(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param locationSeqId the locationSeqId to set
     */
    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
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
     * @param geoPointId the geoPointId to set
     */
    public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }
    /**
     * Auto generated value setter.
     * @param dataSourceId the dataSourceId to set
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    /**
     * Auto generated value setter.
     * @param latitude the latitude to set
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
    /**
     * Auto generated value setter.
     * @param longitude the longitude to set
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
    /**
     * Auto generated value setter.
     * @param elevation the elevation to set
     */
    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }
    /**
     * Auto generated value setter.
     * @param elevationUomId the elevationUomId to set
     */
    public void setElevationUomId(String elevationUomId) {
        this.elevationUomId = elevationUomId;
    }
    /**
     * Auto generated value setter.
     * @param information the information to set
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.facilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLocationSeqId() {
        return this.locationSeqId;
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
     * @return <code>String</code>
     */
    public String getGeoPointId() {
        return this.geoPointId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getLatitude() {
        return this.latitude;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getLongitude() {
        return this.longitude;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getElevation() {
        return this.elevation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getElevationUomId() {
        return this.elevationUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInformation() {
        return this.information;
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
     * Auto generated method that gets the related <code>FacilityLocation</code> by the relation named <code>FacilityLocation</code>.
     * @return the <code>FacilityLocation</code>
     * @throws RepositoryException if an error occurs
     */
    public FacilityLocation getFacilityLocation() throws RepositoryException {
        if (this.facilityLocation == null) {
            this.facilityLocation = getRelatedOne(FacilityLocation.class, "FacilityLocation");
        }
        return this.facilityLocation;
    }
    /**
     * Auto generated method that gets the related <code>GeoPoint</code> by the relation named <code>GeoPoint</code>.
     * @return the <code>GeoPoint</code>
     * @throws RepositoryException if an error occurs
     */
    public GeoPoint getGeoPoint() throws RepositoryException {
        if (this.geoPoint == null) {
            this.geoPoint = getRelatedOne(GeoPoint.class, "GeoPoint");
        }
        return this.geoPoint;
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
     * @param facilityLocation the facilityLocation to set
    */
    public void setFacilityLocation(FacilityLocation facilityLocation) {
        this.facilityLocation = facilityLocation;
    }
    /**
     * Auto generated value setter.
     * @param geoPoint the geoPoint to set
    */
    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFacilityId((String) mapValue.get("facilityId"));
        setLocationSeqId((String) mapValue.get("locationSeqId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setGeoPointId((String) mapValue.get("geoPointId"));
        setDataSourceId((String) mapValue.get("dataSourceId"));
        setLatitude(convertToBigDecimal(mapValue.get("latitude")));
        setLongitude(convertToBigDecimal(mapValue.get("longitude")));
        setElevation(convertToBigDecimal(mapValue.get("elevation")));
        setElevationUomId((String) mapValue.get("elevationUomId"));
        setInformation((String) mapValue.get("information"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("locationSeqId", getLocationSeqId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("geoPointId", getGeoPointId());
        mapValue.put("dataSourceId", getDataSourceId());
        mapValue.put("latitude", getLatitude());
        mapValue.put("longitude", getLongitude());
        mapValue.put("elevation", getElevation());
        mapValue.put("elevationUomId", getElevationUomId());
        mapValue.put("information", getInformation());
        return mapValue;
    }


}
