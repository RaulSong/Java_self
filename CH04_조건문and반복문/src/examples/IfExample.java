package examples;

public class IfExample {

	public static void main(String[] args) {
		// ***if��***
		int score = 93;
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		}
		
		if(score<90) 
			System.out.println("������ 90���� �۽��ϴ�."); //false�� �ǹǷ� ��� �ȵ� 
			System.out.println("����� B�Դϴ�."); //if������ ������� ���๮
		
	}

}
