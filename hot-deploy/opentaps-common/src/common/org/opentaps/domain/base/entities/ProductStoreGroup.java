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
 * Auto generated base entity ProductStoreGroup.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_STORE_GROUP")
public class ProductStoreGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productStoreGroupId", "PRODUCT_STORE_GROUP_ID");
        fields.put("productStoreGroupTypeId", "PRODUCT_STORE_GROUP_TYPE_ID");
        fields.put("primaryParentGroupId", "PRIMARY_PARENT_GROUP_ID");
        fields.put("productStoreGroupName", "PRODUCT_STORE_GROUP_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductStoreGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductStoreGroup> {
    productStoreGroupId("productStoreGroupId"),
    productStoreGroupTypeId("productStoreGroupTypeId"),
    primaryParentGroupId("primaryParentGroupId"),
    productStoreGroupName("productStoreGroupName"),
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

   @org.hibernate.annotations.GenericGenerator(name="ProductStoreGroup_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProductStoreGroup_GEN")
   @Id
   @Column(name="PRODUCT_STORE_GROUP_ID")
   private String productStoreGroupId;
   @Column(name="PRODUCT_STORE_GROUP_TYPE_ID")
   private String productStoreGroupTypeId;
   @Column(name="PRIMARY_PARENT_GROUP_ID")
   private String primaryParentGroupId;
   @Column(name="PRODUCT_STORE_GROUP_NAME")
   private String productStoreGroupName;
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
   @JoinColumn(name="PRODUCT_STORE_GROUP_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStoreGroupType productStoreGroupType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRIMARY_PARENT_GROUP_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStoreGroup primaryParentProductStoreGroup = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productStoreGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_STORE_GROUP_ID")
   
   private List<MrpProductStoreGroupMember> mrpProductStoreGroupMembers = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productStoreGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_STORE_GROUP_ID")
   
   private List<ProductPrice> productPrices = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PRIMARY_STORE_GROUP_ID")
   
   private List<ProductStore> primaryProductStores = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productStoreGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_STORE_GROUP_ID")
   
   private List<ProductStoreGroupMember> productStoreGroupMembers = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productStoreGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_STORE_GROUP_ID")
   
   private List<ProductStoreGroupRole> productStoreGroupRoles = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="currentProductStoreGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_STORE_GROUP_ID")
   
   private List<ProductStoreGroupRollup> currentProductStoreGroupRollups = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentProductStoreGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_GROUP_ID")
   
   private List<ProductStoreGroupRollup> parentProductStoreGroupRollups = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productStoreGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_STORE_GROUP_ID")
   
   private List<VendorProduct> vendorProducts = null;

  /**
   * Default constructor.
   */
  public ProductStoreGroup() {
      super();
      this.baseEntityName = "ProductStoreGroup";
      this.isView = false;
      this.resourceName = "ProductEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productStoreGroupId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productStoreGroupId");this.allFieldsNames.add("productStoreGroupTypeId");this.allFieldsNames.add("primaryParentGroupId");this.allFieldsNames.add("productStoreGroupName");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductStoreGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productStoreGroupId the productStoreGroupId to set
     */
    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
    }
    /**
     * Auto generated value setter.
     * @param productStoreGroupTypeId the productStoreGroupTypeId to set
     */
    public void setProductStoreGroupTypeId(String productStoreGroupTypeId) {
        this.productStoreGroupTypeId = productStoreGroupTypeId;
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
     * @param productStoreGroupName the productStoreGroupName to set
     */
    public void setProductStoreGroupName(String productStoreGroupName) {
        this.productStoreGroupName = productStoreGroupName;
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
    public String getProductStoreGroupId() {
        return this.productStoreGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreGroupTypeId() {
        return this.productStoreGroupTypeId;
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
    public String getProductStoreGroupName() {
        return this.productStoreGroupName;
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
     * Auto generated method that gets the related <code>ProductStoreGroupType</code> by the relation named <code>ProductStoreGroupType</code>.
     * @return the <code>ProductStoreGroupType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStoreGroupType getProductStoreGroupType() throws RepositoryException {
        if (this.productStoreGroupType == null) {
            this.productStoreGroupType = getRelatedOne(ProductStoreGroupType.class, "ProductStoreGroupType");
        }
        return this.productStoreGroupType;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroup</code> by the relation named <code>PrimaryParentProductStoreGroup</code>.
     * @return the <code>ProductStoreGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStoreGroup getPrimaryParentProductStoreGroup() throws RepositoryException {
        if (this.primaryParentProductStoreGroup == null) {
            this.primaryParentProductStoreGroup = getRelatedOne(ProductStoreGroup.class, "PrimaryParentProductStoreGroup");
        }
        return this.primaryParentProductStoreGroup;
    }
    /**
     * Auto generated method that gets the related <code>MrpProductStoreGroupMember</code> by the relation named <code>MrpProductStoreGroupMember</code>.
     * @return the list of <code>MrpProductStoreGroupMember</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MrpProductStoreGroupMember> getMrpProductStoreGroupMembers() throws RepositoryException {
        if (this.mrpProductStoreGroupMembers == null) {
            this.mrpProductStoreGroupMembers = getRelated(MrpProductStoreGroupMember.class, "MrpProductStoreGroupMember");
        }
        return this.mrpProductStoreGroupMembers;
    }
    /**
     * Auto generated method that gets the related <code>ProductPrice</code> by the relation named <code>ProductPrice</code>.
     * @return the list of <code>ProductPrice</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPrice> getProductPrices() throws RepositoryException {
        if (this.productPrices == null) {
            this.productPrices = getRelated(ProductPrice.class, "ProductPrice");
        }
        return this.productPrices;
    }
    /**
     * Auto generated method that gets the related <code>ProductStore</code> by the relation named <code>PrimaryProductStore</code>.
     * @return the list of <code>ProductStore</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStore> getPrimaryProductStores() throws RepositoryException {
        if (this.primaryProductStores == null) {
            this.primaryProductStores = getRelated(ProductStore.class, "PrimaryProductStore");
        }
        return this.primaryProductStores;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroupMember</code> by the relation named <code>ProductStoreGroupMember</code>.
     * @return the list of <code>ProductStoreGroupMember</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreGroupMember> getProductStoreGroupMembers() throws RepositoryException {
        if (this.productStoreGroupMembers == null) {
            this.productStoreGroupMembers = getRelated(ProductStoreGroupMember.class, "ProductStoreGroupMember");
        }
        return this.productStoreGroupMembers;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroupRole</code> by the relation named <code>ProductStoreGroupRole</code>.
     * @return the list of <code>ProductStoreGroupRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreGroupRole> getProductStoreGroupRoles() throws RepositoryException {
        if (this.productStoreGroupRoles == null) {
            this.productStoreGroupRoles = getRelated(ProductStoreGroupRole.class, "ProductStoreGroupRole");
        }
        return this.productStoreGroupRoles;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroupRollup</code> by the relation named <code>CurrentProductStoreGroupRollup</code>.
     * @return the list of <code>ProductStoreGroupRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreGroupRollup> getCurrentProductStoreGroupRollups() throws RepositoryException {
        if (this.currentProductStoreGroupRollups == null) {
            this.currentProductStoreGroupRollups = getRelated(ProductStoreGroupRollup.class, "CurrentProductStoreGroupRollup");
        }
        return this.currentProductStoreGroupRollups;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroupRollup</code> by the relation named <code>ParentProductStoreGroupRollup</code>.
     * @return the list of <code>ProductStoreGroupRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreGroupRollup> getParentProductStoreGroupRollups() throws RepositoryException {
        if (this.parentProductStoreGroupRollups == null) {
            this.parentProductStoreGroupRollups = getRelated(ProductStoreGroupRollup.class, "ParentProductStoreGroupRollup");
        }
        return this.parentProductStoreGroupRollups;
    }
    /**
     * Auto generated method that gets the related <code>VendorProduct</code> by the relation named <code>VendorProduct</code>.
     * @return the list of <code>VendorProduct</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends VendorProduct> getVendorProducts() throws RepositoryException {
        if (this.vendorProducts == null) {
            this.vendorProducts = getRelated(VendorProduct.class, "VendorProduct");
        }
        return this.vendorProducts;
    }

    /**
     * Auto generated value setter.
     * @param productStoreGroupType the productStoreGroupType to set
    */
    public void setProductStoreGroupType(ProductStoreGroupType productStoreGroupType) {
        this.productStoreGroupType = productStoreGroupType;
    }
    /**
     * Auto generated value setter.
     * @param primaryParentProductStoreGroup the primaryParentProductStoreGroup to set
    */
    public void setPrimaryParentProductStoreGroup(ProductStoreGroup primaryParentProductStoreGroup) {
        this.primaryParentProductStoreGroup = primaryParentProductStoreGroup;
    }
    /**
     * Auto generated value setter.
     * @param mrpProductStoreGroupMembers the mrpProductStoreGroupMembers to set
    */
    public void setMrpProductStoreGroupMembers(List<MrpProductStoreGroupMember> mrpProductStoreGroupMembers) {
        this.mrpProductStoreGroupMembers = mrpProductStoreGroupMembers;
    }
    /**
     * Auto generated value setter.
     * @param productPrices the productPrices to set
    */
    public void setProductPrices(List<ProductPrice> productPrices) {
        this.productPrices = productPrices;
    }
    /**
     * Auto generated value setter.
     * @param primaryProductStores the primaryProductStores to set
    */
    public void setPrimaryProductStores(List<ProductStore> primaryProductStores) {
        this.primaryProductStores = primaryProductStores;
    }
    /**
     * Auto generated value setter.
     * @param productStoreGroupMembers the productStoreGroupMembers to set
    */
    public void setProductStoreGroupMembers(List<ProductStoreGroupMember> productStoreGroupMembers) {
        this.productStoreGroupMembers = productStoreGroupMembers;
    }
    /**
     * Auto generated value setter.
     * @param productStoreGroupRoles the productStoreGroupRoles to set
    */
    public void setProductStoreGroupRoles(List<ProductStoreGroupRole> productStoreGroupRoles) {
        this.productStoreGroupRoles = productStoreGroupRoles;
    }
    /**
     * Auto generated value setter.
     * @param currentProductStoreGroupRollups the currentProductStoreGroupRollups to set
    */
    public void setCurrentProductStoreGroupRollups(List<ProductStoreGroupRollup> currentProductStoreGroupRollups) {
        this.currentProductStoreGroupRollups = currentProductStoreGroupRollups;
    }
    /**
     * Auto generated value setter.
     * @param parentProductStoreGroupRollups the parentProductStoreGroupRollups to set
    */
    public void setParentProductStoreGroupRollups(List<ProductStoreGroupRollup> parentProductStoreGroupRollups) {
        this.parentProductStoreGroupRollups = parentProductStoreGroupRollups;
    }
    /**
     * Auto generated value setter.
     * @param vendorProducts the vendorProducts to set
    */
    public void setVendorProducts(List<VendorProduct> vendorProducts) {
        this.vendorProducts = vendorProducts;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addMrpProductStoreGroupMember(MrpProductStoreGroupMember mrpProductStoreGroupMember) {
        if (this.mrpProductStoreGroupMembers == null) {
            this.mrpProductStoreGroupMembers = new ArrayList<MrpProductStoreGroupMember>();
        }
        this.mrpProductStoreGroupMembers.add(mrpProductStoreGroupMember);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeMrpProductStoreGroupMember(MrpProductStoreGroupMember mrpProductStoreGroupMember) {
        if (this.mrpProductStoreGroupMembers == null) {
            return;
        }
        this.mrpProductStoreGroupMembers.remove(mrpProductStoreGroupMember);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearMrpProductStoreGroupMember() {
        if (this.mrpProductStoreGroupMembers == null) {
            return;
        }
        this.mrpProductStoreGroupMembers.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductPrice(ProductPrice productPrice) {
        if (this.productPrices == null) {
            this.productPrices = new ArrayList<ProductPrice>();
        }
        this.productPrices.add(productPrice);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductPrice(ProductPrice productPrice) {
        if (this.productPrices == null) {
            return;
        }
        this.productPrices.remove(productPrice);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductPrice() {
        if (this.productPrices == null) {
            return;
        }
        this.productPrices.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductStoreGroupMember(ProductStoreGroupMember productStoreGroupMember) {
        if (this.productStoreGroupMembers == null) {
            this.productStoreGroupMembers = new ArrayList<ProductStoreGroupMember>();
        }
        this.productStoreGroupMembers.add(productStoreGroupMember);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductStoreGroupMember(ProductStoreGroupMember productStoreGroupMember) {
        if (this.productStoreGroupMembers == null) {
            return;
        }
        this.productStoreGroupMembers.remove(productStoreGroupMember);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductStoreGroupMember() {
        if (this.productStoreGroupMembers == null) {
            return;
        }
        this.productStoreGroupMembers.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductStoreGroupRole(ProductStoreGroupRole productStoreGroupRole) {
        if (this.productStoreGroupRoles == null) {
            this.productStoreGroupRoles = new ArrayList<ProductStoreGroupRole>();
        }
        this.productStoreGroupRoles.add(productStoreGroupRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductStoreGroupRole(ProductStoreGroupRole productStoreGroupRole) {
        if (this.productStoreGroupRoles == null) {
            return;
        }
        this.productStoreGroupRoles.remove(productStoreGroupRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductStoreGroupRole() {
        if (this.productStoreGroupRoles == null) {
            return;
        }
        this.productStoreGroupRoles.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addCurrentProductStoreGroupRollup(ProductStoreGroupRollup currentProductStoreGroupRollup) {
        if (this.currentProductStoreGroupRollups == null) {
            this.currentProductStoreGroupRollups = new ArrayList<ProductStoreGroupRollup>();
        }
        this.currentProductStoreGroupRollups.add(currentProductStoreGroupRollup);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeCurrentProductStoreGroupRollup(ProductStoreGroupRollup currentProductStoreGroupRollup) {
        if (this.currentProductStoreGroupRollups == null) {
            return;
        }
        this.currentProductStoreGroupRollups.remove(currentProductStoreGroupRollup);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearCurrentProductStoreGroupRollup() {
        if (this.currentProductStoreGroupRollups == null) {
            return;
        }
        this.currentProductStoreGroupRollups.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addParentProductStoreGroupRollup(ProductStoreGroupRollup parentProductStoreGroupRollup) {
        if (this.parentProductStoreGroupRollups == null) {
            this.parentProductStoreGroupRollups = new ArrayList<ProductStoreGroupRollup>();
        }
        this.parentProductStoreGroupRollups.add(parentProductStoreGroupRollup);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeParentProductStoreGroupRollup(ProductStoreGroupRollup parentProductStoreGroupRollup) {
        if (this.parentProductStoreGroupRollups == null) {
            return;
        }
        this.parentProductStoreGroupRollups.remove(parentProductStoreGroupRollup);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearParentProductStoreGroupRollup() {
        if (this.parentProductStoreGroupRollups == null) {
            return;
        }
        this.parentProductStoreGroupRollups.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addVendorProduct(VendorProduct vendorProduct) {
        if (this.vendorProducts == null) {
            this.vendorProducts = new ArrayList<VendorProduct>();
        }
        this.vendorProducts.add(vendorProduct);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeVendorProduct(VendorProduct vendorProduct) {
        if (this.vendorProducts == null) {
            return;
        }
        this.vendorProducts.remove(vendorProduct);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearVendorProduct() {
        if (this.vendorProducts == null) {
            return;
        }
        this.vendorProducts.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductStoreGroupId((String) mapValue.get("productStoreGroupId"));
        setProductStoreGroupTypeId((String) mapValue.get("productStoreGroupTypeId"));
        setPrimaryParentGroupId((String) mapValue.get("primaryParentGroupId"));
        setProductStoreGroupName((String) mapValue.get("productStoreGroupName"));
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
        mapValue.put("productStoreGroupId", getProductStoreGroupId());
        mapValue.put("productStoreGroupTypeId", getProductStoreGroupTypeId());
        mapValue.put("primaryParentGroupId", getPrimaryParentGroupId());
        mapValue.put("productStoreGroupName", getProductStoreGroupName());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
