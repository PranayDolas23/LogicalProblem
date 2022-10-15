package HasAgetterSetter;

public class Employee1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name n=new Name();
		
		n.setName("Pranay");
		n.setNickName("Dolas");
		
		Mobile m=new Mobile();
		
		m.setFirstNo(7383738378l);
		m.setSecondNo(9897894999l);
		
		Employee1 e=new Employee1();
		
		e.setEid(50);
		e.setEname(n);
		e.setEsalary(45000d);
		e.setEmob(m);
		
		System.out.println(e.getEid());
		System.out.println(e.getName().getName());
		System.out.println(e.getName().getNickName());
		System.out.println(e.getEsalary());
		System.out.println(e.getEmobile().getFirstNo());
		System.out.println(e.getEmobile().getSecondNo());
		

	}

}
