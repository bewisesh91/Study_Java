public class BankDriver {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("문승현");
        p1.setAge(31);
        p1.setCashAmount(30000);

        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        System.out.println(p1.getAge());

        a1.deposit(30000);
        a1.withdraw(170000);
        a1.deposit(620000);
        a1.withdraw(890000);
    }
}
