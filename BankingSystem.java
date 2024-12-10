package exceptionsCom;

class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}

public class BankingSystem
{
    static double balance = 500.0;
    public static void withdraw(double amount) throws InsufficientFundsException
    {
        if (amount > balance)
        {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance =balance- amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args)
    {
        try
        {
            withdraw(600.0);
        }
        catch (InsufficientFundsException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}