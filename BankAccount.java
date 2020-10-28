public class BankAccount {
    //instance variables
    private double balance;
    private int accountID;
    private String password;
   
    //constructor
    public BankAccount(int accountID, String password) {
        //initialize
        balance = 0;
        accountID = accountID;
        password = password;
    }   
    /*standard accessor methods*/ 
    public double getBalance(){
        return(balance);
    } 
    public int getAccountID(){
        return(accountID);
    } 
    public void setPassword(String newPass){
        password = newPass;
    }
    public boolean deposit(double amount){
        //When the amount is non-negative increase the account balance by that much, and return true. 
        //When the argument given is a negative you should leave the balance unchanged and return false. 
        if (amount >= 0) {
            balance += amount;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean withdraw(double amount){
        // This will not be successful if the balance is too low, or the amount is negative. In these cases do not change the balance. 
        //When the amount is non-negative subtract it from the balance and return true if it was successful,false otherwise.
        if (amount < 0 || amount > balance) {
            return false;
        }
        else {
            balance -= amount;
            return true;
        }
    } 
    public String toString(){
        //AccountID and balance in the format:   "ID\tBALANCE" e.g. "5213452\t99.423"
        return(accountID + "\t" + String.valueOf(balance));
    } 


}
