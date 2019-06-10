/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientcolors.api.impll;

import java.util.List;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.patientcolors.patientcolors;
import org.openmrs.module.patientcolors.api.PatientcolorsService;
import org.openmrs.module.patientcolors.api.dao.PatientcolorsDao;
import org.springframework.stereotype.Service;

@Service
public class PatientcolorsServiceImpl extends BaseOpenmrsService implements PatientcolorsService {
	
	PatientcolorsDao dao;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(PatientcolorsDao dao) {
		this.dao = dao;
	}
	
	public PatientcolorsDao getDao() {
		return dao;
	}
	
	@Override
	public List<patientcolors> getAllpatientcolrs() {
		
		return dao.getAllpatientcolors();
	}
	
	@Override
	public patientcolors getpatientcolor(Integer patientcolorId) {
		
		return dao.getpatientcolor(patientcolorId);
	}
	
	@Override
	public patientcolors savepatientcolor(patientcolors patientcolor) {
		
		return dao.savepatientcolor(patientcolor);
	}
	
	@Override
	public void purgePatientcolor(patientcolors patientcolor) {
		
		dao.purgepatientcolor(patientcolor);
	}
	
}
