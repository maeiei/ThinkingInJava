package solution.generics;

import java.util.HashMap;
import java.util.Map;

//: generics/ClassTypeCapture.java

class Building {
}

class House extends Building {
}

public class E21_ClassTypeCapture<T> {
	Map<String, Class<T>> map;

	public E21_ClassTypeCapture() {
		map = new HashMap<String, Class<T>>();
	}

	public void addType(String typeName, Class<T> kind) {
		map.put(typeName, kind);
	}

	public T createNewType(String typeName) {
		try {
			return (T) map.get(typeName).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		E21_ClassTypeCapture<Building> ctt1 = new E21_ClassTypeCapture<Building>();
		ctt1.addType("Building", Building.class);
		Building Building = ctt1.createNewType("Building");
		
	}
}
