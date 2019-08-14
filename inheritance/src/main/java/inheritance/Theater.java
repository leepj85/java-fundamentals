package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Business {

    private List<String> movieList;

    public Theater(String name, double starRating) {
        super(name, starRating);
        this.movieList = new ArrayList<>();
    }

    public List getMovieList() {
        return this.movieList;
    }

    public void addMovie(String movie) {
        this.movieList.add(movie);
    }

    public void removeMovie(String movie) {
        if (movieList.indexOf(movie) > -1) {
            movieList.remove(movieList.indexOf(movie));
        }
    }
}
