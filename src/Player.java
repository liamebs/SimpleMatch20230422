public class Player {
    private final String firstName;
    private final String lastName;
    private final String position;
    private final String nationality;
    private final String preferredFoot;
    private final int height;
    private final int age;

    // create constructor for Player class and initialise instance variables
    public Player(String firstName, String lastName, String position,
           String nationality, String preferredFoot, int height, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.nationality = nationality;
        this.preferredFoot = preferredFoot;
        this.height = height;
        this.age = age;
    }

    // getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPreferredFoot() {
        return preferredFoot;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }



}
