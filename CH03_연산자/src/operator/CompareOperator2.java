package operator;

public class CompareOperator2 {

	public static void main(String[] args) {
		// ***비교연산자***
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true

	}

}
