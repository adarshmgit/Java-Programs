package ArrayPrograms;

public class SumOfFirstThreeLargestNumber {

	public static void main(String[] args) {
		// sort in ascending order
		int[] arr= {50,20,30,10,60,40};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=arr.length-1;i>=arr.length-3;i--) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		

	}

}
