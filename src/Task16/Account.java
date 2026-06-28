package Task16;

//1. Создать класс счёт (Account).
// Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double).
//Выполнить переопределение equals и hashcode по двум полям (id и номер счёта), так как логически, эти поля будут уникальными для каждого счёта.
public class Account {
    private int id;
    private String accountNumber;
    private String currency;
    private double amount;

    public Account(int id, String accountNumber, String currency, double amount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", currency='" + currency + '\'' +
                ", balance=" + amount +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        Account account = (Account) o;
        if (id == (account.getId())
                && accountNumber.equals(account.getAccountNumber())) {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        int result = id + accountNumber.hashCode();
        return result;
    }
}