import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0, sum=0, count=0;
        float avg=0;
        while(i%2==0){
            i=scan.nextInt();
            if(i%4==0){
                sum+=i;
                count++;
            }
        }
        avg=(float)sum / (float) count;
        System.out.println(avg);
    }
}
