package arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class array_practice_interview {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		Q1. The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
		
		// Read the number of test cases.
//		int T = sc.nextInt();
//		sc.nextLine(); // consume the newline character
//		
//		for (int t = 0; t<T; t++) {
//			// Read the number of elements in the array
//			int n = sc.nextInt();
//			int[] arr = new int[n];
//			
//			// Read the array elements
//			for (int i=0; i<n; i++) {
//				arr[i] = sc.nextInt();
//				
//			}
//			
//			// compute the commulative sum
//			int [] cumSum = computeCumulativeSum(arr);
//			
//			// print the cumulative sum for this test case
//			
//			for (int i= 0; i<n; i++) {
//				System.out.println(cumSum[i]);
//				if (i<n-1) {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//			
//		}
//		sc.close();
//		
//	}
//	
//	
//	public static int[] computeCumulativeSum(int[] arr) {
//		
//		int[] cumSum = new int[arr.length];
//		cumSum[0] = arr[0];
//		for (int i=1; i<arr.length; i++) {
//			cumSum[i] = cumSum[i-1] + arr[i];
//			
//		}
//		return cumSum;
//		
//	}
		
		
		
// Q2. 	The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
		
//		int T = sc.nextInt(); // Number of test cases
//		
//		// Process each test case 
//		for (int t=0; t<T; t++) {
//			int n = sc.nextInt(); // Number of elements in the array
//			int[] arr = new int[n];
//			
//			//Read the array elements
//			for (int i=0; i<n; i++) {
//				arr[i] = sc.nextInt();
//			}
//			
//			// Calculate cumulative sums and collect positive ones
//			ArrayList<Integer> positiveCumulativeSums = new ArrayList<>();
//			int cumulativeSum = 0;
//			for (int i=0; i<n; i++) {
//				cumulativeSum += arr[i];
//				if (cumulativeSum > 0) {
//					positiveCumulativeSums.add(cumulativeSum);
//					
//				}
//			}
//			
//			// Print the positive cumulative Sums
//			
//			for (int sum : positiveCumulativeSums) {
//				System.out.println(sum + " ");
//			}
//			System.out.println();
//			
//		}
//		
//		sc.close();
		
		
// Q3. 	For an array of integers nums, an identical twin is defined as pair (i, j) where nums[i] is equal to nums[j] and i < j.
		
//		int T = sc.nextInt(); // Number of test cases 
//		
//		// Process each test cases 
//		for (int t=0; t<T;t++) {
//			int n = sc.nextInt(); // Number of elements in the Array
//			int[] nums = new int[n];
//			
//			// Read the array elements 
//			for (int i=0; i<n; i++) {
//				nums[i] = sc.nextInt();
//				
//			}
//			
//			// Count identical twins 
//			int count = 0;
//			for (int i=0; i<n; i++) {
//				for (int j = i+1; j<n; j++) {
//					if (nums[i] == nums[j]) {
//						count++;
//					}
//				}
//			}
//			
//			// print the result for this test case 
//			System.out.println(count);
//		}
//		
//		sc.close();
		
		
//	Q4. Given an array of integers, find the elements which have an even number of digits.
		
		int T = sc.nextInt();
		for (int t=0; t<T; t++) { 
			int n = sc.nextInt(); // number of elements in the array
			int[] arr = new int[n];
			
			for (int i=0; i<n; i++) {
				arr[i] = sc.nextInt(); // Read each element
				
			}
			
			List<Integer> result = getElementsWithEvenDigits(arr);
			
			for (int num : result) {
				System.out.print(num + " ");
			}
			
			System.out.println();
			
		}
		sc.close();
		
	}
	
	static List<Integer> getElementsWithEvenDigits(int[] arr){
		
		List<Integer> result = new ArrayList<>();
		
		for (int num : arr) {
			if (hasEvenNumberOfDigits(num)) {
				result.add(num);
			}
		}
		return result;
	}
	
	static boolean hasEvenNumberOfDigits(int num) {
		int digitCount = 0;
		
		while (num!=0) {
			num /= 10;
			digitCount++;
		}
		return digitCount%2 ==0;
	}

}
