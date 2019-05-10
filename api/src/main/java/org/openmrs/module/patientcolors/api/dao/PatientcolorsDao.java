/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientcolors.api.dao;

import java.util.List;

import org.openmrs.api.db.DAOException;
import org.openmrs.module.patientcolors.patientcolors;

public interface PatientcolorsDao {
	
	public patientcolors getpatientcolor(Integer patientcolorId) throws DAOException;
	
	public List<patientcolors> getAllpatientcolors() throws DAOException;
	
	public PatientcolorsDao savepatientcolor(PatientcolorsDao patientcolorId) throws DAOException;
	
	public void purgepatientcolor(PatientcolorsDao patientcolor) throws DAOException;
	
}
