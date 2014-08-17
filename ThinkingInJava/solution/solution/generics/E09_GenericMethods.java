package solution.generics;

public class E09_GenericMethods {
	public <A, B, C> void f(A a, B b, C c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}

	public static void main(String[] args) {
		E09_GenericMethods gm = new E09_GenericMethods();
		gm.f(1, gm, "");
		gm.f(1.0, 'c', 1.0F);
	}
}