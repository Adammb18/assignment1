public class SavingAccount
{
    double annualinterest;
    double balance;
    double monthlyinterest;
    double withdrawals;
    double deposits;
    double totalinterest;

public SavingAccount(double Ainterest, double balance1) {
    balance1=balance;
    Ainterest=annualinterest;

}

public void getwithdrawals(double dollars){
    balance-= dollars;
    withdrawals += dollars;

}

public void getdeposits(double dollars){
    balance += dollars;
    deposits += dollars;
}

public double getmonthlyinterest(){
    return annualinterest/12;
}
double getbalance(){
    return balance;
}

public void calculatemonthlyinterest(){
    monthlyinterest= balance* getmonthlyinterest();
    totalinterest= totalinterest + balance* getmonthlyinterest();
    balance= balance+ balance* getmonthlyinterest();
}
public double getTotalWithdrawals(){
    return withdrawals;
}
public double getTotalDeposits(){
    return deposits;
}
public double getTotalInterest(){
    return totalinterest;
}
public static void displayData(SavingAccount sa) 
    {
        double balance=sa.getbalance();
        double totalinterest=sa.getmonthlyinterest();
        System.out.println("Total deposited: " +deposits);
        System.out.println("Total withdrawn: " +withdrawals);
        System.out.println("Interest earned: " +totalinterest);
        System.out.println("Ending balance: " +balance);
        
    }

}
