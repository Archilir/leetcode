import re

class Solution:
    def isPalindrome(self, s: str) -> bool:
        formatted = str.lower(re.sub(r'[\W_]+', '', s))
        head_p = 0
        tail_p = len(formatted) - 1
        while tail_p >= 0:
            if formatted[tail_p] != formatted[head_p]:
                return False
            tail_p -= 1
            head_p += 1
        return True
