/*

 +* Name: Zohaib Ahmad
 +
 + * Date : Saturday , April 28th
 +
 + * Version : v0.02
 +
 +  * Description : Used to test System and video game



/**
 *
 * @author 1ahmadzoh
 */
package edu.hdsb.gwss.zohaib.ics4u.u4;

/**
 *
 * @author 1ahmadzoh
 */
public class VideoGameTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Testing
        //Test #1 : Empty Constructor
        //Pre Condition (none)
        VideoGame game = new VideoGame();
        System system = new System();

        //Post Condition 
        java.lang.System.out.println(game + "\n");
        java.lang.System.out.println(system + "\n");

        java.lang.System.out.println("----------------------------------------------");

        java.lang.System.out.println("Test #1 - Empty Constructor");

        VideoGame games = new VideoGame();

        System systems = new System();

        //VideoGame
        assert (games.getConsoles() == null);

        assert (games.getTypeofGame() == null);

        assert (games.getName() == null);

        assert (games.getNumberOfCopiesSold() == 0);

        assert (games.getCosts() == 0);

        assert (game.getRating() == 0);

        assert (game.getdateReleased() == null);

        //System
        assert (system.getCompany() == null);

        assert (system.getConsole() == null);

        assert (system.getIsConsole() == false);

        assert (system.getCost() == 0);

        assert (system.getdateReleased() == null);

        //Test #2 : isValid()
        //VideoGame
        games.isValid(games);

        java.lang.System.out.println();
        //Sysem

        system.isValid(system);

        java.lang.System.out.println("----------------------------------------------");

        java.lang.System.out.println("Test # 2  - isValid()");

        //System
        System playstation = new System();
        playstation.setConsole("PLAYSTATION");

        playstation.setCompany("Sony");

        playstation.setIsConsole(true);

        playstation.setdateReleased(2, 8, 2012);

        playstation.setCost(100);

        playstation.isValid(playstation);

        java.lang.System.out.println();

        //VideoGame
        VideoGame callofduty = new VideoGame();

        callofduty.setConsoles(playstation);

        callofduty.setTypeofGame("ACTION");

        callofduty.setName("Call of duty");

        callofduty.setNumberOfCopiesSold(15);

        callofduty.setCosts(60);

        callofduty.setRating(2);

        callofduty.setIsGame(true);

        callofduty.setdateReleased(1, 10, 2012);

        callofduty.isValid(callofduty);

        //Test #3 : Add(..)
        java.lang.System.out.println("\n" + "Adding invalid 'videogame'");

        system.add(games);

        //Empty
        VideoGame gam = new VideoGame();

        java.lang.System.out.println();

        system.add(gam);

        java.lang.System.out.println("\n" + "Test #3 - add(..) invalid Triangle" + "\n");

        VideoGame ga = new VideoGame();

        ga.setCosts(0);
        ga.setIsAvailable(false);
        ga.setRating(-1);
        
        system.add(ga);

        java.lang.System.out.println();

        //Test #4 : add(..) - adding a valid object - created a valid system - playstation and added valid game call of duty
        java.lang.System.out.println("\n" + "Test #3 - add(..) Valid Triangle" + "\n");
        playstation.add(callofduty);
        

    }

}
