package org.opentaps.domain.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.service.ServiceWrapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Update EntitySyncHistory.
 * Auto generated base service entity updateEntitySyncHistory.
 *
 * Engine: simple
 * Location: component://entityext/script/org/ofbiz/entityext/synchronization/EntitySyncServices.xml
 * Invoke: updateEntitySyncHistory
 * Defined in: file:/home/jeremy/programmation/opentaps-git/framework/entityext/servicedef/services.xml
 */
public class UpdateEntitySyncHistoryService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateEntitySyncHistory";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.TRUE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        beginningSynchTime("beginningSynchTime"),
        entitySyncId("entitySyncId"),
        lastCandidateEndTime("lastCandidateEndTime"),
        lastSplitStartTime("lastSplitStartTime"),
        lastSuccessfulSynchTime("lastSuccessfulSynchTime"),
        locale("locale"),
        perSplitMaxItems("perSplitMaxItems"),
        perSplitMaxMillis("perSplitMaxMillis"),
        perSplitMinItems("perSplitMinItems"),
        perSplitMinMillis("perSplitMinMillis"),
        runStatusId("runStatusId"),
        runningTimeMillis("runningTimeMillis"),
        startDate("startDate"),
        timeZone("timeZone"),
        toCreateInserted("toCreateInserted"),
        toCreateNotUpdated("toCreateNotUpdated"),
        toCreateUpdated("toCreateUpdated"),
        toRemoveAlreadyDeleted("toRemoveAlreadyDeleted"),
        toRemoveDeleted("toRemoveDeleted"),
        toStoreInserted("toStoreInserted"),
        toStoreNotUpdated("toStoreNotUpdated"),
        toStoreUpdated("toStoreUpdated"),
        totalRowsExported("totalRowsExported"),
        totalRowsToCreate("totalRowsToCreate"),
        totalRowsToRemove("totalRowsToRemove"),
        totalRowsToStore("totalRowsToStore"),
        totalSplits("totalSplits"),
        totalStoreCalls("totalStoreCalls"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateEntitySyncHistoryService</code> instance.
     */
    public UpdateEntitySyncHistoryService() {
        super();
    }

    /**
     * Creates a new <code>UpdateEntitySyncHistoryService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateEntitySyncHistoryService(User user) {
        super(user);
    }

    private Timestamp inBeginningSynchTime;
    private String inEntitySyncId;
    private Timestamp inLastCandidateEndTime;
    private Long inLastSplitStartTime;
    private Timestamp inLastSuccessfulSynchTime;
    private Locale inLocale;
    private Long inPerSplitMaxItems;
    private Long inPerSplitMaxMillis;
    private Long inPerSplitMinItems;
    private Long inPerSplitMinMillis;
    private String inRunStatusId;
    private Long inRunningTimeMillis;
    private Timestamp inStartDate;
    private TimeZone inTimeZone;
    private Long inToCreateInserted;
    private Long inToCreateNotUpdated;
    private Long inToCreateUpdated;
    private Long inToRemoveAlreadyDeleted;
    private Long inToRemoveDeleted;
    private Long inToStoreInserted;
    private Long inToStoreNotUpdated;
    private Long inToStoreUpdated;
    private Long inTotalRowsExported;
    private Long inTotalRowsToCreate;
    private Long inTotalRowsToRemove;
    private Long inTotalRowsToStore;
    private Long inTotalSplits;
    private Long inTotalStoreCalls;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInBeginningSynchTime() {
        return this.inBeginningSynchTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInEntitySyncId() {
        return this.inEntitySyncId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastCandidateEndTime() {
        return this.inLastCandidateEndTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInLastSplitStartTime() {
        return this.inLastSplitStartTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastSuccessfulSynchTime() {
        return this.inLastSuccessfulSynchTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInPerSplitMaxItems() {
        return this.inPerSplitMaxItems;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInPerSplitMaxMillis() {
        return this.inPerSplitMaxMillis;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInPerSplitMinItems() {
        return this.inPerSplitMinItems;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInPerSplitMinMillis() {
        return this.inPerSplitMinMillis;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRunStatusId() {
        return this.inRunStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInRunningTimeMillis() {
        return this.inRunningTimeMillis;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInStartDate() {
        return this.inStartDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInToCreateInserted() {
        return this.inToCreateInserted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInToCreateNotUpdated() {
        return this.inToCreateNotUpdated;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInToCreateUpdated() {
        return this.inToCreateUpdated;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInToRemoveAlreadyDeleted() {
        return this.inToRemoveAlreadyDeleted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInToRemoveDeleted() {
        return this.inToRemoveDeleted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInToStoreInserted() {
        return this.inToStoreInserted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInToStoreNotUpdated() {
        return this.inToStoreNotUpdated;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInToStoreUpdated() {
        return this.inToStoreUpdated;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTotalRowsExported() {
        return this.inTotalRowsExported;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTotalRowsToCreate() {
        return this.inTotalRowsToCreate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTotalRowsToRemove() {
        return this.inTotalRowsToRemove;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTotalRowsToStore() {
        return this.inTotalRowsToStore;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTotalSplits() {
        return this.inTotalSplits;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTotalStoreCalls() {
        return this.inTotalStoreCalls;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBeginningSynchTime the inBeginningSynchTime to set
    */
    public void setInBeginningSynchTime(Timestamp inBeginningSynchTime) {
        this.inParameters.add("beginningSynchTime");
        this.inBeginningSynchTime = inBeginningSynchTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inEntitySyncId the inEntitySyncId to set
    */
    public void setInEntitySyncId(String inEntitySyncId) {
        this.inParameters.add("entitySyncId");
        this.inEntitySyncId = inEntitySyncId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastCandidateEndTime the inLastCandidateEndTime to set
    */
    public void setInLastCandidateEndTime(Timestamp inLastCandidateEndTime) {
        this.inParameters.add("lastCandidateEndTime");
        this.inLastCandidateEndTime = inLastCandidateEndTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastSplitStartTime the inLastSplitStartTime to set
    */
    public void setInLastSplitStartTime(Long inLastSplitStartTime) {
        this.inParameters.add("lastSplitStartTime");
        this.inLastSplitStartTime = inLastSplitStartTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastSuccessfulSynchTime the inLastSuccessfulSynchTime to set
    */
    public void setInLastSuccessfulSynchTime(Timestamp inLastSuccessfulSynchTime) {
        this.inParameters.add("lastSuccessfulSynchTime");
        this.inLastSuccessfulSynchTime = inLastSuccessfulSynchTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPerSplitMaxItems the inPerSplitMaxItems to set
    */
    public void setInPerSplitMaxItems(Long inPerSplitMaxItems) {
        this.inParameters.add("perSplitMaxItems");
        this.inPerSplitMaxItems = inPerSplitMaxItems;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPerSplitMaxMillis the inPerSplitMaxMillis to set
    */
    public void setInPerSplitMaxMillis(Long inPerSplitMaxMillis) {
        this.inParameters.add("perSplitMaxMillis");
        this.inPerSplitMaxMillis = inPerSplitMaxMillis;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPerSplitMinItems the inPerSplitMinItems to set
    */
    public void setInPerSplitMinItems(Long inPerSplitMinItems) {
        this.inParameters.add("perSplitMinItems");
        this.inPerSplitMinItems = inPerSplitMinItems;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPerSplitMinMillis the inPerSplitMinMillis to set
    */
    public void setInPerSplitMinMillis(Long inPerSplitMinMillis) {
        this.inParameters.add("perSplitMinMillis");
        this.inPerSplitMinMillis = inPerSplitMinMillis;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRunStatusId the inRunStatusId to set
    */
    public void setInRunStatusId(String inRunStatusId) {
        this.inParameters.add("runStatusId");
        this.inRunStatusId = inRunStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRunningTimeMillis the inRunningTimeMillis to set
    */
    public void setInRunningTimeMillis(Long inRunningTimeMillis) {
        this.inParameters.add("runningTimeMillis");
        this.inRunningTimeMillis = inRunningTimeMillis;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inStartDate the inStartDate to set
    */
    public void setInStartDate(Timestamp inStartDate) {
        this.inParameters.add("startDate");
        this.inStartDate = inStartDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inToCreateInserted the inToCreateInserted to set
    */
    public void setInToCreateInserted(Long inToCreateInserted) {
        this.inParameters.add("toCreateInserted");
        this.inToCreateInserted = inToCreateInserted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inToCreateNotUpdated the inToCreateNotUpdated to set
    */
    public void setInToCreateNotUpdated(Long inToCreateNotUpdated) {
        this.inParameters.add("toCreateNotUpdated");
        this.inToCreateNotUpdated = inToCreateNotUpdated;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inToCreateUpdated the inToCreateUpdated to set
    */
    public void setInToCreateUpdated(Long inToCreateUpdated) {
        this.inParameters.add("toCreateUpdated");
        this.inToCreateUpdated = inToCreateUpdated;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inToRemoveAlreadyDeleted the inToRemoveAlreadyDeleted to set
    */
    public void setInToRemoveAlreadyDeleted(Long inToRemoveAlreadyDeleted) {
        this.inParameters.add("toRemoveAlreadyDeleted");
        this.inToRemoveAlreadyDeleted = inToRemoveAlreadyDeleted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inToRemoveDeleted the inToRemoveDeleted to set
    */
    public void setInToRemoveDeleted(Long inToRemoveDeleted) {
        this.inParameters.add("toRemoveDeleted");
        this.inToRemoveDeleted = inToRemoveDeleted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inToStoreInserted the inToStoreInserted to set
    */
    public void setInToStoreInserted(Long inToStoreInserted) {
        this.inParameters.add("toStoreInserted");
        this.inToStoreInserted = inToStoreInserted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inToStoreNotUpdated the inToStoreNotUpdated to set
    */
    public void setInToStoreNotUpdated(Long inToStoreNotUpdated) {
        this.inParameters.add("toStoreNotUpdated");
        this.inToStoreNotUpdated = inToStoreNotUpdated;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inToStoreUpdated the inToStoreUpdated to set
    */
    public void setInToStoreUpdated(Long inToStoreUpdated) {
        this.inParameters.add("toStoreUpdated");
        this.inToStoreUpdated = inToStoreUpdated;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTotalRowsExported the inTotalRowsExported to set
    */
    public void setInTotalRowsExported(Long inTotalRowsExported) {
        this.inParameters.add("totalRowsExported");
        this.inTotalRowsExported = inTotalRowsExported;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTotalRowsToCreate the inTotalRowsToCreate to set
    */
    public void setInTotalRowsToCreate(Long inTotalRowsToCreate) {
        this.inParameters.add("totalRowsToCreate");
        this.inTotalRowsToCreate = inTotalRowsToCreate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTotalRowsToRemove the inTotalRowsToRemove to set
    */
    public void setInTotalRowsToRemove(Long inTotalRowsToRemove) {
        this.inParameters.add("totalRowsToRemove");
        this.inTotalRowsToRemove = inTotalRowsToRemove;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTotalRowsToStore the inTotalRowsToStore to set
    */
    public void setInTotalRowsToStore(Long inTotalRowsToStore) {
        this.inParameters.add("totalRowsToStore");
        this.inTotalRowsToStore = inTotalRowsToStore;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTotalSplits the inTotalSplits to set
    */
    public void setInTotalSplits(Long inTotalSplits) {
        this.inParameters.add("totalSplits");
        this.inTotalSplits = inTotalSplits;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTotalStoreCalls the inTotalStoreCalls to set
    */
    public void setInTotalStoreCalls(Long inTotalStoreCalls) {
        this.inParameters.add("totalStoreCalls");
        this.inTotalStoreCalls = inTotalStoreCalls;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("beginningSynchTime")) mapValue.put("beginningSynchTime", getInBeginningSynchTime());
        if (inParameters.contains("entitySyncId")) mapValue.put("entitySyncId", getInEntitySyncId());
        if (inParameters.contains("lastCandidateEndTime")) mapValue.put("lastCandidateEndTime", getInLastCandidateEndTime());
        if (inParameters.contains("lastSplitStartTime")) mapValue.put("lastSplitStartTime", getInLastSplitStartTime());
        if (inParameters.contains("lastSuccessfulSynchTime")) mapValue.put("lastSuccessfulSynchTime", getInLastSuccessfulSynchTime());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("perSplitMaxItems")) mapValue.put("perSplitMaxItems", getInPerSplitMaxItems());
        if (inParameters.contains("perSplitMaxMillis")) mapValue.put("perSplitMaxMillis", getInPerSplitMaxMillis());
        if (inParameters.contains("perSplitMinItems")) mapValue.put("perSplitMinItems", getInPerSplitMinItems());
        if (inParameters.contains("perSplitMinMillis")) mapValue.put("perSplitMinMillis", getInPerSplitMinMillis());
        if (inParameters.contains("runStatusId")) mapValue.put("runStatusId", getInRunStatusId());
        if (inParameters.contains("runningTimeMillis")) mapValue.put("runningTimeMillis", getInRunningTimeMillis());
        if (inParameters.contains("startDate")) mapValue.put("startDate", getInStartDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("toCreateInserted")) mapValue.put("toCreateInserted", getInToCreateInserted());
        if (inParameters.contains("toCreateNotUpdated")) mapValue.put("toCreateNotUpdated", getInToCreateNotUpdated());
        if (inParameters.contains("toCreateUpdated")) mapValue.put("toCreateUpdated", getInToCreateUpdated());
        if (inParameters.contains("toRemoveAlreadyDeleted")) mapValue.put("toRemoveAlreadyDeleted", getInToRemoveAlreadyDeleted());
        if (inParameters.contains("toRemoveDeleted")) mapValue.put("toRemoveDeleted", getInToRemoveDeleted());
        if (inParameters.contains("toStoreInserted")) mapValue.put("toStoreInserted", getInToStoreInserted());
        if (inParameters.contains("toStoreNotUpdated")) mapValue.put("toStoreNotUpdated", getInToStoreNotUpdated());
        if (inParameters.contains("toStoreUpdated")) mapValue.put("toStoreUpdated", getInToStoreUpdated());
        if (inParameters.contains("totalRowsExported")) mapValue.put("totalRowsExported", getInTotalRowsExported());
        if (inParameters.contains("totalRowsToCreate")) mapValue.put("totalRowsToCreate", getInTotalRowsToCreate());
        if (inParameters.contains("totalRowsToRemove")) mapValue.put("totalRowsToRemove", getInTotalRowsToRemove());
        if (inParameters.contains("totalRowsToStore")) mapValue.put("totalRowsToStore", getInTotalRowsToStore());
        if (inParameters.contains("totalSplits")) mapValue.put("totalSplits", getInTotalSplits());
        if (inParameters.contains("totalStoreCalls")) mapValue.put("totalStoreCalls", getInTotalStoreCalls());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("beginningSynchTime")) setInBeginningSynchTime((Timestamp) mapValue.get("beginningSynchTime"));
        if (mapValue.containsKey("entitySyncId")) setInEntitySyncId((String) mapValue.get("entitySyncId"));
        if (mapValue.containsKey("lastCandidateEndTime")) setInLastCandidateEndTime((Timestamp) mapValue.get("lastCandidateEndTime"));
        if (mapValue.containsKey("lastSplitStartTime")) setInLastSplitStartTime((Long) mapValue.get("lastSplitStartTime"));
        if (mapValue.containsKey("lastSuccessfulSynchTime")) setInLastSuccessfulSynchTime((Timestamp) mapValue.get("lastSuccessfulSynchTime"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("perSplitMaxItems")) setInPerSplitMaxItems((Long) mapValue.get("perSplitMaxItems"));
        if (mapValue.containsKey("perSplitMaxMillis")) setInPerSplitMaxMillis((Long) mapValue.get("perSplitMaxMillis"));
        if (mapValue.containsKey("perSplitMinItems")) setInPerSplitMinItems((Long) mapValue.get("perSplitMinItems"));
        if (mapValue.containsKey("perSplitMinMillis")) setInPerSplitMinMillis((Long) mapValue.get("perSplitMinMillis"));
        if (mapValue.containsKey("runStatusId")) setInRunStatusId((String) mapValue.get("runStatusId"));
        if (mapValue.containsKey("runningTimeMillis")) setInRunningTimeMillis((Long) mapValue.get("runningTimeMillis"));
        if (mapValue.containsKey("startDate")) setInStartDate((Timestamp) mapValue.get("startDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("toCreateInserted")) setInToCreateInserted((Long) mapValue.get("toCreateInserted"));
        if (mapValue.containsKey("toCreateNotUpdated")) setInToCreateNotUpdated((Long) mapValue.get("toCreateNotUpdated"));
        if (mapValue.containsKey("toCreateUpdated")) setInToCreateUpdated((Long) mapValue.get("toCreateUpdated"));
        if (mapValue.containsKey("toRemoveAlreadyDeleted")) setInToRemoveAlreadyDeleted((Long) mapValue.get("toRemoveAlreadyDeleted"));
        if (mapValue.containsKey("toRemoveDeleted")) setInToRemoveDeleted((Long) mapValue.get("toRemoveDeleted"));
        if (mapValue.containsKey("toStoreInserted")) setInToStoreInserted((Long) mapValue.get("toStoreInserted"));
        if (mapValue.containsKey("toStoreNotUpdated")) setInToStoreNotUpdated((Long) mapValue.get("toStoreNotUpdated"));
        if (mapValue.containsKey("toStoreUpdated")) setInToStoreUpdated((Long) mapValue.get("toStoreUpdated"));
        if (mapValue.containsKey("totalRowsExported")) setInTotalRowsExported((Long) mapValue.get("totalRowsExported"));
        if (mapValue.containsKey("totalRowsToCreate")) setInTotalRowsToCreate((Long) mapValue.get("totalRowsToCreate"));
        if (mapValue.containsKey("totalRowsToRemove")) setInTotalRowsToRemove((Long) mapValue.get("totalRowsToRemove"));
        if (mapValue.containsKey("totalRowsToStore")) setInTotalRowsToStore((Long) mapValue.get("totalRowsToStore"));
        if (mapValue.containsKey("totalSplits")) setInTotalSplits((Long) mapValue.get("totalSplits"));
        if (mapValue.containsKey("totalStoreCalls")) setInTotalStoreCalls((Long) mapValue.get("totalStoreCalls"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateEntitySyncHistoryService</code> from the input values of the given <code>UpdateEntitySyncHistoryService</code>.
     * @param input a <code>UpdateEntitySyncHistoryService</code>
     */
    public static UpdateEntitySyncHistoryService fromInput(UpdateEntitySyncHistoryService input) {
        UpdateEntitySyncHistoryService service = new UpdateEntitySyncHistoryService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateEntitySyncHistoryService</code> from the output values of the given <code>UpdateEntitySyncHistoryService</code>.
     * @param output a <code>UpdateEntitySyncHistoryService</code>
     */
    public static UpdateEntitySyncHistoryService fromOutput(UpdateEntitySyncHistoryService output) {
        UpdateEntitySyncHistoryService service = new UpdateEntitySyncHistoryService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateEntitySyncHistoryService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateEntitySyncHistoryService fromInput(Map<String, Object> mapValue) {
        UpdateEntitySyncHistoryService service = new UpdateEntitySyncHistoryService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>UpdateEntitySyncHistoryService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateEntitySyncHistoryService fromOutput(Map<String, Object> mapValue) {
        UpdateEntitySyncHistoryService service = new UpdateEntitySyncHistoryService();
        service.putAllOutput(mapValue);
        return service;
    }
}