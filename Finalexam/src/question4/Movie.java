package question4;

import java.util.Date;

public class Movie {
    public String title;
    private Date releaseDate;
    private String[] actors;
    private String director;

    public Movie(String title, Date releaseDate, String[] actors, String director){
        this.title = title;
        this.releaseDate = releaseDate;
        this.actors = actors;
        this.director = director;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
