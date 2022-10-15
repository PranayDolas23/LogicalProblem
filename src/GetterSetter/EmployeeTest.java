package GetterSetter;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		
		e1.setEid(10);
		e1.setEname("ABC");
		e1.setEsalary(35000);
		e1.setEmob(787980);
		
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getEsalary());
		System.out.println(e1.getEmob());
		
		System.out.println(" ");
		
		Employee e2=new Employee();
		
		e2.setEid(20);
		e2.setEname("XYZ");
		e2.setEsalary(45000);
		e2.setEmob(626364);
		
		System.out.println(e2.getEid());
		System.out.println(e2.getEname());
		System.out.println(e2.getEsalary());
		System.out.println(e2.getEmob());
	}

}
