package org.openmrs.module.patientcolors;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.openmrs.BaseOpenmrsData;

@Entity
@Table(name = "patients_colors")
public class patientcolors extends BaseOpenmrsData implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@JoinColumn(name = "patient_colors_id", nullable = false)
	@Access(AccessType.PROPERTY)
	private Integer patientcolorsId;
	
	private String name;
	
	private Integer patientId;
	
	private String patientname;
	
	//private Integer id;
	
	//private Boolean voided = Boolean.FALSE;
	
	//private User voidedBy;
	
	//private String voidReason;
	
	//private Date dateVoided;
	
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
		
		return getPatientcolorsId();
	}
	
	public Integer getPatientId() {
		return patientId;
	}
	
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	
	@Override
	public void setId(Integer arg0) {
		setPatientcolorsId(arg0);
	}
	
	public String getPatientname() {
		return patientname;
	}
	
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	
}
