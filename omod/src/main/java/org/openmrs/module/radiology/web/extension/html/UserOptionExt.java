/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.radiology.web.extension.html;

import org.openmrs.module.web.extension.UserOptionExtension;

public class UserOptionExt extends UserOptionExtension {
    
    
    @Override
    public String getTabName() {
        return "Radiology";
    }
    
    @Override
    public String getTabId() {
        return "radiologyUserOptions";
    }
    
    @Override
    public String getRequiredPrivilege() {
        return "";
    }
    
    @Override
    public String getPortletUrl() {
        return "userOptions.portlet";
    }
    
    @Override
    public String getPortletParameters() {
        return "";
    }
}
