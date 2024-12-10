package exceptionsCom;

public class DiffCatch
{
    public static void main(String[] args)
    {
        try {
            int result = 10 / 0;
            String str = null;
            str.length();
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Attempt to access a null object.");
        }
        catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }
}