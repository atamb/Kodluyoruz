import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        double a,r,area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angle of the piece: ");
        a=sc.nextDouble();
        System.out.print("Enter the radius: ");
        r=sc.nextDouble();
        area=3.14* r*r * a / 360;
        System.out.println("Area of the piece: " + area);
    }
}
