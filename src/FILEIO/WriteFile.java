package FILEIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	 public static void main(String[] args) throws IOException {
	        String fileSeparator = System.getProperty("file.separator");
	        String content = "hi hdshraddha "
	        		+ "jd";
	        //absolute file name with path
	        String absoluteFilePath = fileSeparator+"Users"+fileSeparator+"lenovo"+fileSeparator+"test3"+fileSeparator+"1.txt";
	        
	  try (FileWriter writer = new FileWriter(absoluteFilePath);
     		 BufferedWriter bw = new BufferedWriter(writer)) {

     		bw.write(content);

     	} catch (IOException e) {
     		System.err.format("IOException: %s%n", e);
     	}
	  }
}
