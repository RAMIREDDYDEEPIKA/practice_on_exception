package exceptionsCom;

import java.io.IOException;

public class ReadFile
{
    public static void readFile() throws Exception
    {
        try {
            throw new IOException("Failed to read the file.");
        }
        catch (IOException e) {
            throw new Exception("An error occurred while processing the file.", e);
        }
    }

    public static void main(String[] args)
    {
        try {
            readFile();
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }
}