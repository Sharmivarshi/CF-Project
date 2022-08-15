package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadUpdateExcel {

	public static void main(String[] args) throws IOException {
		// loc of excel
		File f = new File("E:\\Sharmi\\Storage\\Testing\\target\\testData\\Data.xlsx");
		//read file
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Login");
		//check the word
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				//find cell type
				int cellType = cell.getCellType();
				if (cellType==1) {
					String value = cell.getStringCellValue();
					if (value.contains("Yogaa")) {
						cell.setCellValue("yogi");
						FileOutputStream fout = new FileOutputStream(f);
						w.write(fout);
						System.out.println("Updated");
					}
					
				}
		

			}
		}
	}
}
