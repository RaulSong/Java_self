package referenceObject;

public class StringEquals {

	public static void main(String[] args) {
		// ***���ڿ� ��***
		String strVar1 = "Martinelli";
		String strVar2 = "Martinelli";
		if(strVar1==strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = ("Martinelli");
		String strVar4 = ("Martinelli");
		if(strVar3==strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
	}
}
