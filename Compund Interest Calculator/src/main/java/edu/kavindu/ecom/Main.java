package edu.kavindu.ecom;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount : ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %) : ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the no of times compounded per year : ");
        int times = scanner.nextInt();
        System.out.print("Enter the no of years : ");
        int years = scanner.nextInt();

        double decimalRate = interestRate / 100;

        double result = principal * Math.pow((1 + decimalRate/times), (times*years));

        System.out.printf("The amount of money accumulated after %d years (including interest) : %.2f",  years, result);

        scanner.close();
    }
}