package edu.hdsb.gwss.zohaib.ics4u.u4;


/*

 +* Name: Zohaib Ahmad
 +
 + * Date : Monday , May 1st
 +
 + * Version : v0.03
 +
 +  * Description : Creates a class of which is the parent to videogame and has a 1..N relationship.



/**
 *
 * @author 1ahmadzoh
 */
import java.util.ArrayList;
import java.util.Objects;

public class System {

    //String - company and console
    private String company;
    private String console;

    //Boolean - Set to false , only if input is set to true will it change
    private boolean isConsole = false;
    private boolean stillManufactured = false;

    //Int - date released - year released + month released + day released / and a  cost variable
    private String dateReleased;
    private int yearReleased;
    private int monthReleased;
    private int dayReleased;
    private int cost;

    //Encapsulation Variable(s) - data that user can't see
    private String storedVideoGameData;

    //Constants (Strings) - All the types of console it can be - Pc, xbox , playstation or wii
    private static final String CONSOLE_ONE = "PC";
    private static final String CONSOLE_TWO = "XBOX";
    private static final String CONSOLE_THREE = "PLAYSTATION";
    private static final String CONSOLE_FOUR = "WII";

    //Minimum length for company name
    private static final int MINMUM_LENGTH = 4;

    //Maximum length for company name
    private static final int MAXIMUM_LENGTH = 50;

    //Int
    //Minimum Year it can be released - first console was released in 1972
    private static final int MINIMUM_YEAR = 1972;

    //Maximum Year it can be released - current year can't go beyond that
    private static final int MAXIMUM_YEAR = 2017;

    //Minimum Day that it can be released - 1
    private static final int MINIMUM_DAY = 1;

    //Maximum Day that it can be released - 30
    private static final int MAXIMUM_DAY = 30;

    //Minimum month it can be released - 1
    private static final int MINIMUM_MONTH = 1;

    //Maximum month it can be released - 12;
    private static final int MAXIMUM_MONTH = 12;

    //Array to add game(s)
    private ArrayList<VideoGame> games;

    VideoGame game;

    //Syntax to creating default constructor
    public System() {

        this.game = new VideoGame();
        games = new ArrayList<>();
        //Default Values for default constructor
        //Set both company and console name to null and null
        this.company = null;
        this.console = null;

        //Set isConsole and stillManufactured to false
        this.isConsole = false;
        this.stillManufactured = false;

        //Set yearReleased and cost to 0 and 0
        this.yearReleased = 0;
        this.monthReleased = 0;
        this.dayReleased = 0;

        //Sets date after setting year/day/month
        this.dateReleased = null;

        //Sets cost to 0 
        this.cost = 0;

    }

    //Primary Key : A company cannot have the same id as another
    public String getCompany() {

        //Returns company based on what it was set or not then "null"
        return company;
    }

    //Sets the company name to argument passed
    public void setCompany(String company) {

        //If company name is above minimum and below maximum its valid
        if (company.length() >= MINMUM_LENGTH && company.length() <= MAXIMUM_LENGTH) {

            //Sets company if statement returns true
            this.company = company;

        }
    }

    //Gets the value console was set
    public String getConsole() {

        //Gets the value of console if set or not then "null"
        return console;
    }

    //Method to set Console with argument String - console
    public void setConsole(String console) {

        //If statement to check if the console is equal to any of the four allowed (Pc , playstation , xbox and wii)
        if (CONSOLE_ONE.equals(console) || CONSOLE_TWO.equals(console) || CONSOLE_THREE.equals(console) || CONSOLE_FOUR.equals(console)) {

            //Sets console if the statement returns true
            this.console = console;

        }
    }

    //Method to return value of isConsole
    public boolean getIsConsole() {

        //Returns on what it set - if not default value "false"
        return isConsole;
    }

    //Sets the value of "isConsole" with argument boolean - isConsole
    public void setIsConsole(boolean isConsole) {

        //this is a console only if IsConsole is set to true
        if (isConsole) {
            this.isConsole = isConsole;
        }
    }

    //Method to return value of StillManufactured
    public boolean isStillManufactured() {

        //Returns on what it set - if not default value "false"
        return stillManufactured;
    }

    //Method to set the value of StillManufactured
    public void setStillManufactured(boolean stillManufactured) {

        //This is used to check if the console is still manufactured
        if (stillManufactured) {

            this.stillManufactured = stillManufactured;

        }
    }

    //Method to get value of getYearReleased
    public String getdateReleased() {

        //Returns value on what it is set - if not default value "0"
        return dateReleased;
    }

    //Method to set value of date released
    public void setdateReleased(int dayReleased, int monthReleased, int yearReleased) {

        //If it is above or equal to min or less then equal to max then set it
        if (yearReleased >= MINIMUM_YEAR && yearReleased <= MAXIMUM_YEAR) {

            this.yearReleased = yearReleased;

        }

        // Checks to see if day is valid
        if (dayReleased >= MINIMUM_DAY && dayReleased <= MAXIMUM_DAY) {

            this.dayReleased = dayReleased;

        }

        //Checks to see if month is valid 
        if (monthReleased >= MINIMUM_MONTH && monthReleased <= MAXIMUM_MONTH) {

            this.monthReleased = monthReleased;

        }

        //Sets date after setting day/month/year
        this.dateReleased = dayReleased + " / " + monthReleased + " / " + yearReleased;

    }

    //Method to get cost
    public int getCost() {

        //Returns value on what it is set - if not default value "0"
        return cost;
    }

    //Method to set value of cost
    public void setCost(int cost) {

        //Since pc can go into $10k range as long as its above 100 its valid
        if (cost >= 100) {

            this.cost = cost;

        }
    }

    //Can't tell user the data that is stored from video game
    public void setStoredVideoGameData(String storedVideoGameData) {

        //As long as there's data its valid
        if (!(storedVideoGameData.isEmpty())) {
            this.storedVideoGameData = storedVideoGameData;
        }
    }

    //Add Method - adds videogame object(s) to system object
    public void add(VideoGame videoGame) {
        //Checks to see if its not null or if its valid and if not sends message say "cant add"
        if (videoGame == null || !videoGame.isValid(videoGame)) {

            java.lang.System.out.println("Invalid Object - Can't add");

        } //Checks to see if theirs duplicate - if there is - don't add and tell user
        else if (games.contains(videoGame)) {

            java.lang.System.out.println("Duplicate!");

        } //Finally if all the statements are false - no duplicate , not null , is valid add game
        else {
            java.lang.System.out.println("Succesfully Added!");
            games.add(videoGame);
        }

    }

    //Removal Method - removes videogame object(s) to system object
    public void remove(VideoGame videoGame) {

        //if statement thats gets all games
        if (games.contains(videoGame)) {

            //Print out "Removed"
            java.lang.System.out.println("Removed");

            //Remove game from list
            games.remove(videoGame);

            //else statement  
        } else {

            //Could not find - print it out (doesnt exist)
            java.lang.System.out.println("Could not find it");

        }

    }

    //Get Method
    public void get(VideoGame videoGame) {

        //Variables
        int index;

        //if statement thats gets all games
        if (games.contains(videoGame)) {

            index = games.indexOf(videoGame);

            java.lang.System.out.println(games.get(index));

            //else statement  
        } else {

            //Could not find in list - to tell user (prints it out)
            java.lang.System.out.println("Could not find it");

        }

    }

    //To String Method
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        //Formats The Output nicely, this.company refers to company name + Company with curly braces and if no info dont give object name
        if (this.company == null) {

            result.append("\n" + "Company {" + "\n");

        } else {

            result.append(this.company).append("Company {" + "\n");

        }
        //Specifically tells user, the company name
        result.append("Company Name : ").append("N/A").append("\n");

        //Tells user the console
        result.append("Console : ").append(this.console).append("\n");

        //Tells user wheter it is a console or not
        result.append("Is it a Console : ").append(this.isConsole).append("\n");

        //Tells user wheter console is still manufactured
        result.append("Is it still manufactured : ").append(this.stillManufactured).append("\n");

        //Tells user the year the console was released
        result.append("Date Released : ").append(this.dateReleased).append("\n");

        //Tells user the cost of the game
        result.append("Cost of the System : ").append(this.cost).append("\n" + "}" + "\n");

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
        System other = (System) obj;

        //Checks to see if comapny match and if not return false
        if (company == null ? other.company != null : !company.equals(other.company)) {

            return false;

        }

        //Checks to see if type of console matches and if not return false
        if (console == null ? other.console != null : !console.equals(other.console)) {

            return false;

        }

        //Checks to see if isConsole matches (f/f) and (t/t) and if not return false
        if (!(isConsole != other.isConsole)) {

            return false;

        }

        //Checks to see if isManufactured is both set to same (false/false) or (true/true)
        if (!(stillManufactured != other.stillManufactured)) {

            return false;

        }

        //Checks to see date released match
        if (dateReleased == null ? other.dateReleased != null : !dateReleased.equals(other.dateReleased)) {

            return false;

        }

        //Checks to see if cost is equal
        return cost == other.cost;
    }

    @Override // used to overide .equals method
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.company);
        hash = 83 * hash + Objects.hashCode(this.console);
        hash = 83 * hash + (this.isConsole ? 1 : 0);
        hash = 83 * hash + (this.stillManufactured ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.dateReleased);
        hash = 83 * hash + this.yearReleased;
        hash = 83 * hash + this.monthReleased;
        hash = 83 * hash + this.dayReleased;
        hash = 83 * hash + this.cost;
        hash = 83 * hash + Objects.hashCode(this.storedVideoGameData);
        hash = 83 * hash + Objects.hashCode(this.games);
        hash = 83 * hash + Objects.hashCode(this.game);
        return hash;
    }

    //IsValid Method (Checks to see if minimum requirements have been set)
    public boolean isValid(System system) {

        //A System needs a console , company , isConsole to be set to true, dateReleased and cost 
        //Checks to see if console is set - if not then it will set to null (invalid)
        if (system.console == null) {

            java.lang.System.out.println("Invalid System Object - properties don't make sense");
            return false;

        }

        //Checks to see if type of company is set - if not then it will be set null (invalid)
        if (system.company == null) {

            java.lang.System.out.println("Invalid System Object - properties don't make sense");
            return false;

        }

        //Checks to see if "isConsole" is set to true - if not then it will be set false (invalid)
        if ((system.isConsole == false)) {

            java.lang.System.out.println("Invalid System Object - properties don't make sense");
            return false;

        }

        //Checks to see if year Released is set  - if not then it will be set null(invalid)
        if (system.dateReleased == null) {

            java.lang.System.out.println("Invalid System Object - properties don't make sense");
            return false;

        }

        //Checks to see if cost is set - if not then it will be set to 0 (invalid)
        if (system.cost == 0) {

            java.lang.System.out.println("Invalid System Object - properties don't make sense");
            return false;

        }

        //prints out message is valid
        java.lang.System.out.println("Is Valid");

        return true;

    }

}
