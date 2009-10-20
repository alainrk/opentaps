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
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Auto generated base entity EmploymentAndPerson.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectEmploymentAndPersons", query="SELECT EMPLMNT.ROLE_TYPE_ID_FROM AS \"roleTypeIdFrom\",EMPLMNT.ROLE_TYPE_ID_TO AS \"roleTypeIdTo\",EMPLMNT.PARTY_ID_FROM AS \"partyIdFrom\",EMPLMNT.PARTY_ID_TO AS \"partyIdTo\",EMPLMNT.FROM_DATE AS \"fromDate\",EMPLMNT.THRU_DATE AS \"thruDate\",EMPLMNT.TERMINATION_REASON_ID AS \"terminationReasonId\",EMPLMNT.TERMINATION_TYPE_ID AS \"terminationTypeId\",PERS.PARTY_ID AS \"partyId\",PERS.SALUTATION AS \"salutation\",PERS.FIRST_NAME AS \"firstName\",PERS.MIDDLE_NAME AS \"middleName\",PERS.LAST_NAME AS \"lastName\",PERS.PERSONAL_TITLE AS \"personalTitle\",PERS.SUFFIX AS \"suffix\",PERS.NICKNAME AS \"nickname\",PERS.FIRST_NAME_LOCAL AS \"firstNameLocal\",PERS.MIDDLE_NAME_LOCAL AS \"middleNameLocal\",PERS.LAST_NAME_LOCAL AS \"lastNameLocal\",PERS.OTHER_LOCAL AS \"otherLocal\",PERS.MEMBER_ID AS \"memberId\",PERS.GENDER AS \"gender\",PERS.BIRTH_DATE AS \"birthDate\",PERS.HEIGHT AS \"height\",PERS.WEIGHT AS \"weight\",PERS.MOTHERS_MAIDEN_NAME AS \"mothersMaidenName\",PERS.MARITAL_STATUS AS \"maritalStatus\",PERS.SOCIAL_SECURITY_NUMBER AS \"socialSecurityNumber\",PERS.PASSPORT_NUMBER AS \"passportNumber\",PERS.PASSPORT_EXPIRE_DATE AS \"passportExpireDate\",PERS.TOTAL_YEARS_WORK_EXPERIENCE AS \"totalYearsWorkExperience\",PERS.COMMENTS AS \"comments\",PERS.EMPLOYMENT_STATUS_ENUM_ID AS \"employmentStatusEnumId\",PERS.RESIDENCE_STATUS_ENUM_ID AS \"residenceStatusEnumId\",PERS.OCCUPATION AS \"occupation\",PERS.YEARS_WITH_EMPLOYER AS \"yearsWithEmployer\",PERS.MONTHS_WITH_EMPLOYER AS \"monthsWithEmployer\",PERS.EXISTING_CUSTOMER AS \"existingCustomer\" FROM EMPLOYMENT EMPLMNT INNER JOIN PERSON PERS ON EMPLMNT.PARTY_ID_TO = PERS.PARTY_ID", resultSetMapping="EmploymentAndPersonMapping")
@SqlResultSetMapping(name="EmploymentAndPersonMapping", entities={
@EntityResult(entityClass=EmploymentAndPerson.class, fields = {
@FieldResult(name="roleTypeIdFrom", column="roleTypeIdFrom")
,@FieldResult(name="roleTypeIdTo", column="roleTypeIdTo")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="terminationReasonId", column="terminationReasonId")
,@FieldResult(name="terminationTypeId", column="terminationTypeId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="salutation", column="salutation")
,@FieldResult(name="firstName", column="firstName")
,@FieldResult(name="middleName", column="middleName")
,@FieldResult(name="lastName", column="lastName")
,@FieldResult(name="personalTitle", column="personalTitle")
,@FieldResult(name="suffix", column="suffix")
,@FieldResult(name="nickname", column="nickname")
,@FieldResult(name="firstNameLocal", column="firstNameLocal")
,@FieldResult(name="middleNameLocal", column="middleNameLocal")
,@FieldResult(name="lastNameLocal", column="lastNameLocal")
,@FieldResult(name="otherLocal", column="otherLocal")
,@FieldResult(name="memberId", column="memberId")
,@FieldResult(name="gender", column="gender")
,@FieldResult(name="birthDate", column="birthDate")
,@FieldResult(name="height", column="height")
,@FieldResult(name="weight", column="weight")
,@FieldResult(name="mothersMaidenName", column="mothersMaidenName")
,@FieldResult(name="maritalStatus", column="maritalStatus")
,@FieldResult(name="socialSecurityNumber", column="socialSecurityNumber")
,@FieldResult(name="passportNumber", column="passportNumber")
,@FieldResult(name="passportExpireDate", column="passportExpireDate")
,@FieldResult(name="totalYearsWorkExperience", column="totalYearsWorkExperience")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="employmentStatusEnumId", column="employmentStatusEnumId")
,@FieldResult(name="residenceStatusEnumId", column="residenceStatusEnumId")
,@FieldResult(name="occupation", column="occupation")
,@FieldResult(name="yearsWithEmployer", column="yearsWithEmployer")
,@FieldResult(name="monthsWithEmployer", column="monthsWithEmployer")
,@FieldResult(name="existingCustomer", column="existingCustomer")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class EmploymentAndPerson extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("roleTypeIdFrom", "EMPLMNT.ROLE_TYPE_ID_FROM");
        fields.put("roleTypeIdTo", "EMPLMNT.ROLE_TYPE_ID_TO");
        fields.put("partyIdFrom", "EMPLMNT.PARTY_ID_FROM");
        fields.put("partyIdTo", "EMPLMNT.PARTY_ID_TO");
        fields.put("fromDate", "EMPLMNT.FROM_DATE");
        fields.put("thruDate", "EMPLMNT.THRU_DATE");
        fields.put("terminationReasonId", "EMPLMNT.TERMINATION_REASON_ID");
        fields.put("terminationTypeId", "EMPLMNT.TERMINATION_TYPE_ID");
        fields.put("partyId", "PERS.PARTY_ID");
        fields.put("salutation", "PERS.SALUTATION");
        fields.put("firstName", "PERS.FIRST_NAME");
        fields.put("middleName", "PERS.MIDDLE_NAME");
        fields.put("lastName", "PERS.LAST_NAME");
        fields.put("personalTitle", "PERS.PERSONAL_TITLE");
        fields.put("suffix", "PERS.SUFFIX");
        fields.put("nickname", "PERS.NICKNAME");
        fields.put("firstNameLocal", "PERS.FIRST_NAME_LOCAL");
        fields.put("middleNameLocal", "PERS.MIDDLE_NAME_LOCAL");
        fields.put("lastNameLocal", "PERS.LAST_NAME_LOCAL");
        fields.put("otherLocal", "PERS.OTHER_LOCAL");
        fields.put("memberId", "PERS.MEMBER_ID");
        fields.put("gender", "PERS.GENDER");
        fields.put("birthDate", "PERS.BIRTH_DATE");
        fields.put("height", "PERS.HEIGHT");
        fields.put("weight", "PERS.WEIGHT");
        fields.put("mothersMaidenName", "PERS.MOTHERS_MAIDEN_NAME");
        fields.put("maritalStatus", "PERS.MARITAL_STATUS");
        fields.put("socialSecurityNumber", "PERS.SOCIAL_SECURITY_NUMBER");
        fields.put("passportNumber", "PERS.PASSPORT_NUMBER");
        fields.put("passportExpireDate", "PERS.PASSPORT_EXPIRE_DATE");
        fields.put("totalYearsWorkExperience", "PERS.TOTAL_YEARS_WORK_EXPERIENCE");
        fields.put("comments", "PERS.COMMENTS");
        fields.put("employmentStatusEnumId", "PERS.EMPLOYMENT_STATUS_ENUM_ID");
        fields.put("residenceStatusEnumId", "PERS.RESIDENCE_STATUS_ENUM_ID");
        fields.put("occupation", "PERS.OCCUPATION");
        fields.put("yearsWithEmployer", "PERS.YEARS_WITH_EMPLOYER");
        fields.put("monthsWithEmployer", "PERS.MONTHS_WITH_EMPLOYER");
        fields.put("existingCustomer", "PERS.EXISTING_CUSTOMER");
fieldMapColumns.put("EmploymentAndPerson", fields);
}
  public static enum Fields implements EntityFieldInterface<EmploymentAndPerson> {
    roleTypeIdFrom("roleTypeIdFrom"),
    roleTypeIdTo("roleTypeIdTo"),
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    terminationReasonId("terminationReasonId"),
    terminationTypeId("terminationTypeId"),
    partyId("partyId"),
    salutation("salutation"),
    firstName("firstName"),
    middleName("middleName"),
    lastName("lastName"),
    personalTitle("personalTitle"),
    suffix("suffix"),
    nickname("nickname"),
    firstNameLocal("firstNameLocal"),
    middleNameLocal("middleNameLocal"),
    lastNameLocal("lastNameLocal"),
    otherLocal("otherLocal"),
    memberId("memberId"),
    gender("gender"),
    birthDate("birthDate"),
    height("height"),
    weight("weight"),
    mothersMaidenName("mothersMaidenName"),
    maritalStatus("maritalStatus"),
    socialSecurityNumber("socialSecurityNumber"),
    passportNumber("passportNumber"),
    passportExpireDate("passportExpireDate"),
    totalYearsWorkExperience("totalYearsWorkExperience"),
    comments("comments"),
    employmentStatusEnumId("employmentStatusEnumId"),
    residenceStatusEnumId("residenceStatusEnumId"),
    occupation("occupation"),
    yearsWithEmployer("yearsWithEmployer"),
    monthsWithEmployer("monthsWithEmployer"),
    existingCustomer("existingCustomer");
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
   private String roleTypeIdFrom;
    
   private String roleTypeIdTo;
    
   private String partyIdFrom;
    
   private String partyIdTo;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String terminationReasonId;
    
   private String terminationTypeId;
    
   private String partyId;
    
   private String salutation;
    
   private String firstName;
    
   private String middleName;
    
   private String lastName;
    
   private String personalTitle;
    
   private String suffix;
    
   private String nickname;
    
   private String firstNameLocal;
    
   private String middleNameLocal;
    
   private String lastNameLocal;
    
   private String otherLocal;
    
   private String memberId;
    
   private String gender;
    
   private Date birthDate;
    
   private BigDecimal height;
    
   private BigDecimal weight;
    
   private String mothersMaidenName;
    
   private String maritalStatus;
    
   private String socialSecurityNumber;
    
   private String passportNumber;
    
   private Date passportExpireDate;
    
   private BigDecimal totalYearsWorkExperience;
    
   private String comments;
    
   private String employmentStatusEnumId;
    
   private String residenceStatusEnumId;
    
   private String occupation;
    
   private Long yearsWithEmployer;
    
   private Long monthsWithEmployer;
    
   private String existingCustomer;

  /**
   * Default constructor.
   */
  public EmploymentAndPerson() {
      super();
      this.baseEntityName = "EmploymentAndPerson";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("roleTypeIdFrom");this.primaryKeyNames.add("roleTypeIdTo");this.primaryKeyNames.add("partyIdFrom");this.primaryKeyNames.add("partyIdTo");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("partyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("terminationReasonId");this.allFieldsNames.add("terminationTypeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("salutation");this.allFieldsNames.add("firstName");this.allFieldsNames.add("middleName");this.allFieldsNames.add("lastName");this.allFieldsNames.add("personalTitle");this.allFieldsNames.add("suffix");this.allFieldsNames.add("nickname");this.allFieldsNames.add("firstNameLocal");this.allFieldsNames.add("middleNameLocal");this.allFieldsNames.add("lastNameLocal");this.allFieldsNames.add("otherLocal");this.allFieldsNames.add("memberId");this.allFieldsNames.add("gender");this.allFieldsNames.add("birthDate");this.allFieldsNames.add("height");this.allFieldsNames.add("weight");this.allFieldsNames.add("mothersMaidenName");this.allFieldsNames.add("maritalStatus");this.allFieldsNames.add("socialSecurityNumber");this.allFieldsNames.add("passportNumber");this.allFieldsNames.add("passportExpireDate");this.allFieldsNames.add("totalYearsWorkExperience");this.allFieldsNames.add("comments");this.allFieldsNames.add("employmentStatusEnumId");this.allFieldsNames.add("residenceStatusEnumId");this.allFieldsNames.add("occupation");this.allFieldsNames.add("yearsWithEmployer");this.allFieldsNames.add("monthsWithEmployer");this.allFieldsNames.add("existingCustomer");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EmploymentAndPerson(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
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
     * @param terminationReasonId the terminationReasonId to set
     */
    public void setTerminationReasonId(String terminationReasonId) {
        this.terminationReasonId = terminationReasonId;
    }
    /**
     * Auto generated value setter.
     * @param terminationTypeId the terminationTypeId to set
     */
    public void setTerminationTypeId(String terminationTypeId) {
        this.terminationTypeId = terminationTypeId;
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
     * @param salutation the salutation to set
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
    /**
     * Auto generated value setter.
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Auto generated value setter.
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * Auto generated value setter.
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Auto generated value setter.
     * @param personalTitle the personalTitle to set
     */
    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }
    /**
     * Auto generated value setter.
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    /**
     * Auto generated value setter.
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    /**
     * Auto generated value setter.
     * @param firstNameLocal the firstNameLocal to set
     */
    public void setFirstNameLocal(String firstNameLocal) {
        this.firstNameLocal = firstNameLocal;
    }
    /**
     * Auto generated value setter.
     * @param middleNameLocal the middleNameLocal to set
     */
    public void setMiddleNameLocal(String middleNameLocal) {
        this.middleNameLocal = middleNameLocal;
    }
    /**
     * Auto generated value setter.
     * @param lastNameLocal the lastNameLocal to set
     */
    public void setLastNameLocal(String lastNameLocal) {
        this.lastNameLocal = lastNameLocal;
    }
    /**
     * Auto generated value setter.
     * @param otherLocal the otherLocal to set
     */
    public void setOtherLocal(String otherLocal) {
        this.otherLocal = otherLocal;
    }
    /**
     * Auto generated value setter.
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    /**
     * Auto generated value setter.
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Auto generated value setter.
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    /**
     * Auto generated value setter.
     * @param height the height to set
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }
    /**
     * Auto generated value setter.
     * @param weight the weight to set
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    /**
     * Auto generated value setter.
     * @param mothersMaidenName the mothersMaidenName to set
     */
    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }
    /**
     * Auto generated value setter.
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    /**
     * Auto generated value setter.
     * @param socialSecurityNumber the socialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    /**
     * Auto generated value setter.
     * @param passportNumber the passportNumber to set
     */
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    /**
     * Auto generated value setter.
     * @param passportExpireDate the passportExpireDate to set
     */
    public void setPassportExpireDate(Date passportExpireDate) {
        this.passportExpireDate = passportExpireDate;
    }
    /**
     * Auto generated value setter.
     * @param totalYearsWorkExperience the totalYearsWorkExperience to set
     */
    public void setTotalYearsWorkExperience(BigDecimal totalYearsWorkExperience) {
        this.totalYearsWorkExperience = totalYearsWorkExperience;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param employmentStatusEnumId the employmentStatusEnumId to set
     */
    public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
        this.employmentStatusEnumId = employmentStatusEnumId;
    }
    /**
     * Auto generated value setter.
     * @param residenceStatusEnumId the residenceStatusEnumId to set
     */
    public void setResidenceStatusEnumId(String residenceStatusEnumId) {
        this.residenceStatusEnumId = residenceStatusEnumId;
    }
    /**
     * Auto generated value setter.
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    /**
     * Auto generated value setter.
     * @param yearsWithEmployer the yearsWithEmployer to set
     */
    public void setYearsWithEmployer(Long yearsWithEmployer) {
        this.yearsWithEmployer = yearsWithEmployer;
    }
    /**
     * Auto generated value setter.
     * @param monthsWithEmployer the monthsWithEmployer to set
     */
    public void setMonthsWithEmployer(Long monthsWithEmployer) {
        this.monthsWithEmployer = monthsWithEmployer;
    }
    /**
     * Auto generated value setter.
     * @param existingCustomer the existingCustomer to set
     */
    public void setExistingCustomer(String existingCustomer) {
        this.existingCustomer = existingCustomer;
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
    public String getTerminationReasonId() {
        return this.terminationReasonId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTerminationTypeId() {
        return this.terminationTypeId;
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
    public String getSalutation() {
        return this.salutation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMiddleName() {
        return this.middleName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPersonalTitle() {
        return this.personalTitle;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSuffix() {
        return this.suffix;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNickname() {
        return this.nickname;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFirstNameLocal() {
        return this.firstNameLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMiddleNameLocal() {
        return this.middleNameLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastNameLocal() {
        return this.lastNameLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOtherLocal() {
        return this.otherLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMemberId() {
        return this.memberId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGender() {
        return this.gender;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Date</code>
     */
    public Date getBirthDate() {
        return this.birthDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getHeight() {
        return this.height;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getWeight() {
        return this.weight;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMothersMaidenName() {
        return this.mothersMaidenName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMaritalStatus() {
        return this.maritalStatus;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPassportNumber() {
        return this.passportNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Date</code>
     */
    public Date getPassportExpireDate() {
        return this.passportExpireDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTotalYearsWorkExperience() {
        return this.totalYearsWorkExperience;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEmploymentStatusEnumId() {
        return this.employmentStatusEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getResidenceStatusEnumId() {
        return this.residenceStatusEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOccupation() {
        return this.occupation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getYearsWithEmployer() {
        return this.yearsWithEmployer;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getMonthsWithEmployer() {
        return this.monthsWithEmployer;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExistingCustomer() {
        return this.existingCustomer;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setTerminationReasonId((String) mapValue.get("terminationReasonId"));
        setTerminationTypeId((String) mapValue.get("terminationTypeId"));
        setPartyId((String) mapValue.get("partyId"));
        setSalutation((String) mapValue.get("salutation"));
        setFirstName((String) mapValue.get("firstName"));
        setMiddleName((String) mapValue.get("middleName"));
        setLastName((String) mapValue.get("lastName"));
        setPersonalTitle((String) mapValue.get("personalTitle"));
        setSuffix((String) mapValue.get("suffix"));
        setNickname((String) mapValue.get("nickname"));
        setFirstNameLocal((String) mapValue.get("firstNameLocal"));
        setMiddleNameLocal((String) mapValue.get("middleNameLocal"));
        setLastNameLocal((String) mapValue.get("lastNameLocal"));
        setOtherLocal((String) mapValue.get("otherLocal"));
        setMemberId((String) mapValue.get("memberId"));
        setGender((String) mapValue.get("gender"));
        setBirthDate((Date) mapValue.get("birthDate"));
        setHeight(convertToBigDecimal(mapValue.get("height")));
        setWeight(convertToBigDecimal(mapValue.get("weight")));
        setMothersMaidenName((String) mapValue.get("mothersMaidenName"));
        setMaritalStatus((String) mapValue.get("maritalStatus"));
        setSocialSecurityNumber((String) mapValue.get("socialSecurityNumber"));
        setPassportNumber((String) mapValue.get("passportNumber"));
        setPassportExpireDate((Date) mapValue.get("passportExpireDate"));
        setTotalYearsWorkExperience(convertToBigDecimal(mapValue.get("totalYearsWorkExperience")));
        setComments((String) mapValue.get("comments"));
        setEmploymentStatusEnumId((String) mapValue.get("employmentStatusEnumId"));
        setResidenceStatusEnumId((String) mapValue.get("residenceStatusEnumId"));
        setOccupation((String) mapValue.get("occupation"));
        setYearsWithEmployer((Long) mapValue.get("yearsWithEmployer"));
        setMonthsWithEmployer((Long) mapValue.get("monthsWithEmployer"));
        setExistingCustomer((String) mapValue.get("existingCustomer"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("terminationReasonId", getTerminationReasonId());
        mapValue.put("terminationTypeId", getTerminationTypeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("salutation", getSalutation());
        mapValue.put("firstName", getFirstName());
        mapValue.put("middleName", getMiddleName());
        mapValue.put("lastName", getLastName());
        mapValue.put("personalTitle", getPersonalTitle());
        mapValue.put("suffix", getSuffix());
        mapValue.put("nickname", getNickname());
        mapValue.put("firstNameLocal", getFirstNameLocal());
        mapValue.put("middleNameLocal", getMiddleNameLocal());
        mapValue.put("lastNameLocal", getLastNameLocal());
        mapValue.put("otherLocal", getOtherLocal());
        mapValue.put("memberId", getMemberId());
        mapValue.put("gender", getGender());
        mapValue.put("birthDate", getBirthDate());
        mapValue.put("height", getHeight());
        mapValue.put("weight", getWeight());
        mapValue.put("mothersMaidenName", getMothersMaidenName());
        mapValue.put("maritalStatus", getMaritalStatus());
        mapValue.put("socialSecurityNumber", getSocialSecurityNumber());
        mapValue.put("passportNumber", getPassportNumber());
        mapValue.put("passportExpireDate", getPassportExpireDate());
        mapValue.put("totalYearsWorkExperience", getTotalYearsWorkExperience());
        mapValue.put("comments", getComments());
        mapValue.put("employmentStatusEnumId", getEmploymentStatusEnumId());
        mapValue.put("residenceStatusEnumId", getResidenceStatusEnumId());
        mapValue.put("occupation", getOccupation());
        mapValue.put("yearsWithEmployer", getYearsWithEmployer());
        mapValue.put("monthsWithEmployer", getMonthsWithEmployer());
        mapValue.put("existingCustomer", getExistingCustomer());
        return mapValue;
    }


}
