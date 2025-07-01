package cinema;

public class MovieScheduleManagerClient {
	public static void main(String[] args) {
		MovieScheduleManager movie = new MovieScheduleManager();
		movie.addMovie("Spiderman", "21:00");
		movie.addMovie("Avengers", "18:00");
//		movie.displayAllMovies();
		
		movie.searchMovie("spiderman");
	}
}