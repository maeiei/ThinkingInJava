package solution.generics;

import static net.mindview.util.Print.*;
import java.util.ArrayList;
import java.util.List;

import generics.Holder;

public class E29_WildcardTest {

	public static void hold(Holder<List<?>> holder) {

		List<?> list = holder.get();
		print(holder.equals(list));
		// Compile errors:
		// list.add(1);
		// list.add(new Object());
		Integer i = (Integer) list.get(0);
		print(i);
		print(list.contains(i));
		print(list.remove(i));
		holder.set(new ArrayList<Float>());

	}

	public static void list(List<Holder<?>> list) {
		Holder<?> holder = (Holder<?>) list.get(0);
		print(holder.equals(Integer.valueOf(1)));
		// Compile error:
		// holder.set(new Integer(2));
		print(holder.get());
		list.add(new Holder<Float>(1.0F));
		print(list.get(1).get());
		list.remove(0);
		print(list.size());
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		hold(new Holder<List<?>>(list1));
		List<Holder<?>> list2 = new ArrayList<Holder<?>>();
		list2.add(new Holder<Integer>(1));
		list(list2);
	}
}
