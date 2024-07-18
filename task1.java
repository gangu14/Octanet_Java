//Implementation of ATM Operations
import java.util.*;
class ATM
{
    Scanner s = new Scanner(System.in);
    int balance=0;
    public void Check()
    {
        System.out.println("Current Balance: "+balance);
    }
    public void Deposit()
    {
        System.out.println("Enter amount to be deposited: ");
        int dep = s.nextInt();
        balance+=dep;
        System.out.println("After Deposit the Balance is: "+balance);
    }
    public void Withdraw()
    {
        System.out.println("Enter amount to Withdraw: ");
        int with = s.nextInt();
        if(with>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance-=with;
            System.out.println("Amount Withdrawed Successfully");
        }
    }
}
public class task1
{
    public static void main(String args[])
    {
        int pin = 1234;
        int option=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pin: ");
        int input_pin = sc.nextInt();
        if(input_pin!=pin)
        {
            System.out.println("Incorrect Pin");
        }
        else
        {
            System.out.println("1.Check Balance\n2.Withdraw Money\n3.Deposit Money\n4.Quit");
            ATM atm = new ATM();
            while(option!=4)
            {
                System.out.println("Enter Option: ");
                option=sc.nextInt();
                switch (option) {
                    case 1:
                        atm.Check();
                        break;
                    case 2:
                        atm.Deposit();
                        break;
                    case 3:
                        atm.Withdraw();
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
