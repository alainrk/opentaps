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

import java.io.Serializable;
import javax.persistence.*;

import java.lang.String;

@Embeddable
public class InvoiceItemTypeGlAccountPk implements Serializable {
    @Column(name="INVOICE_ITEM_TYPE_ID")
    private String invoiceItemTypeId;
    @Column(name="ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    
    /**
     * Auto generated value setter.
     * @param invoiceItemTypeId the invoiceItemTypeId to set
     */
    public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getInvoiceItemTypeId() {
        return this.invoiceItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
}
