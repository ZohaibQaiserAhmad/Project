package edu.hdsb.gwss.zohaib.ics4u.u4;

/*

 +* Name: Zohaib Ahmad
 +
 + * Date : Saturday , April 28th
 +
 + * Version : v0.02
 +
 +  * Description : Creates a class of which is the child to System and has a 1..N relationship.



/**
 *
 * @author 1ahmadzoh
 */







public class VideoGame {

    //Object
    private System console;

    //String - type of game and name
    private String typeofGame;
    private String name;

    //Boolean - Set to false , only if input is set to true will it change
    private boolean isGame = false;
    private boolean isAvailable = false;

    //Int - rating, numbersofcopiessold , year released and cost
    private int rating;
    private int numberOfCopiesSold;
    private String dateReleased;
    private int yearReleased;
    private int monthReleased;
    private int dayReleased;
    private int cost;
    
    
    
    //Encapsulation Variable(s)
    private String codeforGame;

    

    //Constants
    //Minimum Year(first video game was released in 1958)
    private static final int MINIMUM_YEAR_RELEASED = 1958;

    //Maximum Year(Game can't exceed current year - not possible)
    private static final int MAXIMUM_YEAR_RELEASED = 2017;
     
    //Minimum Day that it can be released - 1
    private static final int MINIMUM_DAY = 1;
    
    //Maximum Day that it can be released - 30
    private static final int MAXIMUM_DAY = 30;
    
    
    //Minimum month it can be released - 1
    private static final int MINIMUM_MONTH = 1;
    
    //Maximum month it can be released - 12;
    private static final int MAXIMUM_MONTH = 12;

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
    private static final int MINIMUM_CHARACTERS = 5;
    private static final int MAXIMUM_CHARACTERS = 40;

    //Maximum amount game can cost and minimum - games can go as low as 5
    private static final int MINIMUM_COST = 5;
    private static final int MAXIMUM_COST = 80;

    public VideoGame() {

        //Default values for default constructor
        
        this.typeofGame = "ACTION";
        this.name = "Call of duty";

        this.isGame = true;
        this.isAvailable = false;

        this.rating = 1;
        this.numberOfCopiesSold = 12;
        
        this.dayReleased = 12;
        this.monthReleased = 9;
        this.yearReleased = 2012;
        
        //Sets date after setting day/month/year
        this.dateReleased = dayReleased + " : " + monthReleased + " : " + yearReleased;
        this.cost = 15;

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
        if (isGame) {
            this.isGame = isGame;
        }
    }

    //Returns true or false based on what isAvaiable is set to
    public boolean isIsAvailable() {
        return isAvailable;
    }

    //Checks to see if game is still available
    public void setIsAvailable(boolean isAvailable) {
        if (isAvailable) {
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

 //Method to get value of getYearReleased
    public String getdateReleased() {
        
        //Returns value on what it is set - if not default value "0"
        return dateReleased;
    }
    
    //Method to set value of date released
    public void setdateReleased(int yearReleased , int monthReleased , int dayReleased) {
         
        //If it is above or equal to min or less then equal to max then set it
         if (yearReleased >= MINIMUM_YEAR_RELEASED && yearReleased <= MAXIMUM_YEAR_RELEASED) {

            this.yearReleased = yearReleased;

        }
         
         
        // Checks to see if day is valid
        
        if(dayReleased >= MINIMUM_DAY && dayReleased <= MAXIMUM_DAY){
            
            this.dayReleased = dayReleased;
            
        }
         
        //Checks to see if month is valid 
        
          if(monthReleased >= MINIMUM_MONTH && monthReleased <= MAXIMUM_MONTH){
            
            this.monthReleased = monthReleased;
            
        }
          
          //Sets date after setting day/month/year
          this.dateReleased = dayReleased + " : " + monthReleased + " : " + yearReleased;
         
    }

    //Gets the cost and returns
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {

        //If the cost of the game is greater then minimum/equal - 5 and less then maximum/equal - 80 set the cost
        if (cost >= MINIMUM_COST && cost <= MAXIMUM_COST) {
            this.cost = cost;
        }
    }
    
   
    


    //Data to hide so can't return to user
    public void setCodeforGame(String codeforGame) {
        
        //As long as their is something in code its valid
        
        if(!(codeforGame.isEmpty())){
            
        this.codeforGame = codeforGame;
        
        }
    }
    
    
    

    //To String Method
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        //Formats The Output nicely, this.company refers to console name + Object with curly braces and if no info dont give object name
        if (this.console == null) {

            result.append("Object {" + "\n");

        } else {

            result.append(this.console).append("Object {" + "\n");

        }
        //Specifically tells user, the console name
        result.append("Cosole Name : ").append(this.console).append("\n");

        //Tells user the type of game
        result.append("Type of game : ").append(this.typeofGame).append("\n");

        //Tells user the name of the game
        result.append("Name of game : ").append(this.name).append("\n");

        //Tells user wheter console is still available for purchase
        result.append("Is it available : ").append(this.isAvailable).append("\n");

        //Tells user the rating of the game
        result.append("The rating of game (1-5): ").append(this.rating).append("\n");

        //Tells user the number of copies sold
        result.append("Number of copies sold : ").append(this.numberOfCopiesSold).append("\n");

        //Tells user the year game was released
        result.append("Date Game Released : ").append(this.dateReleased).append("\n");

        //Tells user cost of the game
        result.append("Cost of the game : ").append(this.cost).append("\n" + "}");

        //Returns the output in modified format created
        return result.toString();

    }

    //Equals Method
    @Override
    public boolean equals(Object obj) {

        //Base case is object null?
        if (obj == null) {

            return false;

        }

        //If classes of object does not equal the class of other return false
        if (getClass() != obj.getClass()) {

            return false;

        }

        //If current object thats being invoked is equal to the object its comparing to  , return true
        if (this == obj) {

            return true;

        }

        //Create new object in order to check if properties match
        VideoGame other = (VideoGame) obj;

        //Checks to see if console match and if not return false
        if (console != other.console) {

            return false;

        }

        //Checks to see if type of game matches and if not return false
        if (typeofGame != other.typeofGame) {

            return false;

        }

        //Checks to see if name matches and if not return false
        if (name != other.name) {

            return false;

        }

        //Checks to see if isGame is both set to same (false/false) or (true/true)
        if (!(isGame != other.isGame)) {

            return false;

        }

        //Checks to see if isAvailable is both set to same (false/false) or (true/true)
        if (!(isAvailable != other.isAvailable)) {

            return false;

        }

        //Checks to see if rating matches (1/1) etc and rating can be 0
        if (rating != other.rating) {

            return false;

        }

        //Checks to see if number of copies sold matches and number of copies can be 0
        if (numberOfCopiesSold != other.numberOfCopiesSold) {

            return false;

        }

        //Checks to see year released match
        if (dateReleased != other.dateReleased) {

            return false;

        }

        //Checks to see if cost is equal
        if (cost != other.cost) {

            return false;

        }

        return true;
    }

    //IsValid Method (Checks to see if minimum requirements have been set)
    public boolean isValid(Object obj) {

        //Creates the object in order to check its properties
        VideoGame other = (VideoGame) obj;

        //A game needs a type of game(genre) , name , and has to be a game , its year released , cost 
        
      
        
        
         //Checks to see if type of game is set as null will be default if not set properly
         
         if(other.typeofGame == null){
             
             return false;
             
         }
        
        //Checks to see if "isGame" is set to true as it will be set to false if not set properly
        
        if((other.isGame == false)){
            
            return false;
            
            
        }
        
        //Checks to see if date Released is set , as it will be set to null if not set properly
        
        if(other.dateReleased == null){
            
            return false;
            
            
        }
        
        
        //Checks to see if cost is above 0 as cost will be set 0 if not set properly 
        
        if(other.cost == 0){
            
            return false;
            
            
        }
        
        
        
        
        return true;
        
        
        
        
        
        
        
    }

}
