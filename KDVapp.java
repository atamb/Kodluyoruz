import java.util.Scanner;
public class KDVapp {
    public static void main(String[] args) {
        double valueTaken, calculatedValue;

        Scanner sc = new Scanner(System.in);
        System.out.println("KDV' sini hesaplamak istediğiniz değeri girin: ");
        valueTaken = sc.nextDouble();
        if(valueTaken<1000)
        {
            calculatedValue = valueTaken * 1.18 ;
        }
        else
        {
            calculatedValue = valueTaken * 1.08 ;
        }
        System.out.println(calculatedValue);
    }

}
