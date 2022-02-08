import java.util.Scanner;
public class Account {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example, 8.25:");
        double interestRate = in.nextDouble();
        interestRate = interestRate/100;

        System.out.println("Enter number of years as an integer:");
        int numberOfYears = in.nextInt();

        System.out.println("Enter loan amount, for example, 120000.95:");
        double loanAmount = in.nextDouble();

        in.close();

        Loan l01 = new Loan(interestRate, numberOfYears, loanAmount);

        System.out.println("The loan was created on " + l01.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.02f",l01.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.02f",l01.getTotalPayment()));
    }
}
