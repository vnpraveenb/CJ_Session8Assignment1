/**
 * NOTE: Delete the contents of the outputTextFile.txt before running the program
 */
package filecopy;

import java.io.*; // importing java.io package

/**
 * A class to copy the contents of a source file to a destination file. 
 * It also prints the contents of the source file check what contents are copied.
 * ram
 * @author Praveen
 * 
 */
public class FileCopy {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 FileReader reader = null; 	// FileReader object to read from a file  
	     FileWriter writer = null;	// FileWriter object to write to a file
  
	     try {
	    	  // Get the path of the file to read
	    	  reader = new FileReader(System.getProperty("user.dir") + "/src/filecopy/inputTextFile.txt");
	    	 
	    	  // Gets the path of the file to write
	    	  writer = new FileWriter(System.getProperty("user.dir")+ "/src/filecopy/outputTextFile.txt");
	         
	    	  // Declares the variable which is used to read from the source file and write to the destination file
	          int readChar; 
	          
	          // While loop to read the file till the end of the file character is reached
	          while ((readChar = reader.read()) != -1) {
	            writer.write((char)readChar); // Writes the character to the destination file
	            System.out.print((char)readChar); // Prints the character that is written to the destination file
	         }
	      }
	      finally {
	         if (reader != null) {
	        	 reader.close(); //closes the reader object
	         }
	         if (writer != null) {
	        	 writer.close(); //closes the writer object
	         }
      
	      }
	}

}
