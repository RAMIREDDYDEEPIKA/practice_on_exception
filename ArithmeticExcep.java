package exceptionsCom;

public class ArithmeticExcep
{
    public static void main(String[] args)
    {
        try
        {
            int a=10/0;
            System.out.println(a);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Number not divisible by zero");
            System.out.println("Exception : "+e.getMessage());
            System.out.println("Exception : "+e.getCause());
        }
    }
}