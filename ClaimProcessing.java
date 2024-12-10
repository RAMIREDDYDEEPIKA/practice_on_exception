package exceptionsCom;

class FraudulentClaimException extends RuntimeException
{
    public FraudulentClaimException(String message) {
        super(message);
    }
}

class InvalidClaimAmountException extends RuntimeException
{
    public InvalidClaimAmountException(String message) {
        super(message);
    }
}

public class ClaimProcessing
{
    static final double MAX_CLAIM_AMOUNT = 10000.0;
    public static void processClaim(double claimAmount, String claimDate, String policyCoverageStartDate)
    {
        if (claimAmount > MAX_CLAIM_AMOUNT) {
            throw new InvalidClaimAmountException("Claim amount exceeds the maximum allowable amount.");
        }
        if (claimDate.compareTo(policyCoverageStartDate) < 0) {
            throw new FraudulentClaimException("Claim date is before the policy coverage start date, indicating possible fraud.");
        }
        System.out.println("Claim processed successfully.");
    }

    public static void main(String[] args)
    {
        double claimAmount = 12000.0;
        String claimDate = "2024-12-01";
        String policyCoverageStartDate = "2024-01-01";
        try {
            processClaim(claimAmount, claimDate, policyCoverageStartDate);
        }
        catch (InvalidClaimAmountException e) {
            System.out.println("Claim rejected: " + e.getMessage());
        }
        catch(FraudulentClaimException f){
            System.out.println("Claim rejected: " + f.getMessage());
            System.out.println("Notification sent to claims department for further investigation.");

        }
    }
}