import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        double a,b,c,area,u;
        Scanner sc = new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını girin.");
        a=sc.nextByte();
        b=sc.nextByte();
        c=sc.nextByte();
        u=(a+b+c)/2;
        area = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.println(area);
    }
}
