package Task16;

import java.util.HashSet;
import java.util.Set;

//2. Создать класс Банк.
// В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
public class Bank {
    private Set<Account> accounts = new HashSet<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    private Account findAccount(String number) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(number)) { //Сравнивает с переданным number
                return account; // Если номера совпадают - возвращает найденный счет
            }
        }
        return new Account(); // если счет не найдет - вернет пустой объект
    }

//5. В классе банк реализовать метод перевода денежных средств с одного счёта на другой.
// Сигнатура метода будет такая:
//public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount)
//5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги,
// выбрасывает своё исключение AccountNotFoundException с errorCode= not.found.account
//5.2 Если на счёте, с которого переводят деньги, сумма меньше переводимой
// то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.
//5.3  Соответсвтенно выполните логику перевода денег в белорусской валюте
// (отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту,
// на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {

        Account accountFrom = findAccount(accountNumberFrom);
        Account accountTo = findAccount(accountNumberTo);

        if (accountFrom == null || accountTo == null) {
            throw new AccountNotFoundException(
                    "Номер счета не найден!",
                    "not.found.account"
            );
        }

        if (accountFrom.getAmount() < amount) {
            throw new NotEnoughMoneyException(
                    "Недостаточно средств",
                    "not.enough.money"
            );
        }

        // уменьшение баланса
        accountFrom.setAmount(accountFrom.getAmount() - amount);
        // увеличение баланса
        accountTo.setAmount(accountTo.getAmount() + amount);

        System.out.println("Переведено успешно!");
    }
}