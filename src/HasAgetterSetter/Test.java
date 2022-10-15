package HasAgetterSetter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address adr=new Address();
		
		adr.setCityname("Pune");
		adr.setAreaname("Karvenagar");
		
		Student stu=new Student();
		
		stu.setRollno(10);
		stu.setName("Pranay");
		stu.setAddr(adr);
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr().getAreaname());
		System.out.println(stu.getAddr().getCityname());

	}

}
