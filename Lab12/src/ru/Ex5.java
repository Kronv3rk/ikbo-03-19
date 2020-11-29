package ru;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {
        String[] password = {"F032_Password","TrySpy_1","smart_pass", "A007"};

        //           больше 8 символов    есть маленькая буква    нет пробелов
        String regex = "(?=^.{8,}$)^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?!.*\\s).*$";
        //                        есть большая буква      есть цифра
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        matcher = pattern.matcher(password[0]);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(password[1]);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(password[2]);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(password[3]);
        System.out.println(matcher.matches());


    }
}
