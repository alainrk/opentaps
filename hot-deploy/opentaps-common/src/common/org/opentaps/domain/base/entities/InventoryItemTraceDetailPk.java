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
public class InventoryItemTraceDetailPk implements Serializable {
    @Column(name="INVENTORY_ITEM_TRACE_ID")
    private String inventoryItemTraceId;
    @Column(name="INVENTORY_ITEM_TRACE_SEQ_ID")
    private String inventoryItemTraceSeqId;
    
    /**
     * Auto generated value setter.
     * @param inventoryItemTraceId the inventoryItemTraceId to set
     */
    public void setInventoryItemTraceId(String inventoryItemTraceId) {
        this.inventoryItemTraceId = inventoryItemTraceId;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemTraceSeqId the inventoryItemTraceSeqId to set
     */
    public void setInventoryItemTraceSeqId(String inventoryItemTraceSeqId) {
        this.inventoryItemTraceSeqId = inventoryItemTraceSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getInventoryItemTraceId() {
        return this.inventoryItemTraceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getInventoryItemTraceSeqId() {
        return this.inventoryItemTraceSeqId;
    }
}
