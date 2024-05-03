package org.dargonrol.myanimelistmanager.framework;

import java.time.LocalDate;

public class SeasonObject {
    private int season;
    private String name;
    private int episodeCount;
    private int part = -1;
    LocalDate releaseDate;
    LocalDate beganWatchingDate;
    LocalDate finishedWatchingDate;
    int currentEpisode;
    int rating = 0;

    public SeasonObject(int season, String name, int episodeCount) {
        this.season = season;
        this.name = name;
        this.episodeCount = episodeCount;
    }

    public SeasonObject(int season, String name, int episodeCount, int part) {
        this.season = season;
        this.name = name;
        this.episodeCount = episodeCount;
        this.part = part;
    }

    public SeasonObject(int season) {
        this.season = season;
    }

    public SeasonObject(int season, String name) {
        this.season = season;
        this.name = name;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public boolean hasParts() {
        return part > 0;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDate getBeganWatchingDate() {
        return beganWatchingDate;
    }

    public void setBeganWatchingDate(LocalDate beganWatchingDate) {
        this.beganWatchingDate = beganWatchingDate;
    }

    public LocalDate getFinishedWatchingDate() {
        return finishedWatchingDate;
    }

    public void setFinishedWatchingDate(LocalDate finishedWatchingDate) {
        this.finishedWatchingDate = finishedWatchingDate;
    }

    public int getCurrentEpisode() {
        return currentEpisode;
    }

    public void setCurrentEpisode(int currentEpisode) {
        this.currentEpisode = currentEpisode;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
