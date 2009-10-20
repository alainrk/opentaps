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
 * Auto generated base entity GlJournal.
 */
@javax.persistence.Entity
@Table(name="GL_JOURNAL")
public class GlJournal extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("glJournalId", "GL_JOURNAL_ID");
        fields.put("glJournalName", "GL_JOURNAL_NAME");
        fields.put("organizationPartyId", "ORGANIZATION_PARTY_ID");
        fields.put("isPosted", "IS_POSTED");
        fields.put("postedDate", "POSTED_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("GlJournal", fields);
}
  public static enum Fields implements EntityFieldInterface<GlJournal> {
    glJournalId("glJournalId"),
    glJournalName("glJournalName"),
    organizationPartyId("organizationPartyId"),
    isPosted("isPosted"),
    postedDate("postedDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="GlJournal_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="GlJournal_GEN")
   @Id
   @Column(name="GL_JOURNAL_ID")
   private String glJournalId;
   @Column(name="GL_JOURNAL_NAME")
   private String glJournalName;
   @Column(name="ORGANIZATION_PARTY_ID")
   private String organizationPartyId;
   @Column(name="IS_POSTED")
   private String isPosted;
   @Column(name="POSTED_DATE")
   private Timestamp postedDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORGANIZATION_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="GL_JOURNAL_ID")
   
   private List<AcctgTrans> acctgTranses = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ERROR_GL_JOURNAL_ID")
   
   private List<PartyAcctgPreference> partyAcctgPreferences = null;

  /**
   * Default constructor.
   */
  public GlJournal() {
      super();
      this.baseEntityName = "GlJournal";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glJournalId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("glJournalId");this.allFieldsNames.add("glJournalName");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("isPosted");this.allFieldsNames.add("postedDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GlJournal(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param glJournalId the glJournalId to set
     */
    public void setGlJournalId(String glJournalId) {
        this.glJournalId = glJournalId;
    }
    /**
     * Auto generated value setter.
     * @param glJournalName the glJournalName to set
     */
    public void setGlJournalName(String glJournalName) {
        this.glJournalName = glJournalName;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param isPosted the isPosted to set
     */
    public void setIsPosted(String isPosted) {
        this.isPosted = isPosted;
    }
    /**
     * Auto generated value setter.
     * @param postedDate the postedDate to set
     */
    public void setPostedDate(Timestamp postedDate) {
        this.postedDate = postedDate;
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
    public String getGlJournalId() {
        return this.glJournalId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlJournalName() {
        return this.glJournalName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsPosted() {
        return this.isPosted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPostedDate() {
        return this.postedDate;
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
     * Auto generated method that gets the related <code>AcctgTrans</code> by the relation named <code>AcctgTrans</code>.
     * @return the list of <code>AcctgTrans</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AcctgTrans> getAcctgTranses() throws RepositoryException {
        if (this.acctgTranses == null) {
            this.acctgTranses = getRelated(AcctgTrans.class, "AcctgTrans");
        }
        return this.acctgTranses;
    }
    /**
     * Auto generated method that gets the related <code>PartyAcctgPreference</code> by the relation named <code>PartyAcctgPreference</code>.
     * @return the list of <code>PartyAcctgPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyAcctgPreference> getPartyAcctgPreferences() throws RepositoryException {
        if (this.partyAcctgPreferences == null) {
            this.partyAcctgPreferences = getRelated(PartyAcctgPreference.class, "PartyAcctgPreference");
        }
        return this.partyAcctgPreferences;
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
     * @param acctgTranses the acctgTranses to set
    */
    public void setAcctgTranses(List<AcctgTrans> acctgTranses) {
        this.acctgTranses = acctgTranses;
    }
    /**
     * Auto generated value setter.
     * @param partyAcctgPreferences the partyAcctgPreferences to set
    */
    public void setPartyAcctgPreferences(List<PartyAcctgPreference> partyAcctgPreferences) {
        this.partyAcctgPreferences = partyAcctgPreferences;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGlJournalId((String) mapValue.get("glJournalId"));
        setGlJournalName((String) mapValue.get("glJournalName"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setIsPosted((String) mapValue.get("isPosted"));
        setPostedDate((Timestamp) mapValue.get("postedDate"));
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
        mapValue.put("glJournalId", getGlJournalId());
        mapValue.put("glJournalName", getGlJournalName());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("isPosted", getIsPosted());
        mapValue.put("postedDate", getPostedDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
