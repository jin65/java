import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab10_1 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String filename;
		int num;
		System.out.print("파일명을 입력하세요 :");
		filename="./src/"+scn.next();
		System.out.print("검색할 정수 1개를 입력하세요 :");
		num=scn.nextInt();
		Scanner inputStream=null;
		try 
		{
			inputStream=new Scanner(new FileInputStream(filename));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found or could not be opened");
			System.exit(0);
		}
		int count=0;
		int numbers;
		while(inputStream.hasNextInt()) 
		{
			numbers=inputStream.nextInt();
			if(numbers==num)
				count++;
		}
		System.out.println("파일에서 정수"+num+"의 개수= "+count);
		
		inputStream.close();
	}
}
