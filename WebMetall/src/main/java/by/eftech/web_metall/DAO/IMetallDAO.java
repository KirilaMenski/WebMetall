package by.eftech.web_metall.DAO;

import java.sql.SQLException;
import java.util.List;

import by.eftech.web_metall.entity.Metall;

public interface IMetallDAO {
	
	public void addMetall (Metall metall) throws SQLException;
	
	public void editMetall (Metall metall) throws SQLException;
	
	public void deletMetall (Metall metall) throws SQLException;
	
	public List<Metall> getAllMetall () throws SQLException;
	
	public List<Metall> getMetallByTitle (String type_eng) throws SQLException; 
	
	public List<Metall> getMetallByAlph () throws SQLException;
	
	public Metall getMetallById (long id) throws SQLException;

}
