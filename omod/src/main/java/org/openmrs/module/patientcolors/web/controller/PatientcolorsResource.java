package org.openmrs.module.patientcolors.web.controller;

import org.openmrs.module.patientcolors.patientcolors;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DataDelegatingCrudResource;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

@Resource(name = RestConstants.VERSION_1 + "/patientcolors", supportedClass = patientcolors.class, supportedOpenmrsVersions = "1.8.*")
public class PatientcolorsResource extends DataDelegatingCrudResource<patientcolors> {
	
	@Override
	public DelegatingResourceDescription getRepresentationDescription(Representation rep) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public patientcolors getByUniqueId(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public patientcolors save(patientcolors delegate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected void delete(patientcolors delegate, String reason, RequestContext context) throws ResponseException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void purge(patientcolors delegate, RequestContext context) throws ResponseException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public patientcolors newDelegate() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
