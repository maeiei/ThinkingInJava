package solution.generics;

public class E10_GenericMethods {
	public <A, B> void f(A a, B b, Boolean c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}

	public static void main(String[] args) {
		E10_GenericMethods gm = new E10_GenericMethods();
		gm.f(1, gm, true);
		gm.f(1.0, 'c', false);
		gm.f(1.0F, "", false);
	}
}