package ex009lists.bank;

import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {

        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        for (int i = 0; i < customers.size(); i++) {
            if (Objects.equals(customers.get(i).getName(), customerName)){
                customers.get(i).addTransaction(transaction);
                return true;
            }
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < customers.size(); i++) {
            if (Objects.equals(customers.get(i).getName(), customerName)){
                return customers.get(i);
            }
        }
        return null;
    }
}
