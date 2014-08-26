package solution.containersindepth;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.Countries;

public class E03_VerifySet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < Countries.DATA.length; i++) {
			set.add(Countries.DATA[i][0]);
		}
		System.out.println(set);
		for (int i = 0; i < Countries.DATA.length; i++) {
			set.add(Countries.DATA[i][0]);
		}
		System.out.println(set);
		Set<String> treeSet = new TreeSet<String>();
		for (int i = 0; i < Countries.DATA.length; i++) {
			treeSet.add(Countries.DATA[i][0]);
		}
		System.out.println(treeSet);
		for (int i = 0; i < Countries.DATA.length; i++) {
			treeSet.add(Countries.DATA[i][0]);
		}
		System.out.println(treeSet);
	}
}








