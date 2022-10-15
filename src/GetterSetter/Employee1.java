package GetterSetter;

public class Employee1 {
	
	private int eid1;
	private String ename1;
	private double esalary1;
	private long emob1;
	
	public Employee1(int eid1,String ename1,double esalary1,long emob1)
	{
		this.eid1=eid1;
		this.ename1=ename1;
		this.esalary1=esalary1;
		this.emob1=emob1;
	}
	
	public int getEid()
	{
	return eid1;
	}

	public String getEname()
	{
	return ename1;
	}

	public double getEsalary()
	{
	return esalary1;
	}
	public long getEmob()
	{
	return emob1;
	}


}
