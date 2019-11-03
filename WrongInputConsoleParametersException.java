public class WrongInputConsoleParametersException extends Exception {

    private String inputNumber;

    public WrongInputConsoleParametersException(String message, String inputNumber) {
        super(message);
        this.inputNumber = inputNumber;
    }

    public String returnProblemNumber(){
        return inputNumber;
    }


}
