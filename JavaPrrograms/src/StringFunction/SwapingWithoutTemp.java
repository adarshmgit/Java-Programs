package StringFunction;

public class SwapingWithoutTemp {
	public static void main(String[] args) {
		
		//Swapping integer value without extra variable
		int a=10,b=20 ;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//swapping string without extra variable
		String s1="hello";
		String s2="boss";
		
		String s3=s1+s2;
		s2=s3.substring(0,s3.length()-s2.length());
		s1=s3.substring(s1.length());
		System.out.println("s2="+s2);
		System.out.println("s1="+s1);
		
	
	}
}
