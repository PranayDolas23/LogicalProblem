package HasAconstructor;

public class Test {
	
	public static void main(String[] args) {
		
		Address ad=new Address("Pune","Karvenagar");
		
		Student stu=new Student(10,"XYZ" , ad);
				
	    System.out.println(stu.rollno);
		System.out.println(stu.name);
		System.out.println(stu.addr.cityname);
		System.out.println(stu.addr.areaname);
	}

}
