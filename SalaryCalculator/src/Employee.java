public class Employee {
    String name;
    double salary, workHours, hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        Print();
    }

    public double tax(){
        if(salary<1000){
            return 0;
        }
        else {
            return salary*0.03;
        }
    }

    public double bonus(){
        if(workHours>40){
            return (workHours-40)*30;
        }
        else return 0;
    }

    public double raiseSalary(){
        if(2021-hireYear<10){
            return salary*0.05;
        }
        else if(9<(2021-hireYear) && 20>(2021-hireYear)){
            return salary*0.1;
        }
        else{
            return salary*0.15;
        }
    }

    public void Print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + ( this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: " + (this.salary+raiseSalary()));
        System.out.println("-----------------");
    }
}
