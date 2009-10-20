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
import java.sql.Timestamp;

@Embeddable
public class FacilityAssocPk implements Serializable {
    @Column(name="FACILITY_ID")
    private String facilityId;
    @Column(name="FACILITY_ID_TO")
    private String facilityIdTo;
    @Column(name="FACILITY_ASSOC_TYPE_ID")
    private String facilityAssocTypeId;
    @Column(name="FROM_DATE")
    private Timestamp fromDate;
    
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param facilityIdTo the facilityIdTo to set
     */
    public void setFacilityIdTo(String facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }
    /**
     * Auto generated value setter.
     * @param facilityAssocTypeId the facilityAssocTypeId to set
     */
    public void setFacilityAssocTypeId(String facilityAssocTypeId) {
        this.facilityAssocTypeId = facilityAssocTypeId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
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
    public String getFacilityIdTo() {
        return this.facilityIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getFacilityAssocTypeId() {
        return this.facilityAssocTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */  
    public Timestamp getFromDate() {
        return this.fromDate;
    }
}
