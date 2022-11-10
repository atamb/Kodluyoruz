import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int down, up, result=1;
        System.out.println("Enter the number: ");
        down = scan.nextInt();
        System.out.println("Enter the exponential part: ");
        up = scan.nextInt();
        for(int i=1;i<=up;i++){
            result*=down;
        }
        System.out.println(result);
    }
}
