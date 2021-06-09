package ArrayPrograms;

public class PrintSmallestStringFromArray {

	public static void main(String[] args) {
		String[] arr= {"adarsh","hello","hi","worlds"};
		String min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min.length()>arr[i].length()) {
				min=arr[i];
			}	
		}
		System.out.println(min);

	}

}
