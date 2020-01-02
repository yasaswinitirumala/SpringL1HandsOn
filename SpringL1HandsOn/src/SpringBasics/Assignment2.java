package SpringBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Assignment2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Assignment2.class);
		Movie movie2 = (Movie) context.getBean("movie2");
		System.out.println("Details of the movie:");
		System.out.println("Movie Id\t: " + movie2.getMovieId());
		System.out.println("Movie Name\t: " + movie2.getMovieName());
		System.out.println("Movie Actor\t: " + movie2.getMovieActor());
	}

	@Bean(name = "movie2")
	public Movie getMovie() {
		Movie movie = new Movie();
		movie.setMovieId("M002");
		movie.setMovieActor("Ben Kingsley");
		movie.setMovieName("Gandhi");
		return movie;
	}
}
