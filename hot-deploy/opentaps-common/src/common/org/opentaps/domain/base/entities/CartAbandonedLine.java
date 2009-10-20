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
 * Auto generated base entity CartAbandonedLine.
 */
@javax.persistence.Entity
@Table(name="CART_ABANDONED_LINE")
public class CartAbandonedLine extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("visitId", "VISIT_ID");
        fields.put("cartAbandonedLineSeqId", "CART_ABANDONED_LINE_SEQ_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("prodCatalogId", "PROD_CATALOG_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("reservStart", "RESERV_START");
        fields.put("reservLength", "RESERV_LENGTH");
        fields.put("reservPersons", "RESERV_PERSONS");
        fields.put("unitPrice", "UNIT_PRICE");
        fields.put("reserv2ndPPPerc", "RESERV2ND_P_P_PERC");
        fields.put("reservNthPPPerc", "RESERV_NTH_P_P_PERC");
        fields.put("configId", "CONFIG_ID");
        fields.put("totalWithAdjustments", "TOTAL_WITH_ADJUSTMENTS");
        fields.put("wasReserved", "WAS_RESERVED");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CartAbandonedLine", fields);
}
  public static enum Fields implements EntityFieldInterface<CartAbandonedLine> {
    visitId("visitId"),
    cartAbandonedLineSeqId("cartAbandonedLineSeqId"),
    productId("productId"),
    prodCatalogId("prodCatalogId"),
    quantity("quantity"),
    reservStart("reservStart"),
    reservLength("reservLength"),
    reservPersons("reservPersons"),
    unitPrice("unitPrice"),
    reserv2ndPPPerc("reserv2ndPPPerc"),
    reservNthPPPerc("reservNthPPPerc"),
    configId("configId"),
    totalWithAdjustments("totalWithAdjustments"),
    wasReserved("wasReserved"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.CartAbandonedLinePkBridge.class)
     private CartAbandonedLinePk id = new CartAbandonedLinePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>CartAbandonedLinePk</code>
     */
      public CartAbandonedLinePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>CartAbandonedLinePk</code> value to set
    */   
      public void setId(CartAbandonedLinePk id) {
         this.id = id;
      }
   @Column(name="PRODUCT_ID")
   private String productId;
   @Column(name="PROD_CATALOG_ID")
   private String prodCatalogId;
   @Column(name="QUANTITY")
   private BigDecimal quantity;
   @Column(name="RESERV_START")
   private Timestamp reservStart;
   @Column(name="RESERV_LENGTH")
   private BigDecimal reservLength;
   @Column(name="RESERV_PERSONS")
   private BigDecimal reservPersons;
   @Column(name="UNIT_PRICE")
   private BigDecimal unitPrice;
   @Column(name="RESERV2ND_P_P_PERC")
   private BigDecimal reserv2ndPPPerc;
   @Column(name="RESERV_NTH_P_P_PERC")
   private BigDecimal reservNthPPPerc;
   @Column(name="CONFIG_ID")
   private String configId;
   @Column(name="TOTAL_WITH_ADJUSTMENTS")
   private BigDecimal totalWithAdjustments;
   @Column(name="WAS_RESERVED")
   private String wasReserved;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VISIT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Visit visit = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PROD_CATALOG_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProdCatalog prodCatalog = null;

  /**
   * Default constructor.
   */
  public CartAbandonedLine() {
      super();
      this.baseEntityName = "CartAbandonedLine";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("visitId");this.primaryKeyNames.add("cartAbandonedLineSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("visitId");this.allFieldsNames.add("cartAbandonedLineSeqId");this.allFieldsNames.add("productId");this.allFieldsNames.add("prodCatalogId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("reservStart");this.allFieldsNames.add("reservLength");this.allFieldsNames.add("reservPersons");this.allFieldsNames.add("unitPrice");this.allFieldsNames.add("reserv2ndPPPerc");this.allFieldsNames.add("reservNthPPPerc");this.allFieldsNames.add("configId");this.allFieldsNames.add("totalWithAdjustments");this.allFieldsNames.add("wasReserved");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CartAbandonedLine(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param visitId the visitId to set
     */
    public void setVisitId(String visitId) {
        id.setVisitId(visitId);
    }
    /**
     * Auto generated value setter.
     * @param cartAbandonedLineSeqId the cartAbandonedLineSeqId to set
     */
    public void setCartAbandonedLineSeqId(String cartAbandonedLineSeqId) {
        id.setCartAbandonedLineSeqId(cartAbandonedLineSeqId);
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
     * @param prodCatalogId the prodCatalogId to set
     */
    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param reservStart the reservStart to set
     */
    public void setReservStart(Timestamp reservStart) {
        this.reservStart = reservStart;
    }
    /**
     * Auto generated value setter.
     * @param reservLength the reservLength to set
     */
    public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }
    /**
     * Auto generated value setter.
     * @param reservPersons the reservPersons to set
     */
    public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }
    /**
     * Auto generated value setter.
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    /**
     * Auto generated value setter.
     * @param reserv2ndPPPerc the reserv2ndPPPerc to set
     */
    public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }
    /**
     * Auto generated value setter.
     * @param reservNthPPPerc the reservNthPPPerc to set
     */
    public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }
    /**
     * Auto generated value setter.
     * @param configId the configId to set
     */
    public void setConfigId(String configId) {
        this.configId = configId;
    }
    /**
     * Auto generated value setter.
     * @param totalWithAdjustments the totalWithAdjustments to set
     */
    public void setTotalWithAdjustments(BigDecimal totalWithAdjustments) {
        this.totalWithAdjustments = totalWithAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param wasReserved the wasReserved to set
     */
    public void setWasReserved(String wasReserved) {
        this.wasReserved = wasReserved;
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
    public String getVisitId() {
        return this.id.getVisitId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCartAbandonedLineSeqId() {
        return this.id.getCartAbandonedLineSeqId();
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
    public String getProdCatalogId() {
        return this.prodCatalogId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReservStart() {
        return this.reservStart;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReservLength() {
        return this.reservLength;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReservPersons() {
        return this.reservPersons;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReserv2ndPPPerc() {
        return this.reserv2ndPPPerc;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReservNthPPPerc() {
        return this.reservNthPPPerc;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigId() {
        return this.configId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTotalWithAdjustments() {
        return this.totalWithAdjustments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWasReserved() {
        return this.wasReserved;
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
     * Auto generated method that gets the related <code>ProdCatalog</code> by the relation named <code>ProdCatalog</code>.
     * @return the <code>ProdCatalog</code>
     * @throws RepositoryException if an error occurs
     */
    public ProdCatalog getProdCatalog() throws RepositoryException {
        if (this.prodCatalog == null) {
            this.prodCatalog = getRelatedOne(ProdCatalog.class, "ProdCatalog");
        }
        return this.prodCatalog;
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
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param prodCatalog the prodCatalog to set
    */
    public void setProdCatalog(ProdCatalog prodCatalog) {
        this.prodCatalog = prodCatalog;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setVisitId((String) mapValue.get("visitId"));
        setCartAbandonedLineSeqId((String) mapValue.get("cartAbandonedLineSeqId"));
        setProductId((String) mapValue.get("productId"));
        setProdCatalogId((String) mapValue.get("prodCatalogId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setReservStart((Timestamp) mapValue.get("reservStart"));
        setReservLength(convertToBigDecimal(mapValue.get("reservLength")));
        setReservPersons(convertToBigDecimal(mapValue.get("reservPersons")));
        setUnitPrice(convertToBigDecimal(mapValue.get("unitPrice")));
        setReserv2ndPPPerc(convertToBigDecimal(mapValue.get("reserv2ndPPPerc")));
        setReservNthPPPerc(convertToBigDecimal(mapValue.get("reservNthPPPerc")));
        setConfigId((String) mapValue.get("configId"));
        setTotalWithAdjustments(convertToBigDecimal(mapValue.get("totalWithAdjustments")));
        setWasReserved((String) mapValue.get("wasReserved"));
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
        mapValue.put("visitId", getVisitId());
        mapValue.put("cartAbandonedLineSeqId", getCartAbandonedLineSeqId());
        mapValue.put("productId", getProductId());
        mapValue.put("prodCatalogId", getProdCatalogId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("reservStart", getReservStart());
        mapValue.put("reservLength", getReservLength());
        mapValue.put("reservPersons", getReservPersons());
        mapValue.put("unitPrice", getUnitPrice());
        mapValue.put("reserv2ndPPPerc", getReserv2ndPPPerc());
        mapValue.put("reservNthPPPerc", getReservNthPPPerc());
        mapValue.put("configId", getConfigId());
        mapValue.put("totalWithAdjustments", getTotalWithAdjustments());
        mapValue.put("wasReserved", getWasReserved());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
