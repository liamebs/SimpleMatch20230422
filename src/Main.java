import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        // Use PlayerManager classes to create and display instances of the player data
        String[] data = {"marcus,rashford,forward,england,right,180,25",
                "cody,gakpo,forward,netherlands,right,193,23",
                "david,de gea,goalkeeper,spain,right,193,31",}; // Define the data array

        // Create an instance of PlayerManager with the data array as input
        PlayerManager manager = new PlayerManager(data);

        manager.displayPlayers(); // call the displayPlayers method to output the PLayer class instances




        // Player[] players = new Player[3];
        // for (int i = 0; i < players.length; i++)
        // {
        // // using BufferedReader and FileReader to parse player-data file and create player array
            // BufferedReader reader = new BufferedReader(new FileReader("/home/dolahillsimon/IdeaProjects/MyProjects/Football/Simple Match 20230422/src/player-info.txt"));
            // String line;
            // while ((line = reader.readLine()) != null) {
                // // split txt file line into different player elements
                // String[] parts = line.split(",");
                // String firstName = parts[0].toUpperCase();
                // String lastName = parts[1].toUpperCase();
                // String position = parts[2].toUpperCase();
                // String nationality = parts[3].toUpperCase();
                // String preferredFoot = parts[4].toUpperCase();
                // int height = Integer.parseInt(parts[5]);
                // int age = Integer.parseInt(parts[6]);
                // Player newPlayer = new Player(firstName, lastName, position, nationality,
                        // preferredFoot, height, age);
                // players[i] = newPlayer;
                // i++;

        // }


        // }






        // Match.play();



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