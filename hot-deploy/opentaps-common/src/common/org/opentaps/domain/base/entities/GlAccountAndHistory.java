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

/**
 * Auto generated base entity GlAccountAndHistory.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectGlAccountAndHistorys", query="SELECT GLAC.GL_ACCOUNT_CLASS_ID AS \"glAccountClassId\",GLA.GL_ACCOUNT_ID AS \"glAccountId\",GLA.GL_ACCOUNT_TYPE_ID AS \"glAccountTypeId\",GLA.GL_RESOURCE_TYPE_ID AS \"glResourceTypeId\",GLA.GL_XBRL_CLASS_ID AS \"glXbrlClassId\",GLA.PARENT_GL_ACCOUNT_ID AS \"parentGlAccountId\",GLA.ACCOUNT_CODE AS \"accountCode\",GLA.ACCOUNT_NAME AS \"accountName\",GLA.DESCRIPTION AS \"description\",GLA.PRODUCT_ID AS \"productId\",GLA.POSTED_BALANCE AS \"postedBalance\",GLAH.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",GLAH.CUSTOM_TIME_PERIOD_ID AS \"customTimePeriodId\",GLAH.POSTED_DEBITS AS \"postedDebits\",GLAH.POSTED_CREDITS AS \"postedCredits\",GLAH.ENDING_BALANCE AS \"endingBalance\" FROM GL_ACCOUNT GLA INNER JOIN GL_ACCOUNT_HISTORY GLAH ON GLA.GL_ACCOUNT_ID = GLAH.GL_ACCOUNT_ID INNER JOIN GL_ACCOUNT_CLASS GLAC ON GLA.GL_ACCOUNT_CLASS_ID = GLAC.GL_ACCOUNT_CLASS_ID", resultSetMapping="GlAccountAndHistoryMapping")
@SqlResultSetMapping(name="GlAccountAndHistoryMapping", entities={
@EntityResult(entityClass=GlAccountAndHistory.class, fields = {
@FieldResult(name="glAccountClassId", column="glAccountClassId")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="glAccountTypeId", column="glAccountTypeId")
,@FieldResult(name="glResourceTypeId", column="glResourceTypeId")
,@FieldResult(name="glXbrlClassId", column="glXbrlClassId")
,@FieldResult(name="parentGlAccountId", column="parentGlAccountId")
,@FieldResult(name="accountCode", column="accountCode")
,@FieldResult(name="accountName", column="accountName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="postedBalance", column="postedBalance")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="customTimePeriodId", column="customTimePeriodId")
,@FieldResult(name="postedDebits", column="postedDebits")
,@FieldResult(name="postedCredits", column="postedCredits")
,@FieldResult(name="endingBalance", column="endingBalance")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class GlAccountAndHistory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("glAccountClassId", "GLAC.GL_ACCOUNT_CLASS_ID");
        fields.put("glAccountId", "GLA.GL_ACCOUNT_ID");
        fields.put("glAccountTypeId", "GLA.GL_ACCOUNT_TYPE_ID");
        fields.put("glResourceTypeId", "GLA.GL_RESOURCE_TYPE_ID");
        fields.put("glXbrlClassId", "GLA.GL_XBRL_CLASS_ID");
        fields.put("parentGlAccountId", "GLA.PARENT_GL_ACCOUNT_ID");
        fields.put("accountCode", "GLA.ACCOUNT_CODE");
        fields.put("accountName", "GLA.ACCOUNT_NAME");
        fields.put("description", "GLA.DESCRIPTION");
        fields.put("productId", "GLA.PRODUCT_ID");
        fields.put("postedBalance", "GLA.POSTED_BALANCE");
        fields.put("organizationPartyId", "GLAH.ORGANIZATION_PARTY_ID");
        fields.put("customTimePeriodId", "GLAH.CUSTOM_TIME_PERIOD_ID");
        fields.put("postedDebits", "GLAH.POSTED_DEBITS");
        fields.put("postedCredits", "GLAH.POSTED_CREDITS");
        fields.put("endingBalance", "GLAH.ENDING_BALANCE");
fieldMapColumns.put("GlAccountAndHistory", fields);
}
  public static enum Fields implements EntityFieldInterface<GlAccountAndHistory> {
    glAccountClassId("glAccountClassId"),
    glAccountId("glAccountId"),
    glAccountTypeId("glAccountTypeId"),
    glResourceTypeId("glResourceTypeId"),
    glXbrlClassId("glXbrlClassId"),
    parentGlAccountId("parentGlAccountId"),
    accountCode("accountCode"),
    accountName("accountName"),
    description("description"),
    productId("productId"),
    postedBalance("postedBalance"),
    organizationPartyId("organizationPartyId"),
    customTimePeriodId("customTimePeriodId"),
    postedDebits("postedDebits"),
    postedCredits("postedCredits"),
    endingBalance("endingBalance");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String glAccountClassId;
    @Id
   private String glAccountId;
    
   private String glAccountTypeId;
    
   private String glResourceTypeId;
    
   private String glXbrlClassId;
    
   private String parentGlAccountId;
    
   private String accountCode;
    
   private String accountName;
    
   private String description;
    
   private String productId;
    
   private BigDecimal postedBalance;
    
   private String organizationPartyId;
    
   private String customTimePeriodId;
    
   private BigDecimal postedDebits;
    
   private BigDecimal postedCredits;
    
   private BigDecimal endingBalance;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount glAccount = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_CLASS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccountClass glAccountClass = null;
   private transient GlAccountHistory glAccountHistory = null;

  /**
   * Default constructor.
   */
  public GlAccountAndHistory() {
      super();
      this.baseEntityName = "GlAccountAndHistory";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glAccountClassId");this.primaryKeyNames.add("glAccountId");this.primaryKeyNames.add("organizationPartyId");this.primaryKeyNames.add("customTimePeriodId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("glAccountClassId");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("glAccountTypeId");this.allFieldsNames.add("glResourceTypeId");this.allFieldsNames.add("glXbrlClassId");this.allFieldsNames.add("parentGlAccountId");this.allFieldsNames.add("accountCode");this.allFieldsNames.add("accountName");this.allFieldsNames.add("description");this.allFieldsNames.add("productId");this.allFieldsNames.add("postedBalance");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("customTimePeriodId");this.allFieldsNames.add("postedDebits");this.allFieldsNames.add("postedCredits");this.allFieldsNames.add("endingBalance");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GlAccountAndHistory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param glAccountClassId the glAccountClassId to set
     */
    public void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
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
     * @param glAccountTypeId the glAccountTypeId to set
     */
    public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }
    /**
     * Auto generated value setter.
     * @param glResourceTypeId the glResourceTypeId to set
     */
    public void setGlResourceTypeId(String glResourceTypeId) {
        this.glResourceTypeId = glResourceTypeId;
    }
    /**
     * Auto generated value setter.
     * @param glXbrlClassId the glXbrlClassId to set
     */
    public void setGlXbrlClassId(String glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
    }
    /**
     * Auto generated value setter.
     * @param parentGlAccountId the parentGlAccountId to set
     */
    public void setParentGlAccountId(String parentGlAccountId) {
        this.parentGlAccountId = parentGlAccountId;
    }
    /**
     * Auto generated value setter.
     * @param accountCode the accountCode to set
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
    /**
     * Auto generated value setter.
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param postedBalance the postedBalance to set
     */
    public void setPostedBalance(BigDecimal postedBalance) {
        this.postedBalance = postedBalance;
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
     * @param customTimePeriodId the customTimePeriodId to set
     */
    public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
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
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountClassId() {
        return this.glAccountClassId;
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
     * @return <code>String</code>
     */
    public String getGlAccountTypeId() {
        return this.glAccountTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlResourceTypeId() {
        return this.glResourceTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlXbrlClassId() {
        return this.glXbrlClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentGlAccountId() {
        return this.parentGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountCode() {
        return this.accountCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountName() {
        return this.accountName;
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
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPostedBalance() {
        return this.postedBalance;
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
    public String getCustomTimePeriodId() {
        return this.customTimePeriodId;
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
     * Auto generated method that gets the related <code>GlAccountClass</code> by the relation named <code>GlAccountClass</code>.
     * @return the <code>GlAccountClass</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccountClass getGlAccountClass() throws RepositoryException {
        if (this.glAccountClass == null) {
            this.glAccountClass = getRelatedOne(GlAccountClass.class, "GlAccountClass");
        }
        return this.glAccountClass;
    }
    /**
     * Auto generated method that gets the related <code>GlAccountHistory</code> by the relation named <code>GlAccountHistory</code>.
     * @return the <code>GlAccountHistory</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccountHistory getGlAccountHistory() throws RepositoryException {
        if (this.glAccountHistory == null) {
            this.glAccountHistory = getRelatedOne(GlAccountHistory.class, "GlAccountHistory");
        }
        return this.glAccountHistory;
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
     * @param glAccountClass the glAccountClass to set
    */
    public void setGlAccountClass(GlAccountClass glAccountClass) {
        this.glAccountClass = glAccountClass;
    }
    /**
     * Auto generated value setter.
     * @param glAccountHistory the glAccountHistory to set
    */
    public void setGlAccountHistory(GlAccountHistory glAccountHistory) {
        this.glAccountHistory = glAccountHistory;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGlAccountClassId((String) mapValue.get("glAccountClassId"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setGlAccountTypeId((String) mapValue.get("glAccountTypeId"));
        setGlResourceTypeId((String) mapValue.get("glResourceTypeId"));
        setGlXbrlClassId((String) mapValue.get("glXbrlClassId"));
        setParentGlAccountId((String) mapValue.get("parentGlAccountId"));
        setAccountCode((String) mapValue.get("accountCode"));
        setAccountName((String) mapValue.get("accountName"));
        setDescription((String) mapValue.get("description"));
        setProductId((String) mapValue.get("productId"));
        setPostedBalance(convertToBigDecimal(mapValue.get("postedBalance")));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setCustomTimePeriodId((String) mapValue.get("customTimePeriodId"));
        setPostedDebits(convertToBigDecimal(mapValue.get("postedDebits")));
        setPostedCredits(convertToBigDecimal(mapValue.get("postedCredits")));
        setEndingBalance(convertToBigDecimal(mapValue.get("endingBalance")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("glAccountClassId", getGlAccountClassId());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("glAccountTypeId", getGlAccountTypeId());
        mapValue.put("glResourceTypeId", getGlResourceTypeId());
        mapValue.put("glXbrlClassId", getGlXbrlClassId());
        mapValue.put("parentGlAccountId", getParentGlAccountId());
        mapValue.put("accountCode", getAccountCode());
        mapValue.put("accountName", getAccountName());
        mapValue.put("description", getDescription());
        mapValue.put("productId", getProductId());
        mapValue.put("postedBalance", getPostedBalance());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("customTimePeriodId", getCustomTimePeriodId());
        mapValue.put("postedDebits", getPostedDebits());
        mapValue.put("postedCredits", getPostedCredits());
        mapValue.put("endingBalance", getEndingBalance());
        return mapValue;
    }


}
