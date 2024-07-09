// Write a program to print all natural numbers from 1 to n using recursion:
	
	static void printIncreasing(int n) {
		if (n==1) {
			System.out.println(1);
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}


	// Write a program to print all natural numbers from n to 1 using recursion:
	
	static void printNaturalNumbers(int n) {
		if (n==1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printNaturalNumbers(n-1); 
		
	}


// write a program to find the value of factorial n! ?
	
	static int findFactorial(int n) {
		// base case
		if (n == 0) {
			return 1;
		}
		//smaller problem : recursive work
		int smallAns = findFactorial(n-1);
		// big problem : self work 
		int ans = n * smallAns;
		return ans;
	}

//   Fibonacci Series: 
	
	static int fib(int n) {
		
		// base case 
		
		if (n == 0 || n==1) {
			return n;
			
		}
		
		// smaller problem (sub problem)
		
		int prev = fib(n-1);
		int preprev = fib(n-2);
		
		// self work
		
		return prev + preprev;
		
		
		
		
	}

// Give an integer, find out the sums of its digits using recursion.
	
	static int sum(int n) {
		// base case
		if (n >=0 && n<=9) {
			return n;
		}
		
		// recursive work -> small ans 
		
		int smallAns = sum(n/10);
		
		// self-wrok
		
		int ans = smallAns + n%10;
		
		return ans;
		
	}

//   Retrun the count of digits in a given number n 
	
	static int count(int n) {
		// base case 
		
		if (n>=0 && n<=9) {
			return 1;
		}
		
		// recursive work -> 
		
		int smallCount = count(n/10);
		
		// self work
		
		return smallCount + 1;
		
	}


// Give two nnumbers p and q, find p^q using recursion
	
	static int pow(int p, int q) {
		// base case 
		
		if (q==0) {
			return 1;
		}
		return pow(p, q-1) * p;
	}


//	Given a number num and a value k. print k multiples of num 
	
	static void printMultiples(int n, int k) {
		// base case 
		
		if (k == 1) {
			System.out.println(n);
			return;
		}
		
		// subproblem : recursive work

		printMultiples(n, k-1);
		
		// self work 
		
		System.out.println(n*k);
		
	}












   
	

}
