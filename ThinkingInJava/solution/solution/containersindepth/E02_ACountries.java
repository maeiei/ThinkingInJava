package solution.containersindepth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.mindview.util.Countries;

public class E02_ACountries {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < Countries.DATA.length; i++) {
			if(Countries.DATA[i][0].startsWith("A")){
				map.put(i, Countries.DATA[i][0]);
			}
		}
		System.out.println(map);
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < Countries.DATA.length; i++) {
			set.add(Countries.DATA[i][0]);
		}
		System.out.println(set);
		for (int i = 0; i < Countries.DATA.length; i++) {
			set.add(Countries.DATA[i][0]);
		}
		System.out.println(set);
	}

}














