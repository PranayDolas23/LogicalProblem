package Constructor1;

public class Test {
	
	public static void main(String[] args) {
		
		Student s1=new Student(10,"Pranay");
		
		Student s2=new Student(20,"PKD");
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s2.rollno);
		System.out.println(s2.name);
	}

}
