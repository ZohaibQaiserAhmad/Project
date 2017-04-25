package edu.hdsb.gwss.zohaib.ics4u.u4;

import java.util.ArrayList;

public class System {

    //String
    private String company;
    private String console;

    //Boolean
    private boolean isConsole;
    private boolean stillManufactured;

    //Int
    private int yearReleased;
    private int cost;

    //Constants
    private static final String CONSOLE_ONE = "PC";
    private static final String CONSOLE_TWO = "XBOX";
    private static final String CONSOLE_THREE = "PLAYSTATION";
    private static final String CONSOLE_FOUR = "WII";

    //Object
    private ArrayList<VideoGame> games;

    VideoGame game = new VideoGame();

    public System() {

        //Default Values for constructor
        this.company = null;
        this.console = null;

        this.isConsole = false;
        this.stillManufactured = false;

        this.yearReleased = 0;
        this.cost = 0;

    }
    
    //Primary Key : A company cannot have the same id as another
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {

        this.company = company;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        
        //If statement to check if the console is equal to any of the four allowed (Pc , playstation , xbox and wii)
        if (CONSOLE_ONE.equals(console) || CONSOLE_TWO.equals(console) || CONSOLE_THREE.equals(console) || CONSOLE_FOUR.equals(console)) {

            this.console = console;

        }
    }

    public boolean isIsConsole() {
        return isConsole;
    }

    public void setIsConsole(boolean isConsole) {
        this.isConsole = isConsole;
    }

    public boolean isStillManufactured() {
        return stillManufactured;
    }

    public void setStillManufactured(boolean stillManufactured) {
        this.stillManufactured = stillManufactured;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ArrayList<VideoGame> getGames() {
        return games;
    }

    public void setGames(ArrayList<VideoGame> games) {
        this.games = games;
    }

    public VideoGame getGame() {
        return game;
    }

    public void setGame(VideoGame game) {
        this.game = game;
    }

}
