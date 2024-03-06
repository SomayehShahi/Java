package atmManagementProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMOperationInterface  op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin=123;;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM machine");
        System.out.println("Enter ATM number: ");
        int atmNumber = in.nextInt();
        System.out.println("Enter Pin: ");
        int atmPin = in.nextInt();
        if((atmnumber == atmNumber) && (atmpin == atmPin)){
            while(true){
                System.out.println("1.view Available balance\n2.withdraw Amount\n3.Deposit Amount\n4.view Ministatement\n5.Exit");
                System.out.println("Enter choice");
                int ch = in.nextInt();
                if(ch == 1){
                    op.viewBalance();
                }

                else if(ch == 2){
                    System.out.println("Enter amount to withdraw");
                    double withdraw = in.nextDouble();
                    op.withdrawAmount(withdraw);
                }

                else if(ch == 3){
                    System.out.println("Enter Amount to deposit: ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                }

                else if (ch == 4) {
                    op.viewMiniStatement();
                }
                else if(ch == 5){
                    System.out.println("Collect your ATM card\n Thank you for using ATM machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM number or Pin ");
            System.exit(0);
        }

    }
}