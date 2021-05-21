package StringFunction;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String s="adarsh";
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	    for (int i = 0; i < ch.length; i++) {
	    	    set.add(ch[i]);
		}
	    for (Character character : set) {
	    	System.out.print(character);  
			
		}

	}
}
