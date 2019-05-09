package org.openmrs.module.patientcolors.api.db;

import java.util.List;

import org.openmrs.api.db.DAOException;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.patientcolors.patientcolors;
import org.openmrs.module.patientcolors.api.dao.PatientcolorsDao;
import org.springframework.stereotype.Repository;

@Repository
public class HibernatepatientcolorsDao implements PatientcolorsDao {
	

	private DbSessionFactory sessionFactory;
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(DbSessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public DbSessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<patientcolors> getAllpatientcolors() throws DAOException {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(patientcolors.class).list();
	}
	
	@Override
	public patientcolors getpatientcolor(Integer patientcolorId) throws DAOException {
		// TODO Auto-generated method stub
		return (patientcolors) sessionFactory.getCurrentSession().get(patientcolors.class, patientcolorId);
	}
	
	@Override
	public PatientcolorsDao savepatientcolor(PatientcolorsDao patientcolorId) throws DAOException {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(patientcolorId);
		return patientcolorId;
	}
	
	@Override
	public void purgepatientcolor(PatientcolorsDao patientcolor) throws DAOException {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(patientcolor);
		
	}
	
}
