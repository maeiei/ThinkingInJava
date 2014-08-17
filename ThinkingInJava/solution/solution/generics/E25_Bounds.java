package solution.generics;

interface Low {
	void c();

	void d(); 
}

public class E25_Bounds implements Top, Low {

	public static void main(String[] args) {
		E25_Bounds bounds = new E25_Bounds();
		bounds.top(bounds);
		bounds.low(bounds);
	}

	public <T extends Top> void top(T t) {
		t.a();
		t.b();
	}

	public <T extends Low> void low(T t) {
		t.c();
		t.d();
	}

	@Override
	public void c() {
		System.out.println("Low.c()");
	}

	@Override
	public void d() {
		System.out.println("Low.d()");
	}

	@Override
	public void a() {
		System.out.println("Top.a()");
	}

	@Override
	public void b() {
		System.out.println("Top.b()");
	}

}
