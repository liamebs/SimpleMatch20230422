public class Team {
    // fields to store the team name and number of goals scored
    private final String name;
    private int goalsScored;

    /* constructor that takes in the name of the team
    and sets the goals to 0
     */
    public Team(String name) {
        this.name = name;
        this.goalsScored = 0;
    }

    // getter method to get the name of the team
    public String getName() {
        return name;
    }

    // getter method to get the number of goals scored by the team
    public int getGoalsScored() {
        return goalsScored;
    }

    // setter method to increment the number of goals scored by the team by 1
    public void scoreGoal() {
        goalsScored++;
    }
}
