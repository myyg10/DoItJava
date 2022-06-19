package polymorphism;

class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting {
	public static void main(String[] args) {
		// 생성 객체에 따라 달라짐, 선언된 타입이 의미하는 바는 선언된 타입의 객체를 가리키는 것
		// 업캐스팅(자동 변환)
		
		A ac = new C();
		B bc = new C();
		
		B bb = new B();
		A a = bb;
		
		// 다운캐스팅(수동 변환): 캐스팅할 수 없을 때(실행할 때 예외 발생)
		A aa = new A();
//		B b = (B) aa;
//		C c = (C) aa;
		
		// 다운캐스팅(수동 변환): 캐스팅이 가능할 때
		A ab = new B();
		B b = (B) ab;
//		C c = (C) ab;
		
		B bd = new D();
		D d = (D) bd;
		
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
	}
}
