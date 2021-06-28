import java.util.Scanner;

//import java.util.Scanner;

public class Lab05 {
	static void ex1() {
		BicycleShop shop1=new BicycleShop("Shop01", 0);
		BicycleShop shop2=new BicycleShop("Shop02", 0);
		BicycleShop shop3=new BicycleShop("Shop03", 0);
		
		shop1.sold();
		shop1.sold();
		shop1.sold();
		shop2.sold();
		shop2.sold();
		shop3.sold();
		
		shop1.trackSaleStatus();
		shop2.trackSaleStatus();
		shop3.trackSaleStatus();
		
		System.out.println("현재까지 판매대수 "+BicycleShop.overallSale());
		
	}
	static void ex2() {
		Scanner select=new Scanner(System.in);
		Scanner t1=new Scanner(System.in);
		Scanner t2=new Scanner(System.in);
		Temperature _t1=new Temperature();
		Temperature _t2=new Temperature();
		int menu;
		do {
			System.out.println("<작업 메뉴>\n"+"1.섭씨에서 화씨로 변환\n"+"2.온도 비교\n"+"0.종료\n"+"작업을 선택하세요");
			menu=select.nextInt();
			if(1==menu) {
				System.out.print("섭씨온도를 입력하세요");
				_t1.setValue(t1.nextDouble());
				System.out.println(_t1.toString()+"화씨로"+_t1.getTemperatureFahrenheit()+"입니다");
			}
			else if(2==menu) {
				System.out.print("온도1을 입력하세요");
				_t1.setValue(t1.nextDouble());
				System.out.print("온도2을 입력하세요");
				_t2.setValue(t2.nextDouble());
				if(_t1.equals(_t2))
					System.out.println(_t1.toString()+_t2.getTemperature()+"과 같습니다");
				else if(_t1.isLessThan(_t2))
					System.out.println(_t1.toString()+_t2.getTemperature()+"보다 낮습니다");
				else if(_t1.isGreaterThan(_t2))
					System.out.println(_t1.toString()+_t2.getTemperature()+"보다 높습니다");
			}	
		}while(!(0==menu));
		select.close();
		t1.close();
		t2.close();
	}
	static void ex3() {
			Scanner input=new Scanner(System.in);//fraction_input
			Scanner scn=new Scanner(System.in);//select
			String fraction_input;//분수입력
			String select;//y/n
			Fraction fraction1=new Fraction();
			Fraction fraction2=new Fraction();
			int num1, den1;
			int num2, den2;
			do{
				System.out.print("분수1을 입력하세요: ");
				fraction_input=input.next();
				String cal1[]=fraction_input.split("/");
				num1=Integer.parseInt(cal1[0]);
				den1=Integer.parseInt(cal1[1]);
				fraction1.setNumeration(num1);
				fraction1.setDenominator(den1);
				System.out.print("분수2을 입력하세요: ");
				fraction_input=input.next();
				String cal2[]=fraction_input.split("/");
				num2=Integer.parseInt(cal2[0]);
				den2=Integer.parseInt(cal2[1]);
				fraction2.setNumeration(num2);
				fraction2.setDenominator(den2);

				if(fraction1.equals(fraction2)) {
					fraction1.DisplayFraction();
					System.out.println("같습니다");
				}
				else {
					fraction1.DisplayFraction();
					System.out.println("다릅니다");
				}
				System.out.print("반복수행할까요?(Y or y)? ");
				select=scn.next();
			}while(select.equalsIgnoreCase("y"));
			input.close();
			scn.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex1();
		//ex2();
		ex3();
	}

}