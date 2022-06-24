package generic;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods1<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

class Test {
	void method1(Goods1<A> g) {}
	void method2(Goods1<?> g) {}
	void method3(Goods1<? extends B> g) {}
	void method4(Goods1<? super B> g) {}
}

public class BoundedTypeMethod {

	public static void main(String[] args) {
		Test t = new Test();
		
		t.method1(new Goods1<A>());
		
		t.method2(new Goods1<A>());
		t.method2(new Goods1<B>());
		t.method2(new Goods1<C>());
		t.method2(new Goods1<D>());

		t.method3(new Goods1<B>());
		t.method3(new Goods1<C>());
		t.method3(new Goods1<D>());
		
		t.method4(new Goods1<A>());
		t.method4(new Goods1<B>());
	}

}
