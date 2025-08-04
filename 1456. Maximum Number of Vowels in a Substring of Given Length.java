/**
1456. Maximum Number of Vowels in a Substring of Given Length

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
**/


//Way1

class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i=0;i<k;i++){
            if(vowels.contains(arr[i])) count++;
        }
        int maxcount = count;
        for(int i=k;i<arr.length;i++){
            if(vowels.contains(arr[i])) count++;
            if(vowels.contains(arr[i-k])) count--;
            maxcount = Math.max(count,maxcount);
        }
        return maxcount;
    }
}



//Way 2
class Solution {
    public int maxVowels(String s, int k) {
        
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i=0;i<k;i++){
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                count++;
        }
        int maxcount = count;
        for(int i=k;i<arr.length;i++){
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')      
                count++;
            if (arr[i-k] == 'a' || arr[i-k] == 'e' || arr[i-k] == 'i' || arr[i-k] == 'o' || arr[i-k] == 'u')            
                count--;
            maxcount = Math.max(count,maxcount);
        }
        return maxcount;
    }
}
