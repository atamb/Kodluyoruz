import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int i, a=1, pay=1, payda=1, first, sec, temp;
        System.out.println("Enter the first integer of combination");
        first=scan.nextInt();
        System.out.println("Enter the second integer of combination");
        sec=scan.nextInt();
        temp=sec;
        while(temp>=1){
        pay*=first;
        first--;
        temp--;
        }
        for(i=1;i<=sec;i++){
            payda*=i;
        }
        System.out.println(pay/payda);
    }
}
