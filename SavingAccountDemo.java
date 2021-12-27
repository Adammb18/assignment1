import java.util.Scanner;

public class SavingAccountDemo
{
    public static void main(String[] args)
    {
        double balance1;
        double aInterest;
        int months;
        double depositedAmount;
        double withdrawnAmount;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the saving account's starting balance: ");
        balance1 = keyboard.nextDouble();

        System.out.println("Enter the saving account's annual interest rate: ");
        aInterest= keyboard.nextDouble();

        System.out.println("How many months have passed since the account was opened? ");
        months= keyboard.nextInt();

        SavingAccount sa= new SavingAccount(balance1, aInterest);

        for (int m=1; m < months+1; m++)
        {
            System.out.println("Enter the amount deposited during month " +m +":");
            depositedAmount= keyboard.nextDouble();

            sa.getdeposits(depositedAmount);

            System.out.println("Enter the amount withdrawn during the month " +m +":");
            withdrawnAmount= keyboard.nextDouble();
            sa.getwithdrawals(withdrawnAmount);

            sa.calculatemonthlyinterest();

        }
        displayData(sa);
    }
    
}