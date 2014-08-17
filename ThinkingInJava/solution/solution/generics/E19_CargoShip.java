package solution.generics;

//: generics/Store.java
// Building up a complex model using generic containers.

import generics.Generators;

import java.util.ArrayList;
import java.util.Random;

import net.mindview.util.Generator;

class Product {
	private final int id;
	private String description;
	private double weight;

	public Product(int IDnumber, String descr, double weight) {
		id = IDnumber;
		description = descr;
		this.weight = weight;
		System.out.println(toString());
	}

	public String toString() {
		return id + ": " + description + ", weight: " + weight + " kg";
	}

	public void weightChange(double change) {
		weight += change;
	}

	public static Generator<Product> generator = new Generator<Product>() {
		private Random rand = new Random(47);

		public Product next() {
			return new Product(rand.nextInt(1000), "Test", Math.round(rand
					.nextDouble() * 1000.0) + 0.99);
		}
	};
}

@SuppressWarnings("serial")
class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}

@SuppressWarnings("serial")
class Aisle extends ArrayList<Shelf> {
	public Aisle(int nShelves, int nProducts) {
		for (int i = 0; i < nShelves; i++)
			add(new Shelf(nProducts));
	}
}

class CheckoutStand {
}

class Office {
}

@SuppressWarnings("serial")
public class E19_CargoShip extends ArrayList<Aisle> {
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();

	public E19_CargoShip(int nAisles, int nShelves, int nProducts) {
		for (int i = 0; i < nAisles; i++)
			add(new Aisle(nShelves, nProducts));
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Aisle a : this)
			for (Shelf s : a)
				for (Product p : s) {
					result.append(p);
					result.append("\n");
				}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(new E19_CargoShip(14, 5, 10));
	}
} 
