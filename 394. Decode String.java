/**
394. Decode String

Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does 
not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
The test cases are generated so that the length of the output will never exceed 105.

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
**/

class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder res = new StringBuilder();
        int count = 0;

        for( char c : s.toCharArray()){
            if(Character.isDigit(c)){
                count = 10 * count + (c - '0');
            }else if(c == '['){
                str.push(res);
                num.push(count);
                count = 0;
                res = new StringBuilder();
            }else if(c == ']'){
                StringBuilder prev = str.pop();
                int repeat = num.pop();
                for(int i=0;i<repeat;i++){
                    prev.append(res);
                }res = prev;
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
