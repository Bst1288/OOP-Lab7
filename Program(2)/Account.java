import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Account {
    private String name;
    private ArrayList<Transaction> transactions;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dataCreated;

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        transactions = new ArrayList<>();
    }

    public Account(String name, int id, double balance){
        this.name = name;
        this.id =id;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void setID(int newID){
        this.id = newID;
    }
    public int getID(){
        return id;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
    public double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate){
        this.annualInterestRate = newAnnualInterestRate;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public double  getMonthlyInterestRate(){
        return (annualInterestRate / 12);
    }

    public double getMonthlyInterest(){
        return balance * (this.getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount){
        balance -= amount;
        Transaction transaction = new Transaction(Transaction.WITHDRAWAL, amount, this.balance, "Standard");
        transactions.add(transaction);
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
        Transaction transaction = new Transaction(Transaction.DEPOSIT, depositAmount, this.balance, "Standard");
        transactions.add(transaction);
    }

    public String toString(){
        return "\nName : " + name +
                "\nAccount ID : " + id +
                "\nAnnual interest rate : " + annualInterestRate +
                "\nBalance : " + balance + "\n" +
                "----------------------------------------------------------------------------------------" +
                "\n\tDate\t\t"+"\t\t\tType"+"\t\tAmount"+"\t\tBalance"+ "\n" +
                "----------------------------------------------------------------------------------------" 
                + Arrays.toString(transactions.toArray()) +
                "---------------------------------------------------------------------------------------";
    }
}
