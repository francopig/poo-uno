package fizzbuzz;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		
		//opcion 1

		for(int i= 1; i<= 100; i++) {
			
			if( (i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			}else if ( i % 3 == 0) {
				System.out.println("Fizz");
			}else if ( i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
		
		
		//opcion 2
		
		for (int i= 1; i<= 100; i++) {
			
			String valor = Integer.toString(i);
			if(i%3 == 0) valor = "Fizz";
			if(i%5 == 0) valor = "Buzz";
			if(i%15 == 0) valor = "FizzBuzz";
			System.out.println(valor);
		}
		
		
		
	}
}
