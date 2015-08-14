package by.eftech.web_metall.DAO;

import java.sql.SQLException;

import by.eftech.web_metall.entity.Metall;

public interface IExcelConDAO {
	
	public void addToMySQL(Metall metall) throws SQLException;

}
