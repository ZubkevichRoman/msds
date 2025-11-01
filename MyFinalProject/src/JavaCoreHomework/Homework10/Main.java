package JavaCoreHomework.Homework10;

public class Main implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         *  Задача 1:
         *  Создать класс для описания пользователя системы. Переопределить в классе методы
         *  toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
         *  значением полей и сравнить с помощью метода equals.
         */
        /**
         * Задача*
         * Создать программу для реализации поверхностного и глубокого клонирования объекта
         *  класса User. Пусть на вход программе будет передаваться тип операции клонирования
         *  (поверхностное клонирование или глубокое), а также id юзера для клонирования.
         */
        InfoAboutUser infoAboutUser1 = new InfoAboutUser(222, "Misha", "23.12.1999");
        InfoAboutUser infoAboutUser2 = new InfoAboutUser(222, "Misha", "23.12.1999");
        InfoAboutUser infoAboutUser3 = new InfoAboutUser(114, "Oleg", "23.12.1999");
        System.out.println(infoAboutUser1.toString());
        System.out.println(infoAboutUser2.toString());
        System.out.println(infoAboutUser3.toString());
        System.out.println();
        System.out.println("user1.equals(user2): " + infoAboutUser1.equals(infoAboutUser2));
        System.out.println("user1.equals(user3): " + infoAboutUser1.equals(infoAboutUser3));
        System.out.println("user3.equals(user2): " + infoAboutUser3.equals(infoAboutUser2));
        System.out.println();
        System.out.println("user1.hashCode(): " + infoAboutUser1.hashCode());
        System.out.println("user2.hashCode(): " + infoAboutUser2.hashCode());
        System.out.println("user3.hashCode(): " + infoAboutUser3.hashCode());
        EmailAddress emailAddress = new EmailAddress("dsfsdf@gmail.com");
        emailAddress.setEmail("dsfsdfw@gmail.com");
        System.out.println(emailAddress.getEmail());
        System.out.println(infoAboutUser1.deepClone());
        System.out.println(infoAboutUser1.clone());

        // deep copy


    }
}
