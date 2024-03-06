package emoloyeemanagementapp;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean ordering = true;
    public static void menu() {
        System.out.println("****************Welcome To Employee Managment System *********** "
                + "\n1. Add Employee "
                + "\n2.View Employee"
                + "\n3.Update Employee"
                + "\n4. Delete Employee"
                + "\n5.View All Employee"
                + "\n6. Exist ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        do{
            menu();
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Add Employee");
                    service.addEmp();
                   break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmp();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("view All Employee");
                    service.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank you for using appliction!");
                    System.exit(0);
                default:
                    System.out.println("please enter valid choice");

            }

        }while(ordering);
    }

}