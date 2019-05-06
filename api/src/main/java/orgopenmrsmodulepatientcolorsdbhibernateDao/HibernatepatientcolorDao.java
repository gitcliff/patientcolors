package orgopenmrsmodulepatientcolorsdbhibernateDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.api.db.DAOException;
import org.openmrs.module.patientcolors.Item;
import org.openmrs.module.patientcolors.patientcolors;
import org.openmrs.module.patientcolors.api.dao.PatientcolorsDao;

public class HibernatepatientcolorDao implements PatientcolorsDao {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private SessionFactory sessionFactory;
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
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
	public Item getItemByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Item saveItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public PatientcolorsDao savepatientcolor(PatientcolorsDao patientcolorId) throws DAOException {
		// TODO Auto-generated method stub
		((HibernatepatientcolorDao) sessionFactory.getCurrentSession()).savepatientcolor(patientcolorId);
		return patientcolorId;
	}
	
	@Override
	public void purgepatientcolor(PatientcolorsDao patientcolor) throws DAOException {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(patientcolor);
		
	}
	
}
