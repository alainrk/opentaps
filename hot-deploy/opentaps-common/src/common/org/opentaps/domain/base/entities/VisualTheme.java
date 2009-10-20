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
 * Auto generated base entity VisualTheme.
 */
@javax.persistence.Entity
@Table(name="VISUAL_THEME")
public class VisualTheme extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("visualThemeId", "VISUAL_THEME_ID");
        fields.put("visualThemeSetId", "VISUAL_THEME_SET_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("VisualTheme", fields);
}
  public static enum Fields implements EntityFieldInterface<VisualTheme> {
    visualThemeId("visualThemeId"),
    visualThemeSetId("visualThemeSetId"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="VisualTheme_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="VisualTheme_GEN")
   @Id
   @Column(name="VISUAL_THEME_ID")
   private String visualThemeId;
   @Column(name="VISUAL_THEME_SET_ID")
   private String visualThemeSetId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VISUAL_THEME_SET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private VisualThemeSet visualThemeSet = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="visualTheme", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="VISUAL_THEME_ID")
   
   private List<VisualThemeResource> visualThemeResources = null;

  /**
   * Default constructor.
   */
  public VisualTheme() {
      super();
      this.baseEntityName = "VisualTheme";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("visualThemeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("visualThemeId");this.allFieldsNames.add("visualThemeSetId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public VisualTheme(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param visualThemeId the visualThemeId to set
     */
    public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId;
    }
    /**
     * Auto generated value setter.
     * @param visualThemeSetId the visualThemeSetId to set
     */
    public void setVisualThemeSetId(String visualThemeSetId) {
        this.visualThemeSetId = visualThemeSetId;
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
    public String getVisualThemeId() {
        return this.visualThemeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVisualThemeSetId() {
        return this.visualThemeSetId;
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
     * Auto generated method that gets the related <code>VisualThemeSet</code> by the relation named <code>VisualThemeSet</code>.
     * @return the <code>VisualThemeSet</code>
     * @throws RepositoryException if an error occurs
     */
    public VisualThemeSet getVisualThemeSet() throws RepositoryException {
        if (this.visualThemeSet == null) {
            this.visualThemeSet = getRelatedOne(VisualThemeSet.class, "VisualThemeSet");
        }
        return this.visualThemeSet;
    }
    /**
     * Auto generated method that gets the related <code>VisualThemeResource</code> by the relation named <code>VisualThemeResource</code>.
     * @return the list of <code>VisualThemeResource</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends VisualThemeResource> getVisualThemeResources() throws RepositoryException {
        if (this.visualThemeResources == null) {
            this.visualThemeResources = getRelated(VisualThemeResource.class, "VisualThemeResource");
        }
        return this.visualThemeResources;
    }

    /**
     * Auto generated value setter.
     * @param visualThemeSet the visualThemeSet to set
    */
    public void setVisualThemeSet(VisualThemeSet visualThemeSet) {
        this.visualThemeSet = visualThemeSet;
    }
    /**
     * Auto generated value setter.
     * @param visualThemeResources the visualThemeResources to set
    */
    public void setVisualThemeResources(List<VisualThemeResource> visualThemeResources) {
        this.visualThemeResources = visualThemeResources;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addVisualThemeResource(VisualThemeResource visualThemeResource) {
        if (this.visualThemeResources == null) {
            this.visualThemeResources = new ArrayList<VisualThemeResource>();
        }
        this.visualThemeResources.add(visualThemeResource);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeVisualThemeResource(VisualThemeResource visualThemeResource) {
        if (this.visualThemeResources == null) {
            return;
        }
        this.visualThemeResources.remove(visualThemeResource);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearVisualThemeResource() {
        if (this.visualThemeResources == null) {
            return;
        }
        this.visualThemeResources.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setVisualThemeId((String) mapValue.get("visualThemeId"));
        setVisualThemeSetId((String) mapValue.get("visualThemeSetId"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("visualThemeId", getVisualThemeId());
        mapValue.put("visualThemeSetId", getVisualThemeSetId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
