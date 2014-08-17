package solution.generics;

//: generics/FactoryConstraint.java

interface FactoryI<T> {
	T create(int type);
}

class Foo2<T> {
	private T x;

	public <F extends FactoryI<T>> Foo2(F factory) {
		x = factory.create(1);
	}
}

class IntegerFactory implements FactoryI<Integer> {
	public Integer create(int type) {
		return new Integer(type);
	}
}

class Widget {
	public Widget(int type){
		
	}
	public static class Factory implements FactoryI<Widget> {

		@Override
		public Widget create(int type) {
			return new Widget(type);
		}
	}
}

public class E23_FactoryConstraint {
	public static void main(String[] args) {
		new Foo2<Integer>(new IntegerFactory());
		new Foo2<Widget>(new Widget.Factory());
	}
}
