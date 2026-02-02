'''
Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct'''

'''Create a set,
iterate through numdss
if the ele in set return true
else add it to set '''

def Containsdup():
  hs = set()
  for n in nums:
    if n in hs:
      return True
    hs.add(n)
  return False
