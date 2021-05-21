package StringFunction;

public class ReverseASentenceWithExtraVariable {

	public static void main(String[] args) {
//		String s="My name is Adarsh";
//		String rev="";
//		String[] str = s.split(" ");
//		for(int i=0;i<str.length;i++) {
//			rev=str[i]+" "+rev;
//		}
//		System.out.println(rev);
//        
		String s="I am spider";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}

}
