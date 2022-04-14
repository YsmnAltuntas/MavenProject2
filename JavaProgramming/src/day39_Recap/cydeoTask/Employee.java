package day39_Recap.cydeoTask;

public class Employee extends Person {

    private int EmployeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty()){
            System.out.println("Invalid Job Title");
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.out.println("Invalid salary : "+salary);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+ " is working");
    }

    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(EmployeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        }


    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "EmployeeId=" + EmployeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Create a sub class of Person named Employee:
    Extra variables:
        employeeId, jobTitle, salary

Encapsulate all the fields

Add a constructor to set all the fields
    Methods:
        work()
        toString()

 */
