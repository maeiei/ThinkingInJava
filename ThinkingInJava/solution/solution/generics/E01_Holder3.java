package solution.generics;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

public class E01_Holder3<T> {
	private T a;

	public E01_Holder3(T a) {
		this.a = a;
	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		Pet pet = new Dog();
		E01_Holder3<? super Pet> h = new E01_Holder3<Pet>(pet);
		h.set(new Cat());
		h.set(new Hamster());
	}
}
