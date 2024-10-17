import java.util.*;

public class ATM {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Initial Amount(Balance): ");
        int balance=sc.nextInt();
        while(true){
            System.out.println("Choose from below(1 -4): ");
            System.out.println("1.Money Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Money to Withdraw: ");
                    int Withdraw=sc.nextInt();
                    WITHDRAW(Withdraw, balance);
                    break;
                case 2:
                    System.out.println("Enter Money to Deposit: ");
                    int deposit=sc.nextInt();
                    DEPOSIT(deposit,balance);
                    break;
                case 3:
                System.out.println("Enter the amount of Withdrawn: ");
                int with=sc.nextInt();
                System.out.println("Enter the amount of deposited :");
                int dep=sc.nextInt();
                    CHECKBALANCE(balance,with,dep);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

public static void WITHDRAW(int withdraw,int balance){
    if(balance>=withdraw){
        balance-=withdraw;
        System.out.println("Your Money has been Successfully Withdrawn");
        System.out.println("Balance : "+balance);
    }
    else{
        System.out.println("Insufficient Balance");
    }
}
public static void DEPOSIT(int deposit,int balance){
    balance+=deposit;
    System.out.println("Your Money has been Successfully Deposited");
    System.out.println("Balance : "+balance);
}
public static void CHECKBALANCE(int balance,int with,int dep){
    System.out.println("Your Available Balance: "+(balance-with+dep));
}
}
