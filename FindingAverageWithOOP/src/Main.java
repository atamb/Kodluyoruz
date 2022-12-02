import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String std1, std2, std3;
        int std1phyexam, std2phyexam, std3phyexam, std1phyquiz, std2phyquiz, std3phyquiz, std1matexam, std2matexam, std3matexam, std1matquiz, std2matquiz, std3matquiz, std1chemexam, std2chemexam, std3chemexam, std1chemquiz, std2chemquiz, std3chemquiz;
        Scanner scan= new Scanner(System.in);
        System.out.println("Birinci öğrenci adı: ");
        std1=scan.nextLine();
        System.out.println("İkinci öğrenci adı: ");
        std2=scan.nextLine();
        System.out.println("Üçüncü öğrenci adı: ");
        std3=scan.nextLine();
        System.out.println("Birinci öğrenci Matematik Quiz Notu: ");
        std1matquiz=scan.nextInt();
        System.out.println("Birinci öğrenci Matematik Sınav Notu: ");
        std1matexam=scan.nextInt();
        System.out.println("Birinci öğrenci Fizik Quiz Notu: ");
        std1phyquiz=scan.nextInt();
        System.out.println("Birinci öğrenci Fizik Sınav Notu: ");
        std1phyexam=scan.nextInt();
        System.out.println("Birinci öğrenci Kimya Quiz Notu: ");
        std1chemquiz=scan.nextInt();
        System.out.println("Birinci öğrenci Kimya Sınav Notu: ");
        std1chemexam=scan.nextInt();
        System.out.println("İkinci öğrenci Matematik Quiz Notu: ");
        std2matquiz=scan.nextInt();
        System.out.println("İkinci öğrenci Matematik Sınav Notu: ");
        std2matexam=scan.nextInt();
        System.out.println("İkinci öğrenci Fizik Quiz Notu: ");
        std2phyquiz=scan.nextInt();
        System.out.println("İkinci öğrenci Fizik Sınav Notu: ");
        std2phyexam=scan.nextInt();
        System.out.println("İkinci öğrenci Kimya Quiz Notu: ");
        std2chemquiz=scan.nextInt();
        System.out.println("İkinci öğrenci Kimya Sınav Notu: ");
        std2chemexam=scan.nextInt();
        System.out.println("Üçüncü öğrenci Matematik Quiz Notu: ");
        std3matquiz=scan.nextInt();
        System.out.println("Üçüncü öğrenci Matematik Sınav Notu: ");
        std3matexam=scan.nextInt();
        System.out.println("Üçüncü öğrenci Fizik Quiz Notu: ");
        std3phyquiz=scan.nextInt();
        System.out.println("Üçüncü öğrenci Fizik Sınav Notu: ");
        std3phyexam=scan.nextInt();
        System.out.println("Üçüncü öğrenci Kimya Quiz Notu: ");
        std3chemquiz=scan.nextInt();
        System.out.println("Üçüncü öğrenci Kimya Sınav Notu: ");
        std3chemexam=scan.nextInt();

        Student s1 = new Student(std1, std1matexam, std1phyexam, std1chemexam, std1chemquiz, std1phyquiz, std1matquiz);
        s1.isPass();

        Student s2 = new Student(std2, std2matexam, std2phyexam, std2chemexam, std2chemquiz, std2phyquiz, std2matquiz);
        s2.isPass();

        Student s3 = new Student(std3, std3matexam, std3phyexam, std3chemexam, std3chemquiz, std3phyquiz, std3matquiz);
        s3.isPass();
    }
}
