package JavaCoreHomework.Homework6.Atm;

import java.util.Scanner;

public class SettingsAtm {
    /**
     * Задача *:
     * Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
     * задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
     * метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
     * принимает сумму денег, а возвращает булевое значение - успешность выполнения
     * операции. При снятии денег, функция должна распечатывать каким количеством купюр
     * какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
     * количеством купюр каждого номинала
     **/
    private int theNumberOfBanknotesInFaceValue20;    // количество банкнот в банкоматее с номиналом 20$
    private int theNumberOfBanknotesInFaceValue50;    //количество банкнот в банкоматее с номиналом 50$
    private int theNumberOfBanknotesInFaceValue100;    // количество банкнот в банкоматее с номиналом 100$
    private int theMoneyAvailableAtTheAtm;           // деньги имеющиеся в банкомате
    private Scanner scanner = new Scanner(System.in);
    private int moneyToIssue;
    private int WithDrawMoneyInAtm;
    private int largeOrSmallBills;
    private boolean successRateOfExecution;

    public SettingsAtm(int theNumberOfBanknotesInFaceValue20, int theNumberOfBanknotesInFaceValue50,
                       int theNumberOfBanknotesInFaceValue100) {
        this.theNumberOfBanknotesInFaceValue20 = theNumberOfBanknotesInFaceValue20;
        this.theNumberOfBanknotesInFaceValue50 = theNumberOfBanknotesInFaceValue50;
        this.theNumberOfBanknotesInFaceValue100 = theNumberOfBanknotesInFaceValue100;
    }

    public void addingMoneyToAtm() {                 // метод для добавления денег в банкомат
        System.out.println(" Сколько вы хотите добавить 20$ купюр?: ");
        int cost20$ = scanner.nextInt();
        if (cost20$ < 0) {
            System.out.println("Введите положительное значение");
            return;
        }
        theNumberOfBanknotesInFaceValue20 = cost20$ + theNumberOfBanknotesInFaceValue20;
        System.out.println(" Сколько вы хотите добавить 50$ купюр?: ");
        int cost50$ = scanner.nextInt();
        if (cost50$ < 0) {
            System.out.println("Введите положительное значение");
            return;
        }
        theNumberOfBanknotesInFaceValue50 = cost50$ + theNumberOfBanknotesInFaceValue50;
        System.out.println(" Сколько вы хотите добавить 100$ купюр?: ");
        int cost100$ = scanner.nextInt();
        if (cost100$ < 0) {
            System.out.println("Введите положительное значение");
            return;
        }
        theNumberOfBanknotesInFaceValue100 = cost100$ + theNumberOfBanknotesInFaceValue100;

    }
//TODO Не понятная задача
    /**
     * Сделать функцию, снимающую деньги, которая
     * принимает сумму денег, а возвращает булевое значение - успешность выполнения
     * операции
     * При снятии денег, функция должна распечатывать каким количеством купюр
     * * какого номинала выдаётся сумма
     **/
    private int allMoneyInAtm;

    public void WithdrawMoney() {
        allMoneyInAtm = theNumberOfBanknotesInFaceValue20 * 20 +
                theNumberOfBanknotesInFaceValue50 * 50
                + theNumberOfBanknotesInFaceValue100 * 100;
        System.out.println(" В банкомате имеется " + theNumberOfBanknotesInFaceValue20 + " 20$ " + " купюр ");
        System.out.println(" В банкомате имеется " + theNumberOfBanknotesInFaceValue50 + " 50$ " + " купюр ");
        System.out.println(" В банкомате имеется " + theNumberOfBanknotesInFaceValue100 + " 100$ " + " купюр ");
        System.out.println("Общая сумма всех купюр в банкомате " + allMoneyInAtm);
        System.out.println(" Введите сумму которую хотите снять ");
        WithDrawMoneyInAtm = scanner.nextInt();
        if (WithDrawMoneyInAtm < allMoneyInAtm) {
            allMoneyInAtm = allMoneyInAtm - WithDrawMoneyInAtm;

        } else {
            System.out.println("Недостаточно денег  в банкомате");
            System.out.println(" Введите корректную сумму , " + " меньше чем : " + allMoneyInAtm);
        }
        if (WithDrawMoneyInAtm % 10 != 0){
            System.out.println(" Введите сумму кратную 10 ");
        }
        int need100 = Math.min(WithDrawMoneyInAtm / 100, theNumberOfBanknotesInFaceValue100);
        int remaining = WithDrawMoneyInAtm - need100 * 100;

        int need50 = Math.min(remaining / 50, theNumberOfBanknotesInFaceValue50);
        remaining -= need50 * 50;

        int need20 = Math.min(remaining / 20, theNumberOfBanknotesInFaceValue20);
        remaining -= need20 * 20;
        System.out.println("Сумма " + WithDrawMoneyInAtm + " выдана:");
        if (need100 > 0) System.out.println("100 x " + need100);
        if (need50 > 0) System.out.println("50 x " + need50);
        if (need20 > 0) System.out.println("20 x " + need20);


    }
}

