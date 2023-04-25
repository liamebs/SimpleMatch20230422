import java.io.*;

// Use the classes to create and display instances of the data
public class Main {
    public static void main(String[] args) throws IOException {
        // Specify the name of the text file
        String fileName = "/home/dolahillsimon/IdeaProjects/MyProjects/Football/Simple Match 20230422/src/player-info.txt";
        // Call the method to read data from the file and store it in the array
        String[] data = readDataFromFile(fileName);

        // Create an instance of PlayerManager with the data array as input
        PlayerManager manager = new PlayerManager(data);

        manager.displayPlayers(); // call the displayPlayers method to output the PLayer class instances

    }

    // Method to read data from a file and return it as an array of strings
    public static String[] readDataFromFile(String fileName) throws IOException {
        String [] data = null; // Initialise the data array as null
        // Create a BufferedReader to read from the file
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line; // Variable to store each line of data read from the file
        int numLines = 0; // Variaable to count the number of lines

        // Count the number of lines in the file
        while ((line = reader.readLine()) != null) {
            numLines++;
        }

        reader.close(); // Close the BufferedReader

        data = new String[numLines]; // Create a new String array with 'numLines' length

        // Re-open the file and read data into the array

        reader = new BufferedReader(new FileReader(fileName)); // Re-open the file
        for (int i = 0; i < numLines; i++) {
            data[i] = reader.readLine(); // Read each line of data and store it in the data array
        }

        reader.close(); // Close the BufferedReader

        return data; // Return the data array
    }

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