package week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int input=11;
		
		boolean isPrime=true;
		
		for(int i=2;i<=input-1;i++)
		{
			if(input%i==0)
			{
				System.out.println("The number is not prime");
				
				isPrime=false;
				
				break;
			}
					}
		if(isPrime==true)
		{
			System.out.println("The number is Prime");
	}

}
}
