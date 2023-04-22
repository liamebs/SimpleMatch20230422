public class Main {
    public static void main(String[] args) {
        double count = 0;
        for (int i = 0; i < 100000; i++) {
            Match.play();
            count++;
        }

        double totalHomeGoals = Match.homeTeam.getGoalsScored();
        double totalAwayGoals = Match.awayTeam.getGoalsScored();

        double homeAvgGoals = totalHomeGoals / count;
        double awayAvgGoals = totalAwayGoals / count;

        System.out.println("Total home goals: " + totalHomeGoals);
        System.out.println("Average home goals: " + homeAvgGoals);
        System.out.println();
        System.out.println("Total away goals: " + totalAwayGoals);
        System.out.println("Average away goals " + awayAvgGoals);
    }
}