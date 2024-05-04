package org.dargonrol.myanimelistmanager.framework;

import java.time.LocalDate;

public record SeasonRecord(
        int seasonNumber,
        String name,
        int episodeCount,
        int part,
        LocalDate releaseDate,
        LocalDate beganWatchingDate,
        LocalDate finishedWatchingDate,
        int currentEpisode,
        double rating,
        Song Opening,
        Song Ending
) implements MediaTypeInterface {
    public SeasonRecord(int seasonNumber, String name, int episodeCount) {
        this(seasonNumber, name, episodeCount, -1, null, null, null, 0, 0, null, null);
    }

    public SeasonRecord(int seasonNumber, String name, int episodeCount, int part) {
        this(seasonNumber, name, episodeCount, part, null, null, null, 0, 0, null, null);
    }

    public SeasonRecord(int seasonNumber) {
        this(seasonNumber, null, 0, -1, null, null, null, 0, 0, null, null);
    }

    public SeasonRecord(int seasonNumber, String name) {
        this(seasonNumber, name, 0, -1, null, null, null, 0, 0, null, null);
    }
}
