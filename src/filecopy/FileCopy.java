/**
 *  
 */
package filecopy;

import java.io.*; // importing java.io package

/**
 * A class to copy the contents of a source file to a destination file. 
 * It does this by creating a new file if destination file does not exist or overwriting it if it exists
 * It also prints the contents of the source file contents that  are copied as well as the contents of the destination file
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

		FileReader inReader = null; 	// FileReader object to read from source file  
		FileReader outReader = null; 	// FileReader object to read from the destination file  

		FileWriter writer = null;	// FileWriter object to write to destination file
		

		try {
			// Gets the path of the file(source file = inputTextFile.txt) to read
			inReader = new FileReader(System.getProperty("user.dir") + "/src/filecopy/inputTextFile.txt");

			//Creates a new file object which has the following path
			File newFile = new File(System.getProperty("user.dir") + "/src/filecopy/", "outputTextFile.txt");
			
			//Creates a new file which has the path of fileObject
			newFile.createNewFile();
			
			// Gets the path of the file(destination file = outputTextFile.txt) to write
			writer = new FileWriter(newFile.getPath());
			
 			// Declares the variable which is used to read and print from the source file and to write to the destination file
			int inReadChar; 

			System.out.println("Printing Source File Text:");

			// While loop to read the file till the end of the file character is reached
			while ((inReadChar = inReader.read()) != -1) {
				System.out.print((char)inReadChar); // Prints the character that is being written to the destination file
				writer.write((char)inReadChar); // Writes the character to the destination file

			}
			writer.close(); //closes the destination file writer object
			
			
 			System.out.println(" ");
			System.out.println("\nPrinting Destination File Text:");

			// Get the path of the file(destination file = outputTextFile.txt) to read
			outReader = new FileReader(System.getProperty("user.dir") + "/src/filecopy/outputTextFile.txt");

			// Declares the variable which is used to read and print from the destination file
			int outReadChar; 
			
			while ((outReadChar = outReader.read()) != -1) {
				System.out.print((char)outReadChar); // Prints the character that is written to the destination file
			}

		}
		finally {
			if (inReader != null) {
				inReader.close(); //closes the source file reader object
			}
			if (writer != null) {
				writer.close(); //closes the destination file writer object
			}
			if (outReader != null) {
				outReader.close(); //closes the destination file reader object
			}

		}
	}

}
