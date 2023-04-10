class Employe {
    String name;
    int hireYear,workHours;
    double salary;

    Employe(String name,double salary,int workHours,int hireYear){
        this.salary = salary;
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        double tax = 0;
        if(this.salary > 1000)
            tax = (this.salary * 3)/100;
        return tax;
    }
    double bonus(){
        double bonus = 0;
        int hours =40;
        if(workHours > 40)
            bonus = (workHours - hours) * 30;
        return bonus;
    }
    double raiseSalary(){
        double increased_salary = 0;
        int year = 2021 - this.hireYear;
        if(year < 10)
            increased_salary = (this.salary * 5) / 100;
        if(year > 9  &&  year < 20)
            increased_salary = (this.salary * 10) / 100;
        if(year > 19)
            increased_salary = (this.salary * 15) / 100;
        return increased_salary;
    }
      public String  toString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()));
        return "x";
    }
}
public class Main {
    public static void main(String[] args) {
        Employe x = new Employe("AHMEt",1000,50,1988);
        x.toString();
    }
}