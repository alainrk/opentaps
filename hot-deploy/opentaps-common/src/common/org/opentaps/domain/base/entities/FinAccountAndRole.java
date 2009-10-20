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
 * Auto generated base entity FinAccountAndRole.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectFinAccountAndRoles", query="SELECT FR.PARTY_ID AS \"partyId\",FR.ROLE_TYPE_ID AS \"roleTypeId\",FR.FROM_DATE AS \"fromDate\",FR.THRU_DATE AS \"thruDate\",FA.FIN_ACCOUNT_ID AS \"finAccountId\",FA.FIN_ACCOUNT_TYPE_ID AS \"finAccountTypeId\",FA.STATUS_ID AS \"statusId\",FA.FIN_ACCOUNT_NAME AS \"finAccountName\",FA.FIN_ACCOUNT_CODE AS \"finAccountCode\",FA.FIN_ACCOUNT_PIN AS \"finAccountPin\",FA.CURRENCY_UOM_ID AS \"currencyUomId\",FA.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",FA.OWNER_PARTY_ID AS \"ownerPartyId\",FA.POST_TO_GL_ACCOUNT_ID AS \"postToGlAccountId\",FA.FROM_DATE AS \"fromDate\",FA.THRU_DATE AS \"thruDate\",FA.IS_REFUNDABLE AS \"isRefundable\",FA.REPLENISH_PAYMENT_ID AS \"replenishPaymentId\",FA.REPLENISH_LEVEL AS \"replenishLevel\",FA.ACTUAL_BALANCE AS \"actualBalance\",FA.AVAILABLE_BALANCE AS \"availableBalance\" FROM FIN_ACCOUNT FA INNER JOIN FIN_ACCOUNT_ROLE FR ON FA.FIN_ACCOUNT_ID = FR.FIN_ACCOUNT_ID", resultSetMapping="FinAccountAndRoleMapping")
@SqlResultSetMapping(name="FinAccountAndRoleMapping", entities={
@EntityResult(entityClass=FinAccountAndRole.class, fields = {
@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="roleFromDate", column="roleFromDate")
,@FieldResult(name="roleThruDate", column="roleThruDate")
,@FieldResult(name="finAccountId", column="finAccountId")
,@FieldResult(name="finAccountTypeId", column="finAccountTypeId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="finAccountName", column="finAccountName")
,@FieldResult(name="finAccountCode", column="finAccountCode")
,@FieldResult(name="finAccountPin", column="finAccountPin")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="ownerPartyId", column="ownerPartyId")
,@FieldResult(name="postToGlAccountId", column="postToGlAccountId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="isRefundable", column="isRefundable")
,@FieldResult(name="replenishPaymentId", column="replenishPaymentId")
,@FieldResult(name="replenishLevel", column="replenishLevel")
,@FieldResult(name="actualBalance", column="actualBalance")
,@FieldResult(name="availableBalance", column="availableBalance")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class FinAccountAndRole extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "FR.PARTY_ID");
        fields.put("roleTypeId", "FR.ROLE_TYPE_ID");
        fields.put("roleFromDate", "FR.FROM_DATE");
        fields.put("roleThruDate", "FR.THRU_DATE");
        fields.put("finAccountId", "FA.FIN_ACCOUNT_ID");
        fields.put("finAccountTypeId", "FA.FIN_ACCOUNT_TYPE_ID");
        fields.put("statusId", "FA.STATUS_ID");
        fields.put("finAccountName", "FA.FIN_ACCOUNT_NAME");
        fields.put("finAccountCode", "FA.FIN_ACCOUNT_CODE");
        fields.put("finAccountPin", "FA.FIN_ACCOUNT_PIN");
        fields.put("currencyUomId", "FA.CURRENCY_UOM_ID");
        fields.put("organizationPartyId", "FA.ORGANIZATION_PARTY_ID");
        fields.put("ownerPartyId", "FA.OWNER_PARTY_ID");
        fields.put("postToGlAccountId", "FA.POST_TO_GL_ACCOUNT_ID");
        fields.put("fromDate", "FA.FROM_DATE");
        fields.put("thruDate", "FA.THRU_DATE");
        fields.put("isRefundable", "FA.IS_REFUNDABLE");
        fields.put("replenishPaymentId", "FA.REPLENISH_PAYMENT_ID");
        fields.put("replenishLevel", "FA.REPLENISH_LEVEL");
        fields.put("actualBalance", "FA.ACTUAL_BALANCE");
        fields.put("availableBalance", "FA.AVAILABLE_BALANCE");
fieldMapColumns.put("FinAccountAndRole", fields);
}
  public static enum Fields implements EntityFieldInterface<FinAccountAndRole> {
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    roleFromDate("roleFromDate"),
    roleThruDate("roleThruDate"),
    finAccountId("finAccountId"),
    finAccountTypeId("finAccountTypeId"),
    statusId("statusId"),
    finAccountName("finAccountName"),
    finAccountCode("finAccountCode"),
    finAccountPin("finAccountPin"),
    currencyUomId("currencyUomId"),
    organizationPartyId("organizationPartyId"),
    ownerPartyId("ownerPartyId"),
    postToGlAccountId("postToGlAccountId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    isRefundable("isRefundable"),
    replenishPaymentId("replenishPaymentId"),
    replenishLevel("replenishLevel"),
    actualBalance("actualBalance"),
    availableBalance("availableBalance");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String partyId;
    
   private String roleTypeId;
    
   private Timestamp roleFromDate;
    
   private Timestamp roleThruDate;
    @Id
   private String finAccountId;
    
   private String finAccountTypeId;
    
   private String statusId;
    
   private String finAccountName;
    
   private String finAccountCode;
    
   private String finAccountPin;
    
   private String currencyUomId;
    
   private String organizationPartyId;
    
   private String ownerPartyId;
    
   private String postToGlAccountId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String isRefundable;
    
   private String replenishPaymentId;
    
   private BigDecimal replenishLevel;
    
   private BigDecimal actualBalance;
    
   private BigDecimal availableBalance;

  /**
   * Default constructor.
   */
  public FinAccountAndRole() {
      super();
      this.baseEntityName = "FinAccountAndRole";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");this.primaryKeyNames.add("roleFromDate");this.primaryKeyNames.add("finAccountId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("roleFromDate");this.allFieldsNames.add("roleThruDate");this.allFieldsNames.add("finAccountId");this.allFieldsNames.add("finAccountTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("finAccountName");this.allFieldsNames.add("finAccountCode");this.allFieldsNames.add("finAccountPin");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("ownerPartyId");this.allFieldsNames.add("postToGlAccountId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("isRefundable");this.allFieldsNames.add("replenishPaymentId");this.allFieldsNames.add("replenishLevel");this.allFieldsNames.add("actualBalance");this.allFieldsNames.add("availableBalance");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FinAccountAndRole(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
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
     * @param roleFromDate the roleFromDate to set
     */
    public void setRoleFromDate(Timestamp roleFromDate) {
        this.roleFromDate = roleFromDate;
    }
    /**
     * Auto generated value setter.
     * @param roleThruDate the roleThruDate to set
     */
    public void setRoleThruDate(Timestamp roleThruDate) {
        this.roleThruDate = roleThruDate;
    }
    /**
     * Auto generated value setter.
     * @param finAccountId the finAccountId to set
     */
    public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
    /**
     * Auto generated value setter.
     * @param finAccountTypeId the finAccountTypeId to set
     */
    public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
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
     * @param finAccountName the finAccountName to set
     */
    public void setFinAccountName(String finAccountName) {
        this.finAccountName = finAccountName;
    }
    /**
     * Auto generated value setter.
     * @param finAccountCode the finAccountCode to set
     */
    public void setFinAccountCode(String finAccountCode) {
        this.finAccountCode = finAccountCode;
    }
    /**
     * Auto generated value setter.
     * @param finAccountPin the finAccountPin to set
     */
    public void setFinAccountPin(String finAccountPin) {
        this.finAccountPin = finAccountPin;
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
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param ownerPartyId the ownerPartyId to set
     */
    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }
    /**
     * Auto generated value setter.
     * @param postToGlAccountId the postToGlAccountId to set
     */
    public void setPostToGlAccountId(String postToGlAccountId) {
        this.postToGlAccountId = postToGlAccountId;
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
     * @param isRefundable the isRefundable to set
     */
    public void setIsRefundable(String isRefundable) {
        this.isRefundable = isRefundable;
    }
    /**
     * Auto generated value setter.
     * @param replenishPaymentId the replenishPaymentId to set
     */
    public void setReplenishPaymentId(String replenishPaymentId) {
        this.replenishPaymentId = replenishPaymentId;
    }
    /**
     * Auto generated value setter.
     * @param replenishLevel the replenishLevel to set
     */
    public void setReplenishLevel(BigDecimal replenishLevel) {
        this.replenishLevel = replenishLevel;
    }
    /**
     * Auto generated value setter.
     * @param actualBalance the actualBalance to set
     */
    public void setActualBalance(BigDecimal actualBalance) {
        this.actualBalance = actualBalance;
    }
    /**
     * Auto generated value setter.
     * @param availableBalance the availableBalance to set
     */
    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getRoleFromDate() {
        return this.roleFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRoleThruDate() {
        return this.roleThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFinAccountId() {
        return this.finAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFinAccountTypeId() {
        return this.finAccountTypeId;
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
    public String getFinAccountName() {
        return this.finAccountName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFinAccountCode() {
        return this.finAccountCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFinAccountPin() {
        return this.finAccountPin;
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
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOwnerPartyId() {
        return this.ownerPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPostToGlAccountId() {
        return this.postToGlAccountId;
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
    public String getIsRefundable() {
        return this.isRefundable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReplenishPaymentId() {
        return this.replenishPaymentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReplenishLevel() {
        return this.replenishLevel;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getActualBalance() {
        return this.actualBalance;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setRoleFromDate((Timestamp) mapValue.get("roleFromDate"));
        setRoleThruDate((Timestamp) mapValue.get("roleThruDate"));
        setFinAccountId((String) mapValue.get("finAccountId"));
        setFinAccountTypeId((String) mapValue.get("finAccountTypeId"));
        setStatusId((String) mapValue.get("statusId"));
        setFinAccountName((String) mapValue.get("finAccountName"));
        setFinAccountCode((String) mapValue.get("finAccountCode"));
        setFinAccountPin((String) mapValue.get("finAccountPin"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setOwnerPartyId((String) mapValue.get("ownerPartyId"));
        setPostToGlAccountId((String) mapValue.get("postToGlAccountId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setIsRefundable((String) mapValue.get("isRefundable"));
        setReplenishPaymentId((String) mapValue.get("replenishPaymentId"));
        setReplenishLevel(convertToBigDecimal(mapValue.get("replenishLevel")));
        setActualBalance(convertToBigDecimal(mapValue.get("actualBalance")));
        setAvailableBalance(convertToBigDecimal(mapValue.get("availableBalance")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("roleFromDate", getRoleFromDate());
        mapValue.put("roleThruDate", getRoleThruDate());
        mapValue.put("finAccountId", getFinAccountId());
        mapValue.put("finAccountTypeId", getFinAccountTypeId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("finAccountName", getFinAccountName());
        mapValue.put("finAccountCode", getFinAccountCode());
        mapValue.put("finAccountPin", getFinAccountPin());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("ownerPartyId", getOwnerPartyId());
        mapValue.put("postToGlAccountId", getPostToGlAccountId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("isRefundable", getIsRefundable());
        mapValue.put("replenishPaymentId", getReplenishPaymentId());
        mapValue.put("replenishLevel", getReplenishLevel());
        mapValue.put("actualBalance", getActualBalance());
        mapValue.put("availableBalance", getAvailableBalance());
        return mapValue;
    }


}
