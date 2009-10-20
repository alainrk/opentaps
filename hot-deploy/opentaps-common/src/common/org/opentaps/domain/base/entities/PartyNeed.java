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
 * Auto generated base entity PartyNeed.
 */
@javax.persistence.Entity
@Table(name="PARTY_NEED")
public class PartyNeed extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyNeedId", "PARTY_NEED_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("roleTypeId", "ROLE_TYPE_ID");
        fields.put("partyTypeId", "PARTY_TYPE_ID");
        fields.put("needTypeId", "NEED_TYPE_ID");
        fields.put("communicationEventId", "COMMUNICATION_EVENT_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("productCategoryId", "PRODUCT_CATEGORY_ID");
        fields.put("visitId", "VISIT_ID");
        fields.put("datetimeRecorded", "DATETIME_RECORDED");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyNeed", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyNeed> {
    partyNeedId("partyNeedId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    partyTypeId("partyTypeId"),
    needTypeId("needTypeId"),
    communicationEventId("communicationEventId"),
    productId("productId"),
    productCategoryId("productCategoryId"),
    visitId("visitId"),
    datetimeRecorded("datetimeRecorded"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.PartyNeedPkBridge.class)
     private PartyNeedPk id = new PartyNeedPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PartyNeedPk</code>
     */
      public PartyNeedPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PartyNeedPk</code> value to set
    */   
      public void setId(PartyNeedPk id) {
         this.id = id;
      }
   @Column(name="PARTY_TYPE_ID")
   private String partyTypeId;
   @Column(name="NEED_TYPE_ID")
   private String needTypeId;
   @Column(name="COMMUNICATION_EVENT_ID")
   private String communicationEventId;
   @Column(name="PRODUCT_ID")
   private String productId;
   @Column(name="PRODUCT_CATEGORY_ID")
   private String productCategoryId;
   @Column(name="VISIT_ID")
   private String visitId;
   @Column(name="DATETIME_RECORDED")
   private Timestamp datetimeRecorded;
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
   @JoinColumn(name="NEED_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private NeedType needType = null;
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
   @JoinColumn(name="PARTY_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PartyType partyType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COMMUNICATION_EVENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CommunicationEvent communicationEvent = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductCategory productCategory = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VISIT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Visit visit = null;
   private transient List<Subscription> subscriptions = null;

  /**
   * Default constructor.
   */
  public PartyNeed() {
      super();
      this.baseEntityName = "PartyNeed";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyNeedId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyNeedId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("needTypeId");this.allFieldsNames.add("communicationEventId");this.allFieldsNames.add("productId");this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("visitId");this.allFieldsNames.add("datetimeRecorded");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyNeed(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyNeedId the partyNeedId to set
     */
    public void setPartyNeedId(String partyNeedId) {
        id.setPartyNeedId(partyNeedId);
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        id.setPartyId(partyId);
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        id.setRoleTypeId(roleTypeId);
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
     * @param needTypeId the needTypeId to set
     */
    public void setNeedTypeId(String needTypeId) {
        this.needTypeId = needTypeId;
    }
    /**
     * Auto generated value setter.
     * @param communicationEventId the communicationEventId to set
     */
    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
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
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param visitId the visitId to set
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
    /**
     * Auto generated value setter.
     * @param datetimeRecorded the datetimeRecorded to set
     */
    public void setDatetimeRecorded(Timestamp datetimeRecorded) {
        this.datetimeRecorded = datetimeRecorded;
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
    public String getPartyNeedId() {
        return this.id.getPartyNeedId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.id.getPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.id.getRoleTypeId();
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
    public String getNeedTypeId() {
        return this.needTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCommunicationEventId() {
        return this.communicationEventId;
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
    public String getProductCategoryId() {
        return this.productCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVisitId() {
        return this.visitId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDatetimeRecorded() {
        return this.datetimeRecorded;
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
     * Auto generated method that gets the related <code>NeedType</code> by the relation named <code>NeedType</code>.
     * @return the <code>NeedType</code>
     * @throws RepositoryException if an error occurs
     */
    public NeedType getNeedType() throws RepositoryException {
        if (this.needType == null) {
            this.needType = getRelatedOne(NeedType.class, "NeedType");
        }
        return this.needType;
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
     * Auto generated method that gets the related <code>PartyType</code> by the relation named <code>PartyType</code>.
     * @return the <code>PartyType</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyType getPartyType() throws RepositoryException {
        if (this.partyType == null) {
            this.partyType = getRelatedOne(PartyType.class, "PartyType");
        }
        return this.partyType;
    }
    /**
     * Auto generated method that gets the related <code>CommunicationEvent</code> by the relation named <code>CommunicationEvent</code>.
     * @return the <code>CommunicationEvent</code>
     * @throws RepositoryException if an error occurs
     */
    public CommunicationEvent getCommunicationEvent() throws RepositoryException {
        if (this.communicationEvent == null) {
            this.communicationEvent = getRelatedOne(CommunicationEvent.class, "CommunicationEvent");
        }
        return this.communicationEvent;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>ProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getProductCategory() throws RepositoryException {
        if (this.productCategory == null) {
            this.productCategory = getRelatedOne(ProductCategory.class, "ProductCategory");
        }
        return this.productCategory;
    }
    /**
     * Auto generated method that gets the related <code>Visit</code> by the relation named <code>Visit</code>.
     * @return the <code>Visit</code>
     * @throws RepositoryException if an error occurs
     */
    public Visit getVisit() throws RepositoryException {
        if (this.visit == null) {
            this.visit = getRelatedOne(Visit.class, "Visit");
        }
        return this.visit;
    }
    /**
     * Auto generated method that gets the related <code>Subscription</code> by the relation named <code>Subscription</code>.
     * @return the list of <code>Subscription</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Subscription> getSubscriptions() throws RepositoryException {
        if (this.subscriptions == null) {
            this.subscriptions = getRelated(Subscription.class, "Subscription");
        }
        return this.subscriptions;
    }

    /**
     * Auto generated value setter.
     * @param needType the needType to set
    */
    public void setNeedType(NeedType needType) {
        this.needType = needType;
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
     * @param partyType the partyType to set
    */
    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;
    }
    /**
     * Auto generated value setter.
     * @param communicationEvent the communicationEvent to set
    */
    public void setCommunicationEvent(CommunicationEvent communicationEvent) {
        this.communicationEvent = communicationEvent;
    }
    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param productCategory the productCategory to set
    */
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
    /**
     * Auto generated value setter.
     * @param visit the visit to set
    */
    public void setVisit(Visit visit) {
        this.visit = visit;
    }
    /**
     * Auto generated value setter.
     * @param subscriptions the subscriptions to set
    */
    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyNeedId((String) mapValue.get("partyNeedId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setPartyTypeId((String) mapValue.get("partyTypeId"));
        setNeedTypeId((String) mapValue.get("needTypeId"));
        setCommunicationEventId((String) mapValue.get("communicationEventId"));
        setProductId((String) mapValue.get("productId"));
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setVisitId((String) mapValue.get("visitId"));
        setDatetimeRecorded((Timestamp) mapValue.get("datetimeRecorded"));
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
        mapValue.put("partyNeedId", getPartyNeedId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("partyTypeId", getPartyTypeId());
        mapValue.put("needTypeId", getNeedTypeId());
        mapValue.put("communicationEventId", getCommunicationEventId());
        mapValue.put("productId", getProductId());
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("visitId", getVisitId());
        mapValue.put("datetimeRecorded", getDatetimeRecorded());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
