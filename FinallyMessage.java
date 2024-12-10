package exceptionsCom;

public class FinallyMessage
{
    public static void main(String[] args)
    {
        try {
            int number = 0;
            int result = 100 / number;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Division operation is complete.");
        }
    }
}