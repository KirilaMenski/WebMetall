package by.eftech.web_metall.DAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.eftech.web_metall.DAO.IMetallDAO;
import by.eftech.web_metall.entity.Metall;

@Repository
public class MetallDAOImpl implements IMetallDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addMetall(Metall metall) throws SQLException {
		currentSession().save(metall);
	}

	public void editMetall(Metall metall) throws SQLException {
		currentSession().update(metall);
	}

	public void deletMetall(Metall metall) throws SQLException {
		currentSession().delete(metall);
	}

	@SuppressWarnings("unchecked")
	public List<Metall> getAllMetall() throws SQLException {
		List<Metall> allMetall = new ArrayList<Metall>();
		try {
			allMetall = currentSession().createQuery("FROM Metall").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allMetall;
	}
	
	@SuppressWarnings("unchecked")
	public List<Metall> getMetallByTitle(String type_eng) throws SQLException {
		List<Metall> metallByTitle = new ArrayList<Metall>();
		try{
			metallByTitle = currentSession().createQuery("FROM Metall m WHERE m.type_eng = :type_eng").setParameter("type_eng", type_eng).list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return metallByTitle;
	}
	
	@SuppressWarnings("unchecked")
	public List<Metall> getMetallByAlph() throws SQLException {
		List<Metall> titleMetall = new ArrayList<Metall>();
		try{
			titleMetall = currentSession().createQuery("SELECT m FROM Metall m ORDER BY m.title").list();
//			titleMetall = currentSession().createSQLQuery("SELECT type_eng FROM metall ORDER BY type_eng").list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return titleMetall;
	}

	public Metall getMetallById(long id) throws SQLException {
		Metall metallById = null;
		metallById = (Metall) currentSession().get(Metall.class, id);
		return metallById;
	}

	public Session currentSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}

	

	

}
