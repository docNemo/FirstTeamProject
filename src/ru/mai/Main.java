package ru.mai;

import ru.mai.cleaners.BlanksCleaner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        data = BlanksCleaner.cleanString(data);

        System.out.println(data);
    }
}
