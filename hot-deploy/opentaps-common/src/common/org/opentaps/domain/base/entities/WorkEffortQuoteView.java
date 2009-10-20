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
 * Auto generated base entity WorkEffortQuoteView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWorkEffortQuoteViews", query="SELECT SI.DESCRIPTION AS \"description\",QWE.QUOTE_ID AS \"quoteId\",QWE.WORK_EFFORT_ID AS \"workEffortId\",Q.QUOTE_TYPE_ID AS \"quoteTypeId\",Q.PARTY_ID AS \"partyId\",Q.ISSUE_DATE AS \"issueDate\",Q.STATUS_ID AS \"statusId\",Q.CURRENCY_UOM_ID AS \"currencyUomId\",Q.PRODUCT_STORE_ID AS \"productStoreId\",Q.SALES_CHANNEL_ENUM_ID AS \"salesChannelEnumId\",Q.VALID_FROM_DATE AS \"validFromDate\",Q.VALID_THRU_DATE AS \"validThruDate\",Q.QUOTE_NAME AS \"quoteName\",Q.DESCRIPTION AS \"description\",Q.CONTACT_PARTY_ID AS \"contactPartyId\",Q.CREATED_BY_PARTY_ID AS \"createdByPartyId\" FROM QUOTE_WORK_EFFORT QWE INNER JOIN QUOTE Q ON QWE.QUOTE_ID = Q.QUOTE_ID LEFT JOIN STATUS_ITEM SI ON Q.STATUS_ID = SI.STATUS_ID", resultSetMapping="WorkEffortQuoteViewMapping")
@SqlResultSetMapping(name="WorkEffortQuoteViewMapping", entities={
@EntityResult(entityClass=WorkEffortQuoteView.class, fields = {
@FieldResult(name="statusItemDescription", column="statusItemDescription")
,@FieldResult(name="quoteId", column="quoteId")
,@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="quoteTypeId", column="quoteTypeId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="issueDate", column="issueDate")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="salesChannelEnumId", column="salesChannelEnumId")
,@FieldResult(name="validFromDate", column="validFromDate")
,@FieldResult(name="validThruDate", column="validThruDate")
,@FieldResult(name="quoteName", column="quoteName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="contactPartyId", column="contactPartyId")
,@FieldResult(name="createdByPartyId", column="createdByPartyId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WorkEffortQuoteView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("statusItemDescription", "SI.DESCRIPTION");
        fields.put("quoteId", "QWE.QUOTE_ID");
        fields.put("workEffortId", "QWE.WORK_EFFORT_ID");
        fields.put("quoteTypeId", "Q.QUOTE_TYPE_ID");
        fields.put("partyId", "Q.PARTY_ID");
        fields.put("issueDate", "Q.ISSUE_DATE");
        fields.put("statusId", "Q.STATUS_ID");
        fields.put("currencyUomId", "Q.CURRENCY_UOM_ID");
        fields.put("productStoreId", "Q.PRODUCT_STORE_ID");
        fields.put("salesChannelEnumId", "Q.SALES_CHANNEL_ENUM_ID");
        fields.put("validFromDate", "Q.VALID_FROM_DATE");
        fields.put("validThruDate", "Q.VALID_THRU_DATE");
        fields.put("quoteName", "Q.QUOTE_NAME");
        fields.put("description", "Q.DESCRIPTION");
        fields.put("contactPartyId", "Q.CONTACT_PARTY_ID");
        fields.put("createdByPartyId", "Q.CREATED_BY_PARTY_ID");
fieldMapColumns.put("WorkEffortQuoteView", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortQuoteView> {
    statusItemDescription("statusItemDescription"),
    quoteId("quoteId"),
    workEffortId("workEffortId"),
    quoteTypeId("quoteTypeId"),
    partyId("partyId"),
    issueDate("issueDate"),
    statusId("statusId"),
    currencyUomId("currencyUomId"),
    productStoreId("productStoreId"),
    salesChannelEnumId("salesChannelEnumId"),
    validFromDate("validFromDate"),
    validThruDate("validThruDate"),
    quoteName("quoteName"),
    description("description"),
    contactPartyId("contactPartyId"),
    createdByPartyId("createdByPartyId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String statusItemDescription;
    @Id
   private String quoteId;
    
   private String workEffortId;
    
   private String quoteTypeId;
    
   private String partyId;
    
   private Timestamp issueDate;
    
   private String statusId;
    
   private String currencyUomId;
    
   private String productStoreId;
    
   private String salesChannelEnumId;
    
   private Timestamp validFromDate;
    
   private Timestamp validThruDate;
    
   private String quoteName;
    
   private String description;
    
   private String contactPartyId;
    
   private String createdByPartyId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="QUOTE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Quote quote = null;

  /**
   * Default constructor.
   */
  public WorkEffortQuoteView() {
      super();
      this.baseEntityName = "WorkEffortQuoteView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("quoteId");this.primaryKeyNames.add("workEffortId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("statusItemDescription");this.allFieldsNames.add("quoteId");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("quoteTypeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("issueDate");this.allFieldsNames.add("statusId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("salesChannelEnumId");this.allFieldsNames.add("validFromDate");this.allFieldsNames.add("validThruDate");this.allFieldsNames.add("quoteName");this.allFieldsNames.add("description");this.allFieldsNames.add("contactPartyId");this.allFieldsNames.add("createdByPartyId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortQuoteView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param statusItemDescription the statusItemDescription to set
     */
    public void setStatusItemDescription(String statusItemDescription) {
        this.statusItemDescription = statusItemDescription;
    }
    /**
     * Auto generated value setter.
     * @param quoteId the quoteId to set
     */
    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
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
     * @param quoteTypeId the quoteTypeId to set
     */
    public void setQuoteTypeId(String quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
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
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(Timestamp issueDate) {
        this.issueDate = issueDate;
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
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
    /**
     * Auto generated value setter.
     * @param salesChannelEnumId the salesChannelEnumId to set
     */
    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }
    /**
     * Auto generated value setter.
     * @param validFromDate the validFromDate to set
     */
    public void setValidFromDate(Timestamp validFromDate) {
        this.validFromDate = validFromDate;
    }
    /**
     * Auto generated value setter.
     * @param validThruDate the validThruDate to set
     */
    public void setValidThruDate(Timestamp validThruDate) {
        this.validThruDate = validThruDate;
    }
    /**
     * Auto generated value setter.
     * @param quoteName the quoteName to set
     */
    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
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
     * @param contactPartyId the contactPartyId to set
     */
    public void setContactPartyId(String contactPartyId) {
        this.contactPartyId = contactPartyId;
    }
    /**
     * Auto generated value setter.
     * @param createdByPartyId the createdByPartyId to set
     */
    public void setCreatedByPartyId(String createdByPartyId) {
        this.createdByPartyId = createdByPartyId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusItemDescription() {
        return this.statusItemDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuoteId() {
        return this.quoteId;
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
    public String getQuoteTypeId() {
        return this.quoteTypeId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getIssueDate() {
        return this.issueDate;
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
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.productStoreId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalesChannelEnumId() {
        return this.salesChannelEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getValidFromDate() {
        return this.validFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getValidThruDate() {
        return this.validThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuoteName() {
        return this.quoteName;
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
    public String getContactPartyId() {
        return this.contactPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByPartyId() {
        return this.createdByPartyId;
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
     * Auto generated method that gets the related <code>Quote</code> by the relation named <code>Quote</code>.
     * @return the <code>Quote</code>
     * @throws RepositoryException if an error occurs
     */
    public Quote getQuote() throws RepositoryException {
        if (this.quote == null) {
            this.quote = getRelatedOne(Quote.class, "Quote");
        }
        return this.quote;
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
     * @param quote the quote to set
    */
    public void setQuote(Quote quote) {
        this.quote = quote;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setStatusItemDescription((String) mapValue.get("statusItemDescription"));
        setQuoteId((String) mapValue.get("quoteId"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setQuoteTypeId((String) mapValue.get("quoteTypeId"));
        setPartyId((String) mapValue.get("partyId"));
        setIssueDate((Timestamp) mapValue.get("issueDate"));
        setStatusId((String) mapValue.get("statusId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setSalesChannelEnumId((String) mapValue.get("salesChannelEnumId"));
        setValidFromDate((Timestamp) mapValue.get("validFromDate"));
        setValidThruDate((Timestamp) mapValue.get("validThruDate"));
        setQuoteName((String) mapValue.get("quoteName"));
        setDescription((String) mapValue.get("description"));
        setContactPartyId((String) mapValue.get("contactPartyId"));
        setCreatedByPartyId((String) mapValue.get("createdByPartyId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("statusItemDescription", getStatusItemDescription());
        mapValue.put("quoteId", getQuoteId());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("quoteTypeId", getQuoteTypeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("issueDate", getIssueDate());
        mapValue.put("statusId", getStatusId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("salesChannelEnumId", getSalesChannelEnumId());
        mapValue.put("validFromDate", getValidFromDate());
        mapValue.put("validThruDate", getValidThruDate());
        mapValue.put("quoteName", getQuoteName());
        mapValue.put("description", getDescription());
        mapValue.put("contactPartyId", getContactPartyId());
        mapValue.put("createdByPartyId", getCreatedByPartyId());
        return mapValue;
    }


}
