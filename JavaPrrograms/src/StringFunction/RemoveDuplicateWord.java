package StringFunction;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String s="Welcome to india, welcome to all";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);	
		}
		for(String s1:set) {
			System.out.println(s1);
		}

	}

}
