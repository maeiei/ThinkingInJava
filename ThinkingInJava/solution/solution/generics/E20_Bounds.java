package solution.generics;

interface Top {
	void a();

	void b();
}

class TopImp implements Top {

	@Override
	public void a() {
		System.out.println("TopImp::a()");
	}

	@Override
	public void b() {
		System.out.println("TopImp::b()");
	}

	public void c() {
		System.out.println("TopImp::c()");
	}
}

public class E20_Bounds {

	static <T extends Top> void f(T obj) {
		obj.a();
		obj.b();
		// c() is not part of an interface
		// obj.c();
	}

	public static void main(String[] args) {
		int x = x = 17;
		f(new TopImp());
	}
}
