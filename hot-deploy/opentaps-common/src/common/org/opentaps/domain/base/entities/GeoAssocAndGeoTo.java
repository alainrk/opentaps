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

/**
 * Auto generated base entity GeoAssocAndGeoTo.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectGeoAssocAndGeoTos", query="SELECT GA.GEO_ID AS \"geoId\",GA.GEO_ASSOC_TYPE_ID AS \"geoAssocTypeId\",GTO.GEO_ID AS \"geoId\",GTO.GEO_TYPE_ID AS \"geoTypeId\",GTO.GEO_NAME AS \"geoName\",GTO.GEO_CODE AS \"geoCode\",GTO.GEO_SEC_CODE AS \"geoSecCode\",GTO.ABBREVIATION AS \"abbreviation\",GTO.WELL_KNOWN_TEXT AS \"wellKnownText\" FROM GEO_ASSOC GA INNER JOIN GEO GTO ON GA.GEO_ID_TO = GTO.GEO_ID", resultSetMapping="GeoAssocAndGeoToMapping")
@SqlResultSetMapping(name="GeoAssocAndGeoToMapping", entities={
@EntityResult(entityClass=GeoAssocAndGeoTo.class, fields = {
@FieldResult(name="geoIdFrom", column="geoIdFrom")
,@FieldResult(name="geoAssocTypeId", column="geoAssocTypeId")
,@FieldResult(name="geoId", column="geoId")
,@FieldResult(name="geoTypeId", column="geoTypeId")
,@FieldResult(name="geoName", column="geoName")
,@FieldResult(name="geoCode", column="geoCode")
,@FieldResult(name="geoSecCode", column="geoSecCode")
,@FieldResult(name="abbreviation", column="abbreviation")
,@FieldResult(name="wellKnownText", column="wellKnownText")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class GeoAssocAndGeoTo extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("geoIdFrom", "GA.GEO_ID");
        fields.put("geoAssocTypeId", "GA.GEO_ASSOC_TYPE_ID");
        fields.put("geoId", "GTO.GEO_ID");
        fields.put("geoTypeId", "GTO.GEO_TYPE_ID");
        fields.put("geoName", "GTO.GEO_NAME");
        fields.put("geoCode", "GTO.GEO_CODE");
        fields.put("geoSecCode", "GTO.GEO_SEC_CODE");
        fields.put("abbreviation", "GTO.ABBREVIATION");
        fields.put("wellKnownText", "GTO.WELL_KNOWN_TEXT");
fieldMapColumns.put("GeoAssocAndGeoTo", fields);
}
  public static enum Fields implements EntityFieldInterface<GeoAssocAndGeoTo> {
    geoIdFrom("geoIdFrom"),
    geoAssocTypeId("geoAssocTypeId"),
    geoId("geoId"),
    geoTypeId("geoTypeId"),
    geoName("geoName"),
    geoCode("geoCode"),
    geoSecCode("geoSecCode"),
    abbreviation("abbreviation"),
    wellKnownText("wellKnownText");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String geoIdFrom;
    
   private String geoAssocTypeId;
    @Id
   private String geoId;
    
   private String geoTypeId;
    
   private String geoName;
    
   private String geoCode;
    
   private String geoSecCode;
    
   private String abbreviation;
    
   private String wellKnownText;

  /**
   * Default constructor.
   */
  public GeoAssocAndGeoTo() {
      super();
      this.baseEntityName = "GeoAssocAndGeoTo";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("geoIdFrom");this.primaryKeyNames.add("geoId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("geoIdFrom");this.allFieldsNames.add("geoAssocTypeId");this.allFieldsNames.add("geoId");this.allFieldsNames.add("geoTypeId");this.allFieldsNames.add("geoName");this.allFieldsNames.add("geoCode");this.allFieldsNames.add("geoSecCode");this.allFieldsNames.add("abbreviation");this.allFieldsNames.add("wellKnownText");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GeoAssocAndGeoTo(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param geoIdFrom the geoIdFrom to set
     */
    public void setGeoIdFrom(String geoIdFrom) {
        this.geoIdFrom = geoIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param geoAssocTypeId the geoAssocTypeId to set
     */
    public void setGeoAssocTypeId(String geoAssocTypeId) {
        this.geoAssocTypeId = geoAssocTypeId;
    }
    /**
     * Auto generated value setter.
     * @param geoId the geoId to set
     */
    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
    /**
     * Auto generated value setter.
     * @param geoTypeId the geoTypeId to set
     */
    public void setGeoTypeId(String geoTypeId) {
        this.geoTypeId = geoTypeId;
    }
    /**
     * Auto generated value setter.
     * @param geoName the geoName to set
     */
    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }
    /**
     * Auto generated value setter.
     * @param geoCode the geoCode to set
     */
    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }
    /**
     * Auto generated value setter.
     * @param geoSecCode the geoSecCode to set
     */
    public void setGeoSecCode(String geoSecCode) {
        this.geoSecCode = geoSecCode;
    }
    /**
     * Auto generated value setter.
     * @param abbreviation the abbreviation to set
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    /**
     * Auto generated value setter.
     * @param wellKnownText the wellKnownText to set
     */
    public void setWellKnownText(String wellKnownText) {
        this.wellKnownText = wellKnownText;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoIdFrom() {
        return this.geoIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoAssocTypeId() {
        return this.geoAssocTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoId() {
        return this.geoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoTypeId() {
        return this.geoTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoName() {
        return this.geoName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoCode() {
        return this.geoCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoSecCode() {
        return this.geoSecCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAbbreviation() {
        return this.abbreviation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWellKnownText() {
        return this.wellKnownText;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGeoIdFrom((String) mapValue.get("geoIdFrom"));
        setGeoAssocTypeId((String) mapValue.get("geoAssocTypeId"));
        setGeoId((String) mapValue.get("geoId"));
        setGeoTypeId((String) mapValue.get("geoTypeId"));
        setGeoName((String) mapValue.get("geoName"));
        setGeoCode((String) mapValue.get("geoCode"));
        setGeoSecCode((String) mapValue.get("geoSecCode"));
        setAbbreviation((String) mapValue.get("abbreviation"));
        setWellKnownText((String) mapValue.get("wellKnownText"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("geoIdFrom", getGeoIdFrom());
        mapValue.put("geoAssocTypeId", getGeoAssocTypeId());
        mapValue.put("geoId", getGeoId());
        mapValue.put("geoTypeId", getGeoTypeId());
        mapValue.put("geoName", getGeoName());
        mapValue.put("geoCode", getGeoCode());
        mapValue.put("geoSecCode", getGeoSecCode());
        mapValue.put("abbreviation", getAbbreviation());
        mapValue.put("wellKnownText", getWellKnownText());
        return mapValue;
    }


}
