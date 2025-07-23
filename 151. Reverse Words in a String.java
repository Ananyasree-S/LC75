/**

151. Reverse Words in a String

Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. 
Do not include any extra spaces.

**/

class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length - 1; i >= 0; i--){
            if(str[i] != ""){
                sb.append(str[i]); // add word
                sb.append(" "); // add space after that word
            }
        }
        sb.setLength(sb.length() - 1); //delete last space by reducing size
        return sb.toString();
    }
}
