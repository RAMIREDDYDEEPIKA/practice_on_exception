package exceptionsCom;

public class Arrayindex
{
    public static void main(String[] args)
    {
        try
        {
            int[] arr={1,23,5,4,6,21,9};
            System.out.println(arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception caused by : "+e.getCause());
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
