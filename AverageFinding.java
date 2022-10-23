import java.util.Scanner;

public class AverageFinding {
    public static void main(String[] args) {

        int mat, chem, phys, hist;
        float av;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your maths grade: ");
        mat= scanner.nextByte();

        System.out.println("Enter your chemistry grade: ");
        chem= scanner.nextByte();

        System.out.println("Enter your physics grade: ");
        phys= scanner.nextByte();

        System.out.println("Enter your history grade: ");
        hist= scanner.nextByte();

        av = (mat+ chem+ phys+ hist)/4;
        boolean passed=(av>60);
        String conclusion = (passed)? "You passed the class" : "You failed the class";
        System.out.print(conclusion);

    }
}
