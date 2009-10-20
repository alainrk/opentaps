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
public class PayrollPreferencePk implements Serializable {
    @Column(name="PARTY_ID")
    private String partyId;
    @Column(name="ROLE_TYPE_ID")
    private String roleTypeId;
    @Column(name="PAYROLL_PREFERENCE_SEQ_ID")
    private String payrollPreferenceSeqId;
    
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
     * @param payrollPreferenceSeqId the payrollPreferenceSeqId to set
     */
    public void setPayrollPreferenceSeqId(String payrollPreferenceSeqId) {
        this.payrollPreferenceSeqId = payrollPreferenceSeqId;
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
     * @return <code>String</code>
     */  
    public String getPayrollPreferenceSeqId() {
        return this.payrollPreferenceSeqId;
    }
}
