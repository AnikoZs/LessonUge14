package demo.MyException;

public class AgeChecker {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        AgeChecker checker = new AgeChecker();

        try {
            checker.checkAge(16); // denne alder vil give en fejl
        } catch (UnderAgeException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

        System.out.println("Programmet fortsætter...");
    }

    public void checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Du skal være mindst 18 år gammel.");
        } else {
            System.out.println("Alder godkendt: " + age + " år.");
        }
    }


}

