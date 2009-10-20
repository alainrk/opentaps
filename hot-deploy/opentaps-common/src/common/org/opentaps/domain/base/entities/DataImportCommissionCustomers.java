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
 * Auto generated base entity DataImportCommissionCustomers.
 */
@javax.persistence.Entity
@Table(name="DATA_IMP_COMM_CUSTOMERS")
public class DataImportCommissionCustomers extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("customerId", "CUSTOMER_ID");
        fields.put("toCustomerId", "TO_CUSTOMER_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DataImportCommissionCustomers", fields);
}
  public static enum Fields implements EntityFieldInterface<DataImportCommissionCustomers> {
    customerId("customerId"),
    toCustomerId("toCustomerId"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.DataImportCommissionCustomersPkBridge.class)
     private DataImportCommissionCustomersPk id = new DataImportCommissionCustomersPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>DataImportCommissionCustomersPk</code>
     */
      public DataImportCommissionCustomersPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>DataImportCommissionCustomersPk</code> value to set
    */   
      public void setId(DataImportCommissionCustomersPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUSTOMER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DataImportCustomer agentDataImportCustomer = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TO_CUSTOMER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DataImportCustomer customerDataImportCustomer = null;

  /**
   * Default constructor.
   */
  public DataImportCommissionCustomers() {
      super();
      this.baseEntityName = "DataImportCommissionCustomers";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("customerId");this.primaryKeyNames.add("toCustomerId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("customerId");this.allFieldsNames.add("toCustomerId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DataImportCommissionCustomers(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        id.setCustomerId(customerId);
    }
    /**
     * Auto generated value setter.
     * @param toCustomerId the toCustomerId to set
     */
    public void setToCustomerId(String toCustomerId) {
        id.setToCustomerId(toCustomerId);
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
    public String getCustomerId() {
        return this.id.getCustomerId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToCustomerId() {
        return this.id.getToCustomerId();
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
     * Auto generated method that gets the related <code>DataImportCustomer</code> by the relation named <code>AgentDataImportCustomer</code>.
     * @return the <code>DataImportCustomer</code>
     * @throws RepositoryException if an error occurs
     */
    public DataImportCustomer getAgentDataImportCustomer() throws RepositoryException {
        if (this.agentDataImportCustomer == null) {
            this.agentDataImportCustomer = getRelatedOne(DataImportCustomer.class, "AgentDataImportCustomer");
        }
        return this.agentDataImportCustomer;
    }
    /**
     * Auto generated method that gets the related <code>DataImportCustomer</code> by the relation named <code>CustomerDataImportCustomer</code>.
     * @return the <code>DataImportCustomer</code>
     * @throws RepositoryException if an error occurs
     */
    public DataImportCustomer getCustomerDataImportCustomer() throws RepositoryException {
        if (this.customerDataImportCustomer == null) {
            this.customerDataImportCustomer = getRelatedOne(DataImportCustomer.class, "CustomerDataImportCustomer");
        }
        return this.customerDataImportCustomer;
    }

    /**
     * Auto generated value setter.
     * @param agentDataImportCustomer the agentDataImportCustomer to set
    */
    public void setAgentDataImportCustomer(DataImportCustomer agentDataImportCustomer) {
        this.agentDataImportCustomer = agentDataImportCustomer;
    }
    /**
     * Auto generated value setter.
     * @param customerDataImportCustomer the customerDataImportCustomer to set
    */
    public void setCustomerDataImportCustomer(DataImportCustomer customerDataImportCustomer) {
        this.customerDataImportCustomer = customerDataImportCustomer;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustomerId((String) mapValue.get("customerId"));
        setToCustomerId((String) mapValue.get("toCustomerId"));
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
        mapValue.put("customerId", getCustomerId());
        mapValue.put("toCustomerId", getToCustomerId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
