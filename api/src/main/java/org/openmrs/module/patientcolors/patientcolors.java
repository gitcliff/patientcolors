package org.openmrs.module.patientcolors;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsObject;

public class patientcolors extends BaseOpenmrsObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer patientcolorId;
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPatientcolorId() {
		return patientcolorId;
	}
	
	public void setPatientcolorId(Integer patientcolorId) {
		this.patientcolorId = patientcolorId;
	}
	
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setId(Integer arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
