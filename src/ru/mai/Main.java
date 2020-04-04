package ru.mai;

import ru.mai.cleaners.BlanksCleaner;
import ru.mai.cleaners.LineCheck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        data = BlanksCleaner.cleanString(data);

        data = LineCheck.delNonLatin(data);

        System.out.println(data);
    }
}
