import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] list = {3,5,7,4,8,90,13,43};
        int input, min=0, temp=0, out=0;
        Scanner scan= new Scanner(System.in);
        Arrays.sort(list);
        System.out.println("Lütfen bir sayı girin: ");
        input= scan.nextByte();
        min=Math.abs(list[0]-input);
        for(int i=0;i< list.length;i++){
            temp=Math.abs(list[i]-input);
            if (temp < min) {
                min= temp;
                out=list[i];
            }
        }
        System.out.println("Girilen sayıya en yakın sayı: "+ out);
    }
}
