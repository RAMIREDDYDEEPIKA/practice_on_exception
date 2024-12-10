package exceptionsCom;

class PolicyExpiredException extends Exception
{
    public PolicyExpiredException(String message) {
        super(message);
    }
}

class PaymentPendingException extends Exception
{
    public PaymentPendingException(String message) {
        super(message);
    }
}

class NonComplianceException extends Exception
{
    public NonComplianceException(String message) {
        super(message);
    }
}

public class PolicyRenewal
{
    public static void renewPolicy(String policyStatus, boolean hasPendingPayment, boolean isCompliant)
            throws PolicyExpiredException, PaymentPendingException, NonComplianceException
    {
        if ("expired".equalsIgnoreCase(policyStatus)) {
            throw new PolicyExpiredException("The policy has expired and cannot be renewed.");
        }
        if (hasPendingPayment) {
            throw new PaymentPendingException("Payment is pending. Please clear outstanding payments before renewal.");
        }
        if (!isCompliant) {
            throw new NonComplianceException("Policyholder does not meet the renewal compliance requirements.");
        }
        System.out.println("Policy renewed successfully.");
    }

    public static void main(String[] args)
    {
        String policyStatus = "expired";
        boolean hasPendingPayment = false;
        boolean isCompliant = true;

        try {
            renewPolicy(policyStatus, hasPendingPayment, isCompliant);
        }
        catch (PolicyExpiredException | PaymentPendingException | NonComplianceException e)
        {
            System.out.println("Policy renewal failed: " + e.getMessage());
            System.out.println("Notification sent to policyholder.");
        }
    }
}