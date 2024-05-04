package org.dargonrol.myanimelistmanager.framework;

import java.util.ArrayList;

public abstract class AnimeList {
    String japaneseTitle;
    String englishTitle;
    int Index;

    public AnimeList(String japaneseTitle, String englishTitle, int index) {
        this.japaneseTitle = japaneseTitle;
        this.englishTitle = englishTitle;
        this.Index = index;
    }

    public AnimeList() {
        this.japaneseTitle = "";
        this.englishTitle = "";
        this.Index = -1;
    }

    public AnimeList(String englishTitle, int Index) {
        this.japaneseTitle = "";
        this.englishTitle = englishTitle;
        this.Index = Index;
    }

    public String getJapaneseTitle() {
        return japaneseTitle;
    }

    public String getEnglishTitle() {
        return englishTitle;
    }

    public void setJapaneseTitle(String japaneseTitle) {
        this.japaneseTitle = japaneseTitle;
    }

    public void setEnglishTitle(String englishTitle) {
        this.englishTitle = englishTitle;
    }

    public static SeriesListItem getSeriesByName(ArrayList<AnimeList> animeList, String name) {
        return (SeriesListItem) animeList.stream().filter(anime -> anime.getEnglishTitle().equalsIgnoreCase(name) || anime.getJapaneseTitle().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public static SeriesListItem getSeriesByNumber(ArrayList<AnimeList> animeList, int number) {
        return (SeriesListItem) animeList.stream().filter(anime -> anime.Index == number).findFirst().orElse(null);
    }

    public static MovieListItem getMovieByName(ArrayList<AnimeList> animeList, String name) {
        return (MovieListItem) animeList.stream().filter(anime -> anime.getEnglishTitle().equalsIgnoreCase(name) || anime.getJapaneseTitle().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public static MovieListItem getMovieByNumber(ArrayList<AnimeList> animeList, int number) {
        return (MovieListItem) animeList.stream().filter(anime -> anime.Index == number).findFirst().orElse(null);
    }
}
