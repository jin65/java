import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab02_4 {

	public static void main(String[] args) {
		String a= "aiueo";
		Scanner fileIn=null;
		Scanner input;
		char letter;
		String sentence;
		
		try {
			fileIn=new Scanner(
				new FileInputStream("C:\\Users\\USER\\Desktop\\eclipse_work\\lab02\\src\\lab02_4.txt"));
		}
		catch (FileNotFoundException e){
			System.out.println("File not found.");
			System.exit(0);
		}
		do{
		input=new Scanner(System.in);
		letter=input.next().charAt(0);
		}while(a.indexOf(letter)==0);
		
		while(fileIn.hasNext()){
			sentence=fileIn.next();
			String [] data=sentence.split(" |.");
			for(int i=0; i<data.length; i++) {
				if(data[i].indexOf(letter)==0) {
					System.out.println(data[i]);
				}
			}
		}
		
		input.close();
		fileIn.close();
	}
}
