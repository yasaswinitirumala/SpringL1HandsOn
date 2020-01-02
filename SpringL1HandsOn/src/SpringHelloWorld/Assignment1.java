package SpringHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringBasics.Movie;

public class Assignment1 {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      Movie movie = (Movie) context.getBean("movie");
	      System.out.println("Details of the movie:");
	      System.out.println("Movie Id\t: "+movie.getMovieId());
	      System.out.println("Movie Name\t: "+movie.getMovieName());
	      System.out.println("Movie Actor\t: "+movie.getMovieActor());
	   }
}
