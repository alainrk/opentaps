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
public class TestEntityItemPk implements Serializable {
    @Column(name="TEST_ENTITY_ID")
    private String testEntityId;
    @Column(name="TEST_ENTITY_ITEM_SEQ_ID")
    private String testEntityItemSeqId;
    
    /**
     * Auto generated value setter.
     * @param testEntityId the testEntityId to set
     */
    public void setTestEntityId(String testEntityId) {
        this.testEntityId = testEntityId;
    }
    /**
     * Auto generated value setter.
     * @param testEntityItemSeqId the testEntityItemSeqId to set
     */
    public void setTestEntityItemSeqId(String testEntityItemSeqId) {
        this.testEntityItemSeqId = testEntityItemSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getTestEntityId() {
        return this.testEntityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getTestEntityItemSeqId() {
        return this.testEntityItemSeqId;
    }
}
