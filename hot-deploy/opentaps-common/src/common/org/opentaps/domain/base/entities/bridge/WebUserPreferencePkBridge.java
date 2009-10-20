package org.opentaps.domain.base.entities.bridge;

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

import java.util.Date;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.hibernate.search.annotations.Resolution;
import org.hibernate.search.bridge.builtin.*;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.Field.TermVector;
import org.hibernate.search.bridge.LuceneOptions;
import org.hibernate.search.bridge.TwoWayFieldBridge;
import org.opentaps.domain.base.entities.WebUserPreferencePk;

/**
 * A FieldBridge for WebUserPreferencePk.
 */
public class WebUserPreferencePkBridge implements TwoWayFieldBridge {

    /**
     * getter method, return the WebUserPreferencePk.
     * @param name a <code>String</code> value
     * @param document a <code>Document</code> value
     * @return a <code>Object</code> value
     */
    public Object get(String name, Document document) {
        WebUserPreferencePk id = new WebUserPreferencePk();
        Field field = null;
        field = document.getField(name + ".userLoginId");
        id.setUserLoginId(field.stringValue());
        field = document.getField(name + ".partyId");
        id.setPartyId(field.stringValue());
        field = document.getField(name + ".visitId");
        id.setVisitId(field.stringValue());
        field = document.getField(name + ".webPreferenceTypeId");
        id.setWebPreferenceTypeId(field.stringValue());
        return id;
    }

    /**
     * change object to String.
     * @param object a <code>Object</code> PK value
     * @return a <code>String</code> value
     */
    public String objectToString(Object object) {
        WebUserPreferencePk id = (WebUserPreferencePk) object;
        StringBuilder sb = new StringBuilder("");
        
        sb.append(id.getUserLoginId());
        sb.append(" ");
        sb.append(id.getPartyId());
        sb.append(" ");
        sb.append(id.getVisitId());
        sb.append(" ");
        sb.append(id.getWebPreferenceTypeId());
        return sb.toString();
    }

    /**
     * set field value by pk.
     * @param name a <code>String</code> field name
     * @param value a <code>Object</code> value
     * @param document a <code>Document</code> value
     * @param luceneOptions a <code>LuceneOptions</code> value
     */
    public void set(String name, Object value, Document document, LuceneOptions luceneOptions) {
        WebUserPreferencePk id = (WebUserPreferencePk) value;
        Store store = luceneOptions.getStore();
        Index index = luceneOptions.getIndex();
        TermVector termVector = luceneOptions.getTermVector();
        Float boost = luceneOptions.getBoost();

        Field field = null;
        field = new Field(name + ".userLoginId", id.getUserLoginId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".partyId", id.getPartyId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".visitId", id.getVisitId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".webPreferenceTypeId", id.getWebPreferenceTypeId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);

        field = new Field(name, objectToString(id), store, index, termVector);
        field.setBoost(boost);
    }

}
