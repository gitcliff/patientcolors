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
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * This class configured as controller using annotation and mapped with the URL of
 * 'module/${rootArtifactid}/${rootArtifactid}Link.form'. /
 */
@Controller
public class PatientcolorsController {
	
	/** Logger for this class and subclasses */
	protected final Logger log = LoggerFactory.getLogger(PatientcolorsController.class);
	
	@RequestMapping(value = "/module/patientcolors/patientcolors.form", method = RequestMethod.GET)
	public ModelAndView displaycolor(ModelMap map) {
		Collection<Patient> patients = Context.getPatientService().getAllPatients();
		map.addAttribute("patients", patients);
		
		ModelAndView modelAndView = new ModelAndView("/module/patientcolors/patientcolors");
		return modelAndView;
	}
	
	@RequestMapping(value = "/module/patientcolors/patientcolors.form", method = RequestMethod.POST)
	public String addcolor(@ModelAttribute("patientcolorss") patientcolors patientcolorss, BindingResult errors,
	        ModelMap model, SessionStatus status) throws IOException {
		
		if (errors.hasErrors()) {
			return "/module/patientcolors/patientcolors.form";
		} else {
			
			Context.getService(PatientcolorsService.class).savepatientcolor(patientcolorss);
			Collection<Patient> patients = Context.getPatientService().getAllPatients();
			
			model.addAttribute("patient", patients);
			model.addAttribute("patientId", patientcolorss.getPatientId());
			model.addAttribute("name", patientcolorss.getName());
			model.addAttribute("msg", "Color added successfully");
			status.setComplete();
			return "redirect:/module/patientcolors/successviewcolor";
		}
	}
	
	@RequestMapping(value = "/module/patientcolors/successviewcolor", method = RequestMethod.GET)
	public String successviewcolor() {
		return "/module/patientcolors/viewpatientcolors";
	}
}
