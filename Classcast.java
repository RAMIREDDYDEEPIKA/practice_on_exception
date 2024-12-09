package exceptionsCom;

public class Classcast
{
    public static void main(String[] args)
    {
         Object str="hahahha";
         try
         {
             Integer data=(Integer)str;
             System.out.println(data);
         }
         catch (ClassCastException i)
         {
             System.out.println(i.getMessage());
         }
    }
}