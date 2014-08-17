package solution.generics;

import java.util.HashMap;
import java.util.Map;

public class E24_ClassTypeCapture<T> {
	Map<String, FactoryI<T>> map;

	public E24_ClassTypeCapture() {
		map = new HashMap<String, FactoryI<T>>();
	}

	public void addType(String typeName, FactoryI<T> kind) {
		map.put(typeName, kind);
	}

	public T createNewType(String typeName) throws InstantiationException {
		return map.get(typeName).create(1);
	}

	public static void main(String[] args) {
		E24_ClassTypeCapture<Widget> ctt1 = new E24_ClassTypeCapture<Widget>();
		ctt1.addType("Widget", new Widget.Factory());
		try {
			Widget Widget = ctt1.createNewType("Widget");
			System.out.println(Widget);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
