import java.util.Scanner;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public void setMonth(int month) {
		this.month=month;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void readinput() {
		Scanner keyboard=new Scanner(System.in);
		year=keyboard.nextInt();
		month=keyboard.nextInt();
		day=keyboard.nextInt();
	}
	public void writeOutput() {
		//입력받은 날짜 출력
		System.out.println("<<date>>");
		System.out.println(year+" "+month+" "+day+"\n");
	}
	public int getAge(Date date1) {
		System.out.println("<<age>>");
		return (date1.year-year+1);
	}
}