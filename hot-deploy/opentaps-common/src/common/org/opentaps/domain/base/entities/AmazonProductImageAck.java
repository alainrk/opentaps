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
 * Auto generated base entity AmazonProductImageAck.
 */
@javax.persistence.Entity
@Table(name="AMAZON_PRODUCT_IMAGE_ACK")
public class AmazonProductImageAck extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PRODUCT_ID");
        fields.put("productContentTypeId", "PRODUCT_CONTENT_TYPE_ID");
        fields.put("acknowledgeMessageId", "ACKNOWLEDGE_MESSAGE_ID");
        fields.put("ackStatusId", "ACK_STATUS_ID");
        fields.put("acknowledgeTimestamp", "ACKNOWLEDGE_TIMESTAMP");
        fields.put("acknowledgeErrorMessage", "ACKNOWLEDGE_ERROR_MESSAGE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AmazonProductImageAck", fields);
}
  public static enum Fields implements EntityFieldInterface<AmazonProductImageAck> {
    productId("productId"),
    productContentTypeId("productContentTypeId"),
    acknowledgeMessageId("acknowledgeMessageId"),
    ackStatusId("ackStatusId"),
    acknowledgeTimestamp("acknowledgeTimestamp"),
    acknowledgeErrorMessage("acknowledgeErrorMessage"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.AmazonProductImageAckPkBridge.class)
     private AmazonProductImageAckPk id = new AmazonProductImageAckPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>AmazonProductImageAckPk</code>
     */
      public AmazonProductImageAckPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>AmazonProductImageAckPk</code> value to set
    */   
      public void setId(AmazonProductImageAckPk id) {
         this.id = id;
      }
   @Column(name="ACKNOWLEDGE_MESSAGE_ID")
   private String acknowledgeMessageId;
   @Column(name="ACK_STATUS_ID")
   private String ackStatusId;
   @Column(name="ACKNOWLEDGE_TIMESTAMP")
   private Timestamp acknowledgeTimestamp;
   @Column(name="ACKNOWLEDGE_ERROR_MESSAGE")
   private String acknowledgeErrorMessage;
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
   
   private AmazonProductImage amazonProductImage = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_CONTENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductContentType productContentType = null;

  /**
   * Default constructor.
   */
  public AmazonProductImageAck() {
      super();
      this.baseEntityName = "AmazonProductImageAck";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("productContentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("productContentTypeId");this.allFieldsNames.add("acknowledgeMessageId");this.allFieldsNames.add("ackStatusId");this.allFieldsNames.add("acknowledgeTimestamp");this.allFieldsNames.add("acknowledgeErrorMessage");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AmazonProductImageAck(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        id.setProductId(productId);
    }
    /**
     * Auto generated value setter.
     * @param productContentTypeId the productContentTypeId to set
     */
    public void setProductContentTypeId(String productContentTypeId) {
        id.setProductContentTypeId(productContentTypeId);
    }
    /**
     * Auto generated value setter.
     * @param acknowledgeMessageId the acknowledgeMessageId to set
     */
    public void setAcknowledgeMessageId(String acknowledgeMessageId) {
        this.acknowledgeMessageId = acknowledgeMessageId;
    }
    /**
     * Auto generated value setter.
     * @param ackStatusId the ackStatusId to set
     */
    public void setAckStatusId(String ackStatusId) {
        this.ackStatusId = ackStatusId;
    }
    /**
     * Auto generated value setter.
     * @param acknowledgeTimestamp the acknowledgeTimestamp to set
     */
    public void setAcknowledgeTimestamp(Timestamp acknowledgeTimestamp) {
        this.acknowledgeTimestamp = acknowledgeTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param acknowledgeErrorMessage the acknowledgeErrorMessage to set
     */
    public void setAcknowledgeErrorMessage(String acknowledgeErrorMessage) {
        this.acknowledgeErrorMessage = acknowledgeErrorMessage;
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
    public String getProductId() {
        return this.id.getProductId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductContentTypeId() {
        return this.id.getProductContentTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcknowledgeMessageId() {
        return this.acknowledgeMessageId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAckStatusId() {
        return this.ackStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAcknowledgeTimestamp() {
        return this.acknowledgeTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcknowledgeErrorMessage() {
        return this.acknowledgeErrorMessage;
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
     * Auto generated method that gets the related <code>AmazonProductImage</code> by the relation named <code>AmazonProductImage</code>.
     * @return the <code>AmazonProductImage</code>
     * @throws RepositoryException if an error occurs
     */
    public AmazonProductImage getAmazonProductImage() throws RepositoryException {
        if (this.amazonProductImage == null) {
            this.amazonProductImage = getRelatedOne(AmazonProductImage.class, "AmazonProductImage");
        }
        return this.amazonProductImage;
    }
    /**
     * Auto generated method that gets the related <code>ProductContentType</code> by the relation named <code>ProductContentType</code>.
     * @return the <code>ProductContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductContentType getProductContentType() throws RepositoryException {
        if (this.productContentType == null) {
            this.productContentType = getRelatedOne(ProductContentType.class, "ProductContentType");
        }
        return this.productContentType;
    }

    /**
     * Auto generated value setter.
     * @param amazonProductImage the amazonProductImage to set
    */
    public void setAmazonProductImage(AmazonProductImage amazonProductImage) {
        this.amazonProductImage = amazonProductImage;
    }
    /**
     * Auto generated value setter.
     * @param productContentType the productContentType to set
    */
    public void setProductContentType(ProductContentType productContentType) {
        this.productContentType = productContentType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setProductContentTypeId((String) mapValue.get("productContentTypeId"));
        setAcknowledgeMessageId((String) mapValue.get("acknowledgeMessageId"));
        setAckStatusId((String) mapValue.get("ackStatusId"));
        setAcknowledgeTimestamp((Timestamp) mapValue.get("acknowledgeTimestamp"));
        setAcknowledgeErrorMessage((String) mapValue.get("acknowledgeErrorMessage"));
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
        mapValue.put("productId", getProductId());
        mapValue.put("productContentTypeId", getProductContentTypeId());
        mapValue.put("acknowledgeMessageId", getAcknowledgeMessageId());
        mapValue.put("ackStatusId", getAckStatusId());
        mapValue.put("acknowledgeTimestamp", getAcknowledgeTimestamp());
        mapValue.put("acknowledgeErrorMessage", getAcknowledgeErrorMessage());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
