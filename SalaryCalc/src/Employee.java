public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int currentYear = 2021;
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if (salary <=1000){
            return 0;
        }else {
            return salary * 0.03;
        }
    }

    public int bonus(){
        if (workHours < 40){
            return 0;
        }else {
            return (workHours - 40) * 30;
        }
    }

    public double raiseSalary(){
        if (currentYear - hireYear < 10){
            return salary * 0.05;
        }else if (currentYear - hireYear >= 10 && currentYear - hireYear < 20){
            return  salary * 0.10;
        }else {
            return salary * 0.15;
        }
    }

    public double totalSalary() {
        return salary + bonus() + raiseSalary() - tax();
    }

    public String toString(){
        return "=====ÇALIŞAN BİLGİLERİ=====" +
                "\nName: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary Raise: " + raiseSalary() +
                "\nSalary with Taxes and Bonuses: " + (totalSalary() - raiseSalary()) +
                "\nTotal Salary: " + totalSalary();
    }
}


