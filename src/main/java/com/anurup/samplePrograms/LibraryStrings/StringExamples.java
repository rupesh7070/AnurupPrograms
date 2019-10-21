package com.anurup.samplePrograms.LibraryStrings;

import java.util.Scanner;

public class StringExamples {

    public static void main(String[] args) {
        StringExamples sam = new StringExamples();
        sam.reverseFirstCharcterOfEachWord();
    }

    //Special Words - Words which start and end with same letters
    //e.g : EXISTENCE, COMIC,WINDOW

    public void specialWord(String word) {
        int len = word.length();
        if (word.charAt(0) == word.charAt(len - 1)) {
            System.out.println("Its' a special word");
        } else {
            System.out.println("Its' not a special word");
        }
    }

    // Palindrome : which read same from left to right and vice versa
    //e.g : MADAM, CICIC

    public void isPlanindrome(String word) {
        int len = word.length();
        String reverseWord = "";
        for (int i = len - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        if (reverseWord.equals(word)) {
            System.out.println("Word is Planindrome");
        } else {
            System.out.println("Word is not a Planindrome");
        }
    }

    // Enter a sentence and count occurence of a world
    // Enter sentence : My name is rupesh . Rupesh is in Delhi
    //ENter word to be searched : is
    //Output : searched word occurs 2 time

    public void searchWord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();

        System.out.println("Enter word to be searched");
        String word = sc.nextLine();

        int count = 0;
        int index = 0;
        index = sentence.indexOf(word);
        while (index >= 0) {
            count = count + 1;
            index = index + 1;
            index = sentence.indexOf(word, index);
        }

        System.out.println("Searched word occurs" + count + " times");
    }

    // program to accept a string and display new string by reversing cse of each charcter
    // This is a Test
    // tHIS IS A tEST

    public void reverseEachCharcter() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence ");
        String text = sc.nextLine();


    }

    // program to accept a sentence in lower case and convert first letter of each word in sentence to upper case

    // this is a test
    // This Is A Test

    public void reverseFirstCharcterOfEachWord() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        String newSentence = "";
        int count = 0;
        while (sentence.indexOf("", count) > 0) {
            int pos = sentence.indexOf("", count);
            String world = sentence.substring(count, pos);
            String newWord = world.substring(0, 1).toUpperCase() + world.substring(1);
            newSentence = newSentence + newWord;
            count = count + pos;
        }

        System.out.println("The new sentence is " +newSentence);

    }

}

