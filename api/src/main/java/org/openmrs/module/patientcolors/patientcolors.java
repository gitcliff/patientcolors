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
	
	private String description;
	
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return getpatientcolorId();
	}
	
	private Integer getpatientcolorId() {
		// TODO Auto-generated method stub
		return patientcolorId;
	}
	
	@Override
	public void setId(Integer id) {
		setpatientcolorId(id);
		
	}
	
	private void setpatientcolorId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
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
	
}
