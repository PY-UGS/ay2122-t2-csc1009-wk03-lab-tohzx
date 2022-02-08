import java.util.Date;
import java.lang.Math.*;
public class Loan {
            private double annualInterestRate;
            private int numberOfYears;
            private double loanAmount;
            private Date loanDate;

        public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            this.loanDate = new Date();
        }

    public double getAnnualInterestRate() {
            return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment(){
            double monthlyPayment = (this.loanAmount * (getAnnualInterestRate()/12))/(1-(1/(Math.pow((1+(getAnnualInterestRate())/12),(numberOfYears*12)))));
            return monthlyPayment;
    }

    public double getTotalPayment() {
            double totalPayment = getMonthlyPayment() * getNumberOfYears() * 12;
            return totalPayment;
    }

}


