public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int workHours, int hireYear, double salary){
        this.name = name;
        this.workHours = workHours;
        this.hireYear= hireYear;
        this.salary = salary;

    }

    public  double raiseSalary() {
        double raise;
        if (2021 - hireYear < 10) {

            //salary = (salary * 105)/100;
            raise = (salary * 5) / 100;
            return raise;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {

            //salary = (salary * 110)/100;
            raise = (salary * 10) / 100;
            return raise;
        } else if (2021 - hireYear > 19) {

            //salary = (salary * 115)/100;
            raise = (salary * 15) / 100;
            return raise;
        } else {
            System.out.println("Hire Year wrong !!!!");
        }
        return 0;
    }


    public double tax(){
        if (salary<1000){
            return 0;
        }else {
            double tax = (salary *0.03 );
            return tax;
        }
    }

    public int bonus(){
        if (workHours > 40){
            int extraHour = workHours-40;
            int bonus = (extraHour * 30);
            return bonus;
        }
        return 0;
    }


    public String toString(){
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Work Hours : " + workHours);
        System.out.println("Hire Year : " + hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Salary Raise : " + raiseSalary());
        System.out.println("Salary with Tax and Bonus : " + (salary + bonus() - tax()));
        return "";
    }

}
