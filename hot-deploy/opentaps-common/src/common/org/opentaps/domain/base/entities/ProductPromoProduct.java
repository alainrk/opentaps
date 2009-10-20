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
 * Auto generated base entity ProductPromoProduct.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_PROMO_PRODUCT")
public class ProductPromoProduct extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productPromoId", "PRODUCT_PROMO_ID");
        fields.put("productPromoRuleId", "PRODUCT_PROMO_RULE_ID");
        fields.put("productPromoActionSeqId", "PRODUCT_PROMO_ACTION_SEQ_ID");
        fields.put("productPromoCondSeqId", "PRODUCT_PROMO_COND_SEQ_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("productPromoApplEnumId", "PRODUCT_PROMO_APPL_ENUM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductPromoProduct", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductPromoProduct> {
    productPromoId("productPromoId"),
    productPromoRuleId("productPromoRuleId"),
    productPromoActionSeqId("productPromoActionSeqId"),
    productPromoCondSeqId("productPromoCondSeqId"),
    productId("productId"),
    productPromoApplEnumId("productPromoApplEnumId"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ProductPromoProductPkBridge.class)
     private ProductPromoProductPk id = new ProductPromoProductPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductPromoProductPk</code>
     */
      public ProductPromoProductPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductPromoProductPk</code> value to set
    */   
      public void setId(ProductPromoProductPk id) {
         this.id = id;
      }
   @Column(name="PRODUCT_PROMO_APPL_ENUM_ID")
   private String productPromoApplEnumId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PROMO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductPromo productPromo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PROMO_APPL_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration applEnumeration = null;

  /**
   * Default constructor.
   */
  public ProductPromoProduct() {
      super();
      this.baseEntityName = "ProductPromoProduct";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productPromoId");this.primaryKeyNames.add("productPromoRuleId");this.primaryKeyNames.add("productPromoActionSeqId");this.primaryKeyNames.add("productPromoCondSeqId");this.primaryKeyNames.add("productId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productPromoId");this.allFieldsNames.add("productPromoRuleId");this.allFieldsNames.add("productPromoActionSeqId");this.allFieldsNames.add("productPromoCondSeqId");this.allFieldsNames.add("productId");this.allFieldsNames.add("productPromoApplEnumId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductPromoProduct(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productPromoId the productPromoId to set
     */
    public void setProductPromoId(String productPromoId) {
        id.setProductPromoId(productPromoId);
    }
    /**
     * Auto generated value setter.
     * @param productPromoRuleId the productPromoRuleId to set
     */
    public void setProductPromoRuleId(String productPromoRuleId) {
        id.setProductPromoRuleId(productPromoRuleId);
    }
    /**
     * Auto generated value setter.
     * @param productPromoActionSeqId the productPromoActionSeqId to set
     */
    public void setProductPromoActionSeqId(String productPromoActionSeqId) {
        id.setProductPromoActionSeqId(productPromoActionSeqId);
    }
    /**
     * Auto generated value setter.
     * @param productPromoCondSeqId the productPromoCondSeqId to set
     */
    public void setProductPromoCondSeqId(String productPromoCondSeqId) {
        id.setProductPromoCondSeqId(productPromoCondSeqId);
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        id.setProductId(productId);
    }
    /**
     * Auto generated value setter.
     * @param productPromoApplEnumId the productPromoApplEnumId to set
     */
    public void setProductPromoApplEnumId(String productPromoApplEnumId) {
        this.productPromoApplEnumId = productPromoApplEnumId;
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
    public String getProductPromoId() {
        return this.id.getProductPromoId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoRuleId() {
        return this.id.getProductPromoRuleId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoActionSeqId() {
        return this.id.getProductPromoActionSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoCondSeqId() {
        return this.id.getProductPromoCondSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.id.getProductId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoApplEnumId() {
        return this.productPromoApplEnumId;
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
     * Auto generated method that gets the related <code>ProductPromo</code> by the relation named <code>ProductPromo</code>.
     * @return the <code>ProductPromo</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductPromo getProductPromo() throws RepositoryException {
        if (this.productPromo == null) {
            this.productPromo = getRelatedOne(ProductPromo.class, "ProductPromo");
        }
        return this.productPromo;
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
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>ApplEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getApplEnumeration() throws RepositoryException {
        if (this.applEnumeration == null) {
            this.applEnumeration = getRelatedOne(Enumeration.class, "ApplEnumeration");
        }
        return this.applEnumeration;
    }

    /**
     * Auto generated value setter.
     * @param productPromo the productPromo to set
    */
    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
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
     * @param applEnumeration the applEnumeration to set
    */
    public void setApplEnumeration(Enumeration applEnumeration) {
        this.applEnumeration = applEnumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductPromoId((String) mapValue.get("productPromoId"));
        setProductPromoRuleId((String) mapValue.get("productPromoRuleId"));
        setProductPromoActionSeqId((String) mapValue.get("productPromoActionSeqId"));
        setProductPromoCondSeqId((String) mapValue.get("productPromoCondSeqId"));
        setProductId((String) mapValue.get("productId"));
        setProductPromoApplEnumId((String) mapValue.get("productPromoApplEnumId"));
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
        mapValue.put("productPromoId", getProductPromoId());
        mapValue.put("productPromoRuleId", getProductPromoRuleId());
        mapValue.put("productPromoActionSeqId", getProductPromoActionSeqId());
        mapValue.put("productPromoCondSeqId", getProductPromoCondSeqId());
        mapValue.put("productId", getProductId());
        mapValue.put("productPromoApplEnumId", getProductPromoApplEnumId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
