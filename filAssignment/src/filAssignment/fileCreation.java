package filAssignment;
import java.io.*;

public class fileCreation {
	
	public static void main(String args[]) {
		String fileSeparator = System.getProperty("file.separator");
		System.out.print("dfgh");
		BufferedReader br = null;
		 try {
			   int strCurrentLine;
			   String absoluteFilePath = fileSeparator+"Users"+fileSeparator+"lenovo"+fileSeparator+"test3"+fileSeparator+"1.txt";
			 
			   br = new BufferedReader(new FileReader(absoluteFilePath));
			   //while ((strCurrentLine = Integer.parseInt(br.readLine())) > 0) {				   	
			        strCurrentLine = Integer.parseInt(br.readLine());
			   		int b = strCurrentLine;
				    System.out.println("dfkl"+b);
				    
			        String absoluteFilePath1 = fileSeparator+"Users"+fileSeparator+"lenovo"+fileSeparator+"test1"+fileSeparator+"1.txt";
			        
			  	  try (FileWriter writer = new FileWriter(absoluteFilePath1);
			       		 BufferedWriter bw = new BufferedWriter(writer)) {
			  		for(int i=0;i< b;i++) {
				    	for(int j=0; j<i;j++) {
				    		bw.write("\t");
				    		}
				    	bw.write("\n");
				    	bw.write("*");
				    }
			       	} catch (IOException e) {
			       		System.err.format("IOException: %s%n", e);
			       	}    
		 }catch(Exception e){
			 
		 }
	}
}