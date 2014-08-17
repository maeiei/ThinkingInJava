package solution.generics;

import static net.mindview.util.Print.*;
import java.lang.reflect.Constructor;

class ClassAsFactory<T> {
	Class<T> kind;

	public ClassAsFactory(Class<T> kind) {
		this.kind = kind;
	}

	public T create(int arg) {
		try {
			// Technique 1 (verbose)
			for (Constructor<?> ctor : kind.getConstructors()) {
				// Look for a constructor with a single parameter:
				Class<?>[] params = ctor.getParameterTypes();
				if (params.length == 1)
					if (params[0] == int.class)
						return kind.cast(ctor.newInstance(arg));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}

public class E22_InstantiateGenericType {

	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(
				Employee.class);
		Employee emp = fe.create(1);
		if (emp == null)
			print("Employee cannot be instantiated!");
		else
			print("Employee can be instantiated!");

		ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		Integer i = fi.create(0);
		if (i == null)
			print("Integer cannot be instantiated!");
		else
			print("Integer can be instantiated!");
	}
}

class Employee {
	public Employee() {

	}

	public Employee(int arg) {

	}
}