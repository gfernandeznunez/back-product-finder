package com.walmart.search.util;

public class Palindrome {
    public static boolean isPalindrome(String data){
        int i = 0, j = data.length() - 1;

        while (i < j) {

            if (data.charAt(i) != data.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
