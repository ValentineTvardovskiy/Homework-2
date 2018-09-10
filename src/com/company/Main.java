package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string");
        if (isPalindrome(input.next())) System.out.println("is palindrome");
        else System.out.println("isn't palindrome");

        System.out.println("Enter i, j and string");
        reverse(input.nextInt(), input.nextInt(), input.next());

        System.out.println("Enter char and string");
        frequency(input.next().charAt(0), input.next());

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

        char[] chars2 = str.toCharArray();
        int frequency = 0;

        for (int i = 0; i < chars2.length; i++) {
            if (ch == chars2[i]) frequency++;
        }
        System.out.println(frequency);
    }
}
