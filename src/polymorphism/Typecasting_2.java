package polymorphism;

class A_ {
	int m = 3;
	void abc() {
		System.out.println("A Ŭ����");
	}
}
class B_ extends A_{
	int n = 4;
	void bcd() {
		System.out.println("B Ŭ����");
	}
}
public class Typecasting_2 {

	public static void main(String[] args) {

		// A Ÿ�� / A������
		A_ aa = new A_();
		System.out.println(aa.m);
		aa.abc();
		
		// BŸ�� / B������
		B_ bb = new B_();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		// A Ÿ�� / B������: ������ ǥ��
		A_ ab = new B_();
		System.out.println(ab.m);
		ab.abc();
	}

}
