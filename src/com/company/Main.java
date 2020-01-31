package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        comandForConverter(userInputComand());
    }

    public static String userInputComand() {

        Scanner scanner = new Scanner(System.in);
        String userComand = scanner.nextLine();
        return userComand;
    }

    public static void comandForConverter(String userComand) {

        ConvertToComand convertToComand = new ConvertToComand(userComand);
    }
}