package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Sanjay C.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "speeeday";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // TODO: Change this to your team name
        Team team = new Team("s25-xx");
        team.addMember("Daniel");
        team.addMember("Kate");
        team.addMember("Divyani P.");
        team.addMember("Sanjay C.");
        team.addMember("Derek");
        team.addMember("Phill");
        return team;
    }
}
