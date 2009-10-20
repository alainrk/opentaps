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
 * Auto generated base entity GlAccountHistory.
 */
@javax.persistence.Entity
@Table(name="GL_ACCOUNT_HISTORY")
public class GlAccountHistory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("glAccountId", "GL_ACCOUNT_ID");
        fields.put("organizationPartyId", "ORGANIZATION_PARTY_ID");
        fields.put("customTimePeriodId", "CUSTOM_TIME_PERIOD_ID");
        fields.put("postedDebits", "POSTED_DEBITS");
        fields.put("postedCredits", "POSTED_CREDITS");
        fields.put("endingBalance", "ENDING_BALANCE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("GlAccountHistory", fields);
}
  public static enum Fields implements EntityFieldInterface<GlAccountHistory> {
    glAccountId("glAccountId"),
    organizationPartyId("organizationPartyId"),
    customTimePeriodId("customTimePeriodId"),
    postedDebits("postedDebits"),
    postedCredits("postedCredits"),
    endingBalance("endingBalance"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.GlAccountHistoryPkBridge.class)
     private GlAccountHistoryPk id = new GlAccountHistoryPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>GlAccountHistoryPk</code>
     */
      public GlAccountHistoryPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>GlAccountHistoryPk</code> value to set
    */   
      public void setId(GlAccountHistoryPk id) {
         this.id = id;
      }
   @Column(name="POSTED_DEBITS")
   private BigDecimal postedDebits;
   @Column(name="POSTED_CREDITS")
   private BigDecimal postedCredits;
   @Column(name="ENDING_BALANCE")
   private BigDecimal endingBalance;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount glAccount = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORGANIZATION_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUSTOM_TIME_PERIOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CustomTimePeriod customTimePeriod = null;

  /**
   * Default constructor.
   */
  public GlAccountHistory() {
      super();
      this.baseEntityName = "GlAccountHistory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glAccountId");this.primaryKeyNames.add("organizationPartyId");this.primaryKeyNames.add("customTimePeriodId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("customTimePeriodId");this.allFieldsNames.add("postedDebits");this.allFieldsNames.add("postedCredits");this.allFieldsNames.add("endingBalance");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GlAccountHistory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        id.setGlAccountId(glAccountId);
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
     * @param customTimePeriodId the customTimePeriodId to set
     */
    public void setCustomTimePeriodId(String customTimePeriodId) {
        id.setCustomTimePeriodId(customTimePeriodId);
    }
    /**
     * Auto generated value setter.
     * @param postedDebits the postedDebits to set
     */
    public void setPostedDebits(BigDecimal postedDebits) {
        this.postedDebits = postedDebits;
    }
    /**
     * Auto generated value setter.
     * @param postedCredits the postedCredits to set
     */
    public void setPostedCredits(BigDecimal postedCredits) {
        this.postedCredits = postedCredits;
    }
    /**
     * Auto generated value setter.
     * @param endingBalance the endingBalance to set
     */
    public void setEndingBalance(BigDecimal endingBalance) {
        this.endingBalance = endingBalance;
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
    public String getGlAccountId() {
        return this.id.getGlAccountId();
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
    public String getCustomTimePeriodId() {
        return this.id.getCustomTimePeriodId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPostedDebits() {
        return this.postedDebits;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPostedCredits() {
        return this.postedCredits;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEndingBalance() {
        return this.endingBalance;
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
     * Auto generated method that gets the related <code>CustomTimePeriod</code> by the relation named <code>CustomTimePeriod</code>.
     * @return the <code>CustomTimePeriod</code>
     * @throws RepositoryException if an error occurs
     */
    public CustomTimePeriod getCustomTimePeriod() throws RepositoryException {
        if (this.customTimePeriod == null) {
            this.customTimePeriod = getRelatedOne(CustomTimePeriod.class, "CustomTimePeriod");
        }
        return this.customTimePeriod;
    }

    /**
     * Auto generated value setter.
     * @param glAccount the glAccount to set
    */
    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
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
     * @param customTimePeriod the customTimePeriod to set
    */
    public void setCustomTimePeriod(CustomTimePeriod customTimePeriod) {
        this.customTimePeriod = customTimePeriod;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGlAccountId((String) mapValue.get("glAccountId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setCustomTimePeriodId((String) mapValue.get("customTimePeriodId"));
        setPostedDebits(convertToBigDecimal(mapValue.get("postedDebits")));
        setPostedCredits(convertToBigDecimal(mapValue.get("postedCredits")));
        setEndingBalance(convertToBigDecimal(mapValue.get("endingBalance")));
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
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("customTimePeriodId", getCustomTimePeriodId());
        mapValue.put("postedDebits", getPostedDebits());
        mapValue.put("postedCredits", getPostedCredits());
        mapValue.put("endingBalance", getEndingBalance());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
