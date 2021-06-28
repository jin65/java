import java.util.Scanner;

public class Lab06 {
	static void ex1(String a, String b, String c) {
		int count;
		int ary[];
		String first_input=a;
		int size=Integer.parseInt(first_input);
		ary=new int[size];
		String second_input=b;
		int value=Integer.parseInt(second_input);
		String third_input=c;
		int increase=Integer.parseInt(third_input);
		ary[0]=value;
		for(count=1; count<size; count++) {
			value+=increase;
			ary[count]=value;
		}
		System.out.println("배열인덱스"+" "+"값");
		for(int i=0; i<size; i++) {
			System.out.println(i+"       "+ary[i]);
		}
	}
	static void ex2() {
		Scanner scn=new Scanner(System.in);
		int grade[]=new int[100];
		System.out.println("<과목명 입력>");
		String name=scn.next();
		for(int i=1;i<11; i++) {
			System.out.print("학생"+i+": ");
			grade[i-1]=scn.nextInt();
		}
		GradeBook student= new GradeBook(name, grade);
		
		System.out.println("\n과목평균 = "+student.getAverage());
		System.out.println("최하점수 = "+student.getMinimum());
		System.out.println("최고점수 = "+student.getMaximum()+"\n");
		
		student.outputBarChart();
		scn.close();
	}
	static void ex3() {
		Scanner scn=new Scanner(System.in);
		PartiallyFilledArray ary=new PartiallyFilledArray();
		int menu;
		double input;
		int maxNum=ary.getMaxCapacity();
		int maxElm=ary.getNumberOfElements();
		do {
			System.out.print("<작업 메뉴>\n"+"1.배열에 데이터 입력\n"+"2.데이터 추가\n"+"3.데이터 위치 반환\n"+"4.배열 데이터 출력\n"+"5.종료\n"+"메뉴 선택:");
			menu=scn.nextInt();
			switch(menu) {
				case 1:
					System.out.println("데이터 5개를 입력하세요:");
					for(int i=0; i<5; i++) {
						input=scn.nextDouble();
						ary.add(input);
					}
					break;
				case 2:
					System.out.println("데이터를 입력하세요:");
					input=scn.nextDouble();
					ary.add(input);
					break;
				case 3:
					maxElm=ary.getNumberOfElements();
					System.out.println("데이터를 입력하세요:");
					input=scn.nextDouble();
					for(int i=0; i<maxElm;i++) {
						if(ary.getElement(i)==input)
							System.out.println("위치(index) = "+i);
					}
					break;
				case 4:
					maxNum=ary.getMaxCapacity();
					maxElm=ary.getNumberOfElements();
					System.out.println("배열사이즈:"+maxNum);
					for(int i=0; i<maxElm; i++) {
						System.out.println("ary"+"["+i+"] : "+ary.getElement(i)+" ");
					}
					System.out.println("나머지인덱스: 값이 없습니다");
					break;
			}
		}while(menu!=5);
		System.out.println("종료되었습니다");
		scn.close();
	}
	public static void main(String[] args) {
		String fst_input=args[0];
		String snd_input=args[1];
		String trd_input=args[2];
		ex1(fst_input, snd_input, trd_input);
		//ex2();
		//ex3();
	}

}
