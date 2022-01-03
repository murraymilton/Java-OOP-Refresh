public class Employee {
    String employeeName;
    int age;
    double salary;
    String location;

    Employee(String employeeName, int age, double salary, String location){
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.location = location;

    }

    void raiseSalary(){
        this.salary = this.salary + 1000;
    }
}
