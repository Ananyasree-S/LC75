/**
2390. Removing Stars From a String
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.
**/

class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.deleteCharAt(sb.length() - 1); // acts like pop, del last char
            } else {
                sb.append(c); // acts like push
            }
        }
        return sb.toString();
        //see another solution using stack
    }
}

//Type 2:
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        StringBuilder res = new StringBuilder();
        for(char c: stack){
            res.append(c);
        }
        return res.toString();
    }
}
