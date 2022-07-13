package lamda;

interface A2 {
	void abc();
}

class B2 {
	static void bcd() {
		System.out.println("메서드");
	}
}

public class RefOfStaticMethod {
	public static void main(String[] args) {
		A2 a1 = new A2() {
			@Override
			public void abc() {
				B2.bcd();
			}
		};
		
		A2 a2 = () -> {B2.bcd();};
		
		A2 a3 = B2::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
