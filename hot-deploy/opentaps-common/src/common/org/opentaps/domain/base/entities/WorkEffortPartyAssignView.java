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
 * Auto generated base entity WorkEffortPartyAssignView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWorkEffortPartyAssignViews", query="SELECT WEPA.STATUS_ID AS \"statusId\",PNV.PARTY_ID AS \"partyId\",PNV.PARTY_TYPE_ID AS \"partyTypeId\",PNV.DESCRIPTION AS \"description\",PNV.STATUS_ID AS \"statusId\",PNV.FIRST_NAME AS \"firstName\",PNV.MIDDLE_NAME AS \"middleName\",PNV.LAST_NAME AS \"lastName\",PNV.FIRST_NAME_LOCAL AS \"firstNameLocal\",PNV.LAST_NAME_LOCAL AS \"lastNameLocal\",PNV.PERSONAL_TITLE AS \"personalTitle\",PNV.SUFFIX AS \"suffix\",PNV.GROUP_NAME AS \"groupName\",PNV.GROUP_NAME_LOCAL AS \"groupNameLocal\",WEPA.WORK_EFFORT_ID AS \"workEffortId\",WEPA.ROLE_TYPE_ID AS \"roleTypeId\",WEPA.FROM_DATE AS \"fromDate\",WEPA.THRU_DATE AS \"thruDate\",WEPA.ASSIGNED_BY_USER_LOGIN_ID AS \"assignedByUserLoginId\",WEPA.STATUS_DATE_TIME AS \"statusDateTime\",WEPA.EXPECTATION_ENUM_ID AS \"expectationEnumId\",WEPA.DELEGATE_REASON_ENUM_ID AS \"delegateReasonEnumId\",WEPA.FACILITY_ID AS \"facilityId\",WEPA.COMMENTS AS \"comments\",WEPA.MUST_RSVP AS \"mustRsvp\",WEPA.AVAILABILITY_STATUS_ID AS \"availabilityStatusId\" FROM WORK_EFFORT_PARTY_ASSIGNMENT WEPA INNER JOIN PARTY_NAME_VIEW PNV ON WEPA.PARTY_ID = PNV.PARTY_ID", resultSetMapping="WorkEffortPartyAssignViewMapping")
@SqlResultSetMapping(name="WorkEffortPartyAssignViewMapping", entities={
@EntityResult(entityClass=WorkEffortPartyAssignView.class, fields = {
@FieldResult(name="assignmentStatusId", column="assignmentStatusId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="partyTypeId", column="partyTypeId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="firstName", column="firstName")
,@FieldResult(name="middleName", column="middleName")
,@FieldResult(name="lastName", column="lastName")
,@FieldResult(name="firstNameLocal", column="firstNameLocal")
,@FieldResult(name="lastNameLocal", column="lastNameLocal")
,@FieldResult(name="personalTitle", column="personalTitle")
,@FieldResult(name="suffix", column="suffix")
,@FieldResult(name="groupName", column="groupName")
,@FieldResult(name="groupNameLocal", column="groupNameLocal")
,@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="assignedByUserLoginId", column="assignedByUserLoginId")
,@FieldResult(name="statusDateTime", column="statusDateTime")
,@FieldResult(name="expectationEnumId", column="expectationEnumId")
,@FieldResult(name="delegateReasonEnumId", column="delegateReasonEnumId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="mustRsvp", column="mustRsvp")
,@FieldResult(name="availabilityStatusId", column="availabilityStatusId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WorkEffortPartyAssignView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("assignmentStatusId", "WEPA.STATUS_ID");
        fields.put("partyId", "PNV.PARTY_ID");
        fields.put("partyTypeId", "PNV.PARTY_TYPE_ID");
        fields.put("description", "PNV.DESCRIPTION");
        fields.put("statusId", "PNV.STATUS_ID");
        fields.put("firstName", "PNV.FIRST_NAME");
        fields.put("middleName", "PNV.MIDDLE_NAME");
        fields.put("lastName", "PNV.LAST_NAME");
        fields.put("firstNameLocal", "PNV.FIRST_NAME_LOCAL");
        fields.put("lastNameLocal", "PNV.LAST_NAME_LOCAL");
        fields.put("personalTitle", "PNV.PERSONAL_TITLE");
        fields.put("suffix", "PNV.SUFFIX");
        fields.put("groupName", "PNV.GROUP_NAME");
        fields.put("groupNameLocal", "PNV.GROUP_NAME_LOCAL");
        fields.put("workEffortId", "WEPA.WORK_EFFORT_ID");
        fields.put("roleTypeId", "WEPA.ROLE_TYPE_ID");
        fields.put("fromDate", "WEPA.FROM_DATE");
        fields.put("thruDate", "WEPA.THRU_DATE");
        fields.put("assignedByUserLoginId", "WEPA.ASSIGNED_BY_USER_LOGIN_ID");
        fields.put("statusDateTime", "WEPA.STATUS_DATE_TIME");
        fields.put("expectationEnumId", "WEPA.EXPECTATION_ENUM_ID");
        fields.put("delegateReasonEnumId", "WEPA.DELEGATE_REASON_ENUM_ID");
        fields.put("facilityId", "WEPA.FACILITY_ID");
        fields.put("comments", "WEPA.COMMENTS");
        fields.put("mustRsvp", "WEPA.MUST_RSVP");
        fields.put("availabilityStatusId", "WEPA.AVAILABILITY_STATUS_ID");
fieldMapColumns.put("WorkEffortPartyAssignView", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortPartyAssignView> {
    assignmentStatusId("assignmentStatusId"),
    partyId("partyId"),
    partyTypeId("partyTypeId"),
    description("description"),
    statusId("statusId"),
    firstName("firstName"),
    middleName("middleName"),
    lastName("lastName"),
    firstNameLocal("firstNameLocal"),
    lastNameLocal("lastNameLocal"),
    personalTitle("personalTitle"),
    suffix("suffix"),
    groupName("groupName"),
    groupNameLocal("groupNameLocal"),
    workEffortId("workEffortId"),
    roleTypeId("roleTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    assignedByUserLoginId("assignedByUserLoginId"),
    statusDateTime("statusDateTime"),
    expectationEnumId("expectationEnumId"),
    delegateReasonEnumId("delegateReasonEnumId"),
    facilityId("facilityId"),
    comments("comments"),
    mustRsvp("mustRsvp"),
    availabilityStatusId("availabilityStatusId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String assignmentStatusId;
    
   private String partyId;
    
   private String partyTypeId;
    
   private String description;
    
   private String statusId;
    
   private String firstName;
    
   private String middleName;
    
   private String lastName;
    
   private String firstNameLocal;
    
   private String lastNameLocal;
    
   private String personalTitle;
    
   private String suffix;
    
   private String groupName;
    
   private String groupNameLocal;
    @Id
   private String workEffortId;
    
   private String roleTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String assignedByUserLoginId;
    
   private Timestamp statusDateTime;
    
   private String expectationEnumId;
    
   private String delegateReasonEnumId;
    
   private String facilityId;
    
   private String comments;
    
   private String mustRsvp;
    
   private String availabilityStatusId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   private transient WorkEffortPartyAssignment workEffortPartyAssignment = null;
   private transient PartyNameView partyNameView = null;
   private transient Person person = null;
   private transient PartyRole partyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType roleType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ASSIGNMENT_STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem assignmentStatusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EXPECTATION_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration expectationEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="DELEGATE_REASON_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration delegateReasonEnumeration = null;

  /**
   * Default constructor.
   */
  public WorkEffortPartyAssignView() {
      super();
      this.baseEntityName = "WorkEffortPartyAssignView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("roleTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("assignmentStatusId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("statusId");this.allFieldsNames.add("firstName");this.allFieldsNames.add("middleName");this.allFieldsNames.add("lastName");this.allFieldsNames.add("firstNameLocal");this.allFieldsNames.add("lastNameLocal");this.allFieldsNames.add("personalTitle");this.allFieldsNames.add("suffix");this.allFieldsNames.add("groupName");this.allFieldsNames.add("groupNameLocal");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("assignedByUserLoginId");this.allFieldsNames.add("statusDateTime");this.allFieldsNames.add("expectationEnumId");this.allFieldsNames.add("delegateReasonEnumId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("comments");this.allFieldsNames.add("mustRsvp");this.allFieldsNames.add("availabilityStatusId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortPartyAssignView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param assignmentStatusId the assignmentStatusId to set
     */
    public void setAssignmentStatusId(String assignmentStatusId) {
        this.assignmentStatusId = assignmentStatusId;
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
     * @param partyTypeId the partyTypeId to set
     */
    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
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
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
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
     * @param firstNameLocal the firstNameLocal to set
     */
    public void setFirstNameLocal(String firstNameLocal) {
        this.firstNameLocal = firstNameLocal;
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
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param groupNameLocal the groupNameLocal to set
     */
    public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
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
     * @param assignedByUserLoginId the assignedByUserLoginId to set
     */
    public void setAssignedByUserLoginId(String assignedByUserLoginId) {
        this.assignedByUserLoginId = assignedByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param statusDateTime the statusDateTime to set
     */
    public void setStatusDateTime(Timestamp statusDateTime) {
        this.statusDateTime = statusDateTime;
    }
    /**
     * Auto generated value setter.
     * @param expectationEnumId the expectationEnumId to set
     */
    public void setExpectationEnumId(String expectationEnumId) {
        this.expectationEnumId = expectationEnumId;
    }
    /**
     * Auto generated value setter.
     * @param delegateReasonEnumId the delegateReasonEnumId to set
     */
    public void setDelegateReasonEnumId(String delegateReasonEnumId) {
        this.delegateReasonEnumId = delegateReasonEnumId;
    }
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
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
     * @param mustRsvp the mustRsvp to set
     */
    public void setMustRsvp(String mustRsvp) {
        this.mustRsvp = mustRsvp;
    }
    /**
     * Auto generated value setter.
     * @param availabilityStatusId the availabilityStatusId to set
     */
    public void setAvailabilityStatusId(String availabilityStatusId) {
        this.availabilityStatusId = availabilityStatusId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAssignmentStatusId() {
        return this.assignmentStatusId;
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
    public String getPartyTypeId() {
        return this.partyTypeId;
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
    public String getStatusId() {
        return this.statusId;
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
    public String getFirstNameLocal() {
        return this.firstNameLocal;
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
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupNameLocal() {
        return this.groupNameLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
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
    public String getAssignedByUserLoginId() {
        return this.assignedByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStatusDateTime() {
        return this.statusDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExpectationEnumId() {
        return this.expectationEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDelegateReasonEnumId() {
        return this.delegateReasonEnumId;
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
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMustRsvp() {
        return this.mustRsvp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAvailabilityStatusId() {
        return this.availabilityStatusId;
    }

    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getWorkEffort() throws RepositoryException {
        if (this.workEffort == null) {
            this.workEffort = getRelatedOne(WorkEffort.class, "WorkEffort");
        }
        return this.workEffort;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortPartyAssignment</code> by the relation named <code>WorkEffortPartyAssignment</code>.
     * @return the <code>WorkEffortPartyAssignment</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortPartyAssignment getWorkEffortPartyAssignment() throws RepositoryException {
        if (this.workEffortPartyAssignment == null) {
            this.workEffortPartyAssignment = getRelatedOne(WorkEffortPartyAssignment.class, "WorkEffortPartyAssignment");
        }
        return this.workEffortPartyAssignment;
    }
    /**
     * Auto generated method that gets the related <code>PartyNameView</code> by the relation named <code>PartyNameView</code>.
     * @return the <code>PartyNameView</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyNameView getPartyNameView() throws RepositoryException {
        if (this.partyNameView == null) {
            this.partyNameView = getRelatedOne(PartyNameView.class, "PartyNameView");
        }
        return this.partyNameView;
    }
    /**
     * Auto generated method that gets the related <code>Person</code> by the relation named <code>Person</code>.
     * @return the <code>Person</code>
     * @throws RepositoryException if an error occurs
     */
    public Person getPerson() throws RepositoryException {
        if (this.person == null) {
            this.person = getRelatedOne(Person.class, "Person");
        }
        return this.person;
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
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>AssignmentStatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getAssignmentStatusItem() throws RepositoryException {
        if (this.assignmentStatusItem == null) {
            this.assignmentStatusItem = getRelatedOne(StatusItem.class, "AssignmentStatusItem");
        }
        return this.assignmentStatusItem;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>ExpectationEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getExpectationEnumeration() throws RepositoryException {
        if (this.expectationEnumeration == null) {
            this.expectationEnumeration = getRelatedOne(Enumeration.class, "ExpectationEnumeration");
        }
        return this.expectationEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>DelegateReasonEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getDelegateReasonEnumeration() throws RepositoryException {
        if (this.delegateReasonEnumeration == null) {
            this.delegateReasonEnumeration = getRelatedOne(Enumeration.class, "DelegateReasonEnumeration");
        }
        return this.delegateReasonEnumeration;
    }

    /**
     * Auto generated value setter.
     * @param workEffort the workEffort to set
    */
    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }
    /**
     * Auto generated value setter.
     * @param workEffortPartyAssignment the workEffortPartyAssignment to set
    */
    public void setWorkEffortPartyAssignment(WorkEffortPartyAssignment workEffortPartyAssignment) {
        this.workEffortPartyAssignment = workEffortPartyAssignment;
    }
    /**
     * Auto generated value setter.
     * @param partyNameView the partyNameView to set
    */
    public void setPartyNameView(PartyNameView partyNameView) {
        this.partyNameView = partyNameView;
    }
    /**
     * Auto generated value setter.
     * @param person the person to set
    */
    public void setPerson(Person person) {
        this.person = person;
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
     * @param roleType the roleType to set
    */
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param assignmentStatusItem the assignmentStatusItem to set
    */
    public void setAssignmentStatusItem(StatusItem assignmentStatusItem) {
        this.assignmentStatusItem = assignmentStatusItem;
    }
    /**
     * Auto generated value setter.
     * @param expectationEnumeration the expectationEnumeration to set
    */
    public void setExpectationEnumeration(Enumeration expectationEnumeration) {
        this.expectationEnumeration = expectationEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param delegateReasonEnumeration the delegateReasonEnumeration to set
    */
    public void setDelegateReasonEnumeration(Enumeration delegateReasonEnumeration) {
        this.delegateReasonEnumeration = delegateReasonEnumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAssignmentStatusId((String) mapValue.get("assignmentStatusId"));
        setPartyId((String) mapValue.get("partyId"));
        setPartyTypeId((String) mapValue.get("partyTypeId"));
        setDescription((String) mapValue.get("description"));
        setStatusId((String) mapValue.get("statusId"));
        setFirstName((String) mapValue.get("firstName"));
        setMiddleName((String) mapValue.get("middleName"));
        setLastName((String) mapValue.get("lastName"));
        setFirstNameLocal((String) mapValue.get("firstNameLocal"));
        setLastNameLocal((String) mapValue.get("lastNameLocal"));
        setPersonalTitle((String) mapValue.get("personalTitle"));
        setSuffix((String) mapValue.get("suffix"));
        setGroupName((String) mapValue.get("groupName"));
        setGroupNameLocal((String) mapValue.get("groupNameLocal"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setAssignedByUserLoginId((String) mapValue.get("assignedByUserLoginId"));
        setStatusDateTime((Timestamp) mapValue.get("statusDateTime"));
        setExpectationEnumId((String) mapValue.get("expectationEnumId"));
        setDelegateReasonEnumId((String) mapValue.get("delegateReasonEnumId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setComments((String) mapValue.get("comments"));
        setMustRsvp((String) mapValue.get("mustRsvp"));
        setAvailabilityStatusId((String) mapValue.get("availabilityStatusId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("assignmentStatusId", getAssignmentStatusId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("partyTypeId", getPartyTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("statusId", getStatusId());
        mapValue.put("firstName", getFirstName());
        mapValue.put("middleName", getMiddleName());
        mapValue.put("lastName", getLastName());
        mapValue.put("firstNameLocal", getFirstNameLocal());
        mapValue.put("lastNameLocal", getLastNameLocal());
        mapValue.put("personalTitle", getPersonalTitle());
        mapValue.put("suffix", getSuffix());
        mapValue.put("groupName", getGroupName());
        mapValue.put("groupNameLocal", getGroupNameLocal());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("assignedByUserLoginId", getAssignedByUserLoginId());
        mapValue.put("statusDateTime", getStatusDateTime());
        mapValue.put("expectationEnumId", getExpectationEnumId());
        mapValue.put("delegateReasonEnumId", getDelegateReasonEnumId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("comments", getComments());
        mapValue.put("mustRsvp", getMustRsvp());
        mapValue.put("availabilityStatusId", getAvailabilityStatusId());
        return mapValue;
    }


}
