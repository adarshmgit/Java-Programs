package StringFunction;

import java.util.HashSet;

public class NumberOfOccuranceOfCharacterInAString {

	public static void main(String[] args) {
		String s="adarsh";
		//convert to character array
		char[] ch = s.toCharArray();
		//add all the character to hash set
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		//compare each value of hash set with each value of array
		for(Character setCharacter:set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if(setCharacter==ch[i]) {
					count++;
				}	
			}
			System.out.println(setCharacter+" "+count);
		}
	}

}
