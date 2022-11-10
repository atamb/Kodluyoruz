import java.util.Scanner;

public class Loop10 {
    public static void main(String[] args) {
        int first,sec,lcm=1,i=1, gcd;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        first= scan.nextInt();
        System.out.println("Enter the second number: ");
        sec= scan.nextInt();
        while(lcm%sec!=0){
            lcm=first*i;
            i++;
        }
        System.out.println("LCM: "+ lcm);
        gcd=(first*sec)/lcm;
        System.out.println("GCD: "+ gcd);
    }
}
