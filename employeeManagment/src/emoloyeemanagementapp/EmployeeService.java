package emoloyeemanagementapp;


import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(101, "Mina", 25, "IT", "Developer", 2500);
    Employee emp2 = new Employee(102, "Sara", 30, "Admmin", "Testor", 3700);
    Employee emp3 = new Employee(103, "John", 32, "Co", "DevOps", 4500);
    Employee emp4 = new Employee(104, "Scott", 27, "IT", "Developer", 3200);

    Scanner sc = new Scanner(System.in);
    boolean found=false;
    int id;
    String name;
    int age;
    String department;
    String desiganation;
    double sal;

    public EmployeeService(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

    // view all employees
    public void viewAllEmps(){
        for(Employee emp:empset){
            System.out.println(emp);
        }
    }
    // view employee based on their id
    public void viewEmp(){
        System.out.println("Enter id: ");
        id = sc.nextInt();
        for(Employee emp:empset){
            if (emp.getId() == id){
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee with this id is not present");
        }
    }
    // update the employee
    public void updateEmp(){
        System.out.println("Enter id: ");
        id = sc.nextInt();
        for(Employee emp:empset){
            if(emp.getId() == id){
                System.out.println("Enter new name: ");
                name = sc.next();
                System.out.println("Enter new salary: ");
                sal = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated details of employee are: ");
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee is not present");
        }
        else{
            System.out.println("Employee details updated successfully !!" );
        }
    }
    //Delete the employee
    public void deleteEmp() {
        System.out.println("Enter id");
        id=sc.nextInt();
        boolean found=false;
        Employee empdelete=null;
        for(Employee emp:empset) {
            if(emp.getId()==id) {
                empdelete=emp;
                found=true;
            }
        }
        if(!found) {
            System.out.println("Employee is not present");
        }
        else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }
    }
    //Add employee
    public void addEmp(){
        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter desiganation: ");
        desiganation = sc.next();
        System.out.println("Enter department: ");
        department = sc.next();
        System.out.println("Enter salary: ");
        sal = sc.nextDouble();

        Employee emp = new Employee(id, name, age, desiganation, department, sal);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");

    }


}
