package Constructor2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		
		s1.rollno=10;
		s1.name="Pranay";
		s1.city="Pune";
		
		Student s2=new Student();
		s2.rollno=20;
		s2.name="PKD";
		s2.city="Mumbai";
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.city);
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println(s2.city);

	}

}
