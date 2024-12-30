package dataread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
	int rowcount =	sheet.getLastRowNum();//gets the count of the rows
	int colcount= sheet.getRow(1).getLastCellNum();
	System.out.println("no of rows are"+rowcount);//rows count from 0
	System.out.println("no of cols are "+colcount);//columns count from 1
	
	for (int r=0;r<=rowcount;r++)
	{
	XSSFRow currentrow=	sheet.getRow(r);
		for(int c=0;c<colcount;c++) {
			
			XSSFCell currentcell = currentrow.getCell(c);
			System.out.print(currentcell.toString()+"\t");
			
		}
		System.err.println();
	}
	workbook.close();
	file.close();
	
	}
}
