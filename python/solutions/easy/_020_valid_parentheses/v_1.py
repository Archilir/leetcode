class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) == 0 or len(s) % 2 != 0:
            False

        opening = set(('(','[','{'))
        closing = {')': '(', ']': '[', '}': '{'}

        if s[0] in closing or s[len(s)-1] in opening:
            False

        stack = []
        for char in s:
            if char in opening:
                stack.append(char)
            if char in closing:
                # if the length of the stack is 0, that means that there are more closing characters than opening ones
                # if the previous character doesn't pair up with the current closing character, there is a break in order 
                if len(stack) == 0 or stack[len(stack)-1] != closing[char]:
                    return False
                stack.pop()
        
        if len(stack) != 0:
            return False
        return True

s = '()'
print(Solution().isValid(s))
