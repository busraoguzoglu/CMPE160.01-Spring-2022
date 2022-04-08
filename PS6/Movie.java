import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Movie {
	
	/**Attributes*/
	private String movieName;
	private String releaseDate;
	private ArrayList<String> actors = new ArrayList<String>();
	
	/**Constructors*/
	public Movie(String movieName) {
		this.movieName = movieName;
	}
	
	/**Methods*/
	public void addActor(String actorName) {
		actors.add(actorName);
	}
	
	final static String DATE_FORMAT = "dd-MM-yyyy";

	public static boolean isDateValid(String date) 
	{
	        try {
	            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
	            df.setLenient(false);
	            df.parse(date);
	            return true;
	        } catch (ParseException e) {
	            return false;
	        }
	}
	
	public void setReleaseDate(String releaseDate) {
		//Check if the date is valid:
		if(isDateValid(releaseDate)) {
			this.releaseDate = releaseDate;
		}
		else {
			System.out.println("Please enter a valid date");
		}
		
	}
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", releaseDate=" + releaseDate + ", actors=" + actors + "]";
	}
}
