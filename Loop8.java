import java.util.Scanner;

public class Loop8 {
    public static void main(String[] args) {
        int input;
        String stars="*";
        Scanner scan= new Scanner(System.in);
        input= scan.nextInt();
        for(int i=1;i<=input;i++){
            System.out.println(stars);
            stars += "*";
        }
        for(int i=1;i<=input;i++){
            System.out.println(stars);
            stars = stars.substring(0, stars.length()-1);
        }
    }
}
