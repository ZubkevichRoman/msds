package JavaCoreHomework.Homework6;

public class Dz6 {
    public static void main(String[] args) {
        /**Задача 1:
         Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
         метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
         который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
         выводит текущую информацию о карточке. Напишите программу, которая создает три
         объекта класса CreditCard у которых заданы номер счета и начальная сумма.
         Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
         третьей. Выведите на экран текущее состояние всех трех карточек**/
        CreditCard card1 = new CreditCard("1111-2222-3333-4444", 22.3214);
        CreditCard card2 = new CreditCard("1232-3453-6543-3452", 10.340);
        CreditCard card3 = new CreditCard("1242-3453-4543-3652", 23.300);
        card1.deposit(2000);
        System.out.println();
        card2.deposit(3200);
        System.out.println();
        card3.withdrawMoney(1000);
        System.out.println();
        System.out.println(" Состояние всех трех карт: ");
        System.out.println();
        card1.infAboutACard();
        System.out.println();
        card2.infAboutACard();
        System.out.println();
        card3.infAboutACard();
        System.out.println();

    }
}
