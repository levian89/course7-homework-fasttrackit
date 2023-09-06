package org.fasttrackit.course7.homework.banking;

public class BankingMain {
    public static void main(String[] args) {
        BankingCustomer bankingCustomer = new BankingCustomer();
        bankingCustomer.setName("Xulescu");
        BRD brdService = new BRD();
        brdService.setAvailableFunds(50);
        bankingCustomer.setBankingService(brdService);
        System.out.println(bankingCustomer.getName() + " used "
                + bankingCustomer.getBankingService().getClass().getSimpleName());
        System.out.println("Available funds for " + bankingCustomer.getBankingService().getClass().getSimpleName()
                + ": " + brdService.getAvailableFunds());
        bankingCustomer.getBankingService().withdraw(50);
        bankingCustomer.getBankingService().deposit(30);
        System.out.println("Available funds for " + bankingCustomer.getBankingService().getClass().getSimpleName()
                + ": " + brdService.getAvailableFunds());
        System.out.println("**************");

        ING ingService = new ING();
        ingService.setAvailableFunds(100);
        bankingCustomer.setBankingService(ingService);
        System.out.println(bankingCustomer.getName() + " used "
                + bankingCustomer.getBankingService().getClass().getSimpleName());
        System.out.println("Available funds for " + bankingCustomer.getBankingService().getClass().getSimpleName()
                + ": " + ingService.getAvailableFunds());
        bankingCustomer.getBankingService().withdraw(110);
        System.out.println("**************");

        BT btService = new BT();
        btService.setAvailableFunds(200);
        bankingCustomer.setBankingService(btService);
        System.out.println(bankingCustomer.getName() + " used "
                + bankingCustomer.getBankingService().getClass().getSimpleName());
        System.out.println("Available funds for " + bankingCustomer.getBankingService().getClass().getSimpleName()
                + ": " + btService.getAvailableFunds());
        bankingCustomer.getBankingService().withdraw(150);
        System.out.println("Available funds for " + bankingCustomer.getBankingService().getClass().getSimpleName()
                + ": " + btService.getAvailableFunds());
    }
}
