package edu.hdsb.gwss.zohaib.ics4u.u4;

public class VideoGame {

    //Object
    private System console;

    //String
    private String typeofGame; 
    private String name; 

    //Boolean
    private boolean isGame; //------------
    private boolean isAvailable;

    //Int
    private int rating; 
    private int numberOfCopiesSold;
    private int yearReleased;
    private int cost;

    //Constants
    //Minimum Year(first video game was released in 1958)
    private static final int MINIMUM_YEAR_RELEASED = 1958;

    //Maximum Year(Game can't exceed current year - not possible)
    private static final int MAXIMUM_YEAR_RELEASED = 2017;

    //The rating will be on a 5 scale so it can't be less then 0 or greater then 5
    private static final int MINIMUM_RATING = 0;
    private static final int MAXIMUM_RATING = 5;

    //Type of game it can be - Action , Adventure , Role-Playing , Simulation , Strategy  , Sports 
    private static final String GENRE_ONE = "ACTION";
    private static final String GENRE_TWO = "ADVENTURE";
    private static final String GENRE_THREE = "ROLEPLAYING";
    private static final String GENRE_FOUR = "SIMULATION";
    private static final String GENRE_FIVE = "STRATEGY";
    private static final String GENRE_SIX = "SPORTS";

    //Maximum number of characters allowed and minimum
    private static final int MINIMUM_CHARACTERS = 0; 
    private static final int MAXIMUM_CHARACTERS = 40; 

    //Maximum amount game can cost and minimum
    private static final int MINIMUM_COST = 0;
    private static final int MAXIMUM_COST = 80;

    public VideoGame() {

        //Default values for constructor
        this.typeofGame = null;
        this.name = null;

        this.isGame = false;
        this.isAvailable = false;

        this.rating = 0;
        this.numberOfCopiesSold = 0;
        this.yearReleased = 0;

    }

    public System getConsole() {
        return console;
    }

    public void setConsole(System console) {
        this.console = console;
    }

    //Returns type of game(genre)
    public String getTypeofGame() {
        return typeofGame;
    }

    //Sets the type of the game - genre
    public void setTypeofGame(String typeofGame) {

        //If  the type of game matches any genre input it
        if (typeofGame.equals(GENRE_ONE) || typeofGame.equals(GENRE_TWO)
                || typeofGame.equals(GENRE_THREE) || typeofGame.equals(GENRE_FOUR)
                || typeofGame.equals(GENRE_FIVE) || typeofGame.equals(GENRE_SIX)) {

            this.typeofGame = typeofGame;

        }
    }

    //Returns the name of the videogame : primary key - no video game can have same name
    public String getName() {
        return name;
    }

    //Sets the name 
    public void setName(String name) {

        //if name length is greater then or equal to 0 and less then or equal to max set it 
        if (name.length() >= MINIMUM_CHARACTERS && name.length() <= MAXIMUM_CHARACTERS) {

            this.name = name;

        }
    }

    //returns isGame if its set to true
    public boolean isIsGame() {
        return isGame;
    }

    //Used to check if it if game
    public void setIsGame(boolean isGame) {

        //this is a game only if isGame is set to true
        if (isGame == true) {
            this.isGame = isGame;
        }
    }

    //Returns true or false based on what isAvaiable is set to
    public boolean isIsAvailable() {
        return isAvailable;
    }

    //Checks to see if game is still available
    public void setIsAvailable(boolean isAvailable) {
        if (isAvailable == true) {
            this.isAvailable = isAvailable;
        }
    }

    //returns rating that was inputted - only if valid info 
    public int getRating() {
        return rating;
    }

    //Sets the rating of the game
    public void setRating(int rating) {

        //if rating is greater then or equal to min rating (0) and less then or equal to max (5) set rating to input
        if (rating >= MINIMUM_RATING && rating <= MAXIMUM_RATING) {

            this.rating = rating;

        }
    }
    
    //Returns number of copies if valid info - greater/equal to 0
    public int getNumberOfCopiesSold() {

        return numberOfCopiesSold;
    }

     //Used to set how much copies are sold
    public void setNumberOfCopiesSold(int numberOfCopiesSold) {

        //Since number of copies sold could be in millions - keep it simple and allow any number as long as it is above 0
        if (numberOfCopiesSold >= 0) {

            this.numberOfCopiesSold = numberOfCopiesSold;

        }
    }

    //Returns the year that the videogame was released
    public int getYearReleased() {
        return yearReleased;
    }

    //Used to set the year that the game was released
    public void setYearReleased(int yearReleased) {

//If the year released is greater then or equal to minimum year a game can be released and is less then or equal to max year set year released to input
        if (yearReleased >= MINIMUM_YEAR_RELEASED && yearReleased <= MAXIMUM_YEAR_RELEASED) {

            this.yearReleased = yearReleased;

        }
    }

    //Gets the cost and returns
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {

        //If the cost of the game is greater then minimum/equal - 0 and less then maximum/equal - 80 set the cost
        if (cost >= MINIMUM_COST && cost <= MAXIMUM_COST) {
            this.cost = cost;
        }
    }

}
