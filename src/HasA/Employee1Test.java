package HasA;

public class Employee1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name n=new Name();
		
		n.name="Pranay";
		n.nickName="XYZ";
		
		Mobile m=new Mobile();
		
		m.firstMobNo=785657857d;
		m.secondMobNo=897484793d;
		
		Employee1 e=new Employee1();
		
		e.eid=10;
		e.ename=n;
		e.esalary=45000d;
		e.emob=m;
		
		System.out.println("eId = "+e.eid);
		System.out.println("eName = "+e.ename.name);
		System.out.println("eNickname = "+e.ename.nickName);
		System.out.println("eSalary = "+e.esalary);
		System.out.println("eFisrtMobile = "+e.emob.firstMobNo);
		System.out.println("eSecondMobile = "+e.emob.secondMobNo);
		

	}

}
