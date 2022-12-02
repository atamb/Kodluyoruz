public class Student {
    String name;
    int  matquiz, matexam, fizikquiz, fizikexam, kimyaquiz, kimyaexam;
    double average;
    boolean isPass;

    Student(String name, int matexam, int fizikexam, int kimyaexam, int kimyaquiz, int fizikquiz, int matquiz){
        this.name=name;
        this.matexam=matexam;
        this.fizikexam=fizikexam;
        this.kimyaexam=kimyaexam;
        this.matquiz=matquiz;
        this.fizikquiz=fizikquiz;
        this.kimyaquiz=kimyaquiz;
        calcAvg();
        this.isPass=false;
    }

    public void isPass() {
    if(this.matquiz<0 || this.matexam<0 || this.fizikquiz<0 || this.fizikexam<0 || this.kimyaexam<0 || this.kimyaquiz<0 ){
        System.out.println("Notlar tam olarak girilmemiş.");
    }
    else{
        this.isPass=isCheckPass();
        printNote();
        System.out.println("Ortalama: "+this.average);
        if(this.isPass){
            System.out.println("Sınıfı geçti.");
        }
        else{
            System.out.println("Sınıfta kaldı.");
        }
    }
    }

    public void calcAvg(){
        this.average=((this.matquiz * 0.2) + (this.matexam * 0.8) + (this.fizikquiz * 0.2) + (this.fizikexam * 0.8) + (this.kimyaquiz * 0.2) + (this.kimyaexam * 0.8))/3;
    }
    public boolean isCheckPass(){
        calcAvg();
        return this.average>55;
    }

    public void printNote(){
        System.out.println("==================");
        System.out.println("Öğrenci: "+ this.name);
        System.out.println("Matematik ortalaması: "+ ((this.matexam * 0.8)+(this.matquiz * 0.2)));
        System.out.println("Fizik ortalaması: "+ ((this.fizikexam * 0.8)+(this.fizikquiz * 0.2)));
        System.out.println("Kimya ortalaması: "+ ((this.kimyaexam * 0.8)+(this.kimyaquiz * 0.2)));
    }
}
