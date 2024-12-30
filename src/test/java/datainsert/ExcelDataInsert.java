package datainsert;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataInsert {

	public static void main(String[] args) throws IOException  
	
	{
		
	
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet = workbook.createSheet("data");
	
	XSSFRow row1=sheet.createRow(0);
	row1.createCell(0).setCellValue("java");
	row1.createCell(1).setCellValue("1234");
	
	XSSFRow row2= sheet.createRow(1);
	row2.createCell(0).setCellValue("phython");
	row2.createCell(1).setCellValue("321");
	
	FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test Data\\newfile.xlsx");
	
	workbook.write(file);
	workbook.close();
	file.close();
	
	}
}
