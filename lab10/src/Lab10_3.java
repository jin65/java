import java.util.Scanner;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Lab10_3 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		ObjectOutputStream outputStream=null;
		float num;
		float sum=0, avg;
		try {
			outputStream=new ObjectOutputStream(new FileOutputStream("out.dat"));
			for(int i=1; i<=5; i++) {
				System.out.print("�Ǽ� �Է� "+i+":");
				num=scn.nextFloat();
				outputStream.writeFloat(num);
				sum+=num;
			}
			avg=sum/(float)5;
			outputStream.close();
			System.out.println("���� ���Ϸ� ��� �Ϸ�\n");
			System.out.println("���� ������ ��� = "+avg);
		}
		catch(IOException e) {
			System.out.println("Problem with file output.");
		}
	}
}