package dzcorp.pattern;

public class OperationMultiply implements Strategy {

    public int doOperation(int number1, int number2) {
        return number1 * number2;
    }

}
