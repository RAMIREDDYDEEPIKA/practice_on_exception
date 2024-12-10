package exceptionsCom;

import java.util.InputMismatchException;

import java.util.Scanner;

public class MultipleCatches
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter user input 1:");
            int a= sc.nextInt();
            System.out.println("Enter user input 2:");
            int b=sc.nextInt();
            int result=a/b;
            System.out.println(result);
        }
        catch (InputMismatchException i){
            System.out.println("Input is mismatched "+i.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Exception occurs that :"+e.getMessage());
        }
    }
}