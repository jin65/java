import java.util.Scanner;
public class Administrator extends SalariedEmployee{
	private String _title;
	private String _area;
	private String _supervisorName;
	public Administrator() {
		super();
		_title="notitle";
		_area="noarea";
		_supervisorName="nosupervisorname";
	}
	public Administrator(String theName, Date theDate, double theSalary, String title, String area, String supervisorname) {
		super(theName, theDate, theSalary);
		_title=title;
		_area=area;
		_supervisorName=supervisorname;
	}
	public Administrator(Administrator other) {
		super(other);
		_title=other._title;
		_area=other._area;
		_supervisorName=other._supervisorName;
	}
	public String getTitle() {
		return _title;
	}
	public String getArea() {
		return _area;
	}
	public String getSupervisorsName() {
		return _supervisorName;
	}
	public void setTitle(String _title) {
		this._title=_title;
	}
	public void setArea(String _area) {
		this._area=_area;
	}
	public void setSupervisorsName(String _supervisorName) {
		this._supervisorName=_supervisorName;
	}
	public void readAdminInfo() {
		Scanner keyboard=new Scanner(System.in);
		Date _hireDate=new Date();
		System.out.println("Enter the name of the administrator:");
		this.setName(keyboard.next());
		System.out.println("Enter the month as a number:");
		_hireDate.setMonth(keyboard.nextInt());
		System.out.println("Enter the day as a number:");
		_hireDate.setDay(keyboard.nextInt());
		System.out.println("Enter the year as a number:");
		_hireDate.setYear(keyboard.nextInt());
		this.setHireDate(_hireDate);
		System.out.println("Enter the Salary as a number:");
		this.setSalary(keyboard.nextDouble());
		System.out.println("Enter the administrator's title:");
		_title=keyboard.next();
		System.out.println("Enter the administrator's area:");
		_area=keyboard.next();
		System.out.println("Enter the administrator's supervisor:");
		_supervisorName=keyboard.next();
	}
	public boolean equals(Object other) {
		Administrator otherAdministrator=(Administrator) other;
		return(getName().equals(otherAdministrator.getName())
				&&getHireDate().equals(otherAdministrator.getHireDate())
				&&getSalary()==otherAdministrator.getSalary()
				&&_title.equals(otherAdministrator._title)
				&&_area.equals(otherAdministrator._area)
				&&_supervisorName.equals(otherAdministrator._supervisorName));
	}
	public String toString() {
		return(getName()+" "+getHireDate().toString()+"\n$"+getSalary()+" per year, "+_title+", "+_area+", supervised by "+_supervisorName);
	}
}
