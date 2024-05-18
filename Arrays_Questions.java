package arrays;

import java.util.Scanner;

public class Arrays_Questions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//Q1 : 
		
//		int T = sc.nextInt();
//		for (int t=0; t<T;t++) {
//			int n = sc.nextInt();
//			int[] arr = new int[n];
//			for (int i=0; i<n; i++) {
//				arr[i] = sc.nextInt();
//			}
//			
//			int[] cumSum = getCumulativeSum(arr);
//			for (int i = 0; i<n; i++) {
//				System.out.print(cumSum[i] + " ");
//				
//			}
//			System.out.println();
//			
//		}
//		sc.close();
		
		
		// Q2:
		
		// int T = sc.nextInt();
		// for (int t=0; t<T; t++) {
		// 	int n = sc.nextInt();
		// 	int [] arr = new int[n];
		// 	for (int i=0; i<n; i++) {
		// 		arr[i] = sc.nextInt();
		// 	}
			
		// 	printPositiveCumulativeSum(arr);
			
		// }
		// sc.close();
		// }
	
//	Q1. The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
	
//	private static int[] getCumulativeSum(int[] arr) {
//		int[] cumSum = new int[arr.length];
//		cumSum[0] = arr[0];
//		for (int i=1; i<arr.length; i++) {
//			cumSum[i] = cumSum[i-1] + arr[i];
//			
//		}
//		return cumSum;
		
	
	
	
//	Q2. The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
	// private static void printPositiveCumulativeSum(int[] arr) {
	// 	int sum=0;
	// 	for(int i=0; i<arr.length; i++) {
	// 		sum+=arr[i];
	// 		if(sum>0) {
	// 			System.out.print(sum + " ");
	// 		} else {
	// 			sum=0;
	// 		}
		
	// }
	// 	System.out.println();


// 		// Q4. Count The number of Occurences of a particular element x
	
// 			public static void countnumber (int [] arr, int x) {
				
// 				int count = 0;
				
// 				for (int i=0 ; i<arr.length; i++) {
// 					if (x== arr[i]) {
// 						count++;
// 					}
// 				}
// 				System.out.println(count);
				
		
// 	}
	
// }

		//	Q2. Find the Last occurrence of an element x in a given array
//	
//	public static void lastelement (int [] arr, int x) {
//		int lastindex = -1;
//		for (int i =0; i<arr.length;i++) {
//			if (arr[i]==x) {
//				lastindex = i;
//			}
//			
//		}
//		System.out.println(lastindex);
//		}
	
//	Q3. Count the number of elements strictly greater than value x;
//	
//	public static void greater(int [] arr, int x) {
//		int count = 0;
//		for (int i = 0; i<arr.length; i++) {
//			if (x<arr[i]) {
//				count++;
//			}
//		}
//		System.out.println(count);
//		
//	}
	
//	Q4. check if the given array is sorted or not 
	
//	public static boolean isSorted(int []arr) {
//		boolean check = true;
//		for (int i=1; i<arr.length; i++) {
//			if (arr[i] < arr[i-1]) {
//				// not sorted 
//				check = false;
//				break;
//			}
//		}
//		return check;
//			
//	}



		// Q5. Find the total number of pairs in the array whose sum is equal to the given value x;
	
//	public static void sum(int [] arr, int x) {
//		
//		int ans = 0;
//		for (int i =0; i<arr.length; i++) {
//			for (int j=i+1; j<arr.length; j++) {
//				if (arr[i] + arr[j] == x) {
//					ans++;
//				}
//				
//			}
//			
//			
//		}
//		System.out.println(ans);
//		
//		
//		
//		
//	}
	
//	Q6. Find the unique number in a given Array where all the elements are being repeated twice with one value being unique.
	
//	public static void unique(int [] arr) {
//		for (int i=0; i<arr.length;i++) {
//			for (int j=i+1; j<arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					arr[i] = -1;
//					arr[j] = -1;
//					
//				}
//			}
//		}
//		
//		 int ans =-1;
//		 for (int i=0; i<arr.length;i++) {
//			 if (arr[i]>0) {
//				 ans = arr[i];
//				 
//			 }
//		 }
//		 System.out.println(ans);
//		
//	}
	
//	Q7. Find the largest number 
	
//	public static void Largest(int []arr) {
//		int max =  Integer.MIN_VALUE;
//		for (int i=0; i<arr.length; i++) {
//			if (arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		
//		System.out.println(max);


	}

}
