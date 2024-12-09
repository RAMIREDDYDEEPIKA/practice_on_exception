package exceptionsCom;

public class Illegalargument
{
    public static void main(String[] args)
    {
        int[] ages={1,-9,20};
        for(int age:ages)
        {
            try
            {
                printAge(age);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void printAge(int age)
    {
        if(age<0)
        {
            System.out.println("Age shouldn't be in negative");
        }
        System.out.println(age);
    }
}