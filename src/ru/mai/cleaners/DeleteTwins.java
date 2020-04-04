package ru.mai.cleaners;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteTwins {
    private static final String MULTI_SPACE = "\\s+";
    private static final String EXTRA_FIRST_SPACE = "^\\s+";
    private static final String DELETE_ALL_EXTRA_CHAR = "[^A-Za-zА-Яа-я0-9]";
    private static final StringBuilder NEW_LINE = new StringBuilder("\n");
    private static final byte NULL_INDEX = 0;

    public static String twins(String inputStr) {
        String[] words = inputStr.split(MULTI_SPACE);
        StringBuilder resultStr = new StringBuilder();

        Pattern pat;
        Matcher mat;
        boolean firstMatch = false;

        for (int i = 0; i < words.length - 1; i++) {
            String pattern = "^" + words[i].replaceAll(DELETE_ALL_EXTRA_CHAR, "") + "$";
            pat = Pattern.compile(pattern);
            mat = pat.matcher(words[i + 1].replaceAll(DELETE_ALL_EXTRA_CHAR, ""));

            if (mat.find()) {
                if (firstMatch) {
                    resultStr.append(NEW_LINE).append(mat.group());
                } else {
                    resultStr.append(mat.group());
                    firstMatch = true;
                }
            }
        }
        return resultStr.toString();
    }

    public static String deleteTwins(String inputStr) {
        String[] words = twins(inputStr).split(MULTI_SPACE);

        if (!words[NULL_INDEX].equals("")) {
            StringBuilder resultStr = new StringBuilder(inputStr);

            Pattern pat;
            Matcher mat;

            for (String word : words) {
                String pattern = word.replaceAll(DELETE_ALL_EXTRA_CHAR, "") + "\\s+" + word.replaceAll(DELETE_ALL_EXTRA_CHAR, "");
                pat = Pattern.compile(pattern);
                mat = pat.matcher(resultStr);

                if (mat.find()) {
                    resultStr.delete(mat.start(), mat.start() + word.replaceAll(DELETE_ALL_EXTRA_CHAR, "").length());
                }
            }
            return resultStr.toString().replaceAll(EXTRA_FIRST_SPACE, "").replaceAll(MULTI_SPACE, " ");
        } else {
            return inputStr;
        }
    }
}
