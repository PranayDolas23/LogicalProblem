package GetterSetter;

public class Employee {
	
	private int eid;
	private String ename;
	private double esalary;
	private long emob;
	
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public long getEmob() {
		return emob;
	}
	public void setEmob(long emob) {
		this.emob = emob;
	}

}
