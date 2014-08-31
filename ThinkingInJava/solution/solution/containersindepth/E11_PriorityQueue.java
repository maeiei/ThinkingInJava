package solution.containersindepth;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class E11_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Item> queue = new PriorityQueue<Item>(100);
		for (int i = 0; i < 100; i++) {
			queue.add(new Item());
		}
//		for (Iterator<Item> iterator = queue.iterator(); iterator.hasNext();) {
//
//			System.out.println(iterator.next());
//		}
		Item item;
		while ((item = queue.poll()) != null)
			System.out.println(item);
	}
}

class Item implements Comparable<Item> {
	public int priority;

	Item() {
		Random random = new Random();
		priority = random.nextInt(100);
	}

	@Override
	public int compareTo(Item item) {
		return priority < item.priority ? -1 : priority == item.priority ? 0
				: 1;
	}

	public String toString() {
		return String.valueOf(priority);
	}
}
