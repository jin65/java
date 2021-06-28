import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab02_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fileIn=null;
		String sentence;
		try 
		{
			fileIn=new Scanner(
				new FileInputStream("C:\\Users\\USER\\Desktop\\eclipse_work\\lab02\\src\\lab02_3.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
		sentence=fileIn.nextLine();
		int position=sentence.indexOf("hate");
		String ending=sentence.substring(position+"hate".length());
		
		sentence=sentence.substring(0,position)+"love"+ending;
		System.out.println(sentence);
		fileIn.close();

	}

}
