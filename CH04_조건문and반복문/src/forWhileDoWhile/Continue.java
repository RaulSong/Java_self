package forWhileDoWhile;

public class Continue {

	public static void main(String[] args) {
		// ***continue�� ����� for��
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {	//2�� ���� �������� 0�� �ƴ� ���, �� Ȧ���� ���
				continue;
			}
			System.out.println(i);
		}
	}
}
