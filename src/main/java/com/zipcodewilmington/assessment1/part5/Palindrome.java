package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Palindrome {

    public String[] getAllSubStrings(String input) {
        ArrayList<String> arr = new ArrayList();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                arr.add(input.substring(i, j));
            }

        }
        return arr.toArray(new String[0]);

    }


    public Integer countPalindromes (String input){
        String[] allSubStrings = getAllSubStrings(input);
        Integer palindromeCounter = 0;

        for (int i = 0; i < allSubStrings.length; i++) {
            String tempString = BasicStringUtils.reverse(allSubStrings[i]);
            if (allSubStrings[i].equals(tempString)) {
                palindromeCounter++;
            }
        }

        return palindromeCounter;
    }





}


