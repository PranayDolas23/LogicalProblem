package Reverse;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=764;
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		System.out.println(sum);

	}

}
