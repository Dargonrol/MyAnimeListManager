package org.dargonrol.myanimelistmanager.framework;

public class AbstractAnimeList {
    String japaneseTitle;
    String englishTitle;

    public AbstractAnimeList(String japaneseTitle, String englishTitle) {
        this.japaneseTitle = japaneseTitle;
        this.englishTitle = englishTitle;
    }

    public AbstractAnimeList() {
        this.japaneseTitle = "";
        this.englishTitle = "";
    }

    public AbstractAnimeList(String englishTitle) {
        this.japaneseTitle = "";
        this.englishTitle = englishTitle;
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
}
