/*
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the Honest Public License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Honest Public License for more details.
 *
 * You should have received a copy of the Honest Public License
 * along with this program; if not, write to Funambol,
 * 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
 */

package org.opentaps.gwt.crmsfa.partners.client.form;


import com.gwtext.client.widgets.form.TextField;
import org.opentaps.gwt.common.client.UtilUi;
import org.opentaps.gwt.common.client.form.FindPartyForm;
import org.opentaps.gwt.common.client.form.base.SubFormPanel;
import org.opentaps.gwt.common.client.listviews.PartnerListView;

/**
 * A combination of a partners list view and a tabbed form used to filter that list view.
 */
public class FindPartnersForm extends FindPartyForm {

    private TextField partnerNameInput;
    private final PartnerListView partnerListView;

    /**
     * Default constructor.
     */
    public FindPartnersForm() {
        super(UtilUi.MSG.partnerId(), UtilUi.MSG.findPartners());
        partnerListView = new PartnerListView();
        partnerListView.init();
        addListView(partnerListView);
    }

    @Override
    protected void buildFilterByNameTab(SubFormPanel p) {
        partnerNameInput = new TextField(UtilUi.MSG.partnerName(), "partnerName", getInputLength());
        p.addField(partnerNameInput);
    }

    @Override
    protected void filterByNames() {
        partnerListView.filterByPartnerName(partnerNameInput.getText());
    }

}
