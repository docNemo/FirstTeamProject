package ru.mai.cleaners;

public class NumCleaner {
    public static String cleanNums(String data) {
        String nums = "[0-9]";
        data = data.replaceAll("[0-9]", " ");
        return  data;
    }
}
