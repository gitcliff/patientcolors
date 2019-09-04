package org.openmrs.module.patientcolors.web.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.patientcolors.patientcolors;
import org.openmrs.module.patientcolors.api.PatientcolorsService;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.DefaultRepresentation;
import org.openmrs.module.webservices.rest.web.representation.FullRepresentation;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DataDelegatingCrudResource;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

@Resource(name = RestConstants.VERSION_1 + "/patientcolors", supportedClass = patientcolors.class, supportedOpenmrsVersions = "1.8.*")
public class PatientcolorsResource extends DataDelegatingCrudResource<patientcolors> {
	
	@Override
	public DelegatingResourceDescription getRepresentationDescription(Representation rep) {
		if (rep instanceof DefaultRepresentation) {
			DelegatingResourceDescription description = new DelegatingResourceDescription();
			description.addProperty("uuid");
			description.addProperty("name");
			description.addProperty("patientname");
			description.addSelfLink();
			description.addLink("full", ".?v=" + RestConstants.REPRESENTATION_FULL);
			return description;
		} else if (rep instanceof FullRepresentation) {
			DelegatingResourceDescription description = new DelegatingResourceDescription();
			description.addProperty("uuid");
			description.addProperty("name");
			description.addProperty("patientname");
			description.addProperty("auditInfo");
			description.addSelfLink();
			return description;
		}
		return null;
	}
	
	@Override
	public patientcolors getByUniqueId(String string) {
		
		return null;
	}
	
	@Override
	public patientcolors save(patientcolors delegate) {
		// TODO Auto-generated method stub
		return Context.getService(PatientcolorsService.class).savepatientcolor(delegate);
		
	}
	
	@Override
	protected void delete(patientcolors delegate, String reason, RequestContext context) throws ResponseException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void purge(patientcolors delegate, RequestContext context) throws ResponseException {
		
		if (delegate == null) {
			// DELETE is idempotent, so we return success here
			return;
		}
		Context.getService(PatientcolorsService.class).purgePatientcolor(delegate);
		
	}
	
	@Override
	public patientcolors newDelegate() {
		
		return new patientcolors();
	}
	
}
