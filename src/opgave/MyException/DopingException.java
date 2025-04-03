package opgave.MyException;

// Custom exception for doping violations
class DopingException extends Exception {
    public DopingException(String message) {
        super(message);
    }
}