package exceptionsCom;

class InvalidAgesException extends Exception
{
    public InvalidAgesException(String message) {
        super(message);
    }
}

class PoorDrivingRecordException extends Exception
{
    public PoorDrivingRecordException(String message) {
        super(message);
    }
}

class HealthIssueException extends Exception
{
    public HealthIssueException(String message) {
        super(message);
    }
}

public class PolicyApplicationProcess
{
    public static void validateAge(int age) throws InvalidAgesException
    {
        if (age < 18) {
            throw new InvalidAgesException("Age must be 18 or older.");
        }
    }

    public static void validateDrivingHistory(boolean hasPoorDrivingRecord) throws PoorDrivingRecordException
    {
        if (hasPoorDrivingRecord) {
            throw new PoorDrivingRecordException("Applicant has a poor driving record.");
        }
    }

    public static void validateHealthHistory(boolean hasHealthIssues) throws HealthIssueException
    {
        if (hasHealthIssues) {
            throw new HealthIssueException("Applicant has health issues that disqualify them.");
        }
    }

    public static void processApplication(int age, boolean hasPoorDrivingRecord, boolean hasHealthIssues)
    {
        try {
            validateAge(age);
            validateDrivingHistory(hasPoorDrivingRecord);
            validateHealthHistory(hasHealthIssues);
            System.out.println("Application processed successfully.");
        }
        catch (InvalidAgesException | PoorDrivingRecordException | HealthIssueException e) {
            System.out.println("Application rejected: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        int age = 16;
        boolean hasPoorDrivingRecord = false;
        boolean hasHealthIssues = true;
        processApplication(age, hasPoorDrivingRecord, hasHealthIssues);
    }
}