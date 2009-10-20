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
 * Auto generated base entity ContactMechDetail.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectContactMechDetails", query="SELECT CM.CONTACT_MECH_ID AS \"contactMechId\",CM.CONTACT_MECH_TYPE_ID AS \"contactMechTypeId\",CM.INFO_STRING AS \"infoString\",PA.TO_NAME AS \"toName\",PA.ATTN_NAME AS \"attnName\",PA.ADDRESS1 AS \"address1\",PA.ADDRESS2 AS \"address2\",PA.DIRECTIONS AS \"directions\",PA.CITY AS \"city\",PA.POSTAL_CODE AS \"postalCode\",PA.POSTAL_CODE_EXT AS \"postalCodeExt\",PA.COUNTRY_GEO_ID AS \"countryGeoId\",PA.STATE_PROVINCE_GEO_ID AS \"stateProvinceGeoId\",PA.COUNTY_GEO_ID AS \"countyGeoId\",PA.POSTAL_CODE_GEO_ID AS \"postalCodeGeoId\",PA.GEO_POINT_ID AS \"geoPointId\",TN.COUNTRY_CODE AS \"countryCode\",TN.AREA_CODE AS \"areaCode\",TN.CONTACT_NUMBER AS \"contactNumber\",TN.ASK_FOR_NAME AS \"askForName\" FROM CONTACT_MECH CM LEFT JOIN POSTAL_ADDRESS PA ON CM.CONTACT_MECH_ID = PA.CONTACT_MECH_ID LEFT JOIN TELECOM_NUMBER TN ON CM.CONTACT_MECH_ID = TN.CONTACT_MECH_ID", resultSetMapping="ContactMechDetailMapping")
@SqlResultSetMapping(name="ContactMechDetailMapping", entities={
@EntityResult(entityClass=ContactMechDetail.class, fields = {
@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="contactMechTypeId", column="contactMechTypeId")
,@FieldResult(name="infoString", column="infoString")
,@FieldResult(name="paToName", column="paToName")
,@FieldResult(name="paAttnName", column="paAttnName")
,@FieldResult(name="paAddress1", column="paAddress1")
,@FieldResult(name="paAddress2", column="paAddress2")
,@FieldResult(name="paDirections", column="paDirections")
,@FieldResult(name="paCity", column="paCity")
,@FieldResult(name="paPostalCode", column="paPostalCode")
,@FieldResult(name="paPostalCodeExt", column="paPostalCodeExt")
,@FieldResult(name="paCountryGeoId", column="paCountryGeoId")
,@FieldResult(name="paStateProvinceGeoId", column="paStateProvinceGeoId")
,@FieldResult(name="paCountyGeoId", column="paCountyGeoId")
,@FieldResult(name="paPostalCodeGeoId", column="paPostalCodeGeoId")
,@FieldResult(name="paGeoPointId", column="paGeoPointId")
,@FieldResult(name="tnCountryCode", column="tnCountryCode")
,@FieldResult(name="tnAreaCode", column="tnAreaCode")
,@FieldResult(name="tnContactNumber", column="tnContactNumber")
,@FieldResult(name="tnAskForName", column="tnAskForName")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ContactMechDetail extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contactMechId", "CM.CONTACT_MECH_ID");
        fields.put("contactMechTypeId", "CM.CONTACT_MECH_TYPE_ID");
        fields.put("infoString", "CM.INFO_STRING");
        fields.put("paToName", "PA.TO_NAME");
        fields.put("paAttnName", "PA.ATTN_NAME");
        fields.put("paAddress1", "PA.ADDRESS1");
        fields.put("paAddress2", "PA.ADDRESS2");
        fields.put("paDirections", "PA.DIRECTIONS");
        fields.put("paCity", "PA.CITY");
        fields.put("paPostalCode", "PA.POSTAL_CODE");
        fields.put("paPostalCodeExt", "PA.POSTAL_CODE_EXT");
        fields.put("paCountryGeoId", "PA.COUNTRY_GEO_ID");
        fields.put("paStateProvinceGeoId", "PA.STATE_PROVINCE_GEO_ID");
        fields.put("paCountyGeoId", "PA.COUNTY_GEO_ID");
        fields.put("paPostalCodeGeoId", "PA.POSTAL_CODE_GEO_ID");
        fields.put("paGeoPointId", "PA.GEO_POINT_ID");
        fields.put("tnCountryCode", "TN.COUNTRY_CODE");
        fields.put("tnAreaCode", "TN.AREA_CODE");
        fields.put("tnContactNumber", "TN.CONTACT_NUMBER");
        fields.put("tnAskForName", "TN.ASK_FOR_NAME");
fieldMapColumns.put("ContactMechDetail", fields);
}
  public static enum Fields implements EntityFieldInterface<ContactMechDetail> {
    contactMechId("contactMechId"),
    contactMechTypeId("contactMechTypeId"),
    infoString("infoString"),
    paToName("paToName"),
    paAttnName("paAttnName"),
    paAddress1("paAddress1"),
    paAddress2("paAddress2"),
    paDirections("paDirections"),
    paCity("paCity"),
    paPostalCode("paPostalCode"),
    paPostalCodeExt("paPostalCodeExt"),
    paCountryGeoId("paCountryGeoId"),
    paStateProvinceGeoId("paStateProvinceGeoId"),
    paCountyGeoId("paCountyGeoId"),
    paPostalCodeGeoId("paPostalCodeGeoId"),
    paGeoPointId("paGeoPointId"),
    tnCountryCode("tnCountryCode"),
    tnAreaCode("tnAreaCode"),
    tnContactNumber("tnContactNumber"),
    tnAskForName("tnAskForName");
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
   private String contactMechId;
    
   private String contactMechTypeId;
    
   private String infoString;
    
   private String paToName;
    
   private String paAttnName;
    
   private String paAddress1;
    
   private String paAddress2;
    
   private String paDirections;
    
   private String paCity;
    
   private String paPostalCode;
    
   private String paPostalCodeExt;
    
   private String paCountryGeoId;
    
   private String paStateProvinceGeoId;
    
   private String paCountyGeoId;
    
   private String paPostalCodeGeoId;
    
   private String paGeoPointId;
    
   private String tnCountryCode;
    
   private String tnAreaCode;
    
   private String tnContactNumber;
    
   private String tnAskForName;

  /**
   * Default constructor.
   */
  public ContactMechDetail() {
      super();
      this.baseEntityName = "ContactMechDetail";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("contactMechId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("contactMechTypeId");this.allFieldsNames.add("infoString");this.allFieldsNames.add("paToName");this.allFieldsNames.add("paAttnName");this.allFieldsNames.add("paAddress1");this.allFieldsNames.add("paAddress2");this.allFieldsNames.add("paDirections");this.allFieldsNames.add("paCity");this.allFieldsNames.add("paPostalCode");this.allFieldsNames.add("paPostalCodeExt");this.allFieldsNames.add("paCountryGeoId");this.allFieldsNames.add("paStateProvinceGeoId");this.allFieldsNames.add("paCountyGeoId");this.allFieldsNames.add("paPostalCodeGeoId");this.allFieldsNames.add("paGeoPointId");this.allFieldsNames.add("tnCountryCode");this.allFieldsNames.add("tnAreaCode");this.allFieldsNames.add("tnContactNumber");this.allFieldsNames.add("tnAskForName");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ContactMechDetail(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechTypeId the contactMechTypeId to set
     */
    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
    /**
     * Auto generated value setter.
     * @param infoString the infoString to set
     */
    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }
    /**
     * Auto generated value setter.
     * @param paToName the paToName to set
     */
    public void setPaToName(String paToName) {
        this.paToName = paToName;
    }
    /**
     * Auto generated value setter.
     * @param paAttnName the paAttnName to set
     */
    public void setPaAttnName(String paAttnName) {
        this.paAttnName = paAttnName;
    }
    /**
     * Auto generated value setter.
     * @param paAddress1 the paAddress1 to set
     */
    public void setPaAddress1(String paAddress1) {
        this.paAddress1 = paAddress1;
    }
    /**
     * Auto generated value setter.
     * @param paAddress2 the paAddress2 to set
     */
    public void setPaAddress2(String paAddress2) {
        this.paAddress2 = paAddress2;
    }
    /**
     * Auto generated value setter.
     * @param paDirections the paDirections to set
     */
    public void setPaDirections(String paDirections) {
        this.paDirections = paDirections;
    }
    /**
     * Auto generated value setter.
     * @param paCity the paCity to set
     */
    public void setPaCity(String paCity) {
        this.paCity = paCity;
    }
    /**
     * Auto generated value setter.
     * @param paPostalCode the paPostalCode to set
     */
    public void setPaPostalCode(String paPostalCode) {
        this.paPostalCode = paPostalCode;
    }
    /**
     * Auto generated value setter.
     * @param paPostalCodeExt the paPostalCodeExt to set
     */
    public void setPaPostalCodeExt(String paPostalCodeExt) {
        this.paPostalCodeExt = paPostalCodeExt;
    }
    /**
     * Auto generated value setter.
     * @param paCountryGeoId the paCountryGeoId to set
     */
    public void setPaCountryGeoId(String paCountryGeoId) {
        this.paCountryGeoId = paCountryGeoId;
    }
    /**
     * Auto generated value setter.
     * @param paStateProvinceGeoId the paStateProvinceGeoId to set
     */
    public void setPaStateProvinceGeoId(String paStateProvinceGeoId) {
        this.paStateProvinceGeoId = paStateProvinceGeoId;
    }
    /**
     * Auto generated value setter.
     * @param paCountyGeoId the paCountyGeoId to set
     */
    public void setPaCountyGeoId(String paCountyGeoId) {
        this.paCountyGeoId = paCountyGeoId;
    }
    /**
     * Auto generated value setter.
     * @param paPostalCodeGeoId the paPostalCodeGeoId to set
     */
    public void setPaPostalCodeGeoId(String paPostalCodeGeoId) {
        this.paPostalCodeGeoId = paPostalCodeGeoId;
    }
    /**
     * Auto generated value setter.
     * @param paGeoPointId the paGeoPointId to set
     */
    public void setPaGeoPointId(String paGeoPointId) {
        this.paGeoPointId = paGeoPointId;
    }
    /**
     * Auto generated value setter.
     * @param tnCountryCode the tnCountryCode to set
     */
    public void setTnCountryCode(String tnCountryCode) {
        this.tnCountryCode = tnCountryCode;
    }
    /**
     * Auto generated value setter.
     * @param tnAreaCode the tnAreaCode to set
     */
    public void setTnAreaCode(String tnAreaCode) {
        this.tnAreaCode = tnAreaCode;
    }
    /**
     * Auto generated value setter.
     * @param tnContactNumber the tnContactNumber to set
     */
    public void setTnContactNumber(String tnContactNumber) {
        this.tnContactNumber = tnContactNumber;
    }
    /**
     * Auto generated value setter.
     * @param tnAskForName the tnAskForName to set
     */
    public void setTnAskForName(String tnAskForName) {
        this.tnAskForName = tnAskForName;
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
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInfoString() {
        return this.infoString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaToName() {
        return this.paToName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaAttnName() {
        return this.paAttnName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaAddress1() {
        return this.paAddress1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaAddress2() {
        return this.paAddress2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaDirections() {
        return this.paDirections;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaCity() {
        return this.paCity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaPostalCode() {
        return this.paPostalCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaPostalCodeExt() {
        return this.paPostalCodeExt;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaCountryGeoId() {
        return this.paCountryGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaStateProvinceGeoId() {
        return this.paStateProvinceGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaCountyGeoId() {
        return this.paCountyGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaPostalCodeGeoId() {
        return this.paPostalCodeGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaGeoPointId() {
        return this.paGeoPointId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTnCountryCode() {
        return this.tnCountryCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTnAreaCode() {
        return this.tnAreaCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTnContactNumber() {
        return this.tnContactNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTnAskForName() {
        return this.tnAskForName;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContactMechId((String) mapValue.get("contactMechId"));
        setContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        setInfoString((String) mapValue.get("infoString"));
        setPaToName((String) mapValue.get("paToName"));
        setPaAttnName((String) mapValue.get("paAttnName"));
        setPaAddress1((String) mapValue.get("paAddress1"));
        setPaAddress2((String) mapValue.get("paAddress2"));
        setPaDirections((String) mapValue.get("paDirections"));
        setPaCity((String) mapValue.get("paCity"));
        setPaPostalCode((String) mapValue.get("paPostalCode"));
        setPaPostalCodeExt((String) mapValue.get("paPostalCodeExt"));
        setPaCountryGeoId((String) mapValue.get("paCountryGeoId"));
        setPaStateProvinceGeoId((String) mapValue.get("paStateProvinceGeoId"));
        setPaCountyGeoId((String) mapValue.get("paCountyGeoId"));
        setPaPostalCodeGeoId((String) mapValue.get("paPostalCodeGeoId"));
        setPaGeoPointId((String) mapValue.get("paGeoPointId"));
        setTnCountryCode((String) mapValue.get("tnCountryCode"));
        setTnAreaCode((String) mapValue.get("tnAreaCode"));
        setTnContactNumber((String) mapValue.get("tnContactNumber"));
        setTnAskForName((String) mapValue.get("tnAskForName"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("contactMechTypeId", getContactMechTypeId());
        mapValue.put("infoString", getInfoString());
        mapValue.put("paToName", getPaToName());
        mapValue.put("paAttnName", getPaAttnName());
        mapValue.put("paAddress1", getPaAddress1());
        mapValue.put("paAddress2", getPaAddress2());
        mapValue.put("paDirections", getPaDirections());
        mapValue.put("paCity", getPaCity());
        mapValue.put("paPostalCode", getPaPostalCode());
        mapValue.put("paPostalCodeExt", getPaPostalCodeExt());
        mapValue.put("paCountryGeoId", getPaCountryGeoId());
        mapValue.put("paStateProvinceGeoId", getPaStateProvinceGeoId());
        mapValue.put("paCountyGeoId", getPaCountyGeoId());
        mapValue.put("paPostalCodeGeoId", getPaPostalCodeGeoId());
        mapValue.put("paGeoPointId", getPaGeoPointId());
        mapValue.put("tnCountryCode", getTnCountryCode());
        mapValue.put("tnAreaCode", getTnAreaCode());
        mapValue.put("tnContactNumber", getTnContactNumber());
        mapValue.put("tnAskForName", getTnAskForName());
        return mapValue;
    }


}
