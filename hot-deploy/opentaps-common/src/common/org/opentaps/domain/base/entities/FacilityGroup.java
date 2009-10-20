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
 * Auto generated base entity FacilityGroup.
 */
@javax.persistence.Entity
@Table(name="FACILITY_GROUP")
public class FacilityGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityGroupId", "FACILITY_GROUP_ID");
        fields.put("facilityGroupTypeId", "FACILITY_GROUP_TYPE_ID");
        fields.put("primaryParentGroupId", "PRIMARY_PARENT_GROUP_ID");
        fields.put("facilityGroupName", "FACILITY_GROUP_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FacilityGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<FacilityGroup> {
    facilityGroupId("facilityGroupId"),
    facilityGroupTypeId("facilityGroupTypeId"),
    primaryParentGroupId("primaryParentGroupId"),
    facilityGroupName("facilityGroupName"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="FacilityGroup_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="FacilityGroup_GEN")
   @Id
   @Column(name="FACILITY_GROUP_ID")
   private String facilityGroupId;
   @Column(name="FACILITY_GROUP_TYPE_ID")
   private String facilityGroupTypeId;
   @Column(name="PRIMARY_PARENT_GROUP_ID")
   private String primaryParentGroupId;
   @Column(name="FACILITY_GROUP_NAME")
   private String facilityGroupName;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_GROUP_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FacilityGroupType facilityGroupType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRIMARY_PARENT_GROUP_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FacilityGroup primaryParentFacilityGroup = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PRIMARY_FACILITY_GROUP_ID")
   
   private List<Facility> facilitys = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="facilityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FACILITY_GROUP_ID")
   
   private List<FacilityGroupMember> facilityGroupMembers = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="facilityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FACILITY_GROUP_ID")
   
   private List<FacilityGroupRole> facilityGroupRoles = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="currentFacilityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FACILITY_GROUP_ID")
   
   private List<FacilityGroupRollup> currentFacilityGroupRollups = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentFacilityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_FACILITY_GROUP_ID")
   
   private List<FacilityGroupRollup> parentFacilityGroupRollups = null;

  /**
   * Default constructor.
   */
  public FacilityGroup() {
      super();
      this.baseEntityName = "FacilityGroup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("facilityGroupId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityGroupId");this.allFieldsNames.add("facilityGroupTypeId");this.allFieldsNames.add("primaryParentGroupId");this.allFieldsNames.add("facilityGroupName");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FacilityGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param facilityGroupId the facilityGroupId to set
     */
    public void setFacilityGroupId(String facilityGroupId) {
        this.facilityGroupId = facilityGroupId;
    }
    /**
     * Auto generated value setter.
     * @param facilityGroupTypeId the facilityGroupTypeId to set
     */
    public void setFacilityGroupTypeId(String facilityGroupTypeId) {
        this.facilityGroupTypeId = facilityGroupTypeId;
    }
    /**
     * Auto generated value setter.
     * @param primaryParentGroupId the primaryParentGroupId to set
     */
    public void setPrimaryParentGroupId(String primaryParentGroupId) {
        this.primaryParentGroupId = primaryParentGroupId;
    }
    /**
     * Auto generated value setter.
     * @param facilityGroupName the facilityGroupName to set
     */
    public void setFacilityGroupName(String facilityGroupName) {
        this.facilityGroupName = facilityGroupName;
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
    public String getFacilityGroupId() {
        return this.facilityGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityGroupTypeId() {
        return this.facilityGroupTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrimaryParentGroupId() {
        return this.primaryParentGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityGroupName() {
        return this.facilityGroupName;
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
     * Auto generated method that gets the related <code>FacilityGroupType</code> by the relation named <code>FacilityGroupType</code>.
     * @return the <code>FacilityGroupType</code>
     * @throws RepositoryException if an error occurs
     */
    public FacilityGroupType getFacilityGroupType() throws RepositoryException {
        if (this.facilityGroupType == null) {
            this.facilityGroupType = getRelatedOne(FacilityGroupType.class, "FacilityGroupType");
        }
        return this.facilityGroupType;
    }
    /**
     * Auto generated method that gets the related <code>FacilityGroup</code> by the relation named <code>PrimaryParentFacilityGroup</code>.
     * @return the <code>FacilityGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public FacilityGroup getPrimaryParentFacilityGroup() throws RepositoryException {
        if (this.primaryParentFacilityGroup == null) {
            this.primaryParentFacilityGroup = getRelatedOne(FacilityGroup.class, "PrimaryParentFacilityGroup");
        }
        return this.primaryParentFacilityGroup;
    }
    /**
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>Facility</code>.
     * @return the list of <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Facility> getFacilitys() throws RepositoryException {
        if (this.facilitys == null) {
            this.facilitys = getRelated(Facility.class, "Facility");
        }
        return this.facilitys;
    }
    /**
     * Auto generated method that gets the related <code>FacilityGroupMember</code> by the relation named <code>FacilityGroupMember</code>.
     * @return the list of <code>FacilityGroupMember</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityGroupMember> getFacilityGroupMembers() throws RepositoryException {
        if (this.facilityGroupMembers == null) {
            this.facilityGroupMembers = getRelated(FacilityGroupMember.class, "FacilityGroupMember");
        }
        return this.facilityGroupMembers;
    }
    /**
     * Auto generated method that gets the related <code>FacilityGroupRole</code> by the relation named <code>FacilityGroupRole</code>.
     * @return the list of <code>FacilityGroupRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityGroupRole> getFacilityGroupRoles() throws RepositoryException {
        if (this.facilityGroupRoles == null) {
            this.facilityGroupRoles = getRelated(FacilityGroupRole.class, "FacilityGroupRole");
        }
        return this.facilityGroupRoles;
    }
    /**
     * Auto generated method that gets the related <code>FacilityGroupRollup</code> by the relation named <code>CurrentFacilityGroupRollup</code>.
     * @return the list of <code>FacilityGroupRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityGroupRollup> getCurrentFacilityGroupRollups() throws RepositoryException {
        if (this.currentFacilityGroupRollups == null) {
            this.currentFacilityGroupRollups = getRelated(FacilityGroupRollup.class, "CurrentFacilityGroupRollup");
        }
        return this.currentFacilityGroupRollups;
    }
    /**
     * Auto generated method that gets the related <code>FacilityGroupRollup</code> by the relation named <code>ParentFacilityGroupRollup</code>.
     * @return the list of <code>FacilityGroupRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityGroupRollup> getParentFacilityGroupRollups() throws RepositoryException {
        if (this.parentFacilityGroupRollups == null) {
            this.parentFacilityGroupRollups = getRelated(FacilityGroupRollup.class, "ParentFacilityGroupRollup");
        }
        return this.parentFacilityGroupRollups;
    }

    /**
     * Auto generated value setter.
     * @param facilityGroupType the facilityGroupType to set
    */
    public void setFacilityGroupType(FacilityGroupType facilityGroupType) {
        this.facilityGroupType = facilityGroupType;
    }
    /**
     * Auto generated value setter.
     * @param primaryParentFacilityGroup the primaryParentFacilityGroup to set
    */
    public void setPrimaryParentFacilityGroup(FacilityGroup primaryParentFacilityGroup) {
        this.primaryParentFacilityGroup = primaryParentFacilityGroup;
    }
    /**
     * Auto generated value setter.
     * @param facilitys the facilitys to set
    */
    public void setFacilitys(List<Facility> facilitys) {
        this.facilitys = facilitys;
    }
    /**
     * Auto generated value setter.
     * @param facilityGroupMembers the facilityGroupMembers to set
    */
    public void setFacilityGroupMembers(List<FacilityGroupMember> facilityGroupMembers) {
        this.facilityGroupMembers = facilityGroupMembers;
    }
    /**
     * Auto generated value setter.
     * @param facilityGroupRoles the facilityGroupRoles to set
    */
    public void setFacilityGroupRoles(List<FacilityGroupRole> facilityGroupRoles) {
        this.facilityGroupRoles = facilityGroupRoles;
    }
    /**
     * Auto generated value setter.
     * @param currentFacilityGroupRollups the currentFacilityGroupRollups to set
    */
    public void setCurrentFacilityGroupRollups(List<FacilityGroupRollup> currentFacilityGroupRollups) {
        this.currentFacilityGroupRollups = currentFacilityGroupRollups;
    }
    /**
     * Auto generated value setter.
     * @param parentFacilityGroupRollups the parentFacilityGroupRollups to set
    */
    public void setParentFacilityGroupRollups(List<FacilityGroupRollup> parentFacilityGroupRollups) {
        this.parentFacilityGroupRollups = parentFacilityGroupRollups;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addFacilityGroupMember(FacilityGroupMember facilityGroupMember) {
        if (this.facilityGroupMembers == null) {
            this.facilityGroupMembers = new ArrayList<FacilityGroupMember>();
        }
        this.facilityGroupMembers.add(facilityGroupMember);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeFacilityGroupMember(FacilityGroupMember facilityGroupMember) {
        if (this.facilityGroupMembers == null) {
            return;
        }
        this.facilityGroupMembers.remove(facilityGroupMember);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearFacilityGroupMember() {
        if (this.facilityGroupMembers == null) {
            return;
        }
        this.facilityGroupMembers.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addFacilityGroupRole(FacilityGroupRole facilityGroupRole) {
        if (this.facilityGroupRoles == null) {
            this.facilityGroupRoles = new ArrayList<FacilityGroupRole>();
        }
        this.facilityGroupRoles.add(facilityGroupRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeFacilityGroupRole(FacilityGroupRole facilityGroupRole) {
        if (this.facilityGroupRoles == null) {
            return;
        }
        this.facilityGroupRoles.remove(facilityGroupRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearFacilityGroupRole() {
        if (this.facilityGroupRoles == null) {
            return;
        }
        this.facilityGroupRoles.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addCurrentFacilityGroupRollup(FacilityGroupRollup currentFacilityGroupRollup) {
        if (this.currentFacilityGroupRollups == null) {
            this.currentFacilityGroupRollups = new ArrayList<FacilityGroupRollup>();
        }
        this.currentFacilityGroupRollups.add(currentFacilityGroupRollup);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeCurrentFacilityGroupRollup(FacilityGroupRollup currentFacilityGroupRollup) {
        if (this.currentFacilityGroupRollups == null) {
            return;
        }
        this.currentFacilityGroupRollups.remove(currentFacilityGroupRollup);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearCurrentFacilityGroupRollup() {
        if (this.currentFacilityGroupRollups == null) {
            return;
        }
        this.currentFacilityGroupRollups.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addParentFacilityGroupRollup(FacilityGroupRollup parentFacilityGroupRollup) {
        if (this.parentFacilityGroupRollups == null) {
            this.parentFacilityGroupRollups = new ArrayList<FacilityGroupRollup>();
        }
        this.parentFacilityGroupRollups.add(parentFacilityGroupRollup);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeParentFacilityGroupRollup(FacilityGroupRollup parentFacilityGroupRollup) {
        if (this.parentFacilityGroupRollups == null) {
            return;
        }
        this.parentFacilityGroupRollups.remove(parentFacilityGroupRollup);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearParentFacilityGroupRollup() {
        if (this.parentFacilityGroupRollups == null) {
            return;
        }
        this.parentFacilityGroupRollups.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFacilityGroupId((String) mapValue.get("facilityGroupId"));
        setFacilityGroupTypeId((String) mapValue.get("facilityGroupTypeId"));
        setPrimaryParentGroupId((String) mapValue.get("primaryParentGroupId"));
        setFacilityGroupName((String) mapValue.get("facilityGroupName"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("facilityGroupId", getFacilityGroupId());
        mapValue.put("facilityGroupTypeId", getFacilityGroupTypeId());
        mapValue.put("primaryParentGroupId", getPrimaryParentGroupId());
        mapValue.put("facilityGroupName", getFacilityGroupName());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
