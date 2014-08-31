package solution.containersindepth;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.mindview.util.CountingMapData;

public class E05_CountingMapData2 {
	private int size;
	private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"
			.split(" ");

	public E05_CountingMapData2(int size) {
		if (size < 0)
			this.size = 0;
		this.size = size;
	}

	private static class Entry implements Map.Entry<Integer, String> {
		int index;

		Entry(int index) {
			this.index = index;
		}

		public boolean equals(Object o) {
			return Integer.valueOf(index).equals(o);
		}

		public Integer getKey() {
			return index;
		}

		public String getValue() {
			return chars[index % chars.length]
					+ Integer.toString(index / chars.length);
		}

		public String setValue(String value) {
			throw new UnsupportedOperationException();
		}

		public int hashCode() {
			return Integer.valueOf(index).hashCode();
		}
	}

	static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {

		private int size;

		EntrySet(int size) {
			if (size < 0)
				this.size = 0;
			// Can't be any bigger than the array:
			else if (size > chars.length)
				this.size = chars.length;
			else
				this.size = size;
		}

		@Override
		public Iterator<java.util.Map.Entry<Integer, String>> iterator() {

			return new Iterator<java.util.Map.Entry<Integer, String>>() {
				private Entry entry = new Entry(-1);

				@Override
				public boolean hasNext() {
					return entry.index < size - 1;
				}

				@Override
				public Map.Entry<Integer, String> next() {
					entry.index++;
					return entry;
				}

				@Override
				public void remove() {
					throw new UnsupportedOperationException();
				}
			};
		}

		@Override
		public int size() {
			return size;
		}

	}

	private static Set<Map.Entry<Integer, String>> entries = new EntrySet(
			chars.length);

	public Set<Map.Entry<Integer, String>> entrySet() {
		return entries;
	}

	// public Set<Map.Entry<Integer, String>> entrySet() {
	// // LinkedHashSet retains initialization order:
	// Set<Map.Entry<Integer, String>> entries = new
	// LinkedHashSet<Map.Entry<Integer, String>>();
	// for (int i = 0; i < size; i++)
	// entries.add(new Entry(i));
	// return entries;
	// }

	public static void main(String[] args) {
		System.out.println(new CountingMapData(60));
	}
}
