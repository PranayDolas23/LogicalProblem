package HasAconstructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s=new Salary(50000,10000);
		
		Employee e=new Employee(10,"XYZ",s,7879787908l);
		
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.esalary.originalSalary);
		System.out.println(e.esalary.extraSalary);
		System.out.println(e.emob);

	}

}
