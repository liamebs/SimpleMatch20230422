public class Team {
    // fields to store the team name, number of goals scored and fouls committed
    private final String name;
    private int goalsScored;
    private int foulCount;

    /* constructor that takes in the name of the team
    and sets the goals to 0
     */
    public Team(String name) {
        this.name = name;
        this.goalsScored = 0;
        this.foulCount = 0;
    }

    // method to get the name of the team
    public String getName() {
        return name;
    }

    // method to get the number of goals scored by the team
    public int getGoalsScored() {
        return goalsScored;
    }

    // method to get the number of fouls committed

    public int getFoulCount() {
        return foulCount;
    }

    // method to increment the number of goals scored by the team by 1
    public void scoreGoal() {
        goalsScored++;
    }

    // method to increment the number of fouls committed by one
    public void commitFoul() {
        foulCount++;
    }
}
