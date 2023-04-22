public class Match {

    // initialise two teams playing in the match
    static Team homeTeam = new Team("Manchester United");
    static Team awayTeam = new Team("Arsenal");
    static int minutes;

    // method that simulates the match
    public static void play() {
        // indicate the match has started
        System.out.println("The match has started!");

        // Simulate the match for 90 minutes
        while (minutes < 90) {
            // Simulate an action during the match, e.g., player shooting or tackling
            simulateAction();
            minutes++;
        }

        // indicate the match is over
        System.out.println("The referee blows the whistle for full-time!");

        // output the final score
        System.out.println(homeTeam.getName() + " " + homeTeam.getGoalsScored() + " - " + awayTeam.getGoalsScored() + " " + awayTeam.getName());

        // determine match outcome
        if (homeTeam.getGoalsScored() > awayTeam.getGoalsScored()) {
            System.out.println(homeTeam.getName() + " wins!");
        } else if (homeTeam.getGoalsScored() < awayTeam.getGoalsScored()) {
            System.out.println(awayTeam.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    // method simulating an action during the match
    private static void simulateAction() {
        /* simulate some action such as a player
        passing, shooting or tackling.  This can be random or
        based on an algorithm.
        Here I call the scoreGoal() method occasionally on either team
         */
        int randNum = (int) (Math.random() * 300);
        if (randNum < 5) {
            homeTeam.scoreGoal();
            System.out.println(homeTeam.getName() + " scores after " + minutes + " minutes!");
        } else if (randNum < 10) {
            awayTeam.scoreGoal();
            System.out.println(awayTeam.getName() + " scores after " + minutes + " minutes!");
        } else if (minutes == 45) {
            System.out.println("The referee blows for half-time!");
        }
    }
}