package ex009lists.bank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,
                               String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchname,
                                          String customerName, double transaction){
        Branch branch = findBranch(branchname);
        if (branch == null){
            return false;
        }
        return branch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)){
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        Branch branch = findBranch(branchName);
        if (branch == null){
         return false;
        }
        System.out.println("Customer details for branch "
                + branch.getName());

        for (int i = 0; i < branch.getCustomers().size(); i++) {
            System.out.println("Customer: " +
                    branch.getCustomers().get(i).getName() +
                    "[" + (i+1) + "]");

            if (printTransaction){
                System.out.println("Transactions");
                for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (j+1) + "]" + " Amount " + branch.getCustomers().get(i).getTransactions().get(j));
                }
            }
        }
        return true;
    }
}
