package forWhileDoWhile;

public class ForSumFrom1To100_2 {

	public static void main(String[] args) {
		// ***1부터 100까지 합을 출력***
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum +=i;
		}
		System.out.println("1~100 합: " + sum);
	}
}
