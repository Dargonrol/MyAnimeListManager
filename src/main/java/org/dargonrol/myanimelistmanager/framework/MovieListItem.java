package org.dargonrol.myanimelistmanager.framework;

import java.time.LocalDate;

public class MovieListItem extends AnimeList {
    private MovieRecord movieRecord;

    public MovieListItem(String japaneseTitle, String englishTitle, LocalDate releaseDate, LocalDate watchDate, double rating, int watchCount) {
        super(japaneseTitle, englishTitle, -1);
        this.movieRecord = new MovieRecord(releaseDate, watchDate, rating, watchCount);
    }

    public MovieListItem(String japaneseTitle, String englishTitle, LocalDate watchDate) {
        super(japaneseTitle, englishTitle, -1);
        this.movieRecord = new MovieRecord(watchDate);
    }

    public MovieListItem(String englishTitle, int number, LocalDate watchDate) {
        super(englishTitle, number);
        this.movieRecord = new MovieRecord(watchDate);
    }

    public MovieListItem(String japaneseTitle, String englishTitle, LocalDate releaseDate, LocalDate watchDate, double rating, int watchCount, boolean watched) {
        super(japaneseTitle, englishTitle, -1);
        this.movieRecord = new MovieRecord(releaseDate, watchDate, rating, watched, watchCount, null, null);
    }

    public MovieListItem(String englishTitle, LocalDate watchDate, int number) {
        super(englishTitle, number);
        this.movieRecord = new MovieRecord(watchDate, true);
    }

    public MovieListItem() {
        super();
    }

    public MovieRecord getMovie() {
        return movieRecord;
    }
}
