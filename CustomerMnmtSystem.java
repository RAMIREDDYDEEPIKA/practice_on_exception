package exceptionsCom;

import java.util.*;

class CustomerNotFoundException extends Exception
{
    public CustomerNotFoundException(String message)
    {
        super(message);
    }
}

class InvalidCustomerDataException extends RuntimeException
{
    public InvalidCustomerDataException(String message)
    {
        super(message);
    }
}

class Customer
{
    int id;
    String name;
    String email;

    public Customer(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class CustomerMnmtSystem
{
    static final Map<Integer, Customer> customerDatabase = new HashMap<>();
    public static void addCustomer(Customer customer)
    {
        if (customer.id <= 0 || customer.name == null || customer.name.isEmpty() || customer.email == null || customer.email.isEmpty())
        {
            throw new InvalidCustomerDataException("Invalid customer data provided.");
        }
        customerDatabase.put(customer.id, customer);
        System.out.println("Customer added successfully: " + customer.name);
    }

    public static void updateCustomer(int customerId, String name, String email) throws CustomerNotFoundException
    {
        Customer customer = customerDatabase.get(customerId);
        if (customer == null)
        {
            throw new CustomerNotFoundException("Customer with ID " + customerId + " not found.");
        }
        customer.name = name;
        customer.email = email;
        System.out.println("Customer updated successfully: " + name);
    }

    public static void deleteCustomer(int customerId) throws CustomerNotFoundException
    {
        Customer customer = customerDatabase.get(customerId);
        if (customer == null)
        {
            throw new CustomerNotFoundException("Customer with ID " + customerId + " not found.");
        }
        customerDatabase.remove(customerId);
        System.out.println("Customer deleted successfully: " + customer.name);
    }

    public static void main(String[] args)
    {
        try
        {
            Customer customer1 = new Customer(1, "Aashu", "aashu@example.com");
            addCustomer(customer1);
            updateCustomer(2, "Aashu Ella", "aashuella@example.com");
            deleteCustomer(1);
        }
        catch (InvalidCustomerDataException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (CustomerNotFoundException e) {
            System.out.println("Exception occurs that: " + e.getMessage());
        }
    }
}