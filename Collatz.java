public class Collatz{
	public static void main(String[] args){
		int N  = 15;
		collatzChecker(N);
	}

	public static int collatz(int N){
		if(N == 1){ //BASE CASE
			return 1;
		}

		else{
			if(N%2 == 0){
				return collatz(N/2);
			}
			else{
				return collatz(3*N + 1);
			}

		}

	}


	public static void collatzChecker(int N){ //Checks if all digits leading up to N reach 1 using the Recursive method above
		for(int i = 1; i <= N; i++){

			if(collatz(i) == 1){
				System.out.println( "the integer " + i + " reaches 1");	
			}

			else{
				System.out.println("false");
			}
			
		}

	}



}
