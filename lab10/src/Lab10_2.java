import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Lab10_2 {

	public static void main(String[] args) {
		PrintWriter outputStream;
		BufferedReader inputStream=null;
		try {
			inputStream=new BufferedReader(new FileReader("./src/file2.txt"));
			outputStream=new PrintWriter(new FileWriter("./src/file1.txt", true));
			String line=inputStream.readLine();
			while(line!=null){
				outputStream.println(line);
				line=inputStream.readLine();
			}
			
			inputStream.close();
			outputStream.close();
			System.out.println("appending complete");
		}
		catch(FileNotFoundException e){
			System.out.println("File not found or could not open.");
			System.exit(0);
		}
		catch(IOException e) {
			System.out.println("error:reading/writing txtfile.");
			System.exit(0);
		}
	}
}
