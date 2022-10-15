package HasAconstructor;

public class Employee {
	
	int eid;
	String ename;
	Salary esalary;
	long emob;
	
	public Employee(int eid,String ename,Salary esalary,long emob)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.emob=emob;
	}

}
