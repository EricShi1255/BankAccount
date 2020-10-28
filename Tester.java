public class Tester {
    public static void main(String[] args) {
        //balance accountid password
        BankAccount d1 = new BankAccount(222661217, "1020");
        d1.deposit(100);
        d1.withdraw(200);
        d1.deposit(100.5);
        d1.setPassword("3260");
        System.out.println(d1.toString());
    }
}   