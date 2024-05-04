package org.dargonrol.myanimelistmanager.framework;

public class SeriesListItem extends AnimeList {
    private int seasons = 1;
    private SeasonRecord[] seasonList;

    public SeriesListItem(String japaneseTitle, String englishTitle, int number, SeasonRecord[] seasonList) {
        super(japaneseTitle, englishTitle, number);
        this.seasons = seasonList.length;
        this.seasonList = seasonList;
    }

    public SeriesListItem(String japaneseTitle, String englishTitle, int number, SeasonRecord season) {
        super(japaneseTitle, englishTitle, number);
        this.seasonList = new SeasonRecord[]{season};
    }

    public SeriesListItem(String japaneseTitle, String englishTitle, int number) {
        super(japaneseTitle, englishTitle, number);
        seasonList = new SeasonRecord[seasons];
    }

    public SeriesListItem(String englishTitle, int number) {
        super(englishTitle, number);
        seasonList = new SeasonRecord[seasons];
    }

    public SeasonRecord getSeason(int season) {
        if (season <= 0 || season >= seasons) {
            System.out.println("Season out of bounds");
            return null;
        }
        for (SeasonRecord seasonObj : seasonList) {
            if (seasonObj.seasonNumber() == season) {
                return seasonObj;
            }
        }
        System.out.println("Season not found");
        return null;
    }

    public SeasonRecord getSeason(int season, int part) {
        if (season <= 0 || season >= seasons) {
            System.out.println("Season out of bounds");
            return null;
        }
        for (SeasonRecord seasonObj : seasonList) {
            if (seasonObj.seasonNumber() == season && seasonObj.part() == part) {
                return seasonObj;
            }
        }
        System.out.println("Season not found");
        return null;
    }

    public void addSeason(SeasonRecord season) {
        for (SeasonRecord seasonObject: this.seasonList) {
            if (season.seasonNumber() == seasonObject.seasonNumber() || season.part() == seasonObject.part()) {
                System.out.println("Season already exists");
                return;
            }
        } // Check if season already exists
        // TODO: Add season
    }

    public void addSeasons(SeasonRecord[] seasons) {
        if (seasons != null) {
            this.seasonList = seasons;
        }
    }

    public void setSeasonList(SeasonRecord[] seasonList) {
        this.seasonList = seasonList;
    }

    public void removeSeason(int season) {
        if (season <= 0 || season >= seasons) {
            System.out.println("Season out of bounds");
            return;
        }
        // TODO: remove season
        System.out.println("Season not found");
    }

    public void removeSeason(int season, int part) {
        if (season <= 0 || season >= seasons) {
            System.out.println("Season out of bounds");
            return;
        }
        // TODO: remove season
        System.out.println("Season not found");
    }

    public void setSeasons(int seasonIndex, SeasonRecord season) {
        //TODO: loop through seasonList and replace seasonIndex
    }
}
