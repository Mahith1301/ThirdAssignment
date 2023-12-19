package Third_Assignment3a;
import java.util.Scanner;

public class bank_Acc{
        Scanner sc=new Scanner(System.in);
        static double balance;
        static String accountType;
        bank_Acc(){
            System.out.println("Thank you for choosing our bank");
            System.out.println("which type of account you need to create");
            accType();
            System.out.println("account type created "+accountType);
            System.out.println("account created");
            balance();
            balance=0;

        }
        void accType(){
            System.out.println("enter 1 for saving enter 2 for current enter 3 for demat");
            int x=sc.nextInt();
            if(x==1){
                accountType="Savings account";
            }else if(x==2){
                accountType="current account";
            }else if(x==3){
                accountType="demat account";
            }else{
                System.out.println("incorrect option");
            }
        }
        void deposit(){
            System.out.println(" enter ammount to be deposited ");
            double x=sc.nextInt();
            balance=balance +x;
            balance();
        }
        void withdraw(){
            System.out.println(" enter ammount to be withdrawed ");
            double x=sc.nextInt();
            sc.close();
            if(balance<x){
                System.out.println("insufficient balance");
            }else{
                balance=balance-x;
                System.out.println("withdrawed amount "+x);
            }
            balance();
        }

        void fd(){
            System.out.println("Fixed deposit Created enter ammount you will deposit ");
            double fd=sc.nextInt();

            int intrest=5;
            System.out.println("enter timeperiod in years");
            double time=sc.nextInt();

            double amc=(fd*time*intrest)/100;
            System.out.println("intrest earned after timeperiod is "+amc);
            balance=balance-fd;
            balance();

        }

        void balance(){
            System.out.println("balance in account is "+balance);
        }
    }
