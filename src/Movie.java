import java.util.Arrays;

public class Movie {
	
	private  Long movieId;
	private  String header;
	private String director;
	private String[] actors;
	private int date;
	private String info;
	private String type;
	
	public Movie(Long movieId, String header, String director, String[] actors, int date, String info, String type) {
		this.movieId = movieId;
		this.header = header;
		this.director = director;
		this.actors = actors;
		this.date = date;
		this.info = info;
		this.type = type;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}


	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return movieId;
	}

	public String getHeader() {
		return header;
	}

	@Override
	public String toString() {
		return "Movie [id=" + movieId + ", header=" + header + ", director=" + director + ", actors="
				+ Arrays.toString(actors) + ", date=" + date + ", info=" + info + ", type=" + type + "]";
	}
	
	
	
	
	
	

}
