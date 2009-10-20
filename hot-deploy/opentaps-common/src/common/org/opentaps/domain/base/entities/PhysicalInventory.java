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
 * Auto generated base entity PhysicalInventory.
 */
@javax.persistence.Entity
@Table(name="PHYSICAL_INVENTORY")
public class PhysicalInventory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("physicalInventoryId", "PHYSICAL_INVENTORY_ID");
        fields.put("physicalInventoryDate", "PHYSICAL_INVENTORY_DATE");
        fields.put("partyId", "PARTY_ID");
        fields.put("generalComments", "GENERAL_COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PhysicalInventory", fields);
}
  public static enum Fields implements EntityFieldInterface<PhysicalInventory> {
    physicalInventoryId("physicalInventoryId"),
    physicalInventoryDate("physicalInventoryDate"),
    partyId("partyId"),
    generalComments("generalComments"),
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

   @org.hibernate.annotations.GenericGenerator(name="PhysicalInventory_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PhysicalInventory_GEN")
   @Id
   @Column(name="PHYSICAL_INVENTORY_ID")
   private String physicalInventoryId;
   @Column(name="PHYSICAL_INVENTORY_DATE")
   private Timestamp physicalInventoryDate;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="GENERAL_COMMENTS")
   private String generalComments;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PHYSICAL_INVENTORY_ID")
   
   private List<AcctgTrans> acctgTranses = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PHYSICAL_INVENTORY_ID")
   
   private List<InventoryItemDetail> inventoryItemDetails = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="physicalInventory", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PHYSICAL_INVENTORY_ID")
   
   private List<InventoryItemVariance> inventoryItemVariances = null;

  /**
   * Default constructor.
   */
  public PhysicalInventory() {
      super();
      this.baseEntityName = "PhysicalInventory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("physicalInventoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("physicalInventoryId");this.allFieldsNames.add("physicalInventoryDate");this.allFieldsNames.add("partyId");this.allFieldsNames.add("generalComments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PhysicalInventory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param physicalInventoryId the physicalInventoryId to set
     */
    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
    /**
     * Auto generated value setter.
     * @param physicalInventoryDate the physicalInventoryDate to set
     */
    public void setPhysicalInventoryDate(Timestamp physicalInventoryDate) {
        this.physicalInventoryDate = physicalInventoryDate;
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
     * @param generalComments the generalComments to set
     */
    public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments;
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
    public String getPhysicalInventoryId() {
        return this.physicalInventoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPhysicalInventoryDate() {
        return this.physicalInventoryDate;
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
    public String getGeneralComments() {
        return this.generalComments;
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
     * Auto generated method that gets the related <code>AcctgTrans</code> by the relation named <code>AcctgTrans</code>.
     * @return the list of <code>AcctgTrans</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AcctgTrans> getAcctgTranses() throws RepositoryException {
        if (this.acctgTranses == null) {
            this.acctgTranses = getRelated(AcctgTrans.class, "AcctgTrans");
        }
        return this.acctgTranses;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemDetail</code> by the relation named <code>InventoryItemDetail</code>.
     * @return the list of <code>InventoryItemDetail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItemDetail> getInventoryItemDetails() throws RepositoryException {
        if (this.inventoryItemDetails == null) {
            this.inventoryItemDetails = getRelated(InventoryItemDetail.class, "InventoryItemDetail");
        }
        return this.inventoryItemDetails;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemVariance</code> by the relation named <code>InventoryItemVariance</code>.
     * @return the list of <code>InventoryItemVariance</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItemVariance> getInventoryItemVariances() throws RepositoryException {
        if (this.inventoryItemVariances == null) {
            this.inventoryItemVariances = getRelated(InventoryItemVariance.class, "InventoryItemVariance");
        }
        return this.inventoryItemVariances;
    }

    /**
     * Auto generated value setter.
     * @param acctgTranses the acctgTranses to set
    */
    public void setAcctgTranses(List<AcctgTrans> acctgTranses) {
        this.acctgTranses = acctgTranses;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemDetails the inventoryItemDetails to set
    */
    public void setInventoryItemDetails(List<InventoryItemDetail> inventoryItemDetails) {
        this.inventoryItemDetails = inventoryItemDetails;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemVariances the inventoryItemVariances to set
    */
    public void setInventoryItemVariances(List<InventoryItemVariance> inventoryItemVariances) {
        this.inventoryItemVariances = inventoryItemVariances;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addInventoryItemVariance(InventoryItemVariance inventoryItemVariance) {
        if (this.inventoryItemVariances == null) {
            this.inventoryItemVariances = new ArrayList<InventoryItemVariance>();
        }
        this.inventoryItemVariances.add(inventoryItemVariance);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeInventoryItemVariance(InventoryItemVariance inventoryItemVariance) {
        if (this.inventoryItemVariances == null) {
            return;
        }
        this.inventoryItemVariances.remove(inventoryItemVariance);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearInventoryItemVariance() {
        if (this.inventoryItemVariances == null) {
            return;
        }
        this.inventoryItemVariances.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPhysicalInventoryId((String) mapValue.get("physicalInventoryId"));
        setPhysicalInventoryDate((Timestamp) mapValue.get("physicalInventoryDate"));
        setPartyId((String) mapValue.get("partyId"));
        setGeneralComments((String) mapValue.get("generalComments"));
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
        mapValue.put("physicalInventoryId", getPhysicalInventoryId());
        mapValue.put("physicalInventoryDate", getPhysicalInventoryDate());
        mapValue.put("partyId", getPartyId());
        mapValue.put("generalComments", getGeneralComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
