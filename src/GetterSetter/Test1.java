package GetterSetter;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new A();
		A a2=new A();
		
		
		a1.setCount(100);
		a2.setCount(200);
		
		System.out.println(a1.getCount());
		System.out.println(a2.getCount());
		
	}

}
