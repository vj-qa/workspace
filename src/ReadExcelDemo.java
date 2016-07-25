package fileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//
		File xlfile = new File ("C:\\Users\\vj\\Desktop\\data.xlsx");
		FileInputStream xldoc = new FileInputStream(xlfile);
		XSSFWorkbook wb = new XSSFWorkbook(xldoc);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int iRowCount = sheet.getLastRowNum()+1;
		int iColumnCount =  sheet.getRow(0).getLastCellNum();
		String[][] xlData = new String[iRowCount][iColumnCount];

			/*
			 * String str1  = sheet.getRow(1).getCell(0).getStringCellValue();
			 * double str1  = sheet.getRow(1).getCell(1).getNumericCellValue();
			 * System.out.println(str1);
			 */
		
		for( int i = 0; i < iRowCount; i++){
			for(int j = 0;j< iColumnCount; j++){
				XSSFCell cell = sheet.getRow(i).getCell(j);
				if (cell.getCellType() == 1){
				xlData[i][j] = String.valueOf (cell);

				}else if ((cell.getCellType() == 0)){
				xlData[i][j] = String.valueOf(Double.valueOf(cell.getNumericCellValue()).intValue());
				}
			}
		}
		
		for( int i = 0; i < iRowCount; i++){
			for(int j = 0;j< iColumnCount; j++){
				System.out.print("\t"+xlData[i][j]);
			}
			System.out.println();
		}
	}

}
