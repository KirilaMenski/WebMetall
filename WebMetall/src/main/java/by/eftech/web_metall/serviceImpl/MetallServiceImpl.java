package by.eftech.web_metall.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.eftech.web_metall.DAO.IMetallDAO;
import by.eftech.web_metall.entity.Metall;
import by.eftech.web_metall.service.IMetallService;

@Service
public class MetallServiceImpl implements IMetallService {

	@Autowired
	private IMetallDAO metallDAO;

	@Transactional
	public void addMetall(Metall metall) throws SQLException {
		metallDAO.addMetall(metall);
	}

	@Transactional
	public void editMetall(Metall metall) throws SQLException {
		metallDAO.editMetall(metall);
	}

	@Transactional
	public void deletMetall(Metall metall) throws SQLException {
		metallDAO.deletMetall(metall);
	}

	@Transactional
	public List<Metall> getAllMetall() throws SQLException {
		List<Metall> allMetall = new ArrayList<Metall>();
		allMetall = metallDAO.getAllMetall();
		return allMetall;
	}

	@Transactional
	public List<Metall> getMetallByTitle(String type_eng) throws SQLException {
		List<Metall> metallByTitle = new ArrayList<Metall>();
		metallByTitle = metallDAO.getMetallByTitle(type_eng);
		return metallByTitle;
	}
	
	@Transactional
	public List<Metall> getMetallByAlph() throws SQLException {
		List<Metall> titleMetall = new ArrayList<Metall>();
		titleMetall = metallDAO.getMetallByAlph();
		return titleMetall;
	}

	@Transactional
	public Metall getMetallById(long id) throws SQLException {
		return metallDAO.getMetallById(id);
	}

	

}
