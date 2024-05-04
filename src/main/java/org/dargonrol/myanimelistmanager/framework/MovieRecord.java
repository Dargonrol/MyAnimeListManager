package org.dargonrol.myanimelistmanager.framework;

import java.time.LocalDate;

public record MovieRecord(
        LocalDate releaseDate,
        LocalDate watchDate,
        double rating,
        boolean watched,
        int watchCount,
        Song Opening,
        Song Ending
) implements MediaTypeInterface {
    public MovieRecord(LocalDate releaseDate, LocalDate watchDate, double rating, int watchCount) {
        this(releaseDate, watchDate, rating, true, watchCount, null, null);
    }

    public MovieRecord(LocalDate releaseDate, LocalDate watchDate) {
        this(releaseDate, watchDate, 0, true, 0, null, null);
    }

    public MovieRecord(LocalDate watchDate) {
        this(null, watchDate, 0, 0);
    }

    public MovieRecord(LocalDate watchDate, boolean watched) {
        this(null, watchDate, 0, watched, 0, null, null);
    }

    public MovieRecord() {
        this(null, null, 0, 0);
    }
}
