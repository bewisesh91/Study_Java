public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public int getBalance() {
        return balance;
    }


    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    public Person getOwner() {
        return owner;
    }

    public boolean deposit(int amount) {
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount() + "원");
            return false;
        }

        balance += amount;
        owner.setCashAmount(owner.getCashAmount() - amount);

        System.out.println(amount + "원 입금 하였습니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount() + "원");
        return true;
    }

    public boolean deposit(double amount, double exchangeRate) {
        return deposit((int) (amount * exchangeRate));
    }

    public boolean withdraw(int amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("출금 실패입니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount() + "원");
            return false;
        }

        balance -= amount;
        owner.setCashAmount(owner.getCashAmount() + amount);
        System.out.println(amount + "원 출금 하였습니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount() + "원");
        return true;
    }

}