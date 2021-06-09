package ArrayPrograms;

public class PrintAllTheSmallestStringFromArray {

	public static void main(String[] args) {
		String[] arr= {"adarsh","rocket","hello","hi","hu","worlds","aa"};
		String min=arr[3];
		for (int i = 0; i < arr.length; i++) {
			if(min.length()>=arr[i].length()) {
				if(min.length()==arr[i].length()) {
					System.out.println(arr[i]);
				}	
	         	min=arr[i];
			}	
		}
	}

}
