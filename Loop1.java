import jva.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        int i, count=0, sum=0 ,a=1;
        double avg;
        Scanner scan= new Scanner(System.in);
        i=scan.nextInt();
        while(a<i){
            if((a%3==0)||(a%4==0)){
                sum+=a;
                count++;

            }
           a++;
        }
        avg=(float)sum / (float) count;
        System.out.println(sum);
        System.out.println(count);
        System.out.println(avg);
    }
}
