package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// loc of excel
				File f = new File("E:\\Sharmi\\Storage\\Testing\\target\\testData\\Data.xlsx");
				//read file
						FileInputStream fin = new FileInputStream(f);
						
						Workbook w = new XSSFWorkbook(fin);
						Sheet s = w.getSheet("Login");
//						Row r = s.getRow(3);
//						Cell c = r.getCell(3);
//						System.out.println(c);
//						int a = s.getPhysicalNumberOfRows();
//						System.out.println("Physical Number of Rows:"+a);
					//	
					//
//						int b = r.getPhysicalNumberOfCells();
//						System.out.println("Physical Number of Cells:"+b);
						//format 
						for (int i = 0;i<s.getPhysicalNumberOfRows() ; i++) {
							Row r = s.getRow(i);

							for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
								Cell c = r.getCell(j);
								int cellType = c.getCellType();
								if (cellType==1) {
									String value = c.getStringCellValue();
									System.out.println(value);

								}
								else if (DateUtil.isCellDateFormatted(c)) {
									Date d = c.getDateCellValue();
									SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
									String value = sim.format(d);
									System.out.println(value);
								}
								else {
									double d = c.getNumericCellValue();
									long l = (long)d;
									String value = String.valueOf(l);
									System.out.println(value);
								}
							}
						}



	}
}

