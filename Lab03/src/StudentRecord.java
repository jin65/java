import java.util.Scanner;

public class StudentRecord {
	private int _quiz1;
	private int _quiz2;
	private int _quiz3;
	private int _midterm;
	private int _final;
	private double _numericScore;
	private char _letterGrade;
	final private int A_GRADE=90;
	final private int B_GRADE=80;
	final private int C_GRADE=70;
	final private int D_GRADE=60;
	public StudentRecord(int _quiz1, int _quiz2, int _quiz3, int _midterm, int _final) {
		Scanner scn=new Scanner(System.in);
		_quiz1=scn.nextInt();
		_quiz2=scn.nextInt();
		_quiz3=scn.nextInt();
		_midterm=scn.nextInt();
		_final=scn.nextInt();
		this._quiz1=_quiz1;
		this._quiz2=_quiz2;
		this._quiz3=_quiz3;
		this._midterm=_midterm;
		this._final=_final;
	}
	
	public int getQuiz() {
		return _quiz1;
	}
	public int getQuiz2() {
		return _quiz2;
	}
	public int getQuiz3() {
		return _quiz3;
	}
	public int getMidterm() {	
		return _midterm;
	}
	public int getFinal() {
		return _final;
	}
	public void setQuiz1(int _quiz1) {
		this._quiz1=_quiz1;
	}
	public void setQuiz2(int _quiz2) {
		this._quiz2=_quiz2;
	}
	public void setQuiz3(int _quiz3) {
		this._quiz3=_quiz3;
	}
	public void setMidterm(int _midterm) {
		this._midterm=_midterm;
	}
	public void setFinal(int _final) {
		this._final=_final;
	}
	public void computeNumericScore() {
		//±â¸» 40 Áß°£ 35 ÄûÁî 25
		double quizSum=_quiz1+_quiz2+_quiz3;
		_numericScore=(quizSum/0.3)*0.25+_midterm*0.35+_final*0.4;
	}
	public void computeLetterGrade() {
		if(_numericScore>=A_GRADE)
			_letterGrade='A';
		else if(_numericScore>=B_GRADE&&_numericScore<A_GRADE)
			_letterGrade='B';
		else if(_numericScore>=C_GRADE&&_numericScore<B_GRADE)
			_letterGrade='C';
		else if(_numericScore>=D_GRADE&&_numericScore<C_GRADE)
			_letterGrade='D';
		else
			_letterGrade='F';
	}
	public boolean equals(StudentRecord a) {
		return((_quiz1==a._quiz1)&&(_quiz2==a._quiz2)&&(_quiz3==a._quiz3)&&(_midterm==a._midterm)&&(_final==a._final));
	}
	public String toString() {
		return ("ÄûÁî1: "+_quiz1+" ÄûÁî2: "+_quiz2+" ÄûÁî3: "+_quiz3+" Áß°£: "+_midterm+" ±â¸»: "+_final+"\n"+"¼ºÀû "+_numericScore+"\n"+"µî±Þ "+_letterGrade);
	}
}
