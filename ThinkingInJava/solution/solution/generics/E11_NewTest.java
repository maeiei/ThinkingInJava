package solution.generics;

import static net.mindview.util.Print.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import net.mindview.util.New;

public class E11_NewTest {

	public static void main(String[] args) {

		Map<String, List<String>> sls = New.map();
		
		List<String> ls = New.list();
		ls.add("123");
		sls.put("ls", ls);
		print(ls == sls.get("ls"));
		print(ls.get(0));
		
		LinkedList<String> lls = New.lList();
		lls.add("");
		Set<String> ss = New.set();
		ss.add("");
		Queue<String> qs = New.queue();
		qs.add("");
	}
}
