// Write a function that takes a string as input and returns the string reversed.
// Example:
// Given s = "Vaibhav Jain", return "niaJ vahbiaV".

public class ReverseString {
    public String reverseString(String s) {
        if(s == null || s.length() == 1 || s.length() == 0) {
            return s;
        }

        char[] word = s.toCharArray();

        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
        }

        return new String(word);
    }

    public static void main(String[] args){
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString("Vaibhav Jain Alankar Jain"));
    }
}
