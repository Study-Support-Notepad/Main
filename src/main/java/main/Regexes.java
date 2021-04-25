package main;

import java.util.regex.Pattern;

public class Regexes {

    public static boolean checkEmail(String txt) {
        String pattern = "[a-zA-Z0-9.!#$%&’*+\\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*";
        Pattern p = Pattern.compile(pattern);
        return p.matcher(txt).matches();
    }

    public static boolean checkPassword(String txt) {
        String pattern = "[0-9a-zA-Z!?]{8,50}+";
        Pattern p = Pattern.compile(pattern);
        return p.matcher(txt).matches();
    }

    public static boolean checkName(String txt)  {
        String pattern = "[0-9a-zA-Z]{3,20}+";
        Pattern p = Pattern.compile(pattern);
        return p.matcher(txt).matches();
    }
}
