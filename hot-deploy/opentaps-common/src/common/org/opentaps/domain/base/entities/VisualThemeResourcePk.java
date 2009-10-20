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
public class VisualThemeResourcePk implements Serializable {
    @Column(name="VISUAL_THEME_ID")
    private String visualThemeId;
    @Column(name="RESOURCE_TYPE_ENUM_ID")
    private String resourceTypeEnumId;
    @Column(name="SEQUENCE_ID")
    private String sequenceId;
    
    /**
     * Auto generated value setter.
     * @param visualThemeId the visualThemeId to set
     */
    public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId;
    }
    /**
     * Auto generated value setter.
     * @param resourceTypeEnumId the resourceTypeEnumId to set
     */
    public void setResourceTypeEnumId(String resourceTypeEnumId) {
        this.resourceTypeEnumId = resourceTypeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param sequenceId the sequenceId to set
     */
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
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
    public String getResourceTypeEnumId() {
        return this.resourceTypeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getSequenceId() {
        return this.sequenceId;
    }
}
