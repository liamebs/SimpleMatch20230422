public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[2];
        players[0] = new Player("Marcus", "Rashford", "Forward", "England",
                "Right", 180, 25);
        players[1] = new Player("Cody", "Gakpo", "Forward", "Netherlands",
                "Right", 193, 23);



        Match.play();



//        double count = 0;
//        for (int i = 0; i < 1; i++) {
//            Match.play();
//            count++;
//        }
//
//        double totalHomeGoals = Match.homeTeam.getGoalsScored();
//        double totalAwayGoals = Match.awayTeam.getGoalsScored();
//
//        double homeAvgGoals = totalHomeGoals / count;
//        double awayAvgGoals = totalAwayGoals / count;
//
//        System.out.println("Total home goals: " + totalHomeGoals);
//        System.out.println("Average home goals: " + homeAvgGoals);
//        System.out.println();
//        System.out.println("Total away goals: " + totalAwayGoals);
//        System.out.println("Average away goals " + awayAvgGoals);
    }
}