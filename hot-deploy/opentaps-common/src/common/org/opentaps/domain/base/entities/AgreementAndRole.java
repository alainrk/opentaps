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
 * Auto generated base entity AgreementAndRole.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectAgreementAndRoles", query="SELECT AGR.AGREEMENT_ID AS \"agreementId\",AGR.PRODUCT_ID AS \"productId\",AGR.PARTY_ID_FROM AS \"partyIdFrom\",AGR.PARTY_ID_TO AS \"partyIdTo\",AGR.ROLE_TYPE_ID_FROM AS \"roleTypeIdFrom\",AGR.ROLE_TYPE_ID_TO AS \"roleTypeIdTo\",AGR.AGREEMENT_TYPE_ID AS \"agreementTypeId\",AGR.AGREEMENT_DATE AS \"agreementDate\",AGR.FROM_DATE AS \"fromDate\",AGR.THRU_DATE AS \"thruDate\",AGR.DESCRIPTION AS \"description\",AGR.TEXT_DATA AS \"textData\",AGR.STATUS_ID AS \"statusId\",AGR.DEFAULT_CURRENCY_UOM_ID AS \"defaultCurrencyUomId\",AGR.FROM_PARTY_CLASS_GROUP_ID AS \"fromPartyClassGroupId\",AGR.TO_PARTY_CLASS_GROUP_ID AS \"toPartyClassGroupId\",AR.PARTY_ID AS \"partyId\",AR.ROLE_TYPE_ID AS \"roleTypeId\" FROM AGREEMENT AGR INNER JOIN AGREEMENT_ROLE AR ON AGR.AGREEMENT_ID = AR.AGREEMENT_ID", resultSetMapping="AgreementAndRoleMapping")
@SqlResultSetMapping(name="AgreementAndRoleMapping", entities={
@EntityResult(entityClass=AgreementAndRole.class, fields = {
@FieldResult(name="agreementId", column="agreementId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="roleTypeIdFrom", column="roleTypeIdFrom")
,@FieldResult(name="roleTypeIdTo", column="roleTypeIdTo")
,@FieldResult(name="agreementTypeId", column="agreementTypeId")
,@FieldResult(name="agreementDate", column="agreementDate")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="description", column="description")
,@FieldResult(name="textData", column="textData")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="defaultCurrencyUomId", column="defaultCurrencyUomId")
,@FieldResult(name="fromPartyClassGroupId", column="fromPartyClassGroupId")
,@FieldResult(name="toPartyClassGroupId", column="toPartyClassGroupId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class AgreementAndRole extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("agreementId", "AGR.AGREEMENT_ID");
        fields.put("productId", "AGR.PRODUCT_ID");
        fields.put("partyIdFrom", "AGR.PARTY_ID_FROM");
        fields.put("partyIdTo", "AGR.PARTY_ID_TO");
        fields.put("roleTypeIdFrom", "AGR.ROLE_TYPE_ID_FROM");
        fields.put("roleTypeIdTo", "AGR.ROLE_TYPE_ID_TO");
        fields.put("agreementTypeId", "AGR.AGREEMENT_TYPE_ID");
        fields.put("agreementDate", "AGR.AGREEMENT_DATE");
        fields.put("fromDate", "AGR.FROM_DATE");
        fields.put("thruDate", "AGR.THRU_DATE");
        fields.put("description", "AGR.DESCRIPTION");
        fields.put("textData", "AGR.TEXT_DATA");
        fields.put("statusId", "AGR.STATUS_ID");
        fields.put("defaultCurrencyUomId", "AGR.DEFAULT_CURRENCY_UOM_ID");
        fields.put("fromPartyClassGroupId", "AGR.FROM_PARTY_CLASS_GROUP_ID");
        fields.put("toPartyClassGroupId", "AGR.TO_PARTY_CLASS_GROUP_ID");
        fields.put("partyId", "AR.PARTY_ID");
        fields.put("roleTypeId", "AR.ROLE_TYPE_ID");
fieldMapColumns.put("AgreementAndRole", fields);
}
  public static enum Fields implements EntityFieldInterface<AgreementAndRole> {
    agreementId("agreementId"),
    productId("productId"),
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    roleTypeIdFrom("roleTypeIdFrom"),
    roleTypeIdTo("roleTypeIdTo"),
    agreementTypeId("agreementTypeId"),
    agreementDate("agreementDate"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    description("description"),
    textData("textData"),
    statusId("statusId"),
    defaultCurrencyUomId("defaultCurrencyUomId"),
    fromPartyClassGroupId("fromPartyClassGroupId"),
    toPartyClassGroupId("toPartyClassGroupId"),
    partyId("partyId"),
    roleTypeId("roleTypeId");
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
   private String agreementId;
    
   private String productId;
    
   private String partyIdFrom;
    
   private String partyIdTo;
    
   private String roleTypeIdFrom;
    
   private String roleTypeIdTo;
    
   private String agreementTypeId;
    
   private Timestamp agreementDate;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String description;
    
   private String textData;
    
   private String statusId;
    
   private String defaultCurrencyUomId;
    
   private String fromPartyClassGroupId;
    
   private String toPartyClassGroupId;
    
   private String partyId;
    
   private String roleTypeId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType roleType = null;
   private transient PartyRole partyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party toParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType toRoleType = null;
   private transient PartyRole toPartyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID_FROM", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party fromParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID_FROM", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType fromRoleType = null;
   private transient PartyRole fromPartyRole = null;
   private transient List<AgreementRole> agreementRoles = null;

  /**
   * Default constructor.
   */
  public AgreementAndRole() {
      super();
      this.baseEntityName = "AgreementAndRole";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("agreementId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("agreementId");this.allFieldsNames.add("productId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("agreementTypeId");this.allFieldsNames.add("agreementDate");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("description");this.allFieldsNames.add("textData");this.allFieldsNames.add("statusId");this.allFieldsNames.add("defaultCurrencyUomId");this.allFieldsNames.add("fromPartyClassGroupId");this.allFieldsNames.add("toPartyClassGroupId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AgreementAndRole(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param agreementId the agreementId to set
     */
    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
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
     * @param partyIdFrom the partyIdFrom to set
     */
    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdFrom the roleTypeIdFrom to set
     */
    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdTo the roleTypeIdTo to set
     */
    public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
    /**
     * Auto generated value setter.
     * @param agreementTypeId the agreementTypeId to set
     */
    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }
    /**
     * Auto generated value setter.
     * @param agreementDate the agreementDate to set
     */
    public void setAgreementDate(Timestamp agreementDate) {
        this.agreementDate = agreementDate;
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
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param textData the textData to set
     */
    public void setTextData(String textData) {
        this.textData = textData;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param defaultCurrencyUomId the defaultCurrencyUomId to set
     */
    public void setDefaultCurrencyUomId(String defaultCurrencyUomId) {
        this.defaultCurrencyUomId = defaultCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param fromPartyClassGroupId the fromPartyClassGroupId to set
     */
    public void setFromPartyClassGroupId(String fromPartyClassGroupId) {
        this.fromPartyClassGroupId = fromPartyClassGroupId;
    }
    /**
     * Auto generated value setter.
     * @param toPartyClassGroupId the toPartyClassGroupId to set
     */
    public void setToPartyClassGroupId(String toPartyClassGroupId) {
        this.toPartyClassGroupId = toPartyClassGroupId;
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
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementId() {
        return this.agreementId;
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
    public String getPartyIdFrom() {
        return this.partyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.partyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdFrom() {
        return this.roleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdTo() {
        return this.roleTypeIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementTypeId() {
        return this.agreementTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAgreementDate() {
        return this.agreementDate;
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
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTextData() {
        return this.textData;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDefaultCurrencyUomId() {
        return this.defaultCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFromPartyClassGroupId() {
        return this.fromPartyClassGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToPartyClassGroupId() {
        return this.toPartyClassGroupId;
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
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>RoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getRoleType() throws RepositoryException {
        if (this.roleType == null) {
            this.roleType = getRelatedOne(RoleType.class, "RoleType");
        }
        return this.roleType;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>PartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getPartyRole() throws RepositoryException {
        if (this.partyRole == null) {
            this.partyRole = getRelatedOne(PartyRole.class, "PartyRole");
        }
        return this.partyRole;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>ToParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getToParty() throws RepositoryException {
        if (this.toParty == null) {
            this.toParty = getRelatedOne(Party.class, "ToParty");
        }
        return this.toParty;
    }
    /**
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>ToRoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getToRoleType() throws RepositoryException {
        if (this.toRoleType == null) {
            this.toRoleType = getRelatedOne(RoleType.class, "ToRoleType");
        }
        return this.toRoleType;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>ToPartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getToPartyRole() throws RepositoryException {
        if (this.toPartyRole == null) {
            this.toPartyRole = getRelatedOne(PartyRole.class, "ToPartyRole");
        }
        return this.toPartyRole;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>FromParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getFromParty() throws RepositoryException {
        if (this.fromParty == null) {
            this.fromParty = getRelatedOne(Party.class, "FromParty");
        }
        return this.fromParty;
    }
    /**
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>FromRoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getFromRoleType() throws RepositoryException {
        if (this.fromRoleType == null) {
            this.fromRoleType = getRelatedOne(RoleType.class, "FromRoleType");
        }
        return this.fromRoleType;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>FromPartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getFromPartyRole() throws RepositoryException {
        if (this.fromPartyRole == null) {
            this.fromPartyRole = getRelatedOne(PartyRole.class, "FromPartyRole");
        }
        return this.fromPartyRole;
    }
    /**
     * Auto generated method that gets the related <code>AgreementRole</code> by the relation named <code>AgreementRole</code>.
     * @return the list of <code>AgreementRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementRole> getAgreementRoles() throws RepositoryException {
        if (this.agreementRoles == null) {
            this.agreementRoles = getRelated(AgreementRole.class, "AgreementRole");
        }
        return this.agreementRoles;
    }

    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param roleType the roleType to set
    */
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    /**
     * Auto generated value setter.
     * @param partyRole the partyRole to set
    */
    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }
    /**
     * Auto generated value setter.
     * @param toParty the toParty to set
    */
    public void setToParty(Party toParty) {
        this.toParty = toParty;
    }
    /**
     * Auto generated value setter.
     * @param toRoleType the toRoleType to set
    */
    public void setToRoleType(RoleType toRoleType) {
        this.toRoleType = toRoleType;
    }
    /**
     * Auto generated value setter.
     * @param toPartyRole the toPartyRole to set
    */
    public void setToPartyRole(PartyRole toPartyRole) {
        this.toPartyRole = toPartyRole;
    }
    /**
     * Auto generated value setter.
     * @param fromParty the fromParty to set
    */
    public void setFromParty(Party fromParty) {
        this.fromParty = fromParty;
    }
    /**
     * Auto generated value setter.
     * @param fromRoleType the fromRoleType to set
    */
    public void setFromRoleType(RoleType fromRoleType) {
        this.fromRoleType = fromRoleType;
    }
    /**
     * Auto generated value setter.
     * @param fromPartyRole the fromPartyRole to set
    */
    public void setFromPartyRole(PartyRole fromPartyRole) {
        this.fromPartyRole = fromPartyRole;
    }
    /**
     * Auto generated value setter.
     * @param agreementRoles the agreementRoles to set
    */
    public void setAgreementRoles(List<AgreementRole> agreementRoles) {
        this.agreementRoles = agreementRoles;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAgreementId((String) mapValue.get("agreementId"));
        setProductId((String) mapValue.get("productId"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setAgreementTypeId((String) mapValue.get("agreementTypeId"));
        setAgreementDate((Timestamp) mapValue.get("agreementDate"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setDescription((String) mapValue.get("description"));
        setTextData((String) mapValue.get("textData"));
        setStatusId((String) mapValue.get("statusId"));
        setDefaultCurrencyUomId((String) mapValue.get("defaultCurrencyUomId"));
        setFromPartyClassGroupId((String) mapValue.get("fromPartyClassGroupId"));
        setToPartyClassGroupId((String) mapValue.get("toPartyClassGroupId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("agreementId", getAgreementId());
        mapValue.put("productId", getProductId());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("agreementTypeId", getAgreementTypeId());
        mapValue.put("agreementDate", getAgreementDate());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("description", getDescription());
        mapValue.put("textData", getTextData());
        mapValue.put("statusId", getStatusId());
        mapValue.put("defaultCurrencyUomId", getDefaultCurrencyUomId());
        mapValue.put("fromPartyClassGroupId", getFromPartyClassGroupId());
        mapValue.put("toPartyClassGroupId", getToPartyClassGroupId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        return mapValue;
    }


}
