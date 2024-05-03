package org.dargonrol.myanimelistmanager.framework;

public class SeriesListItem extends AbstractAnimeList {
    private int seasons = 1;
    private SeasonObject[] seasonList;


    public SeriesListItem(String japaneseTitle, String englishTitle, int seasons) {
        super(japaneseTitle, englishTitle);
        this.seasons = seasons;
        seasonList = new SeasonObject[seasons];
    }

    public SeriesListItem(String englishTitle, int seasons) {
        super(englishTitle);
        this.seasons = seasons;
        seasonList = new SeasonObject[seasons];
    }

    public SeasonObject getSeason(int season) {
        if (season <= 0 || season >= seasons) {
            System.out.println("Season out of bounds");
            return null;
        }
        for (SeasonObject seasonObj : seasonList) {
            if (seasonObj.getSeason() == season) {
                return seasonObj;
            }
        }
        System.out.println("Season not found");
        return null;
    }

    public SeasonObject getSeason(int season, int part) {
        if (season <= 0 || season >= seasons) {
            System.out.println("Season out of bounds");
            return null;
        }
        for (SeasonObject seasonObj : seasonList) {
            if (seasonObj.getSeason() == season && seasonObj.getPart() == part) {
                return seasonObj;
            }
        }
        System.out.println("Season not found");
        return null;
    }

    public void addSeason(SeasonObject season) {
        for (SeasonObject seasonObject: this.seasonList) {
            if (season.getSeason() == seasonObject.getSeason() || season.getPart() == seasonObject.getPart()) {
                System.out.println("Season already exists");
                return;
            }
        } // Check if season already exists
        // Add season
    }

    public void addSeasons(SeasonObject[] seasons) {
        if (seasons != null) {
            this.seasonList = seasons;
        }
    }

    // Adding Opening Class?? and array or list here
    // movie object cause Anime can have seasons and movies

}
