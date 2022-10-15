package HasA;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address adr=new Address();
		
		adr.areaname="XYZ";
		adr.cityname="Pune";
		
		Student stu=new Student();
		
		stu.rollno=10;
		stu.name="ABC";
		stu.addr=adr;
		
		System.out.println(stu.rollno);
		System.out.println(stu.name);
		System.out.println(stu.addr.cityname);
		System.out.println(stu.addr.areaname);

	}

}
