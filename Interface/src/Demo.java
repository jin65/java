import java.util.Scanner;

public class Demo {
	static void demo1(){
		int width, height;
		Scanner scn=new Scanner(System.in);
		System.out.print("r1�� ���� ���� ũ�� �Է�:");
		width=scn.nextInt();
		height=scn.nextInt();
		Rectangle r1=new Rectangle(width, height);
		System.out.print("r2�� ���� ���� ũ�� �Է�:");
		width=scn.nextInt();
		height=scn.nextInt();
		Rectangle r2=new Rectangle(width, height);
		System.out.println("r1�� ����:"+r1.area());
		System.out.println("r2�� ����:"+r2.area());
		switch(r1.compareTo(r2)) {
		case 1:System.out.println("r1�� r2���� ũ��"); break;
		case 0:System.out.println("r1�� r2�� ������ ����"); break;
		case -1:System.out.println("r1�� r2���� �۴�"); break;
		}
		scn.close();
	}
	static void demo2() {
		int size, menu=0, item;
		Scanner scn=new Scanner(System.in);
		System.out.print("�迭 ũ�� �Է�>>");
		size=scn.nextInt();
		IStack stack=new IStack(size);
		while(menu!=4) {
			System.out.print("\n�޴�: 1.push 2.pop 3.���� stack 4.exit>>");
			menu=scn.nextInt();
			switch(menu) {
			case 1:
				System.out.print("push�� ���� �Է�:");
				item=scn.nextInt();
				stack.push(item);
				break;
			case 2:
				System.out.println("pop data:"+stack.pop());
				break;
			case 3:
				stack.stackPrint();
				break;
			case 4:
				System.out.println("terminated");
				break;
			}
		}
		scn.close();
	}
	static void demo3() {
		Date d=new Date(1,22,2004);
		System.out.println("The date is: "+d);
		
		Date otherD=(Date)d.clone();
		System.out.println("The cloned date is: "+otherD);
		
		Person p=new Person("Test Person", new Date(1,1,1900),null);
		System.out.println("The person is: "+ p);
		
		Person other=(Person)p.clone();
		System.out.println("The cloned person is: "+ other);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		demo3();
	}

}
