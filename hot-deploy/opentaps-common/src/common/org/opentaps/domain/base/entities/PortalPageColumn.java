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
import java.sql.Timestamp;

/**
 * Auto generated base entity PortalPageColumn.
 */
@javax.persistence.Entity
@Table(name="PORTAL_PAGE_COLUMN")
public class PortalPageColumn extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("portalPageId", "PORTAL_PAGE_ID");
        fields.put("columnSeqId", "COLUMN_SEQ_ID");
        fields.put("columnWidthPixels", "COLUMN_WIDTH_PIXELS");
        fields.put("columnWidthPercentage", "COLUMN_WIDTH_PERCENTAGE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PortalPageColumn", fields);
}
  public static enum Fields implements EntityFieldInterface<PortalPageColumn> {
    portalPageId("portalPageId"),
    columnSeqId("columnSeqId"),
    columnWidthPixels("columnWidthPixels"),
    columnWidthPercentage("columnWidthPercentage"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.PortalPageColumnPkBridge.class)
     private PortalPageColumnPk id = new PortalPageColumnPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PortalPageColumnPk</code>
     */
      public PortalPageColumnPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PortalPageColumnPk</code> value to set
    */   
      public void setId(PortalPageColumnPk id) {
         this.id = id;
      }
   @Column(name="COLUMN_WIDTH_PIXELS")
   private Long columnWidthPixels;
   @Column(name="COLUMN_WIDTH_PERCENTAGE")
   private Long columnWidthPercentage;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PORTAL_PAGE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PortalPage portalPage = null;
   private transient List<PortalPagePortlet> portalPagePortlets = null;

  /**
   * Default constructor.
   */
  public PortalPageColumn() {
      super();
      this.baseEntityName = "PortalPageColumn";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("portalPageId");this.primaryKeyNames.add("columnSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("portalPageId");this.allFieldsNames.add("columnSeqId");this.allFieldsNames.add("columnWidthPixels");this.allFieldsNames.add("columnWidthPercentage");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PortalPageColumn(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param portalPageId the portalPageId to set
     */
    public void setPortalPageId(String portalPageId) {
        id.setPortalPageId(portalPageId);
    }
    /**
     * Auto generated value setter.
     * @param columnSeqId the columnSeqId to set
     */
    public void setColumnSeqId(String columnSeqId) {
        id.setColumnSeqId(columnSeqId);
    }
    /**
     * Auto generated value setter.
     * @param columnWidthPixels the columnWidthPixels to set
     */
    public void setColumnWidthPixels(Long columnWidthPixels) {
        this.columnWidthPixels = columnWidthPixels;
    }
    /**
     * Auto generated value setter.
     * @param columnWidthPercentage the columnWidthPercentage to set
     */
    public void setColumnWidthPercentage(Long columnWidthPercentage) {
        this.columnWidthPercentage = columnWidthPercentage;
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
    public String getPortalPageId() {
        return this.id.getPortalPageId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getColumnSeqId() {
        return this.id.getColumnSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getColumnWidthPixels() {
        return this.columnWidthPixels;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getColumnWidthPercentage() {
        return this.columnWidthPercentage;
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
     * Auto generated method that gets the related <code>PortalPage</code> by the relation named <code>PortalPage</code>.
     * @return the <code>PortalPage</code>
     * @throws RepositoryException if an error occurs
     */
    public PortalPage getPortalPage() throws RepositoryException {
        if (this.portalPage == null) {
            this.portalPage = getRelatedOne(PortalPage.class, "PortalPage");
        }
        return this.portalPage;
    }
    /**
     * Auto generated method that gets the related <code>PortalPagePortlet</code> by the relation named <code>PortalPagePortlet</code>.
     * @return the list of <code>PortalPagePortlet</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PortalPagePortlet> getPortalPagePortlets() throws RepositoryException {
        if (this.portalPagePortlets == null) {
            this.portalPagePortlets = getRelated(PortalPagePortlet.class, "PortalPagePortlet");
        }
        return this.portalPagePortlets;
    }

    /**
     * Auto generated value setter.
     * @param portalPage the portalPage to set
    */
    public void setPortalPage(PortalPage portalPage) {
        this.portalPage = portalPage;
    }
    /**
     * Auto generated value setter.
     * @param portalPagePortlets the portalPagePortlets to set
    */
    public void setPortalPagePortlets(List<PortalPagePortlet> portalPagePortlets) {
        this.portalPagePortlets = portalPagePortlets;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPortalPageId((String) mapValue.get("portalPageId"));
        setColumnSeqId((String) mapValue.get("columnSeqId"));
        setColumnWidthPixels((Long) mapValue.get("columnWidthPixels"));
        setColumnWidthPercentage((Long) mapValue.get("columnWidthPercentage"));
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
        mapValue.put("portalPageId", getPortalPageId());
        mapValue.put("columnSeqId", getColumnSeqId());
        mapValue.put("columnWidthPixels", getColumnWidthPixels());
        mapValue.put("columnWidthPercentage", getColumnWidthPercentage());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
