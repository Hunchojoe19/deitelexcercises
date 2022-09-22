package cddClass.Practice;

import java.util.Arrays;

import static java.lang.String.format;

public class ReverseString2 {
    public static void main(String[] args) {
        String r = reversedString("Good Food");
        System.out.println("The letters to be reversed is "+"Good Food");
        System.out.println("The reversed string is "+ r);


    }
    public static String reversedString(String s){
        String[] arrays = new String[s.length()];
        int letterIndex = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            arrays[letterIndex] = String.valueOf(s.charAt(i));
            letterIndex++;

        }
        String letter = "";
        for (int i = 0; i < s.length(); i++) {
            letter += arrays[i];

        }
        return letter;

        }
}
