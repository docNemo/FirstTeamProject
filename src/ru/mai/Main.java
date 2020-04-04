package ru.mai;

import ru.mai.cleaners.*;
import ru.mai.cleaners.DeleteTwins;
import ru.mai.cleaners.UpperCaseCorrection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        data = BlanksCleaner.cleanString(data);
        data = NumCleaner.cleanNums(data);
        data = SpecialCharsToSpaces.specialCharsToSpaces(data);
        data = DeleteTwins.deleteTwins(data);
        data = UpperCaseCorrection.correction(data);
        data = UpperCaseCleaner.cleanString(data);
        System.out.println(data);
    }
}
