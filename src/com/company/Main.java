package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("For task-1 enter 1");
        System.out.println("For task-2 enter 2");
        System.out.println("For task-3 enter 3");
        System.out.println("For exit enter -1");

        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose task: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter string");
                    if (isPalindrome(input.next())) System.out.println("is palindrome");
                    else System.out.println("isn't palindrome");
                    break;
                case 2:
                    System.out.println("Enter i, j and string");
                    reverse(input.nextInt(), input.nextInt(), input.next());
                    break;
                case 3:
                    System.out.println("Enter char and string");
                    frequency(input.next().charAt(0), input.next());
                    break;
            }
        } while (option != -1);

    }

    public static boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1))
                return true;
        }
        return false;
    }

    public static void reverse(int i, int j, String str) {

        char[] chars = str.toCharArray();
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }
        System.out.println(chars);
    }

    public static void frequency(char ch, String str) {
        
        //int frequency = str.chars().filter(char -> char == ch).count();
        char[] chars2 = str.toCharArray();
        int frequency = 0;

        for (int i = 0; i < chars2.length; i++) {
            if (ch == chars2[i]) frequency++;
        }
        System.out.println(frequency);
    }
}
