import java.util.Scanner;

public class Loop13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stepCount,starCount, temp, spaceCount=0;
        System.out.println("Step count: ");
        stepCount= scan.nextInt();
        temp=stepCount;
        for(int i=0; i<stepCount;i++){
            for(int x=0;x<=spaceCount;x++){
                System.out.print(" ");
            }
            starCount=(2*temp)-1;
                    for(int a=0;a<=starCount;a++){
                        System.out.print("*");
                    }
            System.out.println("");
            temp-=1;
            spaceCount+=1;
        }
    }
}
