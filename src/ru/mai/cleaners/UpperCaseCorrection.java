package ru.mai.cleaners;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperCaseCorrection {

    public static String correction(String str) {
        String res = new String(str.subSequence(1, str.length()).toString());
        Pattern pattern = Pattern.compile("[A-ZА-Я]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            res = matcher.replaceFirst(matcher.group(0).toLowerCase());
            matcher = pattern.matcher(res);
        }
        return str.charAt(0) + res;
    }
}
