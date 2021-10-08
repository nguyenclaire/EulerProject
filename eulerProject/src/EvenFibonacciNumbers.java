package eulerProjecy;

public class EvenFibonacciNumbers {
	public static void main(String args[]) {
		numbers();
	}
	
	public static int numbers() {
	
	int a = 0;
	int b = 1;
	int c = 0;
	int sum = 0;
	
	while(b < 4000000) {
		if(b % 2 == 0) {
			sum = sum + b;
		}
		c = a + b;
		a = b;
		b = c;
	}
	System.out.println(sum);
	return sum;
	}
}
