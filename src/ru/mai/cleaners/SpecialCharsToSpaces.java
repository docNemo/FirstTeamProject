package ru.mai.cleaners;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharsToSpaces {
    public static String specialCharsToSpaces(String strIn) {
        Pattern pattern = Pattern.compile("[!@#$%^&*()_+\\-\"№;:?=/\\\\.,|]");
        Matcher matcher = pattern.matcher(strIn);
        return matcher.replaceAll(" ");
    }
}
