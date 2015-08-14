package by.eftech.web_metall.util;

import by.eftech.web_metall.DAO.IExcelConDAO;
import by.eftech.web_metall.DAOImpl.ExcelConDAOImpl;

public class Factory {
	private static IExcelConDAO excelDAO = null;
	private static Factory instance = null;
	
	public static synchronized Factory getInstance(){
		if(instance == null){
			instance = new Factory();
		}
		return instance;
	}
	
	public IExcelConDAO getExcelDAO(){
		if(excelDAO == null){
			excelDAO = new ExcelConDAOImpl();
		}
		return excelDAO;
	}
}
