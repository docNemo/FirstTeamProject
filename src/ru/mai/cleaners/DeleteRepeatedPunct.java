package ru.mai.cleaners;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteRepeatedPunct {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String input = in.nextLine();
        String result = deleteRepeatedPunctuation(input);
        System.out.print(result);
    }

    private static String deleteRepeatedPunctuation(String str) {
        String pattern = "[,!?.:-]{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            String buf = matcher.group();
            buf = buf.substring(buf.length() - 1);
            str = str.replaceFirst(pattern, buf);
        }
        return str;
    }
}