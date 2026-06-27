package Task16;

//6. В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Account account1 = new Account(1, "11111", "BYN", 1256.34);
        Account account2 = new Account(2, "22222", "BYN", 2345.19);
        Account account3 = new Account(3, "33333", "BYN", 3254.32);
        Account account4 = new Account(4, "44444", "BYN", 5623.22);
        Account account5 = new Account(5, "55555", "BYN", 952.78);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

//7. В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт.
// При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch
//7.1 Если пришло исключение AccountNotFoundException то выведите в консоль «Откройте счёт в нашем банке для выполнения переводов»
//7.2 Если пришло исключение NotEnoughMoneyException то выведите в консоль «Недостаточно средств для перевода»
//7.3 В обоих случаях не пробрасывайте исключения дальше. Программа должна продолжать работу.
//8. Добавьте блок finally. В блоке finally выведите в консоли «Спасибо,что вопользовались услугами банка»
        try {
            //bank.transferMoney("55555", "22222", 2000.00);
            bank.transferMoney("33333", "55555", 2000.00);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");

        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }
        System.out.println(account5);
        System.out.println(account3);
    }
}