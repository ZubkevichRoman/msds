package JavaCoreHomework.Homework12.HardTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /**
         * Задача *:
         *  Программа на вход получает произвольный текст. В этом тексте может быть номер
         *  документа(один или несколько), емейл и номер телефона. Номер документа в
         *  формате: xxxx-xxxx-xx, где x- это любая цифра; номер телефона в формате:
         *  +(xx)xxxxxxx. Документ может содержать не всю информацию, т.е. например, может не
         *  содержать номер телефона, или другое. Необходимо найти эту информацию и вывести
         *  в консоль в формате:
         *  email: teachmeskills@gmail.com
         *  document number: 1423-1512-51
         *  и т.д
         */
        String text = "Вот моя электронная почта dsfghjds@gmail.com вот мой номер телефона +375(44)5667364" +
                " и номер документа 1233-2322-44";
        Pattern pattern = Pattern.compile("(.[a-zA-Z]{2,})@(.[a-zA-Z]{2,})");//email
        Pattern pattern1 = Pattern.compile("(\\+375\\(\\d{2}\\)\\d{7})");//phoneNumber
        Pattern pattern2 = Pattern.compile("(\\d{4}-\\d{4}-\\d{2})");
        Matcher matcherPhone = pattern1.matcher(text);
        Matcher matcherEmail = pattern.matcher(text);
        Matcher matcherDocument = pattern2.matcher(text);
        if (matcherEmail.find()) {
            System.out.println("Email: " + matcherEmail.group());
        }else{
            System.out.println("No email ");
        }
        if (matcherPhone.find()) {
            System.out.println("phone number: " + matcherPhone.group());
        }else {
            System.out.println("No phone number ");
        }
        if (matcherDocument.find()){
            System.out.println("document: "+ matcherDocument.group());
        }else {
            System.out.println("no document ");
        }
    }
}
