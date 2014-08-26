package solution.containersindepth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import sun.text.resources.CollationData_sv;
import net.mindview.util.Countries;

public class E01_CountryList {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		for (int i = 0; i < Countries.DATA.length; i++) {

			arrayList.add(Countries.DATA[i][0]);
			linkedList.add(Countries.DATA[i][1]);
		}

		System.out.println(arrayList);
		System.out.println(linkedList);
		Collections.sort(arrayList);
		Collections.sort(linkedList);

		System.out.println(arrayList);
		System.out.println(linkedList);
		Collections.shuffle(arrayList);
		Collections.shuffle(linkedList);

		System.out.println(arrayList);
		Collections.shuffle(arrayList);
		Collections.shuffle(linkedList);
		System.out.println(arrayList);
		System.out.println(linkedList);
		Collections.shuffle(arrayList);
		Collections.shuffle(linkedList);
		System.out.println(arrayList);
		System.out.println(linkedList);
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		Collections.shuffle(linkedList);
		System.out.println(linkedList);
	}
}
