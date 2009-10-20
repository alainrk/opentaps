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
 * Auto generated base entity DataImportInventory.
 */
@javax.persistence.Entity
@Table(name="DATA_IMPORT_INVENTORY")
public class DataImportInventory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("itemId", "ITEM_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("facilityId", "FACILITY_ID");
        fields.put("availableToPromise", "AVAILABLE_TO_PROMISE");
        fields.put("onHand", "ON_HAND");
        fields.put("minimumStock", "MINIMUM_STOCK");
        fields.put("reorderQuantity", "REORDER_QUANTITY");
        fields.put("daysToShip", "DAYS_TO_SHIP");
        fields.put("inventoryValue", "INVENTORY_VALUE");
        fields.put("processedTimestamp", "PROCESSED_TIMESTAMP");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DataImportInventory", fields);
}
  public static enum Fields implements EntityFieldInterface<DataImportInventory> {
    itemId("itemId"),
    productId("productId"),
    facilityId("facilityId"),
    availableToPromise("availableToPromise"),
    onHand("onHand"),
    minimumStock("minimumStock"),
    reorderQuantity("reorderQuantity"),
    daysToShip("daysToShip"),
    inventoryValue("inventoryValue"),
    processedTimestamp("processedTimestamp"),
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

   @org.hibernate.annotations.GenericGenerator(name="DataImportInventory_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="DataImportInventory_GEN")
   @Id
   @Column(name="ITEM_ID")
   private String itemId;
   @Column(name="PRODUCT_ID")
   private String productId;
   @Column(name="FACILITY_ID")
   private String facilityId;
   @Column(name="AVAILABLE_TO_PROMISE")
   private BigDecimal availableToPromise;
   @Column(name="ON_HAND")
   private BigDecimal onHand;
   @Column(name="MINIMUM_STOCK")
   private BigDecimal minimumStock;
   @Column(name="REORDER_QUANTITY")
   private BigDecimal reorderQuantity;
   @Column(name="DAYS_TO_SHIP")
   private BigDecimal daysToShip;
   @Column(name="INVENTORY_VALUE")
   private BigDecimal inventoryValue;
   @Column(name="PROCESSED_TIMESTAMP")
   private Timestamp processedTimestamp;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Facility facility = null;

  /**
   * Default constructor.
   */
  public DataImportInventory() {
      super();
      this.baseEntityName = "DataImportInventory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("itemId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("itemId");this.allFieldsNames.add("productId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("availableToPromise");this.allFieldsNames.add("onHand");this.allFieldsNames.add("minimumStock");this.allFieldsNames.add("reorderQuantity");this.allFieldsNames.add("daysToShip");this.allFieldsNames.add("inventoryValue");this.allFieldsNames.add("processedTimestamp");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DataImportInventory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
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
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param availableToPromise the availableToPromise to set
     */
    public void setAvailableToPromise(BigDecimal availableToPromise) {
        this.availableToPromise = availableToPromise;
    }
    /**
     * Auto generated value setter.
     * @param onHand the onHand to set
     */
    public void setOnHand(BigDecimal onHand) {
        this.onHand = onHand;
    }
    /**
     * Auto generated value setter.
     * @param minimumStock the minimumStock to set
     */
    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }
    /**
     * Auto generated value setter.
     * @param reorderQuantity the reorderQuantity to set
     */
    public void setReorderQuantity(BigDecimal reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
    /**
     * Auto generated value setter.
     * @param daysToShip the daysToShip to set
     */
    public void setDaysToShip(BigDecimal daysToShip) {
        this.daysToShip = daysToShip;
    }
    /**
     * Auto generated value setter.
     * @param inventoryValue the inventoryValue to set
     */
    public void setInventoryValue(BigDecimal inventoryValue) {
        this.inventoryValue = inventoryValue;
    }
    /**
     * Auto generated value setter.
     * @param processedTimestamp the processedTimestamp to set
     */
    public void setProcessedTimestamp(Timestamp processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
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
    public String getItemId() {
        return this.itemId;
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
    public String getFacilityId() {
        return this.facilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAvailableToPromise() {
        return this.availableToPromise;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOnHand() {
        return this.onHand;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinimumStock() {
        return this.minimumStock;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReorderQuantity() {
        return this.reorderQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getDaysToShip() {
        return this.daysToShip;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInventoryValue() {
        return this.inventoryValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getProcessedTimestamp() {
        return this.processedTimestamp;
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
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>Facility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getFacility() throws RepositoryException {
        if (this.facility == null) {
            this.facility = getRelatedOne(Facility.class, "Facility");
        }
        return this.facility;
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
     * @param facility the facility to set
    */
    public void setFacility(Facility facility) {
        this.facility = facility;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setItemId((String) mapValue.get("itemId"));
        setProductId((String) mapValue.get("productId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setAvailableToPromise(convertToBigDecimal(mapValue.get("availableToPromise")));
        setOnHand(convertToBigDecimal(mapValue.get("onHand")));
        setMinimumStock(convertToBigDecimal(mapValue.get("minimumStock")));
        setReorderQuantity(convertToBigDecimal(mapValue.get("reorderQuantity")));
        setDaysToShip(convertToBigDecimal(mapValue.get("daysToShip")));
        setInventoryValue(convertToBigDecimal(mapValue.get("inventoryValue")));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
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
        mapValue.put("itemId", getItemId());
        mapValue.put("productId", getProductId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("availableToPromise", getAvailableToPromise());
        mapValue.put("onHand", getOnHand());
        mapValue.put("minimumStock", getMinimumStock());
        mapValue.put("reorderQuantity", getReorderQuantity());
        mapValue.put("daysToShip", getDaysToShip());
        mapValue.put("inventoryValue", getInventoryValue());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
