public class DepositAndWithdrawFiles {

    private double accountBal;
    private double annualInterest;
    private double tInterest;

    public SavingsAccount(double balance, double interestRate) {

        accountBal = balance;
        annualInterest = interestRate;
        tInterest = 0.0;
    }

    public void withdraw(double withdrawnAmount) {
        accountBal -= withdrawnAmount;
    }

    public void deposit(double depositedAmount) {
        accountBal += depositedAmount;
    }

    public void addInterest() {
        double monthlyInterest = annualInterest/12;
        tInterest = monthlyInterest*accountBal;
        accountBal +=tInterest;
    }


public static void main(String args[]) throws IOException {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter the annual interest rate: ");
    double interestRate = keyboard.nextDouble();

    DepositAndWithdrawalFiles depositAndWithdrawalFiles = new DepositAndWithdrawalFiles();
    SavingsAccount savingsAccount = depositAndWithdrawalFiles.new SavingsAccount(500, interestRate);

    Path depositPath = Paths.get("C:/Users/bisso/OneDrive/Desktop/Javaprojects/Deposits.txt").toAbsolutePath();
    double totalDeposits = Files.lines(depositPath).mapToDouble(Double::valueOf).sum();

    savingsAccount.deposit(totalDeposits);

    Path withdrawlsPath = Paths.get("C:/Users/bisso/OneDrive/Desktop/Javaprojects/Withdrawals.txt").toAbsolutePath();
    double totalWithdrawls = Files.lines(withdrawlsPath).mapToDouble(Double::valueOf).sum();

    savingsAccount.withdraw(totalWithdrawls);

    double prevBalance = savingsAccount.getAccountBalance();

    savingsAccount.addInterest();

    double interestEarned = savingsAccount.getLastAmountOfInterestEarned();


    System.out.println("Interest earned: $" + interestEarned);
    System.out.println("Prior balance: $" + prevBalance);
    System.out.println("Ending balance: $" +savingsAccount.getAccountBalance());

}
}