package arrays;

public class Bubble_Sort_Algorithim {
	public static void main(String[] args) {
		
		int [] a = {7,6,5,4,3};
		bubbleSort(a);
		for (int i:a) {
			System.out.print(i + " ");
		}
		
	}
	
	static void bubbleSort(int[] a) {
		int n = a.length;
		
		// n-1 iteration/passes 
		for (int i=0; i<n-1;i++) {
			for (int j=0; j<n-i-1;j++) {
				
				/*
				 * last i elements are already at correct sorted positions,
				 * so no need to check them
				 * 
				 */
				
				if (a[j]> a[j+1]) {
					// swap - a[j], a[j+1]
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
	}

}
