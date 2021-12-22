package dzcorp.pattern;

public class StrategyMain {


    public static void main(String[] args) {

        Context add = new Context(new OperationAdd());

        System.out.println("Add operation   " + add.executeStrategy(1, 2));

        Context subtraction = new Context(new OperationSubtraction());

        System.out.println("Subtraction operation   " + subtraction.executeStrategy(2, 1));

        Context multiply = new Context(new OperationMultiply());

        System.out.println("Subtraction operation   " + multiply.executeStrategy(2, 4));

    }


}
