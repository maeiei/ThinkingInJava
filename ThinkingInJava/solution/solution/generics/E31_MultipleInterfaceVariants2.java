package solution.generics;

public class E31_MultipleInterfaceVariants2 {

}

interface Payable<T> {
}

class Employee1<T> implements Payable<T> {
}

class Hourly<T> extends Employee1<T> implements Payable<T> {
}
