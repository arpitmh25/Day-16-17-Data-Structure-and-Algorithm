package com.bridgelabz.dsa;


import java.util.Scanner;

public class AnagramDetection {

    public void anagram(String one, String two) {
        char newOne[] = one.toCharArray();
        char newTwo[] = two.toCharArray();
        sortMethod(newOne);
        sortMethod(newTwo);
        one = new String(newOne);
        two = new String(newTwo);
        if (one.equals(two))
            System.out.println(" They are anagrams");
        else
            System.out.println(" They are not anagrams");
    }

    public static void sortMethod(char[] array) {
        char temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > (array[j + 1])) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String string1 = sc.next();
        System.out.println("Enter second string");
        String string2 = sc.next();
        AnagramDetection anag1 = new AnagramDetection();
        anag1.anagram(string1, string2);
    }
}