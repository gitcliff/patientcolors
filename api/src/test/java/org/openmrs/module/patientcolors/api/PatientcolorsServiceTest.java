/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientcolors.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.openmrs.api.UserService;
import org.openmrs.api.context.Context;
import org.openmrs.module.patientcolors.patientcolors;
import org.openmrs.module.patientcolors.api.dao.PatientcolorsDao;
import org.openmrs.test.BaseModuleContextSensitiveTest;

/**
 * This is a unit test, which verifies logic in PatientcolorsService. It doesn't extend
 * BaseModuleContextSensitiveTest, thus it is run without the in-memory DB and Spring context.
 * 
 * @param <PatientcolorsServiceImpll>
 */
public class PatientcolorsServiceTest<PatientcolorsServiceImpll> extends BaseModuleContextSensitiveTest {
	
	@InjectMocks
	PatientcolorsServiceImpll basicModuleService;
	
	@Mock
	PatientcolorsDao dao;
	
	@Mock
	UserService userService;
	
	protected static PatientcolorsService xxx;
	
	@Before
	public void runBeforeAllTests() throws Exception {
		xxx = Context.getService(PatientcolorsService.class);
		
	}
	
	@Test
	public void getAllPatientcolors_shouldNotReturnNull() throws Exception {
		List<patientcolors> www = xxx.getAllpatientcolors();
		assertEquals(0, www.size());
		
	}
	
	@Test
	public void getpatientcolor_shouldReturnNullIfPatientcolorObjectDoesNotExist() throws Exception {
		assertNull(xxx.getpatientcolor(1000));
	}
	
	@Test
	public void getpatientcolor_shouldNotReturnNullIfPatientcolorsIdDoesExist() throws Exception {
		patientcolors vvv = new patientcolors();
		vvv.setId(null);
		vvv.setName("blue");
		vvv.setPatientcolorsId(1);
		vvv.setPatientId(7);
		vvv.setPatientname("john");
		vvv.setUuid(null);
		xxx.savepatientcolor(vvv);
		assertNotNull(vvv);
		
	}
	
	@Test
	public void savepatientcolor_shouldSavePatientcolorsObject() throws Exception {
		patientcolors ttt = new patientcolors();
		ttt.setId(null);
		ttt.setName("green");
		ttt.setPatientcolorsId(2);
		ttt.setPatientId(8);
		ttt.setPatientname("tom");
		ttt.setUuid(null);
		patientcolors hhh = xxx.savepatientcolor(ttt);
		assertNotNull(hhh);
		
	}
	
	@Test
	public void purgepatientcolor_shouldPurgePatientcolorsObject() throws Exception {
		patientcolors ttt = new patientcolors();
		ttt.setId(null);
		ttt.setName("green");
		ttt.setPatientcolorsId(2);
		ttt.setPatientId(8);
		ttt.setPatientname("tom");
		ttt.setUuid(null);
		patientcolors hhh = xxx.savepatientcolor(ttt);
		hhh = dao.purgepatientcolor(hhh);
		assertNull(hhh);
		
	}
	
	@Test
	public void purgepatientcolor_shouldPurgePatientcolorsByPatientcolorsId() throws Exception {
		patientcolors ttt = new patientcolors();
		ttt.setId(null);
		ttt.setName("green");
		ttt.setPatientcolorsId(2);
		ttt.setPatientId(8);
		ttt.setPatientname("tom");
		ttt.setUuid(null);
		xxx.savepatientcolor(ttt);
		Integer hhhh = dao.purgepatientcolor(2);
		assertNotNull(hhhh);
		
	}
}
