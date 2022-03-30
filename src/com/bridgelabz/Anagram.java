package com.bridgelabz;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        char str1[] = { 'a', 'b', 'c', 'd' };
        char str2[] = { 'd', 'c', 'b', 'a' };
        if (areAnagram(str1, str2))									// Function Call
            System.out.println("The two strings are Anagram of each other");
        else
            System.out.println("The two strings are not Anagram of each other");
    }
        static boolean areAnagram(char[] str1, char[] str2) {	/* function to check whether two strings are
                                                                     anagram of each other */
        int n1 = str1.length;	 // Get lenghts of both strings
        int n2 = str2.length;
        if (n1 != n2)			 // If length of both strings is not same, then they cannot be anagram
            return false;
        Arrays.sort(str1);		 // Sort both strings
        Arrays.sort(str2);
        for (int i = 0; i < n1; i++)			// Compare sorted strings
            if (str1[i] != str2[i])
                return false;
        return true;
    }
}
