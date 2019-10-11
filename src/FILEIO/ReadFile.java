package FILEIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	 public static void main(String[] args) throws IOException {
		 String fileSeparator = System.getProperty("file.separator");
	       
		 BufferedReader objReader = null;
		  try {
		   String strCurrentLine;
		   String absoluteFilePath = fileSeparator+"Users"+fileSeparator+"lenovo"+fileSeparator+"test3"+fileSeparator+"1.txt";

		   objReader = new BufferedReader(new FileReader(absoluteFilePath));

		   while ((strCurrentLine = objReader.readLine()) != null) {

		    System.out.println(strCurrentLine);
		   }

		  } catch (IOException e) {

		   e.printStackTrace();

		  } 
	  }

}
