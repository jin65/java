import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab10_1 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String filename;
		int num;
		System.out.print("���ϸ��� �Է��ϼ��� :");
		filename="./src/"+scn.next();
		System.out.print("�˻��� ���� 1���� �Է��ϼ��� :");
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
		System.out.println("���Ͽ��� ����"+num+"�� ����= "+count);
		
		inputStream.close();
	}
}
