package HasAgetterSetter;

public class Employee1 {
	
	private int eid;
	private Name ename;
	private double esalary;
	private Mobile emob;
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	
	public Name getName()
	{
		return ename;
	}
	
	public void setEname(Name ename)
	{
		this.ename=ename;
	}
	
	public double getEsalary()
	{
		return esalary;
	}
	
	public void setEsalary(double esalary)
	{
		this.esalary=esalary;
	}
	
	public Mobile getEmobile()
	{
		return emob;
	}

	public void setEmob(Mobile emob)
	{
		this.emob=emob;
	}
}
