package ru.mai.cleaners;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineCheck {
    public static String delNonLatin(String str) {
        Pattern pat = Pattern.compile("([\\w\\s,!?.:;/\"'])");
        Matcher mat = pat.matcher(str);
        String resStr = "";
        while (mat.find()) {
            resStr += mat.group(1);
        }
        return resStr;
    }
}
