import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayNums {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int arrLength;
        System.out.print("Dizinin boyutu n: ");
        arrLength= scan.nextByte();
        int[] arr= new int[arrLength];
        System.out.println("Dizinin elemanlarını giriniz: ");
        System.out.print("1. Elemanı: ");
        for(int i=0;i<arrLength-1;i++){
            arr[i]= scan.nextInt();
            System.out.print((i+2)+ ". Elemanı: ");
        }
        Arrays.sort(arr);
        System.out.print("Sıralama: ");
        for(int i=0;i<arrLength;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
