import java.util.Scanner;

public class AverageFinding {
    public static void main(String[] args) {

        int mat, chem, phys, hist;
        float av, sum;
        Scanner scanner = new Scanner(System.in);

        //with every grade I checked if the code is greater or less than zero. If it is bigger, it doesn't count. If it is smaller, I summed the grade with sum variable.
        System.out.println("Enter your maths grade: ");
        mat= scanner.nextByte();
        if(mat<=100){
          sum+=mat;
        }
      
        System.out.println("Enter your chemistry grade: ");
        chem= scanner.nextByte();
        if(chem<=100){
          sum+=chem;
        }
      
        System.out.println("Enter your physics grade: ");
        phys= scanner.nextByte();
        if(phys<=100){
          sum+=phys;
        }

        System.out.println("Enter your history grade: ");
        hist= scanner.nextByte();
        if(hist<=100){
          sum+=hist;
        }
      
        //I found the average in here.
        av = sum/4;
        
        //with the grades I found last situation
        if(av>=55){
          System.out.println("You passed!);
        }
        else{
          System.out.println("You failed!);
       }

    }
}
