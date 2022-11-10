import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        int result=0, input;
        Scanner scan= new Scanner(System.in);
        input= scan.nextInt();
        while(input>0){
            result+=input%10;
            input=input/10;
        }
        System.out.println(result);
    }
}
