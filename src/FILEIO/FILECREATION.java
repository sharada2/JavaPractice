package FILEIO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;  
import java.io.OutputStream;  
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
//import org.apache.poi.ss.usermodel.Sheet;  
//import org.apache.poi.ss.usermodel.Workbook;  
 class FILECREATION {
	 public static void main(String[] args) throws IOException {
	        String fileSeparator = System.getProperty("file.separator");
	        
	        //absolute file name with path
	        String absoluteFilePath = fileSeparator+"Users"+fileSeparator+"lenovo"+fileSeparator+"test3"+fileSeparator+"1.txt";
	        
	         //String absoluteFilePath1 = "lenovo"+fileSeparator+"1.txt";
	        //try {
	        	
	        
	         File file = new File(absoluteFilePath);
	         
	         file.getParentFile().mkdir();
	         file.createNewFile();
	         
	         try (FileWriter writer = new FileWriter(absoluteFilePath);
	        		 BufferedWriter bw = new BufferedWriter(writer)) {

	        		bw.write("Hi shraddha");

	        	} catch (IOException e) {
	        		System.err.format("IOException: %s%n", e);
	        	}
	         
	         //System.out.print(file.getName());
	        
	         
	       
	        //File file = new File("C:\\Directory1");
	        
	        //file.mkdir();
//	        if (!file.exists()) {
//	            if (file.getParentFile().mkdir()) {
//	            	System.out.println(file.getName());
//	            	//File file1 = new File(absoluteFilePath1);
//	                System.out.println("Directory is created!");
//	                if(file.createNewFile()){
//	    	            System.out.println(absoluteFilePath1+" File Created");
//	    	        }else System.out.println("File "+absoluteFilePath1+" already exists");
//	    	        
//	            } else {
//	                System.out.println("Failed to create directory!");
//	            }
//	        }
	       // }catch(Exception e) {
	        //	System.out.print("exception occured" +e);
	        //}
	      
	        //file name only
//	        file = new File("file.txt");
//	        if(file.createNewFile()){
//	            System.out.println("file.txt File Created in Project root directory");
//	        }else System.out.println("File file.txt already exists in the project root directory");
//	        
	        //relative path
	      //  String relativePath = "tmp"+fileSeparator+"file.txt";
	        //file = new File(relativePath);
//	        if(file.createNewFile()){
//	            System.out.println(relativePath+" File Created in Project root directory");
//	        }else System.out.println("File "+relativePath+" already exists in the project root directory");
	    }
}
