package dynamicexcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldatadynamic {
	public static void main(String [] args) throws IOException
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test data\\file.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheet1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no fo rows");
		int noofrows = sc.nextInt();
		System.out.println("enter no of cols");
int noofcols = sc.nextInt();



for (int r=0;r<=noofrows;r++)
{
	XSSFRow currentrow = sheet.createRow(r);
	for(int c=0;c<noofcols;c++) {
		
		XSSFCell currentcell =currentrow.createCell(c);
		currentcell.setCellValue(sc.next());
		
	}
}
workbook.write(file);//attachwork
workbook.close();
file.close();
System.out.println("fiel is created");
	}

}
