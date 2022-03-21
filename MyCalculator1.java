package week1.day2;

public class MyCalculator1 {
	
	public static void main(String[] args) {
		MyCalculator mycal = new MyCalculator();
		int sum = mycal.add(100, 200,300);
		int sub=mycal.sub(90,52);
		double mul=mycal.multiply(20.2,90.6);
		float mod=mycal.modulo(20.3f,80.7f);
		float div=mycal.divide(80.7f,20.3f);
		
		System.out.println("the sum of two numbers is "+sum);
	    System.out.println("the difference of two numbers is"+sub);
		System.out.println("the multiplication of two numbers is "+mul);
		System.out.println("The modulo of two numbers is "+mod);
		System.out.println("The division of two numbers is "+div);

	}


}
