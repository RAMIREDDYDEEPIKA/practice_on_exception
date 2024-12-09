package exceptionsCom;

public class NullpointerExcep
{
    public static void main(String[] args)
    {
        try
        {
            String str=null;
            System.out.println(str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("Exception caught: "+e.getMessage());
            System.out.println("Exception caused by : "+e.getCause());
            StackTraceElement[] stackTrace=e.getStackTrace();
            for(StackTraceElement data:stackTrace){
                System.out.println("Stack Trace" +data);
            }
            System.out.println("To string: "+e.toString());
        }
    }
}