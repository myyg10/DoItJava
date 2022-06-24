package polymorphism;

class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting {
	public static void main(String[] args) {
		// ���� ��ü�� ���� �޶���, ����� Ÿ���� �ǹ��ϴ� �ٴ� ����� Ÿ���� ��ü�� ����Ű�� ��
		// ��ĳ����(�ڵ� ��ȯ)
		
		A ac = new C();
		B bc = new C();
		
		B bb = new B();
		A a = bb;
		
		// �ٿ�ĳ����(���� ��ȯ): ĳ������ �� ���� ��(������ �� ���� �߻�)
		A aa = new A();
//		B b = (B) aa;
//		C c = (C) aa;
		
		// �ٿ�ĳ����(���� ��ȯ): ĳ������ ������ ��
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
