package DefiningClasses.CarDemo.CompanyRoster;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private Deparment deparment;
    private String email;
    private int age;


    public Employee(String name, double salary, String position, Deparment deparment) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.deparment = deparment;
    }

    public Employee(String name, double salary, String position, Deparment deparment, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.deparment = deparment;
        this.email = email;

    }

    public Employee(String name, double salary, String position, Deparment deparment, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.deparment = deparment;
        this.age = age;
    }

    public Employee(String name, double salary, String position, Deparment deparment, String email, int parseInt) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.deparment = deparment;
        this.email = email;
        this.age = parseInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Deparment getDeparment() {
        return deparment;
    }

    public void setDeparment(Deparment deparment) {
        this.deparment = deparment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
