
public class MultiplesOf3and5 {
	public static void main(String[] args) {
		System.out.print(multiplesOf3and5());
	}
	
	public static int multiplesOf3and5() {
	int sum = 0;
	for(int i = 0; i < 1000; i++) {
		if((i % 3 == 0) || (i  % 5 == 0)) {
			sum = i + sum;
		}
	}
	return sum;
	}
}
