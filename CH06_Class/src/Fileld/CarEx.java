package Fileld;

public class CarEx {
	public static void main(String[] args) {
		// ***�ܺ� Ŭ�������� Car �ʵ尪 �б�� ����***
		//��ü ����
		Car myCar = new Car();
		//�ʵ尪 �б�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);	
	}
}
