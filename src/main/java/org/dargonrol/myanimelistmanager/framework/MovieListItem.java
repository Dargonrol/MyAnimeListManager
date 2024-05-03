package org.dargonrol.myanimelistmanager.framework;

import java.time.LocalDate;

public class MovieListItem extends AbstractAnimeList {
    private LocalDate releaseDate;
    private LocalDate watchDate;
    private double rating = 0;
    private boolean watched = true;
    private int watchCount = 0;

    public MovieListItem(String japaneseTitle, String englishTitle, LocalDate releaseDate, LocalDate watchDate, double rating, int watchCount) {
        super(japaneseTitle, englishTitle);
        this.releaseDate = releaseDate;
        this.watchDate = watchDate;
        this.rating = rating;
        this.watchCount = watchCount;
    }

    public MovieListItem(String japaneseTitle, String englishTitle, LocalDate watchDate) {
        super(japaneseTitle, englishTitle);
        this.watchDate = watchDate;
    }

    public MovieListItem(String englishTitle, LocalDate watchDate) {
        super(englishTitle);
        this.watchDate = watchDate;
    }

    public MovieListItem(String japaneseTitle, String englishTitle, LocalDate releaseDate, LocalDate watchDate, double rating, int watchCount, boolean watched) {
        super(japaneseTitle, englishTitle);
        this.releaseDate = releaseDate;
        this.watchDate = watchDate;
        this.rating = rating;
        this.watchCount = watchCount;
        this.watched = watched;
    }

    public MovieListItem(String japaneseTitle, String englishTitle, LocalDate watchDate, boolean watched) {
        super(japaneseTitle, englishTitle);
        this.watchDate = watchDate;
        this.watched = watched;
    }

    public MovieListItem(String englishTitle, LocalDate watchDate, boolean watched) {
        super(englishTitle);
        this.watchDate = watchDate;
        this.watched = watched;
    }

    public MovieListItem() {
        super();
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public LocalDate getWatchDate() {
        return watchDate;
    }

    public double getRating() {
        return rating;
    }

    public boolean getWatched() {
        return watched;
    }

    public int getWatchCount() {
        return watchCount;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setWatchDate(LocalDate watchDate) {
        this.watchDate = watchDate;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public void setWatchCount(int watchCount) {
        this.watchCount = watchCount;
    }
}
