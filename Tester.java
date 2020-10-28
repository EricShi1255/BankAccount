public class Tester {
    public static void main(String[] args) {
        //balance accountid password
        BankAccount d1 = new BankAccount(222661217, "1020");
        d1.deposit(100);
        BankAccount d2 = new BankAccount(205002604, "3260");
        d1.transferTo(d2, 50, "1020");
        System.out.println(d1.toString());
    }
}   