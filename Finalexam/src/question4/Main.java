package question4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Initialize
        Movie movie1 = new Movie("Monster Hunter World",
                new GregorianCalendar(1998, Calendar.FEBRUARY, 11).getTime(),
                new String[]{"Sijali", "Limuhao", "Wangzishan", "blablabla"}, "NiTendo");
        Movie movie2 = new Movie("Avatar",
                new GregorianCalendar(2001, Calendar.SEPTEMBER, 13).getTime(),
                new String[]{"Sijali", "Limuhao", "Wangzishan", "blablabla", "huangxiao"}, "XiaoHuang");
        Movie movie3 = new Movie("Monster Hunter World",
                new GregorianCalendar(1998, Calendar.FEBRUARY, 11).getTime(),
                new String[]{"Sijali", "Limuhao", "Wangzishan", "blablabla"}, "NiTendo");
        Movie movie4 = new Movie("Female Ghost",
                new GregorianCalendar(1995, Calendar.MARCH, 1).getTime(),
                new String[]{"Sijali", "Limuhao", "Wangzishan", "wangyurong"}, "NingCaiCheng");
        Movie movie5 = new Movie("Olympic Game",
                new GregorianCalendar(2008, Calendar.AUGUST, 13).getTime(),
                new String[]{"Sijali", "Limuhao", "Wangzishan", "blablabla"}, "Xijingping");
        Movie movie6 = new Movie("BengHuai",
                new GregorianCalendar(2018, Calendar.FEBRUARY, 11).getTime(),
                new String[]{"Sijali", "Limuhao", "Wangzishan", "blablabla"}, "Marvel");

        Movie[] movieList = {movie1, movie2, movie3, movie4, movie5, movie6};
        Genre fiction = new Genre();
        for (Movie movie: movieList){
            fiction.addMovie(movie);
        }
        Netflix netFlix = new Netflix();
        netFlix.addGenre(fiction);

        //***********************************************************************

        // Add Classic Title
        Date classic = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        netFlix.myList.stream()
                .flatMap(g -> g.genre.stream())
                .filter(movie -> movie.getReleaseDate().before(classic))
                .forEach(movie -> movie.setTitle("Classic" + movie.getTitle()));

        //Get 3 latest movie:
        List<Movie> latestMovie = netFlix.myList.stream()
                .flatMap(g -> g.genre.stream())
                .sorted(Comparator.comparing(movie -> movie.getReleaseDate().getTime()))
                .limit(3)
                .collect(Collectors.toList());

        // Create Predicate
        Date y2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date y1990 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        List<Movie> predict = netFlix.myList.stream()
                .flatMap(g -> g.genre.stream())
                .filter(movie -> movie.getReleaseDate().before(y2000))
                .filter(movie -> movie.getReleaseDate().before(y1990)).toList();
        System.out.println(predict);

        //change all the movie title
        netFlix.myList.stream()
                .flatMap(g -> g.genre.stream())
                .forEach(Main::addTitle);

        //sorting released year
        netFlix.myList.stream()
                .flatMap(g -> g.genre.stream())
                .sorted(Comparator.comparing(movie -> movie.getReleaseDate().getTime()))
    }

    public static String addTitle(Movie movie){
        movie.setTitle(movie.getReleaseDate().toString() + movie.getTitle());
        return movie.getTitle();
    }



}
