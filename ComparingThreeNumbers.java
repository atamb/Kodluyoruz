import java.util.Scanner;
public class ComparingThreeNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 different numbers for comparing: ");
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        if(a>b && a>c){
            if(b>c){
                System.out.println("Order of the numbers is: a,b,c");
            }
            else if(c>b){
                System.out.println("Order of the numbers is: a,c,b");
            }
            else{
                System.out.println("Two or more numbers are same, please enter different numbers.");
            }
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.println("Order of the numbers is: b,a,c");
            }
            else if(c>a){
                System.out.println("Order of the numbers is: b,c,a");
            }
            else{
                System.out.println("Two or more numbers are same, please enter different numbers.");
            }
        }
        else if(c>a && c>b){
            if(b>a){
                System.out.println("Order of the numbers is: c,b,a");
            }
            else if(a>b){
                System.out.println("Order of the numbers is: c,a,b");
            }
            else{
                System.out.println("Two or more numbers are same, please enter different numbers.");
            }
        }
        else if(b==a || a==c || b==c){
            System.out.println("Two or more numbers are same, please enter different numbers.");
        }
    }

}
