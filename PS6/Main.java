
public class Main {

	public static void main(String[] args) {
		
		//Create users
		User user1 = new User("ali194", 21);
		User user2 = new User("ayse_17", 20);
		
		Netflix netflixAccount = new Netflix();
		netflixAccount.addUser(user1);
		netflixAccount.addUser(user2);
		
		netflixAccount.listUsers();
		
		Movie gora = new Movie("Gora");
		gora.setReleaseDate("10-89-2005");
		System.out.println(gora.toString());
	}

}
