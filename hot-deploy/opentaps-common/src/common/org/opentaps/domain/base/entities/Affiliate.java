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
 * Auto generated base entity Affiliate.
 */
@javax.persistence.Entity
@Table(name="AFFILIATE")
public class Affiliate extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PARTY_ID");
        fields.put("affiliateName", "AFFILIATE_NAME");
        fields.put("affiliateDescription", "AFFILIATE_DESCRIPTION");
        fields.put("yearEstablished", "YEAR_ESTABLISHED");
        fields.put("siteType", "SITE_TYPE");
        fields.put("sitePageViews", "SITE_PAGE_VIEWS");
        fields.put("siteVisitors", "SITE_VISITORS");
        fields.put("dateTimeCreated", "DATE_TIME_CREATED");
        fields.put("dateTimeApproved", "DATE_TIME_APPROVED");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("Affiliate", fields);
}
  public static enum Fields implements EntityFieldInterface<Affiliate> {
    partyId("partyId"),
    affiliateName("affiliateName"),
    affiliateDescription("affiliateDescription"),
    yearEstablished("yearEstablished"),
    siteType("siteType"),
    sitePageViews("sitePageViews"),
    siteVisitors("siteVisitors"),
    dateTimeCreated("dateTimeCreated"),
    dateTimeApproved("dateTimeApproved"),
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

   @org.hibernate.annotations.GenericGenerator(name="Affiliate_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="Affiliate_GEN")
   @Id
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="AFFILIATE_NAME")
   private String affiliateName;
   @Column(name="AFFILIATE_DESCRIPTION")
   private String affiliateDescription;
   @Column(name="YEAR_ESTABLISHED")
   private String yearEstablished;
   @Column(name="SITE_TYPE")
   private String siteType;
   @Column(name="SITE_PAGE_VIEWS")
   private String sitePageViews;
   @Column(name="SITE_VISITORS")
   private String siteVisitors;
   @Column(name="DATE_TIME_CREATED")
   private Timestamp dateTimeCreated;
   @Column(name="DATE_TIME_APPROVED")
   private Timestamp dateTimeApproved;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   private transient PartyGroup partyGroup = null;

  /**
   * Default constructor.
   */
  public Affiliate() {
      super();
      this.baseEntityName = "Affiliate";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("affiliateName");this.allFieldsNames.add("affiliateDescription");this.allFieldsNames.add("yearEstablished");this.allFieldsNames.add("siteType");this.allFieldsNames.add("sitePageViews");this.allFieldsNames.add("siteVisitors");this.allFieldsNames.add("dateTimeCreated");this.allFieldsNames.add("dateTimeApproved");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public Affiliate(RepositoryInterface repository) {
      this();
      initRepository(repository);
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
     * @param affiliateName the affiliateName to set
     */
    public void setAffiliateName(String affiliateName) {
        this.affiliateName = affiliateName;
    }
    /**
     * Auto generated value setter.
     * @param affiliateDescription the affiliateDescription to set
     */
    public void setAffiliateDescription(String affiliateDescription) {
        this.affiliateDescription = affiliateDescription;
    }
    /**
     * Auto generated value setter.
     * @param yearEstablished the yearEstablished to set
     */
    public void setYearEstablished(String yearEstablished) {
        this.yearEstablished = yearEstablished;
    }
    /**
     * Auto generated value setter.
     * @param siteType the siteType to set
     */
    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }
    /**
     * Auto generated value setter.
     * @param sitePageViews the sitePageViews to set
     */
    public void setSitePageViews(String sitePageViews) {
        this.sitePageViews = sitePageViews;
    }
    /**
     * Auto generated value setter.
     * @param siteVisitors the siteVisitors to set
     */
    public void setSiteVisitors(String siteVisitors) {
        this.siteVisitors = siteVisitors;
    }
    /**
     * Auto generated value setter.
     * @param dateTimeCreated the dateTimeCreated to set
     */
    public void setDateTimeCreated(Timestamp dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }
    /**
     * Auto generated value setter.
     * @param dateTimeApproved the dateTimeApproved to set
     */
    public void setDateTimeApproved(Timestamp dateTimeApproved) {
        this.dateTimeApproved = dateTimeApproved;
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
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAffiliateName() {
        return this.affiliateName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAffiliateDescription() {
        return this.affiliateDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getYearEstablished() {
        return this.yearEstablished;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSiteType() {
        return this.siteType;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSitePageViews() {
        return this.sitePageViews;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSiteVisitors() {
        return this.siteVisitors;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDateTimeCreated() {
        return this.dateTimeCreated;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDateTimeApproved() {
        return this.dateTimeApproved;
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
     * Auto generated method that gets the related <code>PartyGroup</code> by the relation named <code>PartyGroup</code>.
     * @return the <code>PartyGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyGroup getPartyGroup() throws RepositoryException {
        if (this.partyGroup == null) {
            this.partyGroup = getRelatedOne(PartyGroup.class, "PartyGroup");
        }
        return this.partyGroup;
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
     * @param partyGroup the partyGroup to set
    */
    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setAffiliateName((String) mapValue.get("affiliateName"));
        setAffiliateDescription((String) mapValue.get("affiliateDescription"));
        setYearEstablished((String) mapValue.get("yearEstablished"));
        setSiteType((String) mapValue.get("siteType"));
        setSitePageViews((String) mapValue.get("sitePageViews"));
        setSiteVisitors((String) mapValue.get("siteVisitors"));
        setDateTimeCreated((Timestamp) mapValue.get("dateTimeCreated"));
        setDateTimeApproved((Timestamp) mapValue.get("dateTimeApproved"));
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
        mapValue.put("partyId", getPartyId());
        mapValue.put("affiliateName", getAffiliateName());
        mapValue.put("affiliateDescription", getAffiliateDescription());
        mapValue.put("yearEstablished", getYearEstablished());
        mapValue.put("siteType", getSiteType());
        mapValue.put("sitePageViews", getSitePageViews());
        mapValue.put("siteVisitors", getSiteVisitors());
        mapValue.put("dateTimeCreated", getDateTimeCreated());
        mapValue.put("dateTimeApproved", getDateTimeApproved());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
