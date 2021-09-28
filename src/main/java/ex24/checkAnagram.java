package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class checkAnagram {
    public static void isAnagram(String anagram1, String anagram2) {
        anagram1 = anagram1.replaceAll("\\s", "").toLowerCase();
        anagram2 = anagram2.replaceAll("\\s", "").toLowerCase();
        List<Character> listAnagram1 = new ArrayList<>();
        List<Character> listAnagram2 = new ArrayList<>();
        for (int i = 0; i < anagram1.length(); i++) {
            listAnagram1.add(anagram1.charAt(i));
        }
        for (int i = 0; i < anagram2.length(); i++) {
            listAnagram2.add(anagram2.charAt(i));
        }
        Collections.sort(listAnagram1);
        Collections.sort(listAnagram2);
        if (listAnagram1.equals(listAnagram2)) {
            System.out.print('"' + anagram1 + '"' + " " + "and " + '"' + anagram2 + '"' + " " + "are anagrams.");
        } else {
            System.out.print('"' + anagram1 + '"' + " " + "and " + '"' + anagram2 + '"' + " " + "are not anagrams.");
        }
    }

}

