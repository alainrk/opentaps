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
 * Auto generated base entity GlAccountClass.
 */
@javax.persistence.Entity
@Table(name="GL_ACCOUNT_CLASS")
public class GlAccountClass extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("glAccountClassId", "GL_ACCOUNT_CLASS_ID");
        fields.put("parentClassId", "PARENT_CLASS_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("isAssetClass", "IS_ASSET_CLASS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("GlAccountClass", fields);
}
  public static enum Fields implements EntityFieldInterface<GlAccountClass> {
    glAccountClassId("glAccountClassId"),
    parentClassId("parentClassId"),
    description("description"),
    isAssetClass("isAssetClass"),
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

   @org.hibernate.annotations.GenericGenerator(name="GlAccountClass_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="GlAccountClass_GEN")
   @Id
   @Column(name="GL_ACCOUNT_CLASS_ID")
   private String glAccountClassId;
   @Column(name="PARENT_CLASS_ID")
   private String parentClassId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="IS_ASSET_CLASS")
   private String isAssetClass;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_CLASS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccountClass parentGlAccountClass = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_CLASS_ID")
   
   private List<GlAccount> glAccounts = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_CLASS_ID")
   
   private List<GlAccountClass> childGlAccountClasses = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_CLASS_ID")
   
   private List<GlAccountClassTypeMap> glAccountClassTypeMaps = null;

  /**
   * Default constructor.
   */
  public GlAccountClass() {
      super();
      this.baseEntityName = "GlAccountClass";
      this.isView = false;
      this.resourceName = "AccountingEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glAccountClassId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("glAccountClassId");this.allFieldsNames.add("parentClassId");this.allFieldsNames.add("description");this.allFieldsNames.add("isAssetClass");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GlAccountClass(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param glAccountClassId the glAccountClassId to set
     */
    public void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }
    /**
     * Auto generated value setter.
     * @param parentClassId the parentClassId to set
     */
    public void setParentClassId(String parentClassId) {
        this.parentClassId = parentClassId;
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
     * @param isAssetClass the isAssetClass to set
     */
    public void setIsAssetClass(String isAssetClass) {
        this.isAssetClass = isAssetClass;
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
    public String getGlAccountClassId() {
        return this.glAccountClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentClassId() {
        return this.parentClassId;
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
    public String getIsAssetClass() {
        return this.isAssetClass;
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
     * Auto generated method that gets the related <code>GlAccountClass</code> by the relation named <code>ParentGlAccountClass</code>.
     * @return the <code>GlAccountClass</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccountClass getParentGlAccountClass() throws RepositoryException {
        if (this.parentGlAccountClass == null) {
            this.parentGlAccountClass = getRelatedOne(GlAccountClass.class, "ParentGlAccountClass");
        }
        return this.parentGlAccountClass;
    }
    /**
     * Auto generated method that gets the related <code>GlAccount</code> by the relation named <code>GlAccount</code>.
     * @return the list of <code>GlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends GlAccount> getGlAccounts() throws RepositoryException {
        if (this.glAccounts == null) {
            this.glAccounts = getRelated(GlAccount.class, "GlAccount");
        }
        return this.glAccounts;
    }
    /**
     * Auto generated method that gets the related <code>GlAccountClass</code> by the relation named <code>ChildGlAccountClass</code>.
     * @return the list of <code>GlAccountClass</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends GlAccountClass> getChildGlAccountClasses() throws RepositoryException {
        if (this.childGlAccountClasses == null) {
            this.childGlAccountClasses = getRelated(GlAccountClass.class, "ChildGlAccountClass");
        }
        return this.childGlAccountClasses;
    }
    /**
     * Auto generated method that gets the related <code>GlAccountClassTypeMap</code> by the relation named <code>GlAccountClassTypeMap</code>.
     * @return the list of <code>GlAccountClassTypeMap</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends GlAccountClassTypeMap> getGlAccountClassTypeMaps() throws RepositoryException {
        if (this.glAccountClassTypeMaps == null) {
            this.glAccountClassTypeMaps = getRelated(GlAccountClassTypeMap.class, "GlAccountClassTypeMap");
        }
        return this.glAccountClassTypeMaps;
    }

    /**
     * Auto generated value setter.
     * @param parentGlAccountClass the parentGlAccountClass to set
    */
    public void setParentGlAccountClass(GlAccountClass parentGlAccountClass) {
        this.parentGlAccountClass = parentGlAccountClass;
    }
    /**
     * Auto generated value setter.
     * @param glAccounts the glAccounts to set
    */
    public void setGlAccounts(List<GlAccount> glAccounts) {
        this.glAccounts = glAccounts;
    }
    /**
     * Auto generated value setter.
     * @param childGlAccountClasses the childGlAccountClasses to set
    */
    public void setChildGlAccountClasses(List<GlAccountClass> childGlAccountClasses) {
        this.childGlAccountClasses = childGlAccountClasses;
    }
    /**
     * Auto generated value setter.
     * @param glAccountClassTypeMaps the glAccountClassTypeMaps to set
    */
    public void setGlAccountClassTypeMaps(List<GlAccountClassTypeMap> glAccountClassTypeMaps) {
        this.glAccountClassTypeMaps = glAccountClassTypeMaps;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGlAccountClassId((String) mapValue.get("glAccountClassId"));
        setParentClassId((String) mapValue.get("parentClassId"));
        setDescription((String) mapValue.get("description"));
        setIsAssetClass((String) mapValue.get("isAssetClass"));
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
        mapValue.put("glAccountClassId", getGlAccountClassId());
        mapValue.put("parentClassId", getParentClassId());
        mapValue.put("description", getDescription());
        mapValue.put("isAssetClass", getIsAssetClass());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}