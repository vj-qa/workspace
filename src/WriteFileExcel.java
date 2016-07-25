package fileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFileExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * To read a table	
		 */
		//	String dtTablePath= "C:\\Users\\vj\\Desktop\\data.xlsx";

		/*
		 * TO write to a single cell
		 */
		//	writeToExcel(dtTablePath, "Sheet2", 0,0,"Hi Madhu!");

		/*
		 * To write object data to a new file
		 */

		/*Object[][] data= new Object[3][3];
		data[0][0] = "Name";
		data[0][1]= "Id";
		data[0][2] = "Age";
		data[1][0]= "Madhu";
		data[1][1] = 1;
		data[1][2]= 35;
		data[2][0] = "Vijay";
		data[2][1]= 2;
		data[2][2]= 42;


		String dtTablePath = writeDataToExcel("Sheet1", data);
		String[][] recData = readExcel(dtTablePath, "POI");




		for( int i = 0; i < recData.length; i++){
			for(int j = 0;j< recData[i].length; j++){
				System.out.print("\t"+recData[i][j]);
			}
			System.out.println();
		}*/

		/*
		 * To compare 2 files
		 */
		String dtTablePath1= "C:\\Users\\vj\\Desktop\\data.xlsx";
		String dtTablePath2= "C:\\Users\\vj\\Desktop\\poi-test.xlsx";
		compareFiles(dtTablePath1, "Sheet1", dtTablePath2, "POI");
		System.out.println("Finished comparing....results marked in color");

	}

	private static void compareFiles(String dtTablePath1, String sheetA, String dtTablePath2, String sheetB) throws IOException {
		// TODO Auto-generated method stub


		File xlfile1 = new File (dtTablePath1);
		FileInputStream xldoc1 = new FileInputStream(xlfile1);

		File xlfile2 = new File (dtTablePath2);
		FileInputStream xldoc2 = new FileInputStream(xlfile2);

		XSSFWorkbook wb1 = new XSSFWorkbook(xldoc1);
		XSSFWorkbook wb2 = new XSSFWorkbook(xldoc2);

		XSSFSheet sheet1 = wb1.getSheet(sheetA);
		XSSFSheet sheet2 = wb2.getSheet(sheetB);


		int iRowCount = sheet1.getLastRowNum()+1;
		int iColumnCount =  sheet1.getRow(0).getLastCellNum();


		for( int i = 0; i < iRowCount; i++){
			for(int j = 0;j< iColumnCount; j++){
				XSSFCell cell1 = sheet1.getRow(i).getCell(j);
				XSSFCell cell2 = sheet2.getRow(i).getCell(j);
				if (cell1.getCellType() == 1 ){
					if(cell1.getStringCellValue().equals(cell2.getStringCellValue())){
						System.out.println("Comparing "+cell1.getStringCellValue()+ " with "+cell1.getStringCellValue());
						XSSFCellStyle titleStyle = wb2.createCellStyle();
						titleStyle.setFillForegroundColor(
								HSSFColor.LIGHT_GREEN.index );
						titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
						cell2.setCellStyle(titleStyle);

					}else if (cell1.getStringCellValue() != cell2.getStringCellValue()){
						System.out.println("Comparing "+cell1.getStringCellValue()+ " with "+cell1.getStringCellValue());
						XSSFCellStyle titleStyle = wb2.createCellStyle();
						titleStyle.setFillForegroundColor(
								HSSFColor.RED.index );
						titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);

						cell2.setCellStyle(titleStyle);
					}
				}
				else if (cell1.getCellType() == 0){
					if(cell1.getNumericCellValue()==cell2.getNumericCellValue()){
						System.out.println("Comparing "+cell1.getNumericCellValue()+ " with "+cell2.getNumericCellValue());
						XSSFCellStyle titleStyle = wb2.createCellStyle();
						titleStyle.setFillForegroundColor(
								HSSFColor.LIGHT_GREEN.index );
						titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);

						cell2.setCellStyle(titleStyle);
					}else if (cell1.getNumericCellValue() != cell2.getNumericCellValue()){
						System.out.println("Comparing "+cell1.getNumericCellValue()+ " with "+cell2.getNumericCellValue());
						XSSFCellStyle titleStyle = wb2.createCellStyle();
						titleStyle.setFillForegroundColor(
								HSSFColor.RED.index );
						titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);

						cell2.setCellStyle(titleStyle);
					}
				}

			}


		}
		FileOutputStream fout = new FileOutputStream(dtTablePath2);
		wb2.write(fout);
		fout.flush();
		fout.close();


	}

	static String[][] readExcel(String dtTablePath, String sheetname) throws IOException{
		File xlfile = new File (dtTablePath);
		FileInputStream xldoc = new FileInputStream(xlfile);
		XSSFWorkbook wb = new XSSFWorkbook(xldoc);
		XSSFSheet sheet = wb.getSheet(sheetname);
		int iRowCount = sheet.getLastRowNum()+1;
		int iColumnCount =  sheet.getRow(0).getLastCellNum();
		String[][] xlData = new String[iRowCount][iColumnCount];

				for( int i = 0; i < iRowCount; i++){
			for(int j = 0;j< iColumnCount; j++){
				XSSFCell cell = sheet.getRow(i).getCell(j);
				if (cell.getCellType() == 1){
					xlData[i][j] = String.valueOf(cell);

				}else if ((cell.getCellType() == 0)){
					xlData[i][j] = String.valueOf(Double.valueOf(cell.getNumericCellValue()).intValue());
				}
			}
		}
		// sheet.getPhysicalNumberOfRows();
		//int iColCount = sheet.getRow(0).getLastCellNum()
		return xlData;
	}


	private static void writeToExcel(String dtTablePath, String sheetname, int rownum, int cellnum, String input) throws IOException {
		// TODO Auto-generated method stub

		File xlFile = new File(dtTablePath);
		FileInputStream xlDoc = new FileInputStream(xlFile);
		XSSFWorkbook wb = new XSSFWorkbook(xlDoc);
		XSSFSheet sheet = wb.getSheet(sheetname);
		sheet.createRow(rownum);
		XSSFRow XSSFRow= sheet.getRow(rownum);
		XSSFCell cell 
		= XSSFRow.createCell(cellnum, XSSFCell.CELL_TYPE_STRING) ;
		cell.setCellValue(input);
		XSSFCellStyle titleStyle = wb.createCellStyle();
		titleStyle.setFillForegroundColor(
				HSSFColor.RED.index );
		titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);

		cell.setCellStyle(titleStyle);
		FileOutputStream fout = new FileOutputStream(dtTablePath);
		wb.write(fout);
		fout.flush();
		fout.close();
	}


	private static String writeDataToExcel(String sheetname, Object[][] input) throws IOException {
		// TODO Auto-generated method stub
		String dtTablePath = "C:\\Users\\vj\\Desktop\\poi-test.xls";

		//Create new xldoc

		FileOutputStream fout = new FileOutputStream(dtTablePath);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("POI");



		for( int i = 0; i < input.length; i++){
			sheet.createRow(i);
			XSSFRow XSSFRow= sheet.getRow(i);
			for(int j = 0;j< input[i].length; j++){


				if (input[i][j] instanceof Integer) {
					XSSFCell cell = XSSFRow.createCell(j, XSSFCell.CELL_TYPE_NUMERIC) ;
					cell.setCellValue((Integer) input[i][j]);

				}else if (input[i][j] instanceof String) {
					XSSFCell cell = XSSFRow.createCell(j, XSSFCell.CELL_TYPE_STRING) ;
					cell.setCellValue((String) input[i][j]);
				}
			}
		}

		wb.write(fout);
		fout.flush();
		fout.close();
		return dtTablePath;

	}
}


