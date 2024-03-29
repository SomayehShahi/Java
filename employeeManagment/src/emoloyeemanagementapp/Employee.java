package emoloyeemanagementapp;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String designation;
    private String departmet;
    private double salary;

    public Employee(int id, String name, int age, String designation, String departmet, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.departmet = departmet;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartmet() {
        return departmet;
    }

    public void setDepartmet(String departmet) {
        this.departmet = departmet;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @java.lang.Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", departmet='" + departmet + '\'' +
                ", salary=" + salary +
                '}';
    }
}

