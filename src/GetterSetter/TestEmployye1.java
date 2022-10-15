package GetterSetter;

public class TestEmployye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e1=new Employee1(10,"ABC",35000,7878787887l);

		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getEsalary());
		System.out.println(e1.getEmob());

		System.out.println("");

		Employee1 e2=new Employee1(20,"PQR",45000,808283845l);

		System.out.println(e2.getEid());
		System.out.println(e2.getEname());
		System.out.println(e2.getEsalary());
		System.out.println(e2.getEmob());


	}

}
