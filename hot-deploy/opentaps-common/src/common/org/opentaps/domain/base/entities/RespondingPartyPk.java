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
public class RespondingPartyPk implements Serializable {
    @Column(name="RESPONDING_PARTY_SEQ_ID")
    private String respondingPartySeqId;
    @Column(name="CUST_REQUEST_ID")
    private String custRequestId;
    @Column(name="PARTY_ID")
    private String partyId;
    
    /**
     * Auto generated value setter.
     * @param respondingPartySeqId the respondingPartySeqId to set
     */
    public void setRespondingPartySeqId(String respondingPartySeqId) {
        this.respondingPartySeqId = respondingPartySeqId;
    }
    /**
     * Auto generated value setter.
     * @param custRequestId the custRequestId to set
     */
    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getRespondingPartySeqId() {
        return this.respondingPartySeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getCustRequestId() {
        return this.custRequestId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getPartyId() {
        return this.partyId;
    }
}
