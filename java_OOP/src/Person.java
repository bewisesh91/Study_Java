public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String name, int age, int cashAmount) {
        this.name = name;
        if (age < 0) {
            this.age = 12;
        } else {
            this.age = age;
        }
        if (cashAmount < 0) {
            this.cashAmount = 0;
        } else {
            this.cashAmount = cashAmount;
        }
    }

    public Person(String name, int age) {
        this.name = name;
        if (age < 0 ) {
            this.age = 12;
        } else {
            this.age = age;
        }
        this.cashAmount = 0;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name;
    }

    public void setCashAmount(int cashAmount) {
        if (cashAmount >= 0) {
            this.cashAmount = cashAmount;
        }
    }

    public int getCashAmount() {
        return this.cashAmount;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return this.account;
    }

    public boolean transfer(Person to, int amount) {
        return account.transfer(to, amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
