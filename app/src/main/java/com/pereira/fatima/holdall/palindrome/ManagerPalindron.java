package com.pereira.fatima.holdall.palindrome;

/**
 * Created by Human Booster on 16/11/2016.
 */

public class ManagerPalindron {

    public boolean palindronWord(String word) {
        int letterCount = word.length();
        // indexD = index Descendant
        int indexD = letterCount - 1;

        // indexA = index ascendant
        for (int indexA = 0; indexA < letterCount / 2; indexA++) {
            indexD = letterCount - 1 - indexA;

            if (word.charAt(indexA) == (word.charAt(indexD))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public String reverseWord(String word) {

        StringBuffer result = new StringBuffer();
        for (int index = 0; index<word.length(); index++ ) {
            //word.charAt(index);
            result.insert(0, word.charAt(index));
        }
        return result.toString();
    }

}
