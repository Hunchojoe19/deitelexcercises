package cddClass;

public class NonRepeatingStrings {
    public static void main(String[] args) {
    String s = "GeeksForGeeks";
    int max = lengthOfNonRepeatingSubString(s);
        System.out.println(max);
    }
    public static int lengthOfNonRepeatingSubString(String string){
        int maxLength = -1;
        StringBuilder test = new StringBuilder();
        if (string.length() == 0){
            return 0;
        }
        if (string.length() == 1){
            return 1;
        }
        StringBuilder longestSubString = new StringBuilder();
        for (char c: string.toCharArray()){
            String currentChar = String.valueOf(c);

            if (test.toString().contains(currentChar)){
                test = new StringBuilder(test.substring(test.indexOf(currentChar)+1));
                System.out.println(test);
            }
            test.append(currentChar);

            if (test.length() > maxLength){
                maxLength = test.length();
                longestSubString = test;
            }
        }
        System.out.println("Longest Substring is "+ longestSubString);
        return maxLength;
    }
}
