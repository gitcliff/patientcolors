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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<patientcolors> getpatientcolor(Integer patientcolorsId) throws DAOException {
		
		return (List<patientcolors>) sessionFactory.getCurrentSession().get(patientcolors.class, patientcolorsId);
	}
	
	@Override
	public patientcolors savepatientcolor(patientcolors patientcolorss) throws DAOException {
		
		sessionFactory.getCurrentSession().save(patientcolorss);
		return patientcolorss;
	}
	
	@Override
	public patientcolors purgepatientcolor(patientcolors patientcolor) throws DAOException {
		
		sessionFactory.getCurrentSession().delete(patientcolor);
		return patientcolor;
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<patientcolors> getAllpatientcolors(String string, int patientId, int patientcolorsId) throws DAOException {
		
		return sessionFactory.getCurrentSession().createCriteria(patientcolors.class).list();
	}
	
	@Override
	public Integer purgepatientcolor(Integer patientcolorId) throws DAOException {
		sessionFactory.getCurrentSession().delete(patientcolorId);
		return patientcolorId;
	}
	
}
