
public class GradeBook {
	private String courseName;
	private int grades[]=new int[10];
	//00-09,10-19,20-29,30-39,40-49,50-59,60-69,70-79,80-89,90-99,100
	public GradeBook(String a, int b[]) {
		this.courseName=a;
		this.grades=b;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void processGrades() {//모두 다 출력
		System.out.println("<"+courseName+">");
		this.outputGrades();
		System.out.println("\n과목평균 = "+this.getAverage());
		System.out.println("최하점수 = "+this.getMinimum());
		System.out.println("최고점수 = "+this.getMaximum()+"\n");
		this.outputBarChart();
	}
	public int getMinimum() {
		int min=grades[0];
		int i;
		for(i=1;i<10; i++) {
			if(min>=grades[i]) {
				min=grades[i];
			}
		}
		return min;
	}
	public int getMaximum() {
		int max=grades[0];
		int i;
		for(i=1; i<10;i++) {
			if(max<grades[i]) {
				max=grades[i];
			}
		}
		return max;
	}
	public double getAverage() {
		int sum=0;
		double average=0;
		for(int i=0; i<10;i++)
			sum+=grades[i];
		average=sum/(double)10;
		return average;
	}
	public void outputBarChart() {//*graph
		int div;
		int num[]=new int[20];
		System.out.println("<성적분포>");
		for(int i=0; i<10; i++) {
			div=grades[i]/10;
			switch(div) {
				case 0:num[0]++;break;
				case 1:num[1]++;break;
				case 2:num[2]++;break;
				case 3:num[3]++;break;
				case 4:num[4]++;break;
				case 5:num[5]++;break;
				case 6:num[6]++;break;
				case 7:num[7]++;break;
				case 8:num[8]++;break;
				case 9:num[9]++;break;
				case 10:num[10]++;break;
			}
		}
		for(int i=0; i<10; i++) {
			System.out.print(i+"0-"+i+"9: ");
			for(int j=0;j<num[i];j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.print("  100: ");
		for(int i=0; i<num[10]; i++)
			System.out.print("*");
	}
	public void outputGrades() {//grade array
		System.out.println("<학생 성적>");
		for(int i=1; i<11; i++) {
			System.out.println("학생"+i+": "+grades[i-1]);
		}
	}
}
