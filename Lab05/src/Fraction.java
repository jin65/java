
public class Fraction {
	private int numerator;//����
	private int denominator;//�и�
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
	public double getDouble() {//�м����� �Ǽ��� ����
		double a=numerator/(double)denominator;
		return a;
	}
	public void DisplayFraction() {//���ڿ� ���
		System.out.print("�м�1�� �м�2�� ����");
	}
	public boolean equals(Fraction a) {//��ü��
		return (this.getDouble()==a.getDouble());
	}
}
