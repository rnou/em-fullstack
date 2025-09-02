package org.eidosmvn.exercice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Loan details
        double principal = 100000;
        double annualRate = 0.06;
        int years = 15;

        // Convert to monthly values
        double monthlyRate = annualRate / 12.0;
        int numberOfPayments = years * 12;

        // Mortgage equation:
        double numerator = monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments);
        double denominator = Math.pow(1 + monthlyRate, numberOfPayments) - 1;
        double monthlyPayment = principal * (numerator / denominator);

        System.out.println("Monthly Payment: $" + monthlyPayment);
    }
}