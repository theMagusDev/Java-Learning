package com.example.myFirstJavaPackage.workingWithData.collection.iterator;

import java.util.LinkedList;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {

        String s = "madam";

        List<Character> characterList = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            characterList.add(ch);
        }

        java.util.ListIterator<Character> listIterator = characterList.listIterator(/*start = 0 by default*/);
        java.util.ListIterator<Character> reverseListIterator = characterList.listIterator(characterList.size());
        boolean isPalindrome = true;
        while (listIterator.hasNext() && reverseListIterator.hasPrevious()) {
            if (listIterator.next() != reverseListIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is not a polindrome");
        }

    }
}
