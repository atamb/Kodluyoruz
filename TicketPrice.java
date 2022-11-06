import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args) {
        int age,distance,type;
        double price=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        distance=scan.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        age=scan.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        type= scan.nextInt();
        if(age<12){
            if(type==2){
                price = ((distance*0.1)* 0.8 * 0.5)*2;
            }
            else if(type==1){
                price=(distance*0.1)/2;
            }
            else{
                System.out.println("Hatalı veri girdiniz !");
            }

        }
        else if(age>=12 && age<=24){
            if(type==2){
                price = ((distance*0.1)* 0.8 * 0.9)*2;
            }
            else if(type==1){
                price=(distance*0.1)*0.9;
            }
            else{
                System.out.println("Hatalı veri girdiniz !");
            }

        }
        else if(age>24 && age<=65){
            if(type==2){
                price = ((distance*0.1)* 0.8)*2;
            }
            else if(type==1){
                price=(distance*0.1);
            }
            else{
                System.out.println("Hatalı veri girdiniz !");
            }

        }
        else if(age>65){
            if(type==2){
                price = ((distance*0.1)* 0.8 * 0.7)*2;
            }
            else if(type==1){
                price=(distance*0.1)*0.7;
            }
            else{
                System.out.println("Hatalı veri girdiniz !");
            }

        }
        else{
            System.out.println("Hatalı veri girdiniz !");
        }
        System.out.println("Toplam Tutar =" + price);
    }
}
