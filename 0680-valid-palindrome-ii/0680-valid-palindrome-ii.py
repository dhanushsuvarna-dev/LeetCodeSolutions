class Solution:
    def validPalindrome(self, s: str) -> bool:
        flag = True
        for i in range(len(s)//2):
            if s[i] != s[len(s)-1-i]:
                flag = False
                loc = i
                break
        if not flag:
            left = s[:loc] + s[loc+1:]
            right = s[:len(s)-1-loc] + s[len(s)-loc:]

            return left==left[::-1] or right==right[::-1]
            
        return flag

            
            