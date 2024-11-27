/**
 * CARE Interface
 * Defines the functional requirements for the CARE system interaction with the Vizier role.
 */
public interface CARE {

    /**
     * Adds a champion to the Vizier's team if funds are sufficient and the champion is available.
     * 
     * @param championName The name of the champion to add.
     * @return true if the champion is successfully added; false otherwise.
     */
    boolean addChampion(String championName);

    /**
     * Retires a champion from the Vizier's team, refunding half the entry fee.
     * 
     * @param championName The name of the champion to retire.
     * @return true if the champion is successfully retired; false otherwise.
     */
    boolean retireChampion(String championName);

    /**
     * Selects a challenge for the Vizier's team to undertake.
     * 
     * @param challengeNumber The number of the challenge to select.
     * @return int representing the result of the challenge:
     *         0 - Challenge won, reward added to treasury.
     *         1 - Challenge lost on skill level, champion disqualified.
     *         2 - Challenge lost due to no suitable champion, reward deducted.
     *         3 - Rare Earth defeated, reward deducted.
     *        -1 - No such challenge.
     */
    int selectChallenge(int challengeNumber);

    /**
     * Gets the current balance of the Vizier's treasury.
     * 
     * @return The current treasury amount.
     */
    int viewTreasury();

    /**
     * Retrieves the current state of the Vizier's team and champions.
     * 
     * @return String containing details of the team and their states.
     */
    String viewTeamState();

    /**
     * Retrieves details of a specific champion.
     * 
     * @param championName The name of the champion to retrieve details for.
     * @return String containing champion details or a message if the champion is not found.
     */
    String getChampionDetails(String championName);

    /**
     * Lists all champions currently available for entry into the tournament.
     * 
     * @return List of strings, each representing an available champion's details.
     */
    List<String> listAvailableChampions();

    /**
     * Lists all challenges currently available in the tournament.
     * 
     * @return List of strings, each representing a challenge's details.
     */
    List<String> listChallenges();

    /**
     * Displays the overall state of the game.
     * 
     * @return String summarizing the game state.
     */
    String viewGameState();
}
