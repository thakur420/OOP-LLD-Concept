package SRP;

public class EmployeeNotSRP {
    private String name;

    private double salary;
    public EmployeeNotSRP(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary(){
        System.out.println("Calculating employee salary");
    }

    public void saveEmployeeDataToDatabase(){
        System.out.println("saving employee details");
    }
}
