package JavaCoreHomework.Homework13;
public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        /**
         * Задача 1:
         * Создать класс, в котором будет статический метод. Этот метод принимает на вход три
         * параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
         *ogi ln должна быть меньше 20 символов и не должен содержать пробелы. Если login не
         * соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
         * password должна быть меньше 20 символов, не должен содержать пробелом и должен
         * содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
         * Если password не соответствует этим требованиям, необходимо выбросить
         * WrongPasswordException. WrongPasswordException и WrongLoginException -
         * пользовательские классы исключения с двумя конструкторами – один по умолчанию,
         * второй принимает сообщение исключения и передает его в конструктор класса Exception.
         * Метод возвращает true, если значения верны, false в противном случае
         */
        try {
            boolean result = Settings.SettingsUser("Login","12345","12345");
            System.out.println("result: " + result);
        }
        catch (WrongPasswordException | WrongLoginException exception){
            exception.printStackTrace();

        }

    }
}
