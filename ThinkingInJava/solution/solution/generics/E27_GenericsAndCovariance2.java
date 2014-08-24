package solution.generics;

import java.util.ArrayList;
import java.util.List;

public class E27_GenericsAndCovariance2 {

	public static void main(String[] args) {
		List<? extends Number> list = new ArrayList<Integer>();
		// list.add(new Integer(1));
		// list.add(new Float(1.0));
		// list.add(new Object());
		list.add(null);
		Number n = list.get(0);
	}

}
