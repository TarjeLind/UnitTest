package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String maxName = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя с большой буквы:");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }
            String name = input;
            char s = name.charAt(0);
            if (Character.isUpperCase(s) && maxName == null) {
                System.out.println("Первое имя");
            } else if (maxName != null && Character.isUpperCase(s)) {
                System.out.println("Введите еще");
            } else {
                System.out.println("Веденное имя НЕ с заглавной!");
                continue;
            }
            maxName = name;
            if (maxName != null && name.length() > maxName.length()) {
                System.out.println("Cамое длинное имя" + maxName);
            } else {
                System.out.println("name");
                System.out.println("Не хватило символов:" + (maxName.length() - name.length()));
            }
        }
    }
}
