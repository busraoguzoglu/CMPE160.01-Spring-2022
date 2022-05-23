public class CastingDemo {

	public static void main(String[] args) {
		// Create and initialize two objects
		Object object1 = new Teacher();
		Object object2 = new Student(); //Implicit casting
		
		Student object3 = (Student)object2; //Explicit casting

		displayObject(object1); 
		displayObject(object2); 
		
	}

	/** A method for displaying an object */
	public static void displayObject(Object object) {
		if (object instanceof Teacher) {
			System.out.println("This is a teacher " +
					((Teacher)object).toString());
		}
		else if (object instanceof Student) {
			System.out.println("This is a student " +
					((Student)object).toString());
		}
	}
}
