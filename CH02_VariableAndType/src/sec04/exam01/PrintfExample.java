package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		//***printf() �޼ҵ� ��� ���***
		int value = 123;
		System.out.printf("��ǰ�� ����:%d��\n", value); //%d : ����
		System.out.printf("��ǰ�� ����:%6d��\n", value); //%6d : ���� �ڸ� ����. ���� ���ڸ� ����
		System.out.printf("��ǰ�� ����:%-6d��\n", value); //%-6d : ���� �ڸ� ����. ������ ���ڸ� ����
		System.out.printf("��ǰ�� ����:%06d��\n", value); //%06d : �����ڸ� ����. ���� ���ڸ� 0ä��
	
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10, area);
		
		String name = "������ ����";
		String job = "�౸ ����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	
	}

}
