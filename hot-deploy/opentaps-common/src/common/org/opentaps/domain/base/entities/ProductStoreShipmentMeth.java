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
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductStoreShipmentMeth.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_STORE_SHIPMENT_METH")
public class ProductStoreShipmentMeth extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productStoreShipMethId", "PRODUCT_STORE_SHIP_METH_ID");
        fields.put("productStoreId", "PRODUCT_STORE_ID");
        fields.put("shipmentMethodTypeId", "SHIPMENT_METHOD_TYPE_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("roleTypeId", "ROLE_TYPE_ID");
        fields.put("companyPartyId", "COMPANY_PARTY_ID");
        fields.put("minWeight", "MIN_WEIGHT");
        fields.put("maxWeight", "MAX_WEIGHT");
        fields.put("minSize", "MIN_SIZE");
        fields.put("maxSize", "MAX_SIZE");
        fields.put("minTotal", "MIN_TOTAL");
        fields.put("maxTotal", "MAX_TOTAL");
        fields.put("allowUspsAddr", "ALLOW_USPS_ADDR");
        fields.put("requireUspsAddr", "REQUIRE_USPS_ADDR");
        fields.put("allowCompanyAddr", "ALLOW_COMPANY_ADDR");
        fields.put("requireCompanyAddr", "REQUIRE_COMPANY_ADDR");
        fields.put("includeNoChargeItems", "INCLUDE_NO_CHARGE_ITEMS");
        fields.put("includeFeatureGroup", "INCLUDE_FEATURE_GROUP");
        fields.put("excludeFeatureGroup", "EXCLUDE_FEATURE_GROUP");
        fields.put("includeGeoId", "INCLUDE_GEO_ID");
        fields.put("excludeGeoId", "EXCLUDE_GEO_ID");
        fields.put("serviceName", "SERVICE_NAME");
        fields.put("configProps", "CONFIG_PROPS");
        fields.put("sequenceNumber", "SEQUENCE_NUMBER");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
        fields.put("codSurcharge", "COD_SURCHARGE");
        fields.put("userDescription", "USER_DESCRIPTION");
        fields.put("minimumRate", "MINIMUM_RATE");
fieldMapColumns.put("ProductStoreShipmentMeth", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductStoreShipmentMeth> {
    productStoreShipMethId("productStoreShipMethId"),
    productStoreId("productStoreId"),
    shipmentMethodTypeId("shipmentMethodTypeId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    companyPartyId("companyPartyId"),
    minWeight("minWeight"),
    maxWeight("maxWeight"),
    minSize("minSize"),
    maxSize("maxSize"),
    minTotal("minTotal"),
    maxTotal("maxTotal"),
    allowUspsAddr("allowUspsAddr"),
    requireUspsAddr("requireUspsAddr"),
    allowCompanyAddr("allowCompanyAddr"),
    requireCompanyAddr("requireCompanyAddr"),
    includeNoChargeItems("includeNoChargeItems"),
    includeFeatureGroup("includeFeatureGroup"),
    excludeFeatureGroup("excludeFeatureGroup"),
    includeGeoId("includeGeoId"),
    excludeGeoId("excludeGeoId"),
    serviceName("serviceName"),
    configProps("configProps"),
    sequenceNumber("sequenceNumber"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp"),
    codSurcharge("codSurcharge"),
    userDescription("userDescription"),
    minimumRate("minimumRate");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="ProductStoreShipmentMeth_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProductStoreShipmentMeth_GEN")
   @Id
   @Column(name="PRODUCT_STORE_SHIP_METH_ID")
   private String productStoreShipMethId;
   @Column(name="PRODUCT_STORE_ID")
   private String productStoreId;
   @Column(name="SHIPMENT_METHOD_TYPE_ID")
   private String shipmentMethodTypeId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="ROLE_TYPE_ID")
   private String roleTypeId;
   @Column(name="COMPANY_PARTY_ID")
   private String companyPartyId;
   @Column(name="MIN_WEIGHT")
   private BigDecimal minWeight;
   @Column(name="MAX_WEIGHT")
   private BigDecimal maxWeight;
   @Column(name="MIN_SIZE")
   private BigDecimal minSize;
   @Column(name="MAX_SIZE")
   private BigDecimal maxSize;
   @Column(name="MIN_TOTAL")
   private BigDecimal minTotal;
   @Column(name="MAX_TOTAL")
   private BigDecimal maxTotal;
   @Column(name="ALLOW_USPS_ADDR")
   private String allowUspsAddr;
   @Column(name="REQUIRE_USPS_ADDR")
   private String requireUspsAddr;
   @Column(name="ALLOW_COMPANY_ADDR")
   private String allowCompanyAddr;
   @Column(name="REQUIRE_COMPANY_ADDR")
   private String requireCompanyAddr;
   @Column(name="INCLUDE_NO_CHARGE_ITEMS")
   private String includeNoChargeItems;
   @Column(name="INCLUDE_FEATURE_GROUP")
   private String includeFeatureGroup;
   @Column(name="EXCLUDE_FEATURE_GROUP")
   private String excludeFeatureGroup;
   @Column(name="INCLUDE_GEO_ID")
   private String includeGeoId;
   @Column(name="EXCLUDE_GEO_ID")
   private String excludeGeoId;
   @Column(name="SERVICE_NAME")
   private String serviceName;
   @Column(name="CONFIG_PROPS")
   private String configProps;
   @Column(name="SEQUENCE_NUMBER")
   private Long sequenceNumber;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @Column(name="COD_SURCHARGE")
   private BigDecimal codSurcharge;
   @Column(name="USER_DESCRIPTION")
   private String userDescription;
   @Column(name="MINIMUM_RATE")
   private BigDecimal minimumRate;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COMPANY_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INCLUDE_GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo includeGeo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EXCLUDE_GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo excludeGeo = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_STORE_SHIP_METH_ID")
   
   private List<DataImportOrderHeader> dataImportOrderHeaders = null;

  /**
   * Default constructor.
   */
  public ProductStoreShipmentMeth() {
      super();
      this.baseEntityName = "ProductStoreShipmentMeth";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productStoreShipMethId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productStoreShipMethId");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("shipmentMethodTypeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("companyPartyId");this.allFieldsNames.add("minWeight");this.allFieldsNames.add("maxWeight");this.allFieldsNames.add("minSize");this.allFieldsNames.add("maxSize");this.allFieldsNames.add("minTotal");this.allFieldsNames.add("maxTotal");this.allFieldsNames.add("allowUspsAddr");this.allFieldsNames.add("requireUspsAddr");this.allFieldsNames.add("allowCompanyAddr");this.allFieldsNames.add("requireCompanyAddr");this.allFieldsNames.add("includeNoChargeItems");this.allFieldsNames.add("includeFeatureGroup");this.allFieldsNames.add("excludeFeatureGroup");this.allFieldsNames.add("includeGeoId");this.allFieldsNames.add("excludeGeoId");this.allFieldsNames.add("serviceName");this.allFieldsNames.add("configProps");this.allFieldsNames.add("sequenceNumber");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");this.allFieldsNames.add("codSurcharge");this.allFieldsNames.add("userDescription");this.allFieldsNames.add("minimumRate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductStoreShipmentMeth(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productStoreShipMethId the productStoreShipMethId to set
     */
    public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
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
     * @param shipmentMethodTypeId the shipmentMethodTypeId to set
     */
    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
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
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param companyPartyId the companyPartyId to set
     */
    public void setCompanyPartyId(String companyPartyId) {
        this.companyPartyId = companyPartyId;
    }
    /**
     * Auto generated value setter.
     * @param minWeight the minWeight to set
     */
    public void setMinWeight(BigDecimal minWeight) {
        this.minWeight = minWeight;
    }
    /**
     * Auto generated value setter.
     * @param maxWeight the maxWeight to set
     */
    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }
    /**
     * Auto generated value setter.
     * @param minSize the minSize to set
     */
    public void setMinSize(BigDecimal minSize) {
        this.minSize = minSize;
    }
    /**
     * Auto generated value setter.
     * @param maxSize the maxSize to set
     */
    public void setMaxSize(BigDecimal maxSize) {
        this.maxSize = maxSize;
    }
    /**
     * Auto generated value setter.
     * @param minTotal the minTotal to set
     */
    public void setMinTotal(BigDecimal minTotal) {
        this.minTotal = minTotal;
    }
    /**
     * Auto generated value setter.
     * @param maxTotal the maxTotal to set
     */
    public void setMaxTotal(BigDecimal maxTotal) {
        this.maxTotal = maxTotal;
    }
    /**
     * Auto generated value setter.
     * @param allowUspsAddr the allowUspsAddr to set
     */
    public void setAllowUspsAddr(String allowUspsAddr) {
        this.allowUspsAddr = allowUspsAddr;
    }
    /**
     * Auto generated value setter.
     * @param requireUspsAddr the requireUspsAddr to set
     */
    public void setRequireUspsAddr(String requireUspsAddr) {
        this.requireUspsAddr = requireUspsAddr;
    }
    /**
     * Auto generated value setter.
     * @param allowCompanyAddr the allowCompanyAddr to set
     */
    public void setAllowCompanyAddr(String allowCompanyAddr) {
        this.allowCompanyAddr = allowCompanyAddr;
    }
    /**
     * Auto generated value setter.
     * @param requireCompanyAddr the requireCompanyAddr to set
     */
    public void setRequireCompanyAddr(String requireCompanyAddr) {
        this.requireCompanyAddr = requireCompanyAddr;
    }
    /**
     * Auto generated value setter.
     * @param includeNoChargeItems the includeNoChargeItems to set
     */
    public void setIncludeNoChargeItems(String includeNoChargeItems) {
        this.includeNoChargeItems = includeNoChargeItems;
    }
    /**
     * Auto generated value setter.
     * @param includeFeatureGroup the includeFeatureGroup to set
     */
    public void setIncludeFeatureGroup(String includeFeatureGroup) {
        this.includeFeatureGroup = includeFeatureGroup;
    }
    /**
     * Auto generated value setter.
     * @param excludeFeatureGroup the excludeFeatureGroup to set
     */
    public void setExcludeFeatureGroup(String excludeFeatureGroup) {
        this.excludeFeatureGroup = excludeFeatureGroup;
    }
    /**
     * Auto generated value setter.
     * @param includeGeoId the includeGeoId to set
     */
    public void setIncludeGeoId(String includeGeoId) {
        this.includeGeoId = includeGeoId;
    }
    /**
     * Auto generated value setter.
     * @param excludeGeoId the excludeGeoId to set
     */
    public void setExcludeGeoId(String excludeGeoId) {
        this.excludeGeoId = excludeGeoId;
    }
    /**
     * Auto generated value setter.
     * @param serviceName the serviceName to set
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    /**
     * Auto generated value setter.
     * @param configProps the configProps to set
     */
    public void setConfigProps(String configProps) {
        this.configProps = configProps;
    }
    /**
     * Auto generated value setter.
     * @param sequenceNumber the sequenceNumber to set
     */
    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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
     * Auto generated value setter.
     * @param codSurcharge the codSurcharge to set
     */
    public void setCodSurcharge(BigDecimal codSurcharge) {
        this.codSurcharge = codSurcharge;
    }
    /**
     * Auto generated value setter.
     * @param userDescription the userDescription to set
     */
    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }
    /**
     * Auto generated value setter.
     * @param minimumRate the minimumRate to set
     */
    public void setMinimumRate(BigDecimal minimumRate) {
        this.minimumRate = minimumRate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreShipMethId() {
        return this.productStoreShipMethId;
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
    public String getShipmentMethodTypeId() {
        return this.shipmentMethodTypeId;
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
    public String getRoleTypeId() {
        return this.roleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCompanyPartyId() {
        return this.companyPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinWeight() {
        return this.minWeight;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaxWeight() {
        return this.maxWeight;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinSize() {
        return this.minSize;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaxSize() {
        return this.maxSize;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinTotal() {
        return this.minTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaxTotal() {
        return this.maxTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllowUspsAddr() {
        return this.allowUspsAddr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequireUspsAddr() {
        return this.requireUspsAddr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllowCompanyAddr() {
        return this.allowCompanyAddr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequireCompanyAddr() {
        return this.requireCompanyAddr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIncludeNoChargeItems() {
        return this.includeNoChargeItems;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIncludeFeatureGroup() {
        return this.includeFeatureGroup;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExcludeFeatureGroup() {
        return this.excludeFeatureGroup;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIncludeGeoId() {
        return this.includeGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExcludeGeoId() {
        return this.excludeGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigProps() {
        return this.configProps;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNumber() {
        return this.sequenceNumber;
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
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCodSurcharge() {
        return this.codSurcharge;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserDescription() {
        return this.userDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinimumRate() {
        return this.minimumRate;
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
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>IncludeGeo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getIncludeGeo() throws RepositoryException {
        if (this.includeGeo == null) {
            this.includeGeo = getRelatedOne(Geo.class, "IncludeGeo");
        }
        return this.includeGeo;
    }
    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>ExcludeGeo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getExcludeGeo() throws RepositoryException {
        if (this.excludeGeo == null) {
            this.excludeGeo = getRelatedOne(Geo.class, "ExcludeGeo");
        }
        return this.excludeGeo;
    }
    /**
     * Auto generated method that gets the related <code>DataImportOrderHeader</code> by the relation named <code>DataImportOrderHeader</code>.
     * @return the list of <code>DataImportOrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends DataImportOrderHeader> getDataImportOrderHeaders() throws RepositoryException {
        if (this.dataImportOrderHeaders == null) {
            this.dataImportOrderHeaders = getRelated(DataImportOrderHeader.class, "DataImportOrderHeader");
        }
        return this.dataImportOrderHeaders;
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
     * @param includeGeo the includeGeo to set
    */
    public void setIncludeGeo(Geo includeGeo) {
        this.includeGeo = includeGeo;
    }
    /**
     * Auto generated value setter.
     * @param excludeGeo the excludeGeo to set
    */
    public void setExcludeGeo(Geo excludeGeo) {
        this.excludeGeo = excludeGeo;
    }
    /**
     * Auto generated value setter.
     * @param dataImportOrderHeaders the dataImportOrderHeaders to set
    */
    public void setDataImportOrderHeaders(List<DataImportOrderHeader> dataImportOrderHeaders) {
        this.dataImportOrderHeaders = dataImportOrderHeaders;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductStoreShipMethId((String) mapValue.get("productStoreShipMethId"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setCompanyPartyId((String) mapValue.get("companyPartyId"));
        setMinWeight(convertToBigDecimal(mapValue.get("minWeight")));
        setMaxWeight(convertToBigDecimal(mapValue.get("maxWeight")));
        setMinSize(convertToBigDecimal(mapValue.get("minSize")));
        setMaxSize(convertToBigDecimal(mapValue.get("maxSize")));
        setMinTotal(convertToBigDecimal(mapValue.get("minTotal")));
        setMaxTotal(convertToBigDecimal(mapValue.get("maxTotal")));
        setAllowUspsAddr((String) mapValue.get("allowUspsAddr"));
        setRequireUspsAddr((String) mapValue.get("requireUspsAddr"));
        setAllowCompanyAddr((String) mapValue.get("allowCompanyAddr"));
        setRequireCompanyAddr((String) mapValue.get("requireCompanyAddr"));
        setIncludeNoChargeItems((String) mapValue.get("includeNoChargeItems"));
        setIncludeFeatureGroup((String) mapValue.get("includeFeatureGroup"));
        setExcludeFeatureGroup((String) mapValue.get("excludeFeatureGroup"));
        setIncludeGeoId((String) mapValue.get("includeGeoId"));
        setExcludeGeoId((String) mapValue.get("excludeGeoId"));
        setServiceName((String) mapValue.get("serviceName"));
        setConfigProps((String) mapValue.get("configProps"));
        setSequenceNumber((Long) mapValue.get("sequenceNumber"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        setCodSurcharge(convertToBigDecimal(mapValue.get("codSurcharge")));
        setUserDescription((String) mapValue.get("userDescription"));
        setMinimumRate(convertToBigDecimal(mapValue.get("minimumRate")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productStoreShipMethId", getProductStoreShipMethId());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("shipmentMethodTypeId", getShipmentMethodTypeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("companyPartyId", getCompanyPartyId());
        mapValue.put("minWeight", getMinWeight());
        mapValue.put("maxWeight", getMaxWeight());
        mapValue.put("minSize", getMinSize());
        mapValue.put("maxSize", getMaxSize());
        mapValue.put("minTotal", getMinTotal());
        mapValue.put("maxTotal", getMaxTotal());
        mapValue.put("allowUspsAddr", getAllowUspsAddr());
        mapValue.put("requireUspsAddr", getRequireUspsAddr());
        mapValue.put("allowCompanyAddr", getAllowCompanyAddr());
        mapValue.put("requireCompanyAddr", getRequireCompanyAddr());
        mapValue.put("includeNoChargeItems", getIncludeNoChargeItems());
        mapValue.put("includeFeatureGroup", getIncludeFeatureGroup());
        mapValue.put("excludeFeatureGroup", getExcludeFeatureGroup());
        mapValue.put("includeGeoId", getIncludeGeoId());
        mapValue.put("excludeGeoId", getExcludeGeoId());
        mapValue.put("serviceName", getServiceName());
        mapValue.put("configProps", getConfigProps());
        mapValue.put("sequenceNumber", getSequenceNumber());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        mapValue.put("codSurcharge", getCodSurcharge());
        mapValue.put("userDescription", getUserDescription());
        mapValue.put("minimumRate", getMinimumRate());
        return mapValue;
    }


}
