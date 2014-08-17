package solution.generics;

//: generics/TupleTest2.java
import static net.mindview.util.Tuple.tuple;
import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.SixTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

public class E16_TupleTest2 {
	static TwoTuple<String, Integer> f() {
		return tuple("hi", 47);
	}

	@SuppressWarnings("rawtypes")
	static TwoTuple f2() {
		return tuple("hi", 47);
	}

	static ThreeTuple<Amphibian, String, Integer> g() {
		return tuple(new Amphibian(), "hi", 47);
	}

	static FourTuple<Vehicle, Amphibian, String, Integer> h() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47);
	}

	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}

	static SixTuple<Vehicle, Amphibian, String, Integer, Double, Character> j() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1,
				new Character('a'));
	}

	public static void main(String[] args) {
		System.out.println(j());
	}
}
