
public class Fraction {
	private int numerator;//분자
	private int denominator;//분모
	public Fraction() {
		numerator=0;
		denominator=0;
	}
	public Fraction(int n,int d) {
		numerator=n;
		denominator=d;
	}
	public void setNumeration(int numerator) {
		this.numerator=numerator;
	}
	public void setDenominator(int denominator) {
		this.denominator=denominator;
	}
	public double getDouble() {//분수정보 실수로 리턴
		double a=numerator/(double)denominator;
		return a;
	}
	public void DisplayFraction() {//문자열 출력
		System.out.print("분수1과 분수2의 값은");
	}
	public boolean equals(Fraction a) {//객체비교
		return (this.getDouble()==a.getDouble());
	}
}
