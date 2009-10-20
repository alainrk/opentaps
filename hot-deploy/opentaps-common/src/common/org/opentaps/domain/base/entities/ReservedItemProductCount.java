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

/**
 * Auto generated base entity ReservedItemProductCount.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectReservedItemProductCounts", query="SELECT OH.ORDER_TYPE_ID AS \"orderTypeId\",OH.STATUS_ID AS \"statusId\",OI.PRODUCT_ID AS \"productId\",OI.STATUS_ID AS \"statusId\",RES.QUANTITY_NOT_AVAILABLE AS \"quantityNotAvailable\",II.FACILITY_ID AS \"facilityId\" FROM ORDER_HEADER OH INNER JOIN ORDER_ITEM_SHIP_GRP_INV_RES RES ON RES.ORDER_ID = OH.ORDER_ID INNER JOIN ORDER_ITEM_SHIP_GRP_INV_RES RES ON RES.ORDER_ID = OI.ORDER_ID AND RES.ORDER_ITEM_SEQ_ID = OI.ORDER_ITEM_SEQ_ID INNER JOIN INVENTORY_ITEM II ON RES.INVENTORY_ITEM_ID = II.INVENTORY_ITEM_ID", resultSetMapping="ReservedItemProductCountMapping")
@SqlResultSetMapping(name="ReservedItemProductCountMapping", entities={
@EntityResult(entityClass=ReservedItemProductCount.class, fields = {
@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="orderStatusId", column="orderStatusId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="orderItemStatusId", column="orderItemStatusId")
,@FieldResult(name="quantityNotAvailable", column="quantityNotAvailable")
,@FieldResult(name="facilityId", column="facilityId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ReservedItemProductCount extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("orderStatusId", "OH.STATUS_ID");
        fields.put("productId", "OI.PRODUCT_ID");
        fields.put("orderItemStatusId", "OI.STATUS_ID");
        fields.put("quantityNotAvailable", "RES.QUANTITY_NOT_AVAILABLE");
        fields.put("facilityId", "II.FACILITY_ID");
fieldMapColumns.put("ReservedItemProductCount", fields);
}
  public static enum Fields implements EntityFieldInterface<ReservedItemProductCount> {
    orderTypeId("orderTypeId"),
    orderStatusId("orderStatusId"),
    productId("productId"),
    orderItemStatusId("orderItemStatusId"),
    quantityNotAvailable("quantityNotAvailable"),
    facilityId("facilityId");
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
   private String orderTypeId;
    
   private String orderStatusId;
    
   private Long productId;
    
   private String orderItemStatusId;
    
   private BigDecimal quantityNotAvailable;
    
   private String facilityId;

  /**
   * Default constructor.
   */
  public ReservedItemProductCount() {
      super();
      this.baseEntityName = "ReservedItemProductCount";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("orderStatusId");this.allFieldsNames.add("productId");this.allFieldsNames.add("orderItemStatusId");this.allFieldsNames.add("quantityNotAvailable");this.allFieldsNames.add("facilityId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ReservedItemProductCount(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param orderTypeId the orderTypeId to set
     */
    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    /**
     * Auto generated value setter.
     * @param orderStatusId the orderStatusId to set
     */
    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param orderItemStatusId the orderItemStatusId to set
     */
    public void setOrderItemStatusId(String orderItemStatusId) {
        this.orderItemStatusId = orderItemStatusId;
    }
    /**
     * Auto generated value setter.
     * @param quantityNotAvailable the quantityNotAvailable to set
     */
    public void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
        this.quantityNotAvailable = quantityNotAvailable;
    }
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderStatusId() {
        return this.orderStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemStatusId() {
        return this.orderItemStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityNotAvailable() {
        return this.quantityNotAvailable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.facilityId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setOrderStatusId((String) mapValue.get("orderStatusId"));
        setProductId((Long) mapValue.get("productId"));
        setOrderItemStatusId((String) mapValue.get("orderItemStatusId"));
        setQuantityNotAvailable(convertToBigDecimal(mapValue.get("quantityNotAvailable")));
        setFacilityId((String) mapValue.get("facilityId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("orderStatusId", getOrderStatusId());
        mapValue.put("productId", getProductId());
        mapValue.put("orderItemStatusId", getOrderItemStatusId());
        mapValue.put("quantityNotAvailable", getQuantityNotAvailable());
        mapValue.put("facilityId", getFacilityId());
        return mapValue;
    }


}
