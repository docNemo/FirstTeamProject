package ru.mai.cleaners;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperCaseCleaner {
    public static String cleanString(String inStr) {
        StringBuilder buffStr = new StringBuilder(inStr);
        Pattern pattern = Pattern.compile("[A-ZА-Я]");
        Matcher matcher = pattern.matcher(buffStr);

        while (matcher.find()) {
            buffStr.delete(matcher.start(), matcher.end());
            matcher = pattern.matcher(buffStr);
        }

        return String.valueOf(buffStr);
    }
}
