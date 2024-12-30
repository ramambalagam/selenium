package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	public static FileOutputStream fo;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;


	public static int getRowCount(String xlfile, String xlsheet) throws IOException {

		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws= wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();

		wb.close();
		fi.close();
		return rowcount;
	}

	public static int getcellcount(String xlfile, String xlsheet, int rownumber) throws IOException {

		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int cellcount = ws.getRow(rownumber).getLastCellNum();


		wb.close();
		fi.close();

		return cellcount;

	}
	public static String getcellData(String xlfile, String xlsheet, int rownumer, int cellnumber ) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownumer);
		cell = row.getCell(cellnumber);

		String data;
		try {
			//data = cell.toString();
			DataFormatter formatter = new DataFormatter();

			data = formatter.formatCellValue(cell);

		}
		catch(Exception e)
		{
			data ="";
		}

		wb.close();
		fi.close();
		return data;
	}



	public static void setCellData(String xlfile, String xlsheet, int rownumber, int cellnumber, String data) throws IOException {

		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownumber);
		cell = row.createCell(cellnumber);
		cell.setCellValue(data);


		fo = new FileOutputStream(xlfile);
		wb.write(fo);

		wb.close();
		fi.close();
		fo.close();

}
}




