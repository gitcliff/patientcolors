package org.openmrs.module.patientcolors;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsData;

public class patientcolors extends BaseOpenmrsData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer patientcolorsId;
	
	private String name;
	
	private Integer patientId;
	
	private String patientname;
	
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
	
	public String getPatientname() {
		return patientname;
	}
	
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	
}
