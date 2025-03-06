import re, math

class Solution:
    def isPalindrome(self, s: str) -> bool:
        formatted = str.lower(re.sub(r'[^a-zA-Z0-9]+', '', s))
        if len(formatted) == 0:
            return True

        head_p = 0
        tail_p = len(formatted) - 1
        mid_p = math.floor((len(formatted)-1) / 2)

        while tail_p >= mid_p:
            if formatted[tail_p] != formatted[head_p]:
                return False
            tail_p -= 1
            head_p += 1
        return True
