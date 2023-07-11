package ru.netoiogy.javaqa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        int expected = 150;
        long actual = service.calculate(5_000,true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        actual = service.calculate(5_000,false);
        System.out.println("2, " + expected + " == ? == " + actual);

    }
}