package com.example.anagram;

public class Anagram {

    public static String getAnagram(String source) {

        StringBuilder result =  new StringBuilder();

        for (String word: source.split(" ")) {

            int size = word.length();
            char tmp;
            char[] characters = word.toCharArray();

            int left = 0;
            int right = size - 1;

            while (left < right) {

                if (!Character.isLetter(characters[left]) &&
                        Character.isLetter(characters[right])) {

                    while (!Character.isLetter(characters[left]) && left < right) {
                        left++;
                    }

                } else if (Character.isLetter(characters[left]) &&
                        !Character.isLetter(characters[right])) {

                    while (!Character.isLetter(characters[right]) && left < right) {
                        right--;
                    }

                }

                if (Character.isLetter(characters[left]) &&
                        Character.isLetter(characters[right]) && left < right) {

                    tmp = characters[left];
                    characters[left] = characters[right];
                    characters[right] = tmp;

                }

                right--;
                left++;
            }
            if (result.toString() == "") {
                result.append(new String(characters));
            } else {
                result.append(" " + new String(characters));
            }
        }

        return result.toString();
    }
}
