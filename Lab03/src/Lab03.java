import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab03 {
	/*static void ex1() {
		Date date1=new Date();
		Date date2=new Date();
		System.out.println("생년월일을 입력하세요");
		date1.readinput();
		System.out.println("오늘날짜를 입력하세요");
		date2.readinput();
		System.out.println(date1.getAge(date2));
	}*/
	static void ex2() {
		WordCount wordcount=new WordCount();
		Scanner scn= new Scanner(System.in);
		String sentence=scn.nextLine();
		String delimeter=" ";
		StringTokenizer st=new StringTokenizer(sentence, delimeter);
		wordcount.resetCounter();
		int check1=st.countTokens();

		for(int i=0; i<check1; i++) {
			String check=st.nextToken();
			if(check.charAt(0)=='a') {
				wordcount.increaseCounter();
			}
			else if(check.charAt(0)=='A') {
				wordcount.increaseCounter();
			}
		}
		System.out.println(wordcount.toString());
		scn.close();
	}
	
	static void ex3() {
		System.out.println("input score");
		System.out.println("input form: quiz1 quiz2 quiz3 midterm final");
		int a=0, b=0, c=0, d=0, e=0;
		Scanner scn=new Scanner(System.in);
		StudentRecord record=new StudentRecord(a, b, c, d, e);
		record.computeNumericScore();
		record.computeLetterGrade();
		System.out.println(record.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex1();
		//ex2();
		ex3();

	}
}
