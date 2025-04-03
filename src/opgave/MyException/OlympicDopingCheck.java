package opgave.MyException;

// Main class to run the doping check
public class OlympicDopingCheck {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        // Creating some athlete objects
        Athlete athlete1 = new Athlete("John Doe", "100m Sprint", false);
        Athlete athlete2 = new Athlete("Jane Smith", "Swimming", true);
        Athlete athlete3 = new Athlete("Alice Brown", "Cycling", false);
        Athlete athlete4 = new Athlete("Bob Johnson", "Weightlifting", true);

        // Array of athletes to check
        Athlete[] athletes = {athlete1, athlete2, athlete3, athlete4};

        // Checking doping status for each athlete
        for (Athlete athlete : athletes) {
            try {
                athlete.checkForDoping(); // Check for doping
            } catch (DopingException e) {
                System.out.println(e.getMessage()); // Handle doping violation
            }
        }
    }

}