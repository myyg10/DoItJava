package polymorphism;

class A_ {
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}
class B_ extends A_{
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}
public class Typecasting_2 {

	public static void main(String[] args) {

		// A 타입 / A생성자
		A_ aa = new A_();
		System.out.println(aa.m);
		aa.abc();
		
		// B타입 / B생성자
		B_ bb = new B_();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		// A 타입 / B생성자: 다형적 표현
		A_ ab = new B_();
		System.out.println(ab.m);
		ab.abc();
	}

}
