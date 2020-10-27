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

}
