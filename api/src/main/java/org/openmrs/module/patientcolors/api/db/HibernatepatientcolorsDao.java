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
		
		return sessionFactory.getCurrentSession().createCriteria(patientcolors.class).list();
	}
	
	@Override
	public patientcolors getpatientcolor(Integer patientcolorsId) throws DAOException {
		
		return (patientcolors) sessionFactory.getCurrentSession().get(patientcolors.class, patientcolorsId);
	}
	
	@Override
	public patientcolors savepatientcolor(patientcolors patientcolorsId) throws DAOException {
		
		sessionFactory.getCurrentSession().save(patientcolorsId);
		return patientcolorsId;
	}
	
	@Override
	public void purgepatientcolor(patientcolors patientcolor) throws DAOException {
		
		sessionFactory.getCurrentSession().delete(patientcolor);
		
	}
	
}
