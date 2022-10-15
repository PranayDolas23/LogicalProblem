package Constructor2;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
		//	System.out.printf("%d * %d = %d \n ", num,i,num*i);
			
			fact *=i;
		}
		
		System.out.printf("factorial of %d = %d ",num,fact);

	}

}
