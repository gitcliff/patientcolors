package org.openmrs.module.patientcolors;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsObject;

public class patientcolors extends BaseOpenmrsObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer patientcolorsId;
	
	private String name;
	
	private Integer patientId;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPatientcolorsId() {
		return patientcolorsId;
	}
	
	public void setPatientcolorsId(Integer patientcolorsId) {
		this.patientcolorsId = patientcolorsId;
	}
	
	@Override
	public Integer getId() {
		
		return null;
	}
	
	public Integer getPatientId() {
		return patientId;
	}
	
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	
	@Override
	public void setId(Integer arg0) {
		
	}
	
}
