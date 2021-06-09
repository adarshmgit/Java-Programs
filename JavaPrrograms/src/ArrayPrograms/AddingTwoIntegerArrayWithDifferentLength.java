package ArrayPrograms;

public class AddingTwoIntegerArrayWithDifferentLength {

	public static void main(String[] args) {
		int[] a= {10,15,25};
		int[] b= {22,22,22,22};

		int size=a.length;
		if(size<b.length) {
			size=b.length;
		}
		for (int i = 0; i < size; i++) {
			try {
				System.out.println(a[i]+b[i]);

			} catch (Exception e) {
				try {
					System.out.println(a[i]);

				} catch (Exception e2) {
					System.out.println(b[i]);

				}

			}

		}
	}

}
