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
		System.out.println("�迭�ε���"+" "+"��");
		for(int i=0; i<size; i++) {
			System.out.println(i+"       "+ary[i]);
		}
	}
	static void ex2() {
		Scanner scn=new Scanner(System.in);
		int grade[]=new int[100];
		System.out.println("<����� �Է�>");
		String name=scn.next();
		for(int i=1;i<11; i++) {
			System.out.print("�л�"+i+": ");
			grade[i-1]=scn.nextInt();
		}
		GradeBook student= new GradeBook(name, grade);
		
		System.out.println("\n������� = "+student.getAverage());
		System.out.println("�������� = "+student.getMinimum());
		System.out.println("�ְ����� = "+student.getMaximum()+"\n");
		
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
			System.out.print("<�۾� �޴�>\n"+"1.�迭�� ������ �Է�\n"+"2.������ �߰�\n"+"3.������ ��ġ ��ȯ\n"+"4.�迭 ������ ���\n"+"5.����\n"+"�޴� ����:");
			menu=scn.nextInt();
			switch(menu) {
				case 1:
					System.out.println("������ 5���� �Է��ϼ���:");
					for(int i=0; i<5; i++) {
						input=scn.nextDouble();
						ary.add(input);
					}
					break;
				case 2:
					System.out.println("�����͸� �Է��ϼ���:");
					input=scn.nextDouble();
					ary.add(input);
					break;
				case 3:
					maxElm=ary.getNumberOfElements();
					System.out.println("�����͸� �Է��ϼ���:");
					input=scn.nextDouble();
					for(int i=0; i<maxElm;i++) {
						if(ary.getElement(i)==input)
							System.out.println("��ġ(index) = "+i);
					}
					break;
				case 4:
					maxNum=ary.getMaxCapacity();
					maxElm=ary.getNumberOfElements();
					System.out.println("�迭������:"+maxNum);
					for(int i=0; i<maxElm; i++) {
						System.out.println("ary"+"["+i+"] : "+ary.getElement(i)+" ");
					}
					System.out.println("�������ε���: ���� �����ϴ�");
					break;
			}
		}while(menu!=5);
		System.out.println("����Ǿ����ϴ�");
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
