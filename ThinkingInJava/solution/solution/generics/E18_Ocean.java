package solution.generics;

//: generics/BankTeller.java
// A very simple bank teller simulation.

import generics.Generators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import net.mindview.util.Generator;

class LittleFish {
	private static long counter = 1;
	private final long id = counter++;

	private LittleFish() {
	}

	public String toString() {
		return "LittleFish " + id;
	}

	// A method to produce Generator objects:
	public static Generator<LittleFish> generator() {
		return new Generator<LittleFish>() {
			public LittleFish next() {
				return new LittleFish();
			}
		};
	}
}

class BigFish {
	private static long counter = 1;
	private final long id = counter++;

	private BigFish() {
	}

	public String toString() {
		return "BigFish " + id;
	}

	// A single Generator object:
	public static Generator<BigFish> generator = new Generator<BigFish>() {
		public BigFish next() {
			return new BigFish();
		}
	};
}

public class E18_Ocean {
	public static void serve(BigFish b, LittleFish l) {
		System.out.println(b + " eat " + l);
	}

	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<LittleFish> line = new LinkedList<LittleFish>();
		Generators.fill(line, LittleFish.generator(), 15);
		List<BigFish> tellers = new ArrayList<BigFish>();
		Generators.fill(tellers, BigFish.generator, 4);
		for (LittleFish c : line)
			serve(tellers.get(rand.nextInt(tellers.size())), c);
	}
}
