package lamda;

interface A {
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("메서드 내용1");
	}
}

public class Expression {
	public static void main(String[] args) {
		A a1 = new B();
		a1.abc();
		
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용2");
			}
		};
		a2.abc();
	
		A a3 = () -> {System.out.println("메서드 내용3");};
		a3.abc();
	}
}
