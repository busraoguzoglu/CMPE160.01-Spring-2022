import java.util.ArrayList;

public class Netflix {

	/**Attributes*/
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Movie> movies = new ArrayList<Movie>();
	
	/**Constructors*/
	public Netflix() {
		
	}
	
	/**Methods*/
	public void addUser(User user) {
		users.add(user);
	}
	
	public void listUsers() {
		for (User user : users) {
			System.out.println(user.toString());
		}
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public void listMovies() {
		for (Movie movie : movies) {
			System.out.println(movie.toString());
		}
	}
	
}
