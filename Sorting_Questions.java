package codes;

public class Sorting_Questions {
	
	
//	Question 1 : Given an integer array, arr move all 0's to the end of it wile maintaining the relative order of the non-zero elements. 
	
	public static void main(String[] args) {
		
		int [] arr = {0,5,0,3,4,2};
		questionMove0s(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
	
	static void questionMove0s(int [] arr) {
		int n = arr.length;
		for (int i =0; i<n-1; i++) {
			for (int j=0; j<n-i-1; j++) {
				
				if (arr[j] == 0 && arr[j+1] !=0 ) {
					
					
					// SWAP arr[j], arr[j+1]
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
	}
	
	
//	Question 2 : Give an array of names of the fruits; you are supposed to sort it in lexicographical Order using the Selection Sort.
	
	public static void main(String[] args) {
		
		String[] fruits = {"kiwi", "apple", "papaya", "mango"};
		sortFruits(fruits);
		for (String val : fruits) {
			System.out.print(val + " ");
		}
		
	}
	
	static void sortFruits(String [] fruits) {
		int n = fruits.length;
		for (int i=0; i<n-1; i++) { // represent the correct index
			int min_index = i;
			for (int j = i+1; j<n; j++ ) {
				if (fruits[j].compareTo(fruits[min_index]) < 0) {
					
					min_index = j;
					
				}
			}
			
			// SWAP FRUITS[min_index],fruits[i]
			
			String temp = fruits[i];
			fruits[i] = fruits[min_index];
			fruits[min_index] = temp;
		}
	}
	
}
