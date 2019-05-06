/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientcolors.api.impl;

import java.util.List;

import org.openmrs.api.APIException;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.patientcolors.Item;
import org.openmrs.module.patientcolors.patientcolors;
import org.openmrs.module.patientcolors.api.PatientcolorsService;
import org.openmrs.module.patientcolors.api.dao.PatientcolorsDao;

public class PatientcolorsServiceImpl extends BaseOpenmrsService implements PatientcolorsService {
	
	PatientcolorsDao dao;
	
	UserService userService;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(PatientcolorsDao dao) {
		this.dao = dao;
	}
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public Item getItemByUuid(String uuid) throws APIException {
		return dao.getItemByUuid(uuid);
	}
	
	@Override
	public Item saveItem(Item item) throws APIException {
		if (item.getOwner() == null) {
			item.setOwner(userService.getUser(1));
		}
		
		return dao.saveItem(item);
	}
	
	@Override
	public List<patientcolors> getAllpatientcolrs() {
		// TODO Auto-generated method stub
		return dao.getAllpatientcolors();
	}
	
	@Override
	public patientcolors getpatientcolor(Integer patientcolorId) {
		// TODO Auto-generated method stub
		return dao.getpatientcolor(patientcolorId);
	}
	
	@Override
	public patientcolors savePatientcolor(patientcolors patientcolor) {
		// TODO Auto-generated method stub
		return ((PatientcolorsService) dao).savePatientcolor(patientcolor);
	}
	
	@Override
	public void purgePatientcolor(patientcolors patientcolor) {
		// TODO Auto-generated method stub
		((PatientcolorsService) dao).purgePatientcolor(patientcolor);
	}
}
