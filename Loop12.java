    import java.util.Scanner;
    public class Loop12 {
        public static void main(String[] args) {
            int sayi, i, total = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Sayıyı giriniz: ");
            sayi = input.nextInt();
            for (i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    total = total + i;
                }
            }
            if (total == sayi) {
                System.out.println(sayi + " Mükemmel sayıdır");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir");
            }
        }
    }
