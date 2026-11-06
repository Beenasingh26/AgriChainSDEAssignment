package com.agrichain.logic;

public class LongSubstring {
	
	public static void main(String[] args) {

        String input = "abcabcbb";

        int maxLength = 0;

        for (int i = 0; i < input.length(); i++) {

            String substring = "";

            for (int j = i; j < input.length(); j++) {

                char currentChar = input.charAt(j);

                if (substring.indexOf(currentChar) == -1) {

                    substring = substring + currentChar;

                } else {

                    break;
                }
            }

            if (substring.length() > maxLength) {

                maxLength = substring.length();
            }
        }

        System.out.println("Longest substring length: " + maxLength);
    }

}
