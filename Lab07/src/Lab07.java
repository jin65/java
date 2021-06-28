
public class Lab07 {

	public static void main(String[] args) {
		Administrator admin1= new Administrator();
		System.out.println("admin1: "+admin1+"\n");
		Administrator admin2=
				new Administrator("Bob", new Date(2,3,1999), 34000, "Vice President", "Human Resources", "joe");
		System.out.println("admin2: "+admin2+"\n");
		
		Administrator admin3=new Administrator(admin2);
		System.out.println("admin3 copy: "+admin3+"\n");
		
		System.out.println("title of admin2: "+admin2.getTitle());
		System.out.println("area : "+admin2.getArea());
		System.out.println("supervisors: "+admin2.getSupervisorsName()+"\n");
		System.out.println("admin2 equal to admin3: "+admin2.equals(admin3));
		System.out.println("admin1 equal to admin3: "+admin1.equals(admin3));
		
		admin1.readAdminInfo();
		System.out.println("admin1: "+admin1);
	}
}
