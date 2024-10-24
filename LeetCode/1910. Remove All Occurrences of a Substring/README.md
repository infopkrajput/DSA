# 1910. Remove All Occurrences of a Substring

## Problem Statement

Given two strings `s` and `part`, perform the following operation on `s` until all occurrences of the substring `part` are removed:

Find the leftmost occurrence of the substring `part` and remove it from `s`.

Return `s` after removing all occurrences of `part`.

### Example 1

Input: s = "daabcbaabcbc", part = "abc"  
Output: "dab"  
Explanation: The following operations are done:  
- "da**abc**baabcbc" → "dabaabcbc"  
- "daba**abc**bc" → "dababc"  
- "dab**abc**" → "dab"

### Example 2

Input: s = "axxxxyyyyb", part = "xy"  
Output: "ab"  
Explanation: The following operations are done:  
- "a**xy**xxxyyyyb" → "axxxyyyyb"  
- "a**xy**xxyyyyb" → "axxyyyyb"  
- "a**xy**xyyyyb" → "axyyyb"  
- "a**xy**yyyb" → "ayyyb"  
- "a**xy**yyb" → "ayyb"  
- "a**xy**yb" → "ayb"  
- "a**xy**b" → "ab"

### Constraints

- `1 <= s.length <= 1000`
- `1 <= part.length <= 1000`
- `s` and `part` consist of lowercase English letters.

[C++]()

[JAVA]()

## My 100 Days Of code Journal

[Day#]() 

[100 Days Of code Journal](https://splashy-zone-afc.notion.site/100-Days-of-Code-Journal-11349fd54d99805f86defe8d1c3b0f78?pvs=4)
