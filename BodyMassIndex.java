import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double boy, kilo, bmi;
        Scanner scan = new Scanner (System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy= scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo= scan.nextDouble();
        bmi = kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : " + bmi);


    }
}
