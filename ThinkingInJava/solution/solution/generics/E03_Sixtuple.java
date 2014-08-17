package solution.generics;

import net.mindview.util.FiveTuple;

public class E03_Sixtuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {

	public final F sixth;

	public E03_Sixtuple(A a, B b, C c, D d, E e, F f) {
		super(a, b, c, d, e);
		sixth = f;
	}

	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " + fourth
				+ ", " + fifth + ", " + sixth + ")";
	}

}
