import java.util.Scanner;
public class LeapYearFounder {
    public static void main(String[] args) {
        int year;
        Scanner scan= new Scanner(System.in);
        System.out.print("Yıl girin: ");
        year=scan.nextInt();
        if(year%4!=0){
            System.out.println(year + " bir artık yıl değildir!");
        }
        else if((year%4==0)&&(year%100!=0)){
            System.out.println(year + " bir artık yıldır!");
        }
        else if((year%4==0)&&(year%100==0)){
            if(year%400==0){
                System.out.println(year + " bir artık yıldır!");
            }
            else{
                System.out.println(year + " bir artık yıl değildir!");
            }
        }
    }
}
