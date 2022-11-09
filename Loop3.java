import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        int result4=1, result5=1, input;
        Scanner scan=new Scanner(System.in);
        input= scan.nextInt();
        while(input>=result4){
            System.out.print(result4+ " ");
            result4*=4;
        }
        System.out.println("");
        while(input>=result5){
            System.out.print(result5+ " ");
            result5*=5;
        }
    }
}
