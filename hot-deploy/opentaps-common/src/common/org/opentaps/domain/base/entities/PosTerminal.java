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
 * Auto generated base entity PosTerminal.
 */
@javax.persistence.Entity
@Table(name="POS_TERMINAL")
public class PosTerminal extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("posTerminalId", "POS_TERMINAL_ID");
        fields.put("facilityId", "FACILITY_ID");
        fields.put("pushEntitySyncId", "PUSH_ENTITY_SYNC_ID");
        fields.put("terminalName", "TERMINAL_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PosTerminal", fields);
}
  public static enum Fields implements EntityFieldInterface<PosTerminal> {
    posTerminalId("posTerminalId"),
    facilityId("facilityId"),
    pushEntitySyncId("pushEntitySyncId"),
    terminalName("terminalName"),
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

   @org.hibernate.annotations.GenericGenerator(name="PosTerminal_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PosTerminal_GEN")
   @Id
   @Column(name="POS_TERMINAL_ID")
   private String posTerminalId;
   @Column(name="FACILITY_ID")
   private String facilityId;
   @Column(name="PUSH_ENTITY_SYNC_ID")
   private String pushEntitySyncId;
   @Column(name="TERMINAL_NAME")
   private String terminalName;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="POS_TERMINAL_ID")
   
   private List<PosTerminalLog> posTerminalLogs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="posTerminal", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="POS_TERMINAL_ID")
   
   private List<PosTerminalState> posTerminalStates = null;

  /**
   * Default constructor.
   */
  public PosTerminal() {
      super();
      this.baseEntityName = "PosTerminal";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("posTerminalId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("posTerminalId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("pushEntitySyncId");this.allFieldsNames.add("terminalName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PosTerminal(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param posTerminalId the posTerminalId to set
     */
    public void setPosTerminalId(String posTerminalId) {
        this.posTerminalId = posTerminalId;
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
     * @param pushEntitySyncId the pushEntitySyncId to set
     */
    public void setPushEntitySyncId(String pushEntitySyncId) {
        this.pushEntitySyncId = pushEntitySyncId;
    }
    /**
     * Auto generated value setter.
     * @param terminalName the terminalName to set
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
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
    public String getPosTerminalId() {
        return this.posTerminalId;
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
     * @return <code>String</code>
     */
    public String getPushEntitySyncId() {
        return this.pushEntitySyncId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTerminalName() {
        return this.terminalName;
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
     * Auto generated method that gets the related <code>PosTerminalLog</code> by the relation named <code>PosTerminalLog</code>.
     * @return the list of <code>PosTerminalLog</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PosTerminalLog> getPosTerminalLogs() throws RepositoryException {
        if (this.posTerminalLogs == null) {
            this.posTerminalLogs = getRelated(PosTerminalLog.class, "PosTerminalLog");
        }
        return this.posTerminalLogs;
    }
    /**
     * Auto generated method that gets the related <code>PosTerminalState</code> by the relation named <code>PosTerminalState</code>.
     * @return the list of <code>PosTerminalState</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PosTerminalState> getPosTerminalStates() throws RepositoryException {
        if (this.posTerminalStates == null) {
            this.posTerminalStates = getRelated(PosTerminalState.class, "PosTerminalState");
        }
        return this.posTerminalStates;
    }

    /**
     * Auto generated value setter.
     * @param posTerminalLogs the posTerminalLogs to set
    */
    public void setPosTerminalLogs(List<PosTerminalLog> posTerminalLogs) {
        this.posTerminalLogs = posTerminalLogs;
    }
    /**
     * Auto generated value setter.
     * @param posTerminalStates the posTerminalStates to set
    */
    public void setPosTerminalStates(List<PosTerminalState> posTerminalStates) {
        this.posTerminalStates = posTerminalStates;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPosTerminalState(PosTerminalState posTerminalState) {
        if (this.posTerminalStates == null) {
            this.posTerminalStates = new ArrayList<PosTerminalState>();
        }
        this.posTerminalStates.add(posTerminalState);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePosTerminalState(PosTerminalState posTerminalState) {
        if (this.posTerminalStates == null) {
            return;
        }
        this.posTerminalStates.remove(posTerminalState);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPosTerminalState() {
        if (this.posTerminalStates == null) {
            return;
        }
        this.posTerminalStates.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPosTerminalId((String) mapValue.get("posTerminalId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setPushEntitySyncId((String) mapValue.get("pushEntitySyncId"));
        setTerminalName((String) mapValue.get("terminalName"));
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
        mapValue.put("posTerminalId", getPosTerminalId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("pushEntitySyncId", getPushEntitySyncId());
        mapValue.put("terminalName", getTerminalName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
