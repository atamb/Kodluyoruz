import java.util.Scanner;
public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float armut, elma, domates, muz, patlıcan, toplam;
        System.out.print("Armut Kaç Kilo ? :");
        armut=scan.nextFloat();
        System.out.print("Elma Kaç Kilo ? :");
        elma = scan.nextFloat();
        System.out.print("Domates Kaç Kilo ? :");
        domates = scan.nextFloat();
        System.out.print("Muz Kaç Kilo ? :");
        muz = scan.nextFloat();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcan = scan.nextFloat();
        toplam = (armut*2.14f)+(elma*3.67f)+(domates*1.11f)+(muz*0.95f)+(patlıcan*5f);
        System.out.print("Toplam tutar : "+ toplam);

    }
}
