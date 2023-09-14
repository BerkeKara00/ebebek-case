public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    public int tax(int salary){
        if (salary < 1000){
            return 0;
        }
        else if (salary > 1000){
            return (salary *3/100);
        }
        return 0;
    }

    public  int Bonus(int workHours){
        if (workHours > 40){
            return (workHours-40)*30;
        }
    return workHours;
    }

    public int raiseSalary(int hireYear){
        if ((2021 - hireYear) < 10){
            return (this.salary)*5/100;
        } else if ((2021 - hireYear)>10 && (2021 - hireYear) < 20) {
            return (this.salary)*10/100;
        } else if ((2021 - hireYear) > 19) {
            return (this.salary)*15/100;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Adı: " + this.getName() +
        "\nMaaş: " + this.getSalary() +
        "\nÇalışma Saati: "+ this.getHireYear() +
        "\nBaşlangıç Yılı: "+ this.getHireYear() +
        "\nVergi: " + this.tax(getSalary()) +
        "\nBonus: " + this.Bonus(getWorkHours()) +
        "\nMaaş Artışı: " + this.raiseSalary(this.getHireYear()) +
        "\nVergi ve bonuslar dahil maaşı: " +  (this.getSalary() + this.Bonus(this.workHours)-this.tax(getSalary())) +
        "\nToplam maası: " +  (this.getSalary()+this.raiseSalary(getHireYear())+this.Bonus(this.workHours)-this.tax(getSalary()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}

