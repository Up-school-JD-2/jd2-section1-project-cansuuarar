public class MovieManager {

	public Movie[] allMovies = new Movie[10];
	public int movieCount = 0;

	public void addMovie(Long movieId, String header, String director, String[] actors, int date, String info,
			String type) {

		allMovies[movieCount] = new Movie(movieId, header, director, actors, date, info, type);
		movieCount++;

		System.out.println(header + " is created");
	}

	public String removeMovie(String movieName) {
		String searchedMovie = null;
		int index = -1;
		for (int i = 0; i < movieCount; i++) {
			if (allMovies[i].getHeader().equalsIgnoreCase(movieName)) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			for (int i = index; i < movieCount; i++) {
				allMovies[i] = allMovies[i + 1];
			}
			allMovies[movieCount - 1] = null;
			searchedMovie = movieName;
			movieCount--;
		} else {
			System.out.println("movie couldnt find.");
		}
		return searchedMovie;
	}

	public Movie searchMovie(String movieName) {
		Movie searchedMovie = null;
		for (Movie movie : allMovies) {
			if (movie.getHeader().equalsIgnoreCase(movieName)) {
				searchedMovie = (Movie) movie;
				break;
			}
		}
		return searchedMovie;
	}

	public void listMovies() {
		for (Movie movie : allMovies) {
			if (movie != null) {
				System.out.println(movie);
			}

		}
	}

}
