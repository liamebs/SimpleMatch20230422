// Define a class to manage player data import and management
public class PlayerManager {
    private Player[] players; // Encapsulate the players field as private

    //Define constructor that takes in the data array as input
    public PlayerManager(String[] data) {
        players = new Player[data.length]; // Create a new 'Player' array

        /* Use a for loop to create a new instance of the Player class for each
        set of data and store it inv the 'players' array
         */
        for (int i = 0; i < data.length; i++) {
            String[] fields = data[i].split(","); // Split the data at comma delimiter
            String firstName = fields[0];
            String lastName = fields[1];
            String position = fields[2];
            String nationality = fields[3];
            String preferredFoot = fields[4];
            int height = Integer.parseInt(fields[5]); // extract height and convert to integer
            int age = Integer.parseInt(fields[6]);
            players[i] = new Player(firstName, lastName, position, nationality, preferredFoot, height, age);
        }
    }

    //Define method to display the 'players' data
    public void displayPlayers() {
        // Use loop to iterate over players array and print out the fields of each players instance
        for (Player player : players) {
            System.out.println(player.getFirstName().toUpperCase() + " " + player.getLastName().toUpperCase());
            System.out.println(player.getPosition().toUpperCase());
            System.out.println(player.getNationality().toUpperCase());
            System.out.println("PREFERRED FOOT: " + player.getPreferredFoot());
            System.out.println("HEIGHT: " + player.getHeight() + "CM");
            System.out.println("AGE: " + player.getAge());
            System.out.println();
        }
    }


}
