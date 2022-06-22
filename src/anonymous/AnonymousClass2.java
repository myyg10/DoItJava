package anonymous;

class A2 {
	C c = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	void abc() {
		c.bcd();
	}
}
interface C2 {
	public abstract void bcd();
}
public class AnonymousClass2 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.abc();

	}

}
