package CRM;
public class BANK_A_S {
        
    public static void main(String[] args) {
        int accountNumber = 3555677;
        String accName = "george";
        double accBalance = 20000.0;
        double depositAmount = 6000;
        double withdrawal_amount = 3000;
        int transactions = 4;
        boolean is_Account_active = true;
        double total_balance_after_deposit = accBalance + depositAmount;
        double total_balance_after_withdrawal = total_balance_after_deposit - withdrawal_amount;
        boolean min_required_balance = total_balance_after_withdrawal >= 2000;
        boolean validity = depositAmount > 0 && is_Account_active == true ;
        transactions++;
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("accName: " + accName);
        System.out.println("accBalance: " + accBalance);
        System.out.println("depositAmount: " + depositAmount);
        System.out.println("withdrawal_amount: " + withdrawal_amount);
        System.out.println("transactions: " + transactions);
        System.out.println("is_Account_active: " + is_Account_active);
        System.out.println("total_balance_after_withdrawal: " + total_balance_after_withdrawal);
        System.out.println("minimum requred balance: " + min_required_balance);
        System.out.println("validity: " + validity);

    }

}

