package constructor;

public class KoreanEx {
	public static void main(String[] args) {
		// ***객체 생성 후 필드값 출력***
		Korean k1 = new Korean("송환혁", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("송환욱", "522110-7654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
