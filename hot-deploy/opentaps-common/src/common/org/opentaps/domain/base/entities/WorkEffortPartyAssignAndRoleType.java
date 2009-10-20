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
 * Auto generated base entity WorkEffortPartyAssignAndRoleType.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWorkEffortPartyAssignAndRoleTypes", query="SELECT WEPA.WORK_EFFORT_ID AS \"workEffortId\",WEPA.PARTY_ID AS \"partyId\",WEPA.ROLE_TYPE_ID AS \"roleTypeId\",WEPA.FROM_DATE AS \"fromDate\",WEPA.THRU_DATE AS \"thruDate\",WEPA.ASSIGNED_BY_USER_LOGIN_ID AS \"assignedByUserLoginId\",WEPA.STATUS_ID AS \"statusId\",WEPA.STATUS_DATE_TIME AS \"statusDateTime\",WEPA.EXPECTATION_ENUM_ID AS \"expectationEnumId\",WEPA.DELEGATE_REASON_ENUM_ID AS \"delegateReasonEnumId\",WEPA.FACILITY_ID AS \"facilityId\",WEPA.COMMENTS AS \"comments\",WEPA.MUST_RSVP AS \"mustRsvp\",WEPA.AVAILABILITY_STATUS_ID AS \"availabilityStatusId\",RT.PARENT_TYPE_ID AS \"parentTypeId\",RT.HAS_TABLE AS \"hasTable\",RT.DESCRIPTION AS \"description\" FROM WORK_EFFORT_PARTY_ASSIGNMENT WEPA INNER JOIN ROLE_TYPE RT ON WEPA.ROLE_TYPE_ID = RT.ROLE_TYPE_ID", resultSetMapping="WorkEffortPartyAssignAndRoleTypeMapping")
@SqlResultSetMapping(name="WorkEffortPartyAssignAndRoleTypeMapping", entities={
@EntityResult(entityClass=WorkEffortPartyAssignAndRoleType.class, fields = {
@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="assignedByUserLoginId", column="assignedByUserLoginId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="statusDateTime", column="statusDateTime")
,@FieldResult(name="expectationEnumId", column="expectationEnumId")
,@FieldResult(name="delegateReasonEnumId", column="delegateReasonEnumId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="mustRsvp", column="mustRsvp")
,@FieldResult(name="availabilityStatusId", column="availabilityStatusId")
,@FieldResult(name="parentTypeId", column="parentTypeId")
,@FieldResult(name="hasTable", column="hasTable")
,@FieldResult(name="description", column="description")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WorkEffortPartyAssignAndRoleType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortId", "WEPA.WORK_EFFORT_ID");
        fields.put("partyId", "WEPA.PARTY_ID");
        fields.put("roleTypeId", "WEPA.ROLE_TYPE_ID");
        fields.put("fromDate", "WEPA.FROM_DATE");
        fields.put("thruDate", "WEPA.THRU_DATE");
        fields.put("assignedByUserLoginId", "WEPA.ASSIGNED_BY_USER_LOGIN_ID");
        fields.put("statusId", "WEPA.STATUS_ID");
        fields.put("statusDateTime", "WEPA.STATUS_DATE_TIME");
        fields.put("expectationEnumId", "WEPA.EXPECTATION_ENUM_ID");
        fields.put("delegateReasonEnumId", "WEPA.DELEGATE_REASON_ENUM_ID");
        fields.put("facilityId", "WEPA.FACILITY_ID");
        fields.put("comments", "WEPA.COMMENTS");
        fields.put("mustRsvp", "WEPA.MUST_RSVP");
        fields.put("availabilityStatusId", "WEPA.AVAILABILITY_STATUS_ID");
        fields.put("parentTypeId", "RT.PARENT_TYPE_ID");
        fields.put("hasTable", "RT.HAS_TABLE");
        fields.put("description", "RT.DESCRIPTION");
fieldMapColumns.put("WorkEffortPartyAssignAndRoleType", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortPartyAssignAndRoleType> {
    workEffortId("workEffortId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    assignedByUserLoginId("assignedByUserLoginId"),
    statusId("statusId"),
    statusDateTime("statusDateTime"),
    expectationEnumId("expectationEnumId"),
    delegateReasonEnumId("delegateReasonEnumId"),
    facilityId("facilityId"),
    comments("comments"),
    mustRsvp("mustRsvp"),
    availabilityStatusId("availabilityStatusId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description");
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
   private String workEffortId;
    
   private String partyId;
    
   private String roleTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String assignedByUserLoginId;
    
   private String statusId;
    
   private Timestamp statusDateTime;
    
   private String expectationEnumId;
    
   private String delegateReasonEnumId;
    
   private String facilityId;
    
   private String comments;
    
   private String mustRsvp;
    
   private String availabilityStatusId;
    
   private String parentTypeId;
    
   private String hasTable;
    
   private String description;

  /**
   * Default constructor.
   */
  public WorkEffortPartyAssignAndRoleType() {
      super();
      this.baseEntityName = "WorkEffortPartyAssignAndRoleType";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("assignedByUserLoginId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("statusDateTime");this.allFieldsNames.add("expectationEnumId");this.allFieldsNames.add("delegateReasonEnumId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("comments");this.allFieldsNames.add("mustRsvp");this.allFieldsNames.add("availabilityStatusId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortPartyAssignAndRoleType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
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
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
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
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
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
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setAssignedByUserLoginId((String) mapValue.get("assignedByUserLoginId"));
        setStatusId((String) mapValue.get("statusId"));
        setStatusDateTime((Timestamp) mapValue.get("statusDateTime"));
        setExpectationEnumId((String) mapValue.get("expectationEnumId"));
        setDelegateReasonEnumId((String) mapValue.get("delegateReasonEnumId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setComments((String) mapValue.get("comments"));
        setMustRsvp((String) mapValue.get("mustRsvp"));
        setAvailabilityStatusId((String) mapValue.get("availabilityStatusId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setDescription((String) mapValue.get("description"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("assignedByUserLoginId", getAssignedByUserLoginId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("statusDateTime", getStatusDateTime());
        mapValue.put("expectationEnumId", getExpectationEnumId());
        mapValue.put("delegateReasonEnumId", getDelegateReasonEnumId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("comments", getComments());
        mapValue.put("mustRsvp", getMustRsvp());
        mapValue.put("availabilityStatusId", getAvailabilityStatusId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        return mapValue;
    }


}
