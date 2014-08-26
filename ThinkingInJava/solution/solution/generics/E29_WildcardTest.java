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
	public static void list(List<Holder<?>> list){
		
		Holder<?> holder = list.get(0);
		holder.get();
		holder.set(null);
//		holder.set(1);
//		holder.set(new Object());
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		hold(new Holder<List<?>>(list1));
	}

}
