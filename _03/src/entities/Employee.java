package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary () {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        if (percentage <= 0 ) throw new Error("Invalid percentage");
        this.grossSalary = (this.grossSalary * percentage) / 100;
    }

    public String toString() {
        return "Nome: " + this.name + " Salário: " + this.grossSalary + " Impostos: " +  this.tax;
    }
}
