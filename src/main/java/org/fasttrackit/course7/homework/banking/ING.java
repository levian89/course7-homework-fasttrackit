package org.fasttrackit.course7.homework.banking;

public class ING implements BankingService {
    private double availableFunds;

    public double getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    @Override
    public double withdraw(double sum) {
        if (sum <= availableFunds) {
            availableFunds -= sum;
            System.out.println("Operation successful. Withdrawn amount: " + sum +
                    "\nRemaining funds: " + availableFunds);
            return availableFunds - sum;
        } else {
            System.out.println("Insufficient funds. Sum " + sum + " cannot be withdrawn. " +
                    "\nMaximum amount that can be withdrawn: " + availableFunds);
        }
        return availableFunds;
    }

    @Override
    public double deposit(double sum) {
        availableFunds += sum;
        System.out.println("Operation successful. Added amount: " + sum +
                "\nTotal funds: " + availableFunds);
        return availableFunds;
    }
}
