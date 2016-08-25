/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.radiology.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.openmrs.web.controller.PortletController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for the radiology user options portlet.
 */
@Controller
@RequestMapping("**/userOptions.portlet")
public class UserOptionsPortletController extends PortletController {
    
    
    @Override
    protected void populateModel(HttpServletRequest request, Map<String, Object> model) {
        
        final Map<String, String> dashboardTabs = new HashMap<String, String>();
        dashboardTabs.put("ordersTab", "/module/radiology/radiologyDashboardOrdersTab.htm");
        dashboardTabs.put("reportsTab", "/module/radiology/radiologyDashboardReportsTab.htm");
        dashboardTabs.put("reportTemplatesTab", "/module/radiology/radiologyDashboardReportTemplatesTab.htm");
        model.put("dashboardTabs", dashboardTabs);
    }
}
