package solution.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;

//: generics/GenericCast.java

class RepairFixedSizeStack<T> {
	private int index = 0;
	private final int size;
	private ArrayList<T> storage;

	public RepairFixedSizeStack(int size) {
		storage = new ArrayList<T>(size);
		this.size = size;
	}

	public void push(T item) {
		if(index < size)
			storage.add(index++, item);
		throw new RuntimeException();
	}

	public T pop() {
		if (index > 0)
			return storage.remove(--index);
		throw new EmptyStackException();
	}
}

public class E33_GenericCast {
	public static final int SIZE = 10;

	public static void main(String[] args) {
		RepairFixedSizeStack<String> strings = new RepairFixedSizeStack<String>(
				SIZE);
		for (String s : "A B C D E F G H I J".split(" "))
			strings.push(s);
		for (int i = 0; i < SIZE + 1; i++) {
			String s = strings.pop();
			System.out.print(s + " ");
		}
	}
}
