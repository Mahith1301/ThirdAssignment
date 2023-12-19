package Third_Assignment3a;
import java.util.Scanner;


public class Banking_application{
    public static void main(String args[]){
        
        bank_Acc b1=new bank_Acc();


        while(true){
        System.out.println("Enter 1 for Deposit enter 2 for withdraw enter 3 for fd enter 4 for balance checking enter any other int to exit ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==1){
        b1.deposit();
        }
        else if(x==2){
        b1.withdraw();
        }else if(x==3){
        b1.fd();
        }else if(x==4){
        b1.balance();
        }
        else{
            System.out.println("incorrect option try again");
            break;
        }
    }

    }
}