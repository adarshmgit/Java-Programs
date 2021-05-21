package StringFunction;

public class ReverseStringUSingcharAtMethod {
	public static void main(String[] args) {
        
		//reverse using charAt method
		String c="welcome";
		String rev3="";
		for(int i=0;i<c.length();i++) {
			rev3=c.charAt(i)+rev3;	
		}
		System.out.println(rev3);
	
		//reverse using charAt & without extra variable
		String d="Hello";
		for(int i=d.length()-1;i>=0;i--) {
			System.out.print(d.charAt(i));
		}
	}

}
