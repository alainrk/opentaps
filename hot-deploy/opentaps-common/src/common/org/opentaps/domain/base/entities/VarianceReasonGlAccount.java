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
 * Auto generated base entity VarianceReasonGlAccount.
 */
@javax.persistence.Entity
@Table(name="VARIANCE_REASON_GL_ACCOUNT")
public class VarianceReasonGlAccount extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("varianceReasonId", "VARIANCE_REASON_ID");
        fields.put("organizationPartyId", "ORGANIZATION_PARTY_ID");
        fields.put("glAccountId", "GL_ACCOUNT_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("VarianceReasonGlAccount", fields);
}
  public static enum Fields implements EntityFieldInterface<VarianceReasonGlAccount> {
    varianceReasonId("varianceReasonId"),
    organizationPartyId("organizationPartyId"),
    glAccountId("glAccountId"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.VarianceReasonGlAccountPkBridge.class)
     private VarianceReasonGlAccountPk id = new VarianceReasonGlAccountPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>VarianceReasonGlAccountPk</code>
     */
      public VarianceReasonGlAccountPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>VarianceReasonGlAccountPk</code> value to set
    */   
      public void setId(VarianceReasonGlAccountPk id) {
         this.id = id;
      }
   @Column(name="GL_ACCOUNT_ID")
   private String glAccountId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VARIANCE_REASON_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private VarianceReason varianceReason = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORGANIZATION_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party organizationParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount glAccount = null;

  /**
   * Default constructor.
   */
  public VarianceReasonGlAccount() {
      super();
      this.baseEntityName = "VarianceReasonGlAccount";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("varianceReasonId");this.primaryKeyNames.add("organizationPartyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("varianceReasonId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public VarianceReasonGlAccount(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param varianceReasonId the varianceReasonId to set
     */
    public void setVarianceReasonId(String varianceReasonId) {
        id.setVarianceReasonId(varianceReasonId);
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        id.setOrganizationPartyId(organizationPartyId);
    }
    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
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
    public String getVarianceReasonId() {
        return this.id.getVarianceReasonId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.id.getOrganizationPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountId() {
        return this.glAccountId;
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
     * Auto generated method that gets the related <code>VarianceReason</code> by the relation named <code>VarianceReason</code>.
     * @return the <code>VarianceReason</code>
     * @throws RepositoryException if an error occurs
     */
    public VarianceReason getVarianceReason() throws RepositoryException {
        if (this.varianceReason == null) {
            this.varianceReason = getRelatedOne(VarianceReason.class, "VarianceReason");
        }
        return this.varianceReason;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>OrganizationParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getOrganizationParty() throws RepositoryException {
        if (this.organizationParty == null) {
            this.organizationParty = getRelatedOne(Party.class, "OrganizationParty");
        }
        return this.organizationParty;
    }
    /**
     * Auto generated method that gets the related <code>GlAccount</code> by the relation named <code>GlAccount</code>.
     * @return the <code>GlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccount getGlAccount() throws RepositoryException {
        if (this.glAccount == null) {
            this.glAccount = getRelatedOne(GlAccount.class, "GlAccount");
        }
        return this.glAccount;
    }

    /**
     * Auto generated value setter.
     * @param varianceReason the varianceReason to set
    */
    public void setVarianceReason(VarianceReason varianceReason) {
        this.varianceReason = varianceReason;
    }
    /**
     * Auto generated value setter.
     * @param organizationParty the organizationParty to set
    */
    public void setOrganizationParty(Party organizationParty) {
        this.organizationParty = organizationParty;
    }
    /**
     * Auto generated value setter.
     * @param glAccount the glAccount to set
    */
    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setVarianceReasonId((String) mapValue.get("varianceReasonId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setGlAccountId((String) mapValue.get("glAccountId"));
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
        mapValue.put("varianceReasonId", getVarianceReasonId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
