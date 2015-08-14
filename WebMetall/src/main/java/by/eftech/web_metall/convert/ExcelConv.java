package by.eftech.web_metall.convert;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import by.eftech.web_metall.entity.Metall;
import by.eftech.web_metall.util.Factory;

public class ExcelConv {

	static Metall metall = new Metall();

	public static void convert(String name) {
		InputStream in = null;
		HSSFWorkbook wb = null;
		try {
			in = new FileInputStream(name);
			wb = new HSSFWorkbook(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Sheet sheet = wb.getSheetAt(0);

		for (int i = 1; i <= sheet.getPhysicalNumberOfRows(); i++) {
			Row rowSheet = sheet.getRow(i);
			rowSheet.getCell(1);

			try {
				metall.setType(rowSheet.getCell(0) + "");
				metall.setType_eng(rowSheet.getCell(1) + "");
				metall.setTitle(rowSheet.getCell(2) + "");
				metall.setGost(rowSheet.getCell(3) + "");
				metall.setSize(rowSheet.getCell(4) + "");
				metall.setModel(rowSheet.getCell(5) + "");
				metall.setLength(rowSheet.getCell(6) + "");
				metall.setPrice(Double.parseDouble(rowSheet.getCell(7) + ""));
				metall.setK(rowSheet.getCell(8) + "");

				Factory.getInstance().getExcelDAO().addToMySQL(metall);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
