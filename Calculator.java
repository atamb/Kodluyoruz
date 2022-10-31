import java.util.Scanner;

// class
public class Calculator {
    //method
    public static void main(String[] args) {
        String input;
        float a,b;
        System.out.print("İstediğiniz işlemi girin: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        System.out.print("Girdiğiniz işlem:  ");
        System.out.println(input);
        System.out.print("İlk sayıyı girin: ");
        a = scan.nextFloat();
        System.out.print("İkinci sayıyı girin: ");
        b = scan.nextFloat();
        switch (input){
            case "toplama":
                System.out.print("Toplam: "+ (a+b));
                break;
            case "çıkarma":
                System.out.println("Çıkarma: " + (a-b));
                break;
            case "çarpma":
                System.out.println("Çarpma: "+ (a*b));
                break;
            case "bölme":
                System.out.println("Bölme: "+ (a/b));
                break;
        }
    }
}