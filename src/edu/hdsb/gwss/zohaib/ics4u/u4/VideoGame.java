package edu.hdsb.gwss.zohaib.ics4u.u4;

public class VideoGame {

    private System videoGame;
    private String typeofGame;
    private String NAME;

    private boolean isGame;
    private boolean isAvailable;

    private int rating;
    private int numberOfCopiesSold;
    private int yearReleased;

    public VideoGame() {

    }

    public VideoGame(String typeofGame) {
        this.typeofGame = typeofGame;
    }

    public System getVideoGame() {

        return videoGame;
    }

    public String getTypeofGame() {
        return typeofGame;
    }

    public String getNAME() {
        return NAME;
    }

    public boolean isIsGame() {
        return isGame;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public int getRating() {
        return rating;
    }

    public int getNumberOfCopiesSold() {
        return numberOfCopiesSold;
    }

    public int getYearReleased() {
        return yearReleased;
    }

}
