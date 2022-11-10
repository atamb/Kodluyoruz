import java.util.Scanner;

public class Loop7 {
    public static void main(String[] args) {
        int i;
        float result=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number for harmonic serie: ");
        i= scan.nextInt();
        for(float a=1;a<=i;a++){
            result+=(1/a);
        }
        System.out.println(result);
    }
}
