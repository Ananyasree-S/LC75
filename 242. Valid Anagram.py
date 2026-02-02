'''242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true'''

'''count len, count char in s into dict
deduct char in t from dict
if no char or count in -ve return false'''

def valid_ana(s,t):
  if len(s) != len(t):
    return False

  map={}
  for ch in s:
    map[ch] += map.get(ch,0)+1
  
  for ch in t:
    if ch not in map:
      return False
    map[ch] -= 1
    if map[ch]<0:
      return False
  return True
