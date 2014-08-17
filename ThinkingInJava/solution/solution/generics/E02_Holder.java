package solution.generics;

import static net.mindview.util.Print.*;

public class E02_Holder<T> {
	private T a, b, c;

	public E02_Holder(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public T getC() {
		return c;
	}

	public void setC(T c) {
		this.c = c;
	}

	public boolean equals(Object obj) {
		return a.equals(obj) && b.equals(obj) && b.equals(obj);
	}

	public static void main(String[] args) {
		E02_Holder<String> Holder = new E02_Holder<String>("a","b","c");
		print(Holder);
		print(Holder.getA());
		print(Holder.getB());
		print(Holder.getC());
	}
}
