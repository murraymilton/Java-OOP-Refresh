public class Analyst extends Employee{
    private String name;
    private double salary;
    private int age;

    public Analyst(String name, double salary, int age){
        super(name, salary, age);
    }


    public double getAnnualBonus(){
        return super.salary * .05;
    }



}
