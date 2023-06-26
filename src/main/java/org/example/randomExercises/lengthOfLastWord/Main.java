package org.example.randomExercises.lengthOfLastWord;

public class Main {
    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //
    //A word is a maximal
    //substring
    // consisting of non-space characters only.
    //
    //
    public static void main(String[] args) {
        String text = "luffy is still joyboy";
        int i = lengthOfLastWord(text);

        System.out.println(i);
    }

    public static int lengthOfLastWord(String s) {

        String trimmed = s.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = trimmed.length()-1; i >=0 ; i--) {
            if (trimmed.charAt(i)!=' '){
                sb.append(trimmed.charAt(i));
            }else {
                break;
            }
        }

        return sb.length();

    }
}
