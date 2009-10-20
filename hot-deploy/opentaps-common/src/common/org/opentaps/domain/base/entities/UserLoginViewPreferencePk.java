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
public class UserLoginViewPreferencePk implements Serializable {
    @Column(name="USER_LOGIN_ID")
    private String userLoginId;
    @Column(name="APPLICATION_NAME")
    private String applicationName;
    @Column(name="SCREEN_NAME")
    private String screenName;
    @Column(name="PREFERENCE_NAME")
    private String preferenceName;
    
    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
    /**
     * Auto generated value setter.
     * @param applicationName the applicationName to set
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    /**
     * Auto generated value setter.
     * @param screenName the screenName to set
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    /**
     * Auto generated value setter.
     * @param preferenceName the preferenceName to set
     */
    public void setPreferenceName(String preferenceName) {
        this.preferenceName = preferenceName;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getUserLoginId() {
        return this.userLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getApplicationName() {
        return this.applicationName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getScreenName() {
        return this.screenName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getPreferenceName() {
        return this.preferenceName;
    }
}
