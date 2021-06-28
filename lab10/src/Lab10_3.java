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
				System.out.print("실수 입력 "+i+":");
				num=scn.nextFloat();
				outputStream.writeFloat(num);
				sum+=num;
			}
			avg=sum/(float)5;
			outputStream.close();
			System.out.println("이진 파일로 출력 완료\n");
			System.out.println("파일 데이터 평균 = "+avg);
		}
		catch(IOException e) {
			System.out.println("Problem with file output.");
		}
	}
}