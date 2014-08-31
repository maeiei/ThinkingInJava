package solution.containersindepth;

import java.util.TreeSet;

import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

public class E09_RandTreeSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts =
				new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		ts.addAll(CollectionData.list(
				new RandomGenerator.String(), 10));
		System.out.println(ts);
	}

}
