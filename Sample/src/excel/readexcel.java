package excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		File file1 = new File("C:\\Selenium\\Projects\\Sample\\src\\excel\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(file1);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Details = wb.getSheetAt(0);
		int rowcount = Details.getLastRowNum();
		rowcount = rowcount+1;
		System.out.println(rowcount);
		
		for(int rn=1;rn<=rowcount;rn++) {
		
		System.out.println("=========");
		
		String Firstname = Details.getRow(rn).getCell(0).getStringCellValue();
		System.out.println(Firstname);
		String Surname = Details.getRow(rn).getCell(1).getStringCellValue();
		System.out.println(Surname);
		String Pass = Details.getRow(rn).getCell(2).getStringCellValue();
		System.out.println(Pass);
		int Birthday = (int) Details.getRow(rn).getCell(3).getNumericCellValue();
		System.out.println(Birthday);
		String Birthmonth = Details.getRow(rn).getCell(4).getStringCellValue();
		System.out.println(Birthmonth);
		String Birthyear = Details.getRow(rn).getCell(5).getRawValue();
		System.out.println(Birthyear);
		
		}
		
		wb.close();
}
}

