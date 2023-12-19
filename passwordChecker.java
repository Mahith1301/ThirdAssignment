
import java.util.Scanner;
public class passwordChecker {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String pw=sc.next();
        sc.close();

        char ch[]=pw.toCharArray();
        int up=0,lo=0,di=0,sp=0;
        for(int x:ch){
            if(pw.length()<8){
            System.out.println(pw+" is weak password");
            }else if(x>=65 && x<90){
                up++;
            }else if(x>=97 && x<=122){
                lo++;
            }else if(x>=48 && x<=57){
                di++;
            }else if (x<127){
                sp++;
            }
        }
        if(up>=1 && lo>=1 && di>=1 && sp>=1 && pw.length()>=8){
            System.out.println(pw+" is strong password");    
        }else{
            System.out.println(pw+" is weak password");
        }

    }
}
