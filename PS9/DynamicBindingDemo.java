public class DynamicBindingDemo {
	
	public static void main(String[] args) {
		
		// Declared type for o = 'Object'
		// Actual type for o = 'Person'
		Object o = new Person();   //Polymorphic Call
		Person s = new Student();
		
		method(o);
		method(s);
	}

	public static void method(Object x) {  //Dynamic Binding
		System.out.println(x.toString());
	}
}


class GraduateStudent extends Student {
}

class Student extends Person {
	@Override
	public String toString() {
		return "Student";
	}
}

class Teacher extends Person {
	@Override
	public String toString() {
		return "Teacher";
	}
}

class Person extends Object {
	@Override
	public String toString() {
		return "Person";
	}
}