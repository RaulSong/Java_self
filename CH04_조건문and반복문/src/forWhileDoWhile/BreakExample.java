package forWhileDoWhile;

public class BreakExample {

	public static void main(String[] args) {
		// ***break�� while�� ����***
		while(true) {
			int num = (int) (Math.random() *6) +1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
