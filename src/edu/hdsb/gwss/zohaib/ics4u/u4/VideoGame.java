package edu.hdsb.gwss.zohaib.ics4u.u4;

public class VideoGame {

    //Object
    private System console;

    //String
    private String typeofGame;
    private String name;

    //Boolean
    private boolean isGame;
    private boolean isAvailable;

    //Int
    private int rating;
    private int numberOfCopiesSold;
    private int yearReleased;
    
    //Constants
    private static final int MINIMUM_YEAR_RELEASED = 1958;
    private static final int MAXIMUM_YEAR_RELEASED = 2017;

    public VideoGame() {

        

    }

    public VideoGame(String typeofGame) {

        this.typeofGame = typeofGame;
    }

    public System getConsole() {

        return console;
    }

    public String getTypeofGame() {
        return typeofGame;
    }

    public String getName() {
        return name;
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
