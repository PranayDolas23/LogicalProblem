package HasAgetterSetter;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s=new Salary();
		s.setOriginalSalary(40000);
		s.setExtraSalary(3000);
		
		Employee e=new Employee();
		
		e.setEid(10);
		e.setEname("Pranay");
		e.setEsalary(s);
		e.setEmob(45464646l);
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getEsalary().getOriginalSalary());
		System.out.println(e.getEsalary().getExtraSalary());
		System.out.println(e.getEmob());

	}

}
