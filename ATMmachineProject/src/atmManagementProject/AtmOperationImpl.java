package atmManagementProject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements ATMOperationInterface {
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 500 == 0) {
            if (atm.getBalance() >= withdrawAmount) {
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient balance !!");
            }
        }
        else{
            System.out.println("Please eter the amount in multiply 500");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, " Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m : ministmt.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
