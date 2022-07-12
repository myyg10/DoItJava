package lamda;

interface A1 {
	void abc();
}

class B1 {
	void bcd() {
		System.out.println("메서드");
	}
}

public class RefOfInstanceMethod {
	public static void main(String[] args) {
		A1 a1 = new A1() {
			@Override
			public void abc() {
				B1 b1 = new B1();
				b1.bcd();
			}
		};
		
		A1 a2 = () -> {
			B1 b1 = new B1();
			b1.bcd();
		};
		
		B1 b1 = new B1();
		A1 a3 = b1::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
