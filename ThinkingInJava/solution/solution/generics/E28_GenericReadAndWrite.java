package solution.generics;

import typeinfo.pets.Cat;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Rodent;

public class E28_GenericReadAndWrite {
	static <T> void f1(Generic1<? super T> obj, T item) {
		obj.set(item);
	}

	static <T> T f2(Generic2<? extends T> obj) {
		return obj.get();
	}

	public static void main(String[] args) {
		Generic1<Rodent> g1 = new Generic1<Rodent>();
		f1(g1, new Mouse()); // OK
		// Compile error: Cat is not a Rodent
		// f1(g1, new Cat());
		Generic2<Pet> g2 = new Generic2<Pet>();
		Pet pet = f2(g2); // OK
		Generic2<Cat> g3 = new Generic2<Cat>();
		Cat cat = f2(g3); // OK
		pet = f2(g3); // OK
	}
}

class Generic1<T> {
	T name;

	public void set(T t) {
		name = t;
	}
}

class Generic2<T> {
	T name;

	public T get() {
		return name;
	}
}
