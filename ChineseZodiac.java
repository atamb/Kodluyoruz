import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int birthyear,zodiacYear;
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        birthyear=scan.nextInt();
        zodiacYear=birthyear % 12;
        if(zodiacYear==0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        else if(zodiacYear==1){
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        else if(zodiacYear==2){
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        else if(zodiacYear==3){
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        else if(zodiacYear==4){
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        else if(zodiacYear==5){
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        else if(zodiacYear==6){
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        else if(zodiacYear==7){
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        else if(zodiacYear==8){
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        else if(zodiacYear==9){
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        else if(zodiacYear==10){
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        else if(zodiacYear==11){
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
