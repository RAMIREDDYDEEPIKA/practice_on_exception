package exceptionsCom;

import java.util.Scanner;

public class DividedByUserInput
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number that you want to divided by 100");
        try
        {
            int result = 100 / sc.nextInt();
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Enter another number,bcz Exception occurs: "+e.getMessage());
        }
    }
}