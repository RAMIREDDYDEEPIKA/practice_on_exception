package exceptionsCom;

class NegativeNumberException extends RuntimeException
{
    public NegativeNumberException(String message)
    {
        super(message);
    }
}

public class CheckNumber
{
    public static void checkNumber(int number)
    {
        if (number < 0) {
            throw new NegativeNumberException("Number must not be negative.");
        }
    }

    public static void main(String[] args)
    {
        try {
            checkNumber(-5);
        }
        catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}