package GetterSetter;

public class TestHostel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hostel h1=new Hostel();
		
		h1.setRoomno(20l);
		h1.setStudentnm("ABC");
		h1.setStudentweight(70.70f);
		h1.setYear(2021);
		
		Hostel h2=new Hostel();
		
		h2.setRoomno(50l);
		h2.setStudentnm("XYZ");
		h2.setStudentweight(65.76f);
		h2.setYear(2022);
		
		System.out.println(h1.getRoomno());
		System.out.println(h1.getStudentnm());
		System.out.println(h1.getStudentweight());
		System.out.println(h1.getYear());
		
		System.out.println(h2.getRoomno());
		System.out.println(h2.getStudentnm());
		System.out.println(h2.getStudentweight());
		System.out.println(h2.getYear());
		

	}

}
