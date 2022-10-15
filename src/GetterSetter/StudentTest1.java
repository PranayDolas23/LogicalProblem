package GetterSetter;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		
		s1.setRollno(10);
		s2.setRollno(20);
		
		s1.setName("ABC");
		s2.setName("PQR");
		
		System.out.println(s1.getRollno());
		System.out.println(s2.getRollno());
		System.out.println(s1.getName());
		System.out.println(s2.getName());

	}

}
