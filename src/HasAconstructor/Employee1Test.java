package HasAconstructor;

public class Employee1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name n=new Name("Pranay","Dolas");
		
		Mobile m=new Mobile(123456789l,987654321l);
		
		Employee1 e=new Employee1(11,n,70000d,m);
		
		System.out.println(e.eid);
		System.out.println(e.ename.name);
		System.out.println(e.ename.nickName);
		System.out.println(e.esalary);
		System.out.println(e.emob.firstMobNo);
		System.out.println(e.emob.secondMobNo);

	}

}
