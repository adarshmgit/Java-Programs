package StringFunction;

import java.util.HashSet;

public class TotalCountOfDuplicateWordsInSentence {

	public static void main(String[] args) {
		String s="Wlcome to india welcome all to india";
		//convert to character array
		 String[] str = s.split(" ");
		//add all the character to hash set
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		//compare each value of hash set with each value of array
		int totalCount=0;
		for(String setString:set) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(setString.equals(str[i])) {
					count++;
				}	
			}
			if(count>1) {
				totalCount++;
			}
		}
		System.out.println(totalCount);
		

	}

}
