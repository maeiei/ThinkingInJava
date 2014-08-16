//: typeinfo/InnerImplementation.java
// Private inner classes can't hide from reflection.
import static net.mindview.util.Print.print;

class InnerA
{
	private static class C implements typeinfo.interfacea.A
	{
		public void f()
		{
			print("public C.f()");
		}

		public void g()
		{
			print("public C.g()");
		}

		void u()
		{
			print("package C.u()");
		}

		protected void v()
		{
			print("protected C.v()");
		}

		private void w()
		{
			print("private C.w()");
		}
	}

	public static typeinfo.interfacea.A makeA()
	{
		return new C();
	}
}

public class InnerImplementation
{
	public static void main(String[] args) throws Exception
	{
		typeinfo.interfacea.A a = InnerA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		// Reflection still gets into the private class:
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}
} /*
 * Output: public C.f() InnerA$C public C.g() package C.u() protected C.v()
 * private C.w()
 */// :~
