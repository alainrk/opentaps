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
 * Auto generated base entity ProductVirtualAndVariantInfo.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductVirtualAndVariantInfos", query="SELECT PVIRT.PRODUCT_ID AS \"productId\",PVIRT.PRODUCT_NAME AS \"productName\",PVIRT.INTERNAL_NAME AS \"internalName\",PVA.PRODUCT_ASSOC_TYPE_ID AS \"productAssocTypeId\",PVA.FROM_DATE AS \"fromDate\",PVA.THRU_DATE AS \"thruDate\",PVAR.PRODUCT_ID AS \"productId\",PVARFA.PRODUCT_FEATURE_APPL_TYPE_ID AS \"productFeatureApplTypeId\",PVARFA.FROM_DATE AS \"fromDate\",PVARFA.THRU_DATE AS \"thruDate\",PVARF.PRODUCT_FEATURE_ID AS \"productFeatureId\",PVARF.PRODUCT_FEATURE_TYPE_ID AS \"productFeatureTypeId\",PVARF.PRODUCT_FEATURE_CATEGORY_ID AS \"productFeatureCategoryId\",PVARF.DESCRIPTION AS \"description\",PVARPRC.PRODUCT_PRICE_TYPE_ID AS \"productPriceTypeId\",PVARPRC.CURRENCY_UOM_ID AS \"currencyUomId\",PVARPRC.PRODUCT_STORE_GROUP_ID AS \"productStoreGroupId\",PVARPRC.FROM_DATE AS \"fromDate\",PVARPRC.THRU_DATE AS \"thruDate\",PVARPRC.PRICE AS \"price\" FROM PRODUCT PVIRT INNER JOIN PRODUCT_ASSOC PVA ON PVIRT.PRODUCT_ID = PVA.PRODUCT_ID INNER JOIN PRODUCT PVAR ON PVA.PRODUCT_ID_TO = PVAR.PRODUCT_ID LEFT JOIN PRODUCT_FEATURE_APPL PVARFA ON PVAR.PRODUCT_ID = PVARFA.PRODUCT_ID INNER JOIN PRODUCT_FEATURE PVARF ON PVARFA.PRODUCT_FEATURE_ID = PVARF.PRODUCT_FEATURE_ID INNER JOIN PRODUCT_PRICE PVARPRC ON PVAR.PRODUCT_ID = PVARPRC.PRODUCT_ID", resultSetMapping="ProductVirtualAndVariantInfoMapping")
@SqlResultSetMapping(name="ProductVirtualAndVariantInfoMapping", entities={
@EntityResult(entityClass=ProductVirtualAndVariantInfo.class, fields = {
@FieldResult(name="productId", column="productId")
,@FieldResult(name="productName", column="productName")
,@FieldResult(name="internalName", column="internalName")
,@FieldResult(name="productAssocTypeId", column="productAssocTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="variantProductId", column="variantProductId")
,@FieldResult(name="productFeatureApplTypeId", column="productFeatureApplTypeId")
,@FieldResult(name="variantFeatureApplFromDate", column="variantFeatureApplFromDate")
,@FieldResult(name="variantFeatureApplThruDate", column="variantFeatureApplThruDate")
,@FieldResult(name="productFeatureId", column="productFeatureId")
,@FieldResult(name="productFeatureTypeId", column="productFeatureTypeId")
,@FieldResult(name="productFeatureCategoryId", column="productFeatureCategoryId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="variantPriceTypeId", column="variantPriceTypeId")
,@FieldResult(name="variantCurrencyUomId", column="variantCurrencyUomId")
,@FieldResult(name="variantProductStoreGroupId", column="variantProductStoreGroupId")
,@FieldResult(name="variantPriceFromDate", column="variantPriceFromDate")
,@FieldResult(name="variantPriceThruDate", column="variantPriceThruDate")
,@FieldResult(name="variantPrice", column="variantPrice")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductVirtualAndVariantInfo extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PVIRT.PRODUCT_ID");
        fields.put("productName", "PVIRT.PRODUCT_NAME");
        fields.put("internalName", "PVIRT.INTERNAL_NAME");
        fields.put("productAssocTypeId", "PVA.PRODUCT_ASSOC_TYPE_ID");
        fields.put("fromDate", "PVA.FROM_DATE");
        fields.put("thruDate", "PVA.THRU_DATE");
        fields.put("variantProductId", "PVAR.PRODUCT_ID");
        fields.put("productFeatureApplTypeId", "PVARFA.PRODUCT_FEATURE_APPL_TYPE_ID");
        fields.put("variantFeatureApplFromDate", "PVARFA.FROM_DATE");
        fields.put("variantFeatureApplThruDate", "PVARFA.THRU_DATE");
        fields.put("productFeatureId", "PVARF.PRODUCT_FEATURE_ID");
        fields.put("productFeatureTypeId", "PVARF.PRODUCT_FEATURE_TYPE_ID");
        fields.put("productFeatureCategoryId", "PVARF.PRODUCT_FEATURE_CATEGORY_ID");
        fields.put("description", "PVARF.DESCRIPTION");
        fields.put("variantPriceTypeId", "PVARPRC.PRODUCT_PRICE_TYPE_ID");
        fields.put("variantCurrencyUomId", "PVARPRC.CURRENCY_UOM_ID");
        fields.put("variantProductStoreGroupId", "PVARPRC.PRODUCT_STORE_GROUP_ID");
        fields.put("variantPriceFromDate", "PVARPRC.FROM_DATE");
        fields.put("variantPriceThruDate", "PVARPRC.THRU_DATE");
        fields.put("variantPrice", "PVARPRC.PRICE");
fieldMapColumns.put("ProductVirtualAndVariantInfo", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductVirtualAndVariantInfo> {
    productId("productId"),
    productName("productName"),
    internalName("internalName"),
    productAssocTypeId("productAssocTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    variantProductId("variantProductId"),
    productFeatureApplTypeId("productFeatureApplTypeId"),
    variantFeatureApplFromDate("variantFeatureApplFromDate"),
    variantFeatureApplThruDate("variantFeatureApplThruDate"),
    productFeatureId("productFeatureId"),
    productFeatureTypeId("productFeatureTypeId"),
    productFeatureCategoryId("productFeatureCategoryId"),
    description("description"),
    variantPriceTypeId("variantPriceTypeId"),
    variantCurrencyUomId("variantCurrencyUomId"),
    variantProductStoreGroupId("variantProductStoreGroupId"),
    variantPriceFromDate("variantPriceFromDate"),
    variantPriceThruDate("variantPriceThruDate"),
    variantPrice("variantPrice");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String productId;
    
   private String productName;
    
   private String internalName;
    
   private String productAssocTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String variantProductId;
    
   private String productFeatureApplTypeId;
    
   private Timestamp variantFeatureApplFromDate;
    
   private Timestamp variantFeatureApplThruDate;
    
   private String productFeatureId;
    
   private String productFeatureTypeId;
    
   private String productFeatureCategoryId;
    
   private String description;
    
   private String variantPriceTypeId;
    
   private String variantCurrencyUomId;
    
   private String variantProductStoreGroupId;
    
   private Timestamp variantPriceFromDate;
    
   private Timestamp variantPriceThruDate;
    
   private BigDecimal variantPrice;

  /**
   * Default constructor.
   */
  public ProductVirtualAndVariantInfo() {
      super();
      this.baseEntityName = "ProductVirtualAndVariantInfo";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("productAssocTypeId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("variantProductId");this.primaryKeyNames.add("variantFeatureApplFromDate");this.primaryKeyNames.add("productFeatureId");this.primaryKeyNames.add("variantPriceTypeId");this.primaryKeyNames.add("variantCurrencyUomId");this.primaryKeyNames.add("variantProductStoreGroupId");this.primaryKeyNames.add("variantPriceFromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("productName");this.allFieldsNames.add("internalName");this.allFieldsNames.add("productAssocTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("variantProductId");this.allFieldsNames.add("productFeatureApplTypeId");this.allFieldsNames.add("variantFeatureApplFromDate");this.allFieldsNames.add("variantFeatureApplThruDate");this.allFieldsNames.add("productFeatureId");this.allFieldsNames.add("productFeatureTypeId");this.allFieldsNames.add("productFeatureCategoryId");this.allFieldsNames.add("description");this.allFieldsNames.add("variantPriceTypeId");this.allFieldsNames.add("variantCurrencyUomId");this.allFieldsNames.add("variantProductStoreGroupId");this.allFieldsNames.add("variantPriceFromDate");this.allFieldsNames.add("variantPriceThruDate");this.allFieldsNames.add("variantPrice");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductVirtualAndVariantInfo(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    /**
     * Auto generated value setter.
     * @param internalName the internalName to set
     */
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }
    /**
     * Auto generated value setter.
     * @param productAssocTypeId the productAssocTypeId to set
     */
    public void setProductAssocTypeId(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param variantProductId the variantProductId to set
     */
    public void setVariantProductId(String variantProductId) {
        this.variantProductId = variantProductId;
    }
    /**
     * Auto generated value setter.
     * @param productFeatureApplTypeId the productFeatureApplTypeId to set
     */
    public void setProductFeatureApplTypeId(String productFeatureApplTypeId) {
        this.productFeatureApplTypeId = productFeatureApplTypeId;
    }
    /**
     * Auto generated value setter.
     * @param variantFeatureApplFromDate the variantFeatureApplFromDate to set
     */
    public void setVariantFeatureApplFromDate(Timestamp variantFeatureApplFromDate) {
        this.variantFeatureApplFromDate = variantFeatureApplFromDate;
    }
    /**
     * Auto generated value setter.
     * @param variantFeatureApplThruDate the variantFeatureApplThruDate to set
     */
    public void setVariantFeatureApplThruDate(Timestamp variantFeatureApplThruDate) {
        this.variantFeatureApplThruDate = variantFeatureApplThruDate;
    }
    /**
     * Auto generated value setter.
     * @param productFeatureId the productFeatureId to set
     */
    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
    /**
     * Auto generated value setter.
     * @param productFeatureTypeId the productFeatureTypeId to set
     */
    public void setProductFeatureTypeId(String productFeatureTypeId) {
        this.productFeatureTypeId = productFeatureTypeId;
    }
    /**
     * Auto generated value setter.
     * @param productFeatureCategoryId the productFeatureCategoryId to set
     */
    public void setProductFeatureCategoryId(String productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId;
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
     * @param variantPriceTypeId the variantPriceTypeId to set
     */
    public void setVariantPriceTypeId(String variantPriceTypeId) {
        this.variantPriceTypeId = variantPriceTypeId;
    }
    /**
     * Auto generated value setter.
     * @param variantCurrencyUomId the variantCurrencyUomId to set
     */
    public void setVariantCurrencyUomId(String variantCurrencyUomId) {
        this.variantCurrencyUomId = variantCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param variantProductStoreGroupId the variantProductStoreGroupId to set
     */
    public void setVariantProductStoreGroupId(String variantProductStoreGroupId) {
        this.variantProductStoreGroupId = variantProductStoreGroupId;
    }
    /**
     * Auto generated value setter.
     * @param variantPriceFromDate the variantPriceFromDate to set
     */
    public void setVariantPriceFromDate(Timestamp variantPriceFromDate) {
        this.variantPriceFromDate = variantPriceFromDate;
    }
    /**
     * Auto generated value setter.
     * @param variantPriceThruDate the variantPriceThruDate to set
     */
    public void setVariantPriceThruDate(Timestamp variantPriceThruDate) {
        this.variantPriceThruDate = variantPriceThruDate;
    }
    /**
     * Auto generated value setter.
     * @param variantPrice the variantPrice to set
     */
    public void setVariantPrice(BigDecimal variantPrice) {
        this.variantPrice = variantPrice;
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
    public String getProductName() {
        return this.productName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInternalName() {
        return this.internalName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductAssocTypeId() {
        return this.productAssocTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVariantProductId() {
        return this.variantProductId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureApplTypeId() {
        return this.productFeatureApplTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getVariantFeatureApplFromDate() {
        return this.variantFeatureApplFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getVariantFeatureApplThruDate() {
        return this.variantFeatureApplThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureId() {
        return this.productFeatureId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureTypeId() {
        return this.productFeatureTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureCategoryId() {
        return this.productFeatureCategoryId;
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
    public String getVariantPriceTypeId() {
        return this.variantPriceTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVariantCurrencyUomId() {
        return this.variantCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVariantProductStoreGroupId() {
        return this.variantProductStoreGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getVariantPriceFromDate() {
        return this.variantPriceFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getVariantPriceThruDate() {
        return this.variantPriceThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getVariantPrice() {
        return this.variantPrice;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setProductName((String) mapValue.get("productName"));
        setInternalName((String) mapValue.get("internalName"));
        setProductAssocTypeId((String) mapValue.get("productAssocTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setVariantProductId((String) mapValue.get("variantProductId"));
        setProductFeatureApplTypeId((String) mapValue.get("productFeatureApplTypeId"));
        setVariantFeatureApplFromDate((Timestamp) mapValue.get("variantFeatureApplFromDate"));
        setVariantFeatureApplThruDate((Timestamp) mapValue.get("variantFeatureApplThruDate"));
        setProductFeatureId((String) mapValue.get("productFeatureId"));
        setProductFeatureTypeId((String) mapValue.get("productFeatureTypeId"));
        setProductFeatureCategoryId((String) mapValue.get("productFeatureCategoryId"));
        setDescription((String) mapValue.get("description"));
        setVariantPriceTypeId((String) mapValue.get("variantPriceTypeId"));
        setVariantCurrencyUomId((String) mapValue.get("variantCurrencyUomId"));
        setVariantProductStoreGroupId((String) mapValue.get("variantProductStoreGroupId"));
        setVariantPriceFromDate((Timestamp) mapValue.get("variantPriceFromDate"));
        setVariantPriceThruDate((Timestamp) mapValue.get("variantPriceThruDate"));
        setVariantPrice(convertToBigDecimal(mapValue.get("variantPrice")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("productName", getProductName());
        mapValue.put("internalName", getInternalName());
        mapValue.put("productAssocTypeId", getProductAssocTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("variantProductId", getVariantProductId());
        mapValue.put("productFeatureApplTypeId", getProductFeatureApplTypeId());
        mapValue.put("variantFeatureApplFromDate", getVariantFeatureApplFromDate());
        mapValue.put("variantFeatureApplThruDate", getVariantFeatureApplThruDate());
        mapValue.put("productFeatureId", getProductFeatureId());
        mapValue.put("productFeatureTypeId", getProductFeatureTypeId());
        mapValue.put("productFeatureCategoryId", getProductFeatureCategoryId());
        mapValue.put("description", getDescription());
        mapValue.put("variantPriceTypeId", getVariantPriceTypeId());
        mapValue.put("variantCurrencyUomId", getVariantCurrencyUomId());
        mapValue.put("variantProductStoreGroupId", getVariantProductStoreGroupId());
        mapValue.put("variantPriceFromDate", getVariantPriceFromDate());
        mapValue.put("variantPriceThruDate", getVariantPriceThruDate());
        mapValue.put("variantPrice", getVariantPrice());
        return mapValue;
    }


}
