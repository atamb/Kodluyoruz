import java.util.Scanner;

public class SuggestionsForWeatherConditions {
    public static void main(String[] args) {
        float heat;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many degrees is the weather today?");
        heat = scan.nextFloat();
        if(heat<=5){
            System.out.println("You can go to skiing today");
        }
        else if(heat>5 && heat<=15){
            System.out.println("You can go to cinema today");
        }
        else if(heat>15&&heat<=25){
            System.out.println("You can go to picnic today");
        }
        else if(heat>25){
            System.out.println("You can swim today");
        }
    }
}
