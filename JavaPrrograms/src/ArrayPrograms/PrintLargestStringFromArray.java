package ArrayPrograms;

public class PrintLargestStringFromArray {

	public static void main(String[] args) {
		String[] arr= {"adarsh","hello","hi","worlds"};
		String max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max.length()<arr[i].length()) {
				max=arr[i];
			}	
		}
		System.out.println(max);	
	}

}
