package HasA;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s=new Salary();
		
		s.originalSalary=45000;
		s.extraSalary=5000;
		
		Employee e=new Employee();
		
		e.eid=10;
		e.ename="ABC";
		e.esalary=s;
		e.emob=45464546;
		
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.esalary.originalSalary);
		System.out.println(e.esalary.extraSalary);
		System.out.println(e.emob);

	}

}
