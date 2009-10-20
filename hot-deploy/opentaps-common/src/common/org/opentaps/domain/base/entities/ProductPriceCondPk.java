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
public class ProductPriceCondPk implements Serializable {
    @Column(name="PRODUCT_PRICE_RULE_ID")
    private String productPriceRuleId;
    @Column(name="PRODUCT_PRICE_COND_SEQ_ID")
    private String productPriceCondSeqId;
    
    /**
     * Auto generated value setter.
     * @param productPriceRuleId the productPriceRuleId to set
     */
    public void setProductPriceRuleId(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId;
    }
    /**
     * Auto generated value setter.
     * @param productPriceCondSeqId the productPriceCondSeqId to set
     */
    public void setProductPriceCondSeqId(String productPriceCondSeqId) {
        this.productPriceCondSeqId = productPriceCondSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getProductPriceRuleId() {
        return this.productPriceRuleId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getProductPriceCondSeqId() {
        return this.productPriceCondSeqId;
    }
}
