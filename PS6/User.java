public class User {

	/**Attributes*/
	private String username;
	private int age;
	
	
	/**Constructors*/
	public User(String username, int age) {
		this.username = username;
		this.age = age;
	}
	
	public User() {
		this.username = "default name";
		this.age = 18;
	}


	/**Methods*/
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (Character.isDigit(username.charAt(0)))
		{
		    System.out.println("Username cannot start with a digit, please enter a valid username");
		}
		else {
			this.username = username;
		}
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("Please enter a valid age");
		}
		else if (age > 0 && age < 13) {
			System.out.println("User needs to be bigger than 13 years old");
		}
		else if (age > 120) {
			System.out.println("Please enter a valid age");
		}
		else {
			this.age = age;
		}
		
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}
	
}
