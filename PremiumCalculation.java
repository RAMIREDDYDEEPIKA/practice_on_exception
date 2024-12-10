package exceptionsCom;

class DataNotFoundException extends Exception
{
    public DataNotFoundException(String message) {
        super(message);
    }
}

class CalculationException extends RuntimeException
{
    public CalculationException(String message) {
        super(message);
    }
}

public class PremiumCalculation
{
    public static double calculateLifeInsurancePremium(int age, boolean hasHealthIssues) throws DataNotFoundException
    {
        if (age <= 0) {
            throw new DataNotFoundException("Age data is missing or invalid.");
        }
        double premium = 1000;
        if (hasHealthIssues) {
            premium += 500;
        }
        return premium;
    }

    public static double calculateHealthInsurancePremium(int age, boolean hasPreExistingConditions) throws DataNotFoundException
    {
        if (age <= 0) {
            throw new DataNotFoundException("Age data is missing or invalid.");
        }
        double premium = 800;
        if (hasPreExistingConditions) {
            premium += 400;
        }
        return premium;
    }

    public static double calculateVehicleInsurancePremium(String vehicleType)
    {
        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new CalculationException("Vehicle type data is missing or invalid.");
        }
        double premium = 1200;
        if (vehicleType.equalsIgnoreCase("SUV")) {
            premium += 300;
        }
        else if (vehicleType.equalsIgnoreCase("Sports")) {
            premium += 500;
        }
        return premium;
    }

    public static void main(String[] args)
    {
        try {
            double lifeInsurancePremium = calculateLifeInsurancePremium(30, true);
            System.out.println("Life Insurance Premium: " + lifeInsurancePremium);
        }
        catch (DataNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (CalculationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double healthInsurancePremium = calculateHealthInsurancePremium(40, false);
            System.out.println("Health Insurance Premium: " + healthInsurancePremium);
        }
        catch (DataNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (CalculationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double vehicleInsurancePremium = calculateVehicleInsurancePremium("SUV");
            System.out.println("Vehicle Insurance Premium: " + vehicleInsurancePremium);
        }
        catch (CalculationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}