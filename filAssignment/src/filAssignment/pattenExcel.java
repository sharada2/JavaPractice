package filAssignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class pattenExcel {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		String fileSeparator = System.getProperty("file.separator");
		int strCurrentLine;
		HSSFWorkbook workbook = new HSSFWorkbook();
		//Workbook wb = new Workbook();
		HSSFSheet sh = workbook.createSheet("java");
		BufferedReader br =null;
		   String absoluteFilePath = fileSeparator+"Users"+fileSeparator+"lenovo"+fileSeparator+"test3"+fileSeparator+"1.txt";
		 
		   br = new BufferedReader(new FileReader(absoluteFilePath));
		   //while ((strCurrentLine = Integer.parseInt(br.readLine())) > 0) {				   	
		        strCurrentLine = Integer.parseInt(br.readLine());
		   		int b = strCurrentLine;
		   		
		   		int rowCount = 0;
				for(int i=0;i< b; i++) {
					Row rw = sh.createRow(rowCount++);
					int colCount = 0 ;
					for(int j =0;j<b;j++) {
						Cell cl = rw.createCell(colCount++);
						if(rowCount == colCount) {
							cl.setCellValue("*");				
						}
					}
				}
				try(FileOutputStream fo = new  FileOutputStream("test9-9.xls")){
					workbook.write(fo);
					fo.close();
				}catch(Exception e) {
					System.out.print("fefwe");
				}finally {
					workbook.close();
				}
			}
	}
	


