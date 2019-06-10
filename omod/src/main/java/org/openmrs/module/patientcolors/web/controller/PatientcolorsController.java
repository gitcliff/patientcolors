/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientcolors.web.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.patientcolors.patientcolors;
import org.openmrs.module.patientcolors.api.PatientcolorsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * This class configured as controller using annotation and mapped with the URL of
 * 'module/${rootArtifactid}/${rootArtifactid}Link.form'.
 */
@Controller
public class PatientcolorsController {
	
	/** Logger for this class and subclasses */
	protected final Logger log = LoggerFactory.getLogger(PatientcolorsController.class);
	
	@RequestMapping(value = "/module/patientcolors/patientcolors.form", method = RequestMethod.GET)
	public ModelAndView formGet(ModelMap map) {
		Collection<Patient> patients = Context.getPatientService().getAllPatients();
		map.addAttribute("patients", patients);
		
		ModelAndView modelAndView = new ModelAndView("/module/patientcolors/patientcolors");
		return modelAndView;
	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/module/patientcolors/patientcolors.form", method = RequestMethod.POST)
	public String formPost(@ModelAttribute("patientcolors") patientcolors patientcolorss, BindingResult errors,
	        ModelMap model, HttpSession session, HttpServletRequest request) throws IOException {
		
		if (errors.hasErrors()) {
			return "/module/patientcolors/patientcolors.form";
		} else {
			patientcolors xxx = new patientcolors();
			
			xxx.setName((String) request.getAttribute("color"));
			String patientid = (String) request.getAttribute("patient_id");
			try {
			xxx.setPatientId(Integer.parseInt(patientid));
			}
			catch (NumberFormatException e) {
				log.info("the exception has been handled");
			}
			Context.getService(PatientcolorsService.class).savepatientcolor(xxx);
			
			Collection<Patient> patients = Context.getPatientService().getAllPatients();
			model.addAttribute("patients", patients);
			
			return "/module/patientcolors/viewpatientcolors";
			
		}
		
	}
}
