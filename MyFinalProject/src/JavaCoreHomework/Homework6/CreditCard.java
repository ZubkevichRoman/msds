package JavaCoreHomework.Homework6;

public class CreditCard {


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(double currentSum) {
        this.currentSum = currentSum;
    }

    /**
     * Задача 1:
     * Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
     * метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
     * который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
     * выводит текущую информацию о карточке. Напишите программу, которая создает три
     * объекта класса CreditCard у которых заданы номер счета и начальная сумма.
     * Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
     * третьей. Выведите на экран текущее состояние всех трех карточек
     **/

    private String accountNumber; //номер счета
    private double currentSum; // текущая сумма на счету

    public CreditCard(String accountNumber, double currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    /**
     * добавьте метод, который позволяет начислять сумму на кредитную карточку
     */
    public void deposit(double amount) {
        if (amount > 0) {
            currentSum += amount;
            System.out.println(" На счет: " + accountNumber + " зачислено " + amount);
        } else {
            System.out.println("На счет можно ложить только положительные суммы!");
        }

    }

    /**
     * Добавьте метод, который позволяет снимать с карточки некоторую сумму
     */
    public void withdrawMoney(double amount) {
        currentSum -= amount;
        if (amount >= 0) {
            System.out.println(" Со счета " + accountNumber + " снято  " + amount);
        } else {
            System.out.println(" Недостаточно средств на счете ");
        }
    }

    /**
     * Добавьте метод, который выводит текущую информацию о карточке
     */

    public void infAboutACard() {
        System.out.println(" на вашем счете: " + accountNumber + " Баланс: " + currentSum);
    }
}

