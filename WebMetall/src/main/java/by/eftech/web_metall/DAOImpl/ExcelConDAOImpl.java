package by.eftech.web_metall.DAOImpl;

import java.sql.SQLException;

import org.hibernate.Session;

import by.eftech.web_metall.DAO.IExcelConDAO;
import by.eftech.web_metall.entity.Metall;
import by.eftech.web_metall.util.HibernateUtil;

public class ExcelConDAOImpl implements IExcelConDAO{

	public void addToMySQL(Metall metall) throws SQLException {
		Session session = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(metall);
			session.getTransaction().commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session != null && session.isOpen()){
				session.close();
			}
		}
	}

}
