import java.util.Scanner;

public class Loop11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int max,min,input;
        System.out.println("How many numbers will you enter?");
        input=scan.nextInt();
        int[] arr=new int[input];
        for(int i=0;i<input;i++){
            arr[i]=scan.nextInt();
        }
        min=arr[0];
        max=arr[0];
        for(int a=0;a<arr.length;a++){
            if(arr[a]>max){
                max=arr[a];
            }
            if(arr[a]<=min){
                min=arr[a];
            }
        }
        System.out.print("Max value: "+ max);
        System.out.println("");
        System.out.print("Min value: "+ min);
    }
}
