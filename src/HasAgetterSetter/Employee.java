package HasAgetterSetter;

public class Employee {
	
	int eid;
	String ename;
	Salary esalary;
	long emob;
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public int getEid()
	{
		return eid;
	}
	
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname()
	{
		return ename;
	}
	
	public void setEsalary(Salary esalary)
	{
		this.esalary=esalary;
	}
	public Salary getEsalary()
	{
		return esalary;
	}
	
	public void setEmob(long emob)
	{
		this.emob=emob;
	}
	public long getEmob()
	{
		return emob;
	}

}
