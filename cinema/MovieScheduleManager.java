package cinema;

import java.util.ArrayList;
import java.util.List;

public class MovieScheduleManager {
	private List<String> movies = new ArrayList<>();
	private List<String> showtime = new ArrayList<>();

	public void addMovie(String title, String time) {
		movies.add(title);
		showtime.add(time);
		// System.out.println("Movie added successfully!");
	}

	public void searchMovie(String keyword) {
		try {
			boolean found = false;
			System.out.println("You have searched for: " + keyword + "\nHere are the details:");

			for (int i = 0; i < movies.size(); i++) {
				if (movies.get(i).toLowerCase().contains(keyword.toLowerCase())) {
					found = true;
					System.out.println(movies.get(i) + " at " + showtime.get(i));
				}
			}

			if (!found) {
				System.out.println("Error! No such movie exists.");
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		}
	}

	public void displayAllMovies() {
		System.out.println("All Scheduled Movies:");
		for (int i = 0; i < movies.size(); i++) {
			System.out.println((i + 1) + ". " + movies.get(i) + " at " + showtime.get(i));
		}
	}
}
