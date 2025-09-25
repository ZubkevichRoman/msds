package Homework13;

public class Settings{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Задача 1:
     * Создать класс, в котором будет статический метод. Этот метод принимает на вход три
     * параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
     * ogi ln должна быть меньше 20 символов и не должен содержать пробелы. Если login не
     * соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
     * password должна быть меньше 20 символов, не должен содержать пробелом и должен
     * содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
     * Если password не соответствует этим требованиям, необходимо выбросить
     * WrongPasswordException. WrongPasswordException и WrongLoginException -
     * пользовательские классы исключения с двумя конструкторами – один по умолчанию,
     * второй принимает сообщение исключения и передает его в конструктор класса Exception.
     * Метод возвращает true, если значения верны, false в противном случае
     */

    public static boolean SettingsUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов и без пробелов ");
        }
        if (password.length() >= 20 || password.contains(" ")) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов и без пробелов ");
        }
        if (!password.matches("(.+\\d.+)")) {
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру ");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны быть одинаковые");
        }
       return true;
    }
}