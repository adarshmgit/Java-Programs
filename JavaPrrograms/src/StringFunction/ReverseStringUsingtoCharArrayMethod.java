package StringFunction;

public class ReverseStringUsingtoCharArrayMethod {
	public static void main(String[] args) {
	    
		//concat rev after ch[i]
		String a="Adarsh";
		String rev="";
		char[] ch=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			rev=ch[i]+rev;
		}
		System.out.println(rev);
	    
		//concat rev before ch[i]
		String b="ILOVEYOU";
		String rev2="";
		char[] ch1 =b.toCharArray();
		for(int i=ch1.length-1; i>=0; i--) {
			rev2=rev2+ch1[i];
		}
		System.out.println(rev2);
		
	}

}
