package com.anurup.samplePrograms.LibraryStrings;

import java.util.Scanner;

// Question bank : Page 41
// Write a program to accept a word and convert it into lowercase if it's in uppercase and display the new world
//by replacing only the vowels with the characters following it
//Sample Input : computer
//Sample Output : cpmpvtfr
public class WordAndReplaceVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String name = sc.nextLine();
        String newName = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                c = (char)((int)c +1);
            }
            if (Character.isUpperCase(c)) {
                newName = newName + Character.toLowerCase(c);

            } else {
                newName = newName + Character.toLowerCase(c);
            }
        }

        System.out.println("NEw word is" +newName);
    }
}
