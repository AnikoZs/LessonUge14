package opgave.MyException;

// Athlete class
class Athlete {
    private String name;
    private String sport;
    private boolean isDopingTestPositive;

    // Constructor
    public Athlete(String name, String sport, boolean isDopingTestPositive) {
        this.name = name;
        this.sport = sport;
        this.isDopingTestPositive = isDopingTestPositive;
    }

    // Method to check for doping
    public void checkForDoping() throws DopingException {
        if (isDopingTestPositive) {
            throw new DopingException(name + " has tested positive for doping in " + sport + "!");
        } else {
            System.out.println(name + " is clean and eligible to compete in " + sport + ".");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public boolean isDopingTestPositive() {
        return isDopingTestPositive;
    }
}
