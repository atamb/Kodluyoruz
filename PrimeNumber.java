import java.util.Scanner;

public class recursiveAsal {
    static int asal(int a,int i) {

        if (i == 1) {
            return 1;
        } else {
            {
                if (a % i == 0) {
                    return 0;
                } else {
                    return asal(a, i - 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Pozitif sayi giriniz: ");
        int b = a.nextInt();
        
        int c = asal(b,b/2);

        if(c == 1){
            System.out.println(b+" Sayi asal ");
        }
        else {
            System.out.println(b+" Sayi asal degildir");
        }
    }
}
