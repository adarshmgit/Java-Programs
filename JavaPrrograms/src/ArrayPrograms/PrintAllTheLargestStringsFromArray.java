package ArrayPrograms;

public class PrintAllTheLargestStringsFromArray {

	public static void main(String[] args) {
		String[] arr= {"adarsh","rocket","hello","hi","hu","worlds"};
		String max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max.length()<=arr[i].length()) {
				//if(max.length()==arr[i].length()) {
					System.out.println(arr[i]);
				//}	
	         	max=arr[i];
			}	
		}
		//System.out.println(max);

	}

}
