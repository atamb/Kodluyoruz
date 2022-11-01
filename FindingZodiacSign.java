import java.util.Scanner;

public class FindingZodiacSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day, month;
        System.out.println("Enter the day you were born: ");
        day= scan.nextInt();
        System.out.println("Enter the month you were born: ");
        month= scan.nextInt();
        if(month==1){
            if(day<=21 && day>0){
                System.out.println("Oğlak Burcusunuz.");
            }
            else if(day>21 && day<=31){
                System.out.println("Kova Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==2){
            if(day<=22 && day>0){
                System.out.println("Kova Burcusunuz.");
            }
            else if(day>22 && day<=28){
                System.out.println("Balık Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==3){
            if(day<=20 && day>0){
                System.out.println("Balık Burcusunuz.");
            }
            else if(day>20 && day<=31){
                System.out.println("Koç Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==4){
            if(day<=20 && day>0){
                System.out.println("Koç Burcusunuz.");
            }
            else if(day>21 && day<=30){
                System.out.println("Boğa Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==5){
            if(day<=22 && day>0){
                System.out.println("Boğa Burcusunuz.");
            }
            else if(day>21 && day<=31){
                System.out.println("İkizler Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==6){
            if(day<=22 && day>0){
                System.out.println("İkizler Burcusunuz.");
            }
            else if(day>22 && day<=31){
                System.out.println("Yengeç Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==7){
            if(day<=22 && day>0){
                System.out.println("Yengeç Burcusunuz.");
            }
            else if(day>23 && day<=31){
                System.out.println("Aslan Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==8){
            if(day<=22 && day>0){
                System.out.println("Aslan Burcusunuz.");
            }
            else if(day>22 && day<=31){
                System.out.println("Başak Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==9){
            if(day<=22 && day>0){
                System.out.println("Başak Burcusunuz.");
            }
            else if(day>22 && day<=31){
                System.out.println("Terazi Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==10){
            if(day<=22 && day>0){
                System.out.println("Terazi Burcusunuz.");
            }
            else if(day>22 && day<=31){
                System.out.println("Akrep Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==11){
            if(day<=21 && day>0){
                System.out.println("Akrep Burcusunuz.");
            }
            else if(day>21 && day<=31){
                System.out.println("Yay Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }
        else if(month==12){
            if(day<=21 && day>0){
                System.out.println("Yay Burcusunuz.");
            }
            else if(day>21 && day<=31){
                System.out.println("Oğlak Burcusunuz");
            }
            else{
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        }

    }
}
