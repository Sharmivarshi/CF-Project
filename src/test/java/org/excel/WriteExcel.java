package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// loc of excel
				File f = new File("E:\\Sharmi\\Storage\\Testing\\target\\testData\\new.xlsx");
				//read file
				boolean a = f.createNewFile();
				System.out.println(a);
				//type of workbook
				Workbook w = new XSSFWorkbook();
				//create new sheet&row&cell
				Sheet s = w.createSheet("Login");
				Row r = s.createRow(1);
				Cell c = r.createCell(0);
				//pass value
				c.setCellValue("sharmi");
				//update
				FileOutputStream fout = new FileOutputStream(f);
				w.write(fout);
				System.out.println("success");
				
	}
}
