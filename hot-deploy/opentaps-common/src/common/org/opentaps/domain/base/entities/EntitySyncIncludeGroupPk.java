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
public class EntitySyncIncludeGroupPk implements Serializable {
    @Column(name="ENTITY_SYNC_ID")
    private String entitySyncId;
    @Column(name="ENTITY_GROUP_ID")
    private String entityGroupId;
    
    /**
     * Auto generated value setter.
     * @param entitySyncId the entitySyncId to set
     */
    public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }
    /**
     * Auto generated value setter.
     * @param entityGroupId the entityGroupId to set
     */
    public void setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getEntitySyncId() {
        return this.entitySyncId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getEntityGroupId() {
        return this.entityGroupId;
    }
}
