mport java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        isPalindrom(sayi);
    }

    public static boolean isPalindrom(int sayi){
        int temp = sayi;
        int ters = 0;
        while(temp > 0){
            ters = ters * 10 + temp % 10;
            temp /= 10;
        }
        if(sayi == ters){
            System.out.println(sayi +" Palindrom Sayı");
            return true;
        }else{
            System.out.println(sayi+ " Palindrom Sayı Değil");
            return false;
        }
    }
}
