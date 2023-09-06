package org.fasttrackit.course7.homework.banking;

public class BankingCustomer {
    private String name;
    private BankingService bankingService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankingService getBankingService() {
        return bankingService;
    }

    public void setBankingService(BankingService bankingService) {
        this.bankingService = bankingService;
    }
}
