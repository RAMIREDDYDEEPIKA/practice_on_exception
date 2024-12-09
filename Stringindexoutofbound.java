package exceptionsCom;

public class Stringindexoutofbound
{
    public static void main(String[] args)
    {
        String str="you are beautiful";
        try{
            for(int i=0;i<str.length();i++){
                System.out.println(str.charAt(70));
            }
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Exception catched : "+e.getMessage());
        }

    }
}
