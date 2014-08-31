package solution.containersindepth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import net.mindview.util.Countries;

public class E07_CrossInsertion {

	private ArrayList<String> arrayList = new ArrayList<String>();
	private LinkedList<String> linkedList = new LinkedList<String>();

	public E07_CrossInsertion() {
		arrayList.addAll(Countries.names(5));
		linkedList.addAll(Countries.names(10));
	}

	public void inset() {
		ListIterator<String> arrayListIterator = arrayList
				.listIterator(arrayList.size());
		// ListIterator<String> linkeListIterator =
		// linkedList.listIterator(linkedList.size());
		int i = 0;
		while (arrayListIterator.hasPrevious()) {
			if (i % 2 == 0)
				linkedList.add(arrayListIterator.previous());
			else
				arrayListIterator.previous();
			i++;
		}

	}

	public void print() {
		System.out.println("---------ArrayList------------");
		for (String name : arrayList) {
			System.out.println(name);
		}
		System.out.println("---------LinkedList------------");
		for (String name : linkedList) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		E07_CrossInsertion crossInsertion = new E07_CrossInsertion();
		crossInsertion.inset();
		crossInsertion.print();
	}

}
