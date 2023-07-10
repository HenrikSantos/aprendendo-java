package entities;

public class Student {
    public double grade01;
    public double grade02;
    public double grade03;

    public double average() {
        return (grade01 + grade02 + grade03) / 3;
    }

    public String qualification() {
        if (this.average() >= 60) {
            return "Pass";
        } else {
            return "Failed";
        }
    }

    public String missingPoints() {
        if (this.average() >= 60) {
            return "No missing points";
        } else {
            return "Missing " + String.format("%.2f", (60 - this.average())) + " points";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
            "grade01=" + grade01 +
            ", grade02=" + grade02 +
            ", grade03=" + grade03 +
        '}';
    }
}
