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
 * Auto generated base entity EftAccount.
 */
@javax.persistence.Entity
@Table(name="EFT_ACCOUNT")
public class EftAccount extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentMethodId", "PAYMENT_METHOD_ID");
        fields.put("bankName", "BANK_NAME");
        fields.put("routingNumber", "ROUTING_NUMBER");
        fields.put("accountType", "ACCOUNT_TYPE");
        fields.put("accountNumber", "ACCOUNT_NUMBER");
        fields.put("nameOnAccount", "NAME_ON_ACCOUNT");
        fields.put("companyNameOnAccount", "COMPANY_NAME_ON_ACCOUNT");
        fields.put("contactMechId", "CONTACT_MECH_ID");
        fields.put("yearsAtBank", "YEARS_AT_BANK");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EftAccount", fields);
}
  public static enum Fields implements EntityFieldInterface<EftAccount> {
    paymentMethodId("paymentMethodId"),
    bankName("bankName"),
    routingNumber("routingNumber"),
    accountType("accountType"),
    accountNumber("accountNumber"),
    nameOnAccount("nameOnAccount"),
    companyNameOnAccount("companyNameOnAccount"),
    contactMechId("contactMechId"),
    yearsAtBank("yearsAtBank"),
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

   @org.hibernate.annotations.GenericGenerator(name="EftAccount_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="EftAccount_GEN")
   @Id
   @Column(name="PAYMENT_METHOD_ID")
   private String paymentMethodId;
   @Column(name="BANK_NAME")
   private String bankName;
   @Column(name="ROUTING_NUMBER")
   private String routingNumber;
   @Column(name="ACCOUNT_TYPE")
   private String accountType;
   @Column(name="ACCOUNT_NUMBER")
   private String accountNumber;
   @Column(name="NAME_ON_ACCOUNT")
   private String nameOnAccount;
   @Column(name="COMPANY_NAME_ON_ACCOUNT")
   private String companyNameOnAccount;
   @Column(name="CONTACT_MECH_ID")
   private String contactMechId;
   @Column(name="YEARS_AT_BANK")
   private Long yearsAtBank;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentMethod paymentMethod = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ContactMech contactMech = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PostalAddress postalAddress = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID")
   
   private List<OrderPaymentPreference> orderPaymentPreferences = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID")
   
   private List<Payment> payments = null;

  /**
   * Default constructor.
   */
  public EftAccount() {
      super();
      this.baseEntityName = "EftAccount";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentMethodId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentMethodId");this.allFieldsNames.add("bankName");this.allFieldsNames.add("routingNumber");this.allFieldsNames.add("accountType");this.allFieldsNames.add("accountNumber");this.allFieldsNames.add("nameOnAccount");this.allFieldsNames.add("companyNameOnAccount");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("yearsAtBank");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EftAccount(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentMethodId the paymentMethodId to set
     */
    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
    /**
     * Auto generated value setter.
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    /**
     * Auto generated value setter.
     * @param routingNumber the routingNumber to set
     */
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
    /**
     * Auto generated value setter.
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    /**
     * Auto generated value setter.
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Auto generated value setter.
     * @param nameOnAccount the nameOnAccount to set
     */
    public void setNameOnAccount(String nameOnAccount) {
        this.nameOnAccount = nameOnAccount;
    }
    /**
     * Auto generated value setter.
     * @param companyNameOnAccount the companyNameOnAccount to set
     */
    public void setCompanyNameOnAccount(String companyNameOnAccount) {
        this.companyNameOnAccount = companyNameOnAccount;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param yearsAtBank the yearsAtBank to set
     */
    public void setYearsAtBank(Long yearsAtBank) {
        this.yearsAtBank = yearsAtBank;
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
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBankName() {
        return this.bankName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoutingNumber() {
        return this.routingNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountType() {
        return this.accountType;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNameOnAccount() {
        return this.nameOnAccount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCompanyNameOnAccount() {
        return this.companyNameOnAccount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getYearsAtBank() {
        return this.yearsAtBank;
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
     * Auto generated method that gets the related <code>PaymentMethod</code> by the relation named <code>PaymentMethod</code>.
     * @return the <code>PaymentMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentMethod getPaymentMethod() throws RepositoryException {
        if (this.paymentMethod == null) {
            this.paymentMethod = getRelatedOne(PaymentMethod.class, "PaymentMethod");
        }
        return this.paymentMethod;
    }
    /**
     * Auto generated method that gets the related <code>ContactMech</code> by the relation named <code>ContactMech</code>.
     * @return the <code>ContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public ContactMech getContactMech() throws RepositoryException {
        if (this.contactMech == null) {
            this.contactMech = getRelatedOne(ContactMech.class, "ContactMech");
        }
        return this.contactMech;
    }
    /**
     * Auto generated method that gets the related <code>PostalAddress</code> by the relation named <code>PostalAddress</code>.
     * @return the <code>PostalAddress</code>
     * @throws RepositoryException if an error occurs
     */
    public PostalAddress getPostalAddress() throws RepositoryException {
        if (this.postalAddress == null) {
            this.postalAddress = getRelatedOne(PostalAddress.class, "PostalAddress");
        }
        return this.postalAddress;
    }
    /**
     * Auto generated method that gets the related <code>OrderPaymentPreference</code> by the relation named <code>OrderPaymentPreference</code>.
     * @return the list of <code>OrderPaymentPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderPaymentPreference> getOrderPaymentPreferences() throws RepositoryException {
        if (this.orderPaymentPreferences == null) {
            this.orderPaymentPreferences = getRelated(OrderPaymentPreference.class, "OrderPaymentPreference");
        }
        return this.orderPaymentPreferences;
    }
    /**
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>Payment</code>.
     * @return the list of <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Payment> getPayments() throws RepositoryException {
        if (this.payments == null) {
            this.payments = getRelated(Payment.class, "Payment");
        }
        return this.payments;
    }

    /**
     * Auto generated value setter.
     * @param paymentMethod the paymentMethod to set
    */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    /**
     * Auto generated value setter.
     * @param contactMech the contactMech to set
    */
    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }
    /**
     * Auto generated value setter.
     * @param postalAddress the postalAddress to set
    */
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }
    /**
     * Auto generated value setter.
     * @param orderPaymentPreferences the orderPaymentPreferences to set
    */
    public void setOrderPaymentPreferences(List<OrderPaymentPreference> orderPaymentPreferences) {
        this.orderPaymentPreferences = orderPaymentPreferences;
    }
    /**
     * Auto generated value setter.
     * @param payments the payments to set
    */
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentMethodId((String) mapValue.get("paymentMethodId"));
        setBankName((String) mapValue.get("bankName"));
        setRoutingNumber((String) mapValue.get("routingNumber"));
        setAccountType((String) mapValue.get("accountType"));
        setAccountNumber((String) mapValue.get("accountNumber"));
        setNameOnAccount((String) mapValue.get("nameOnAccount"));
        setCompanyNameOnAccount((String) mapValue.get("companyNameOnAccount"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setYearsAtBank((Long) mapValue.get("yearsAtBank"));
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
        mapValue.put("paymentMethodId", getPaymentMethodId());
        mapValue.put("bankName", getBankName());
        mapValue.put("routingNumber", getRoutingNumber());
        mapValue.put("accountType", getAccountType());
        mapValue.put("accountNumber", getAccountNumber());
        mapValue.put("nameOnAccount", getNameOnAccount());
        mapValue.put("companyNameOnAccount", getCompanyNameOnAccount());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("yearsAtBank", getYearsAtBank());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
