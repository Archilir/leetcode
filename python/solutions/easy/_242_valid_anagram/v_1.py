class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            False

        char_dict = {}
        for char in s:
            if char in char_dict:
                char_dict[char] = char_dict[char] + 1
            else:
                char_dict[char] = 1
        
        for char in t:
            if char in char_dict:
                if char_dict[char] == 1:
                    del char_dict[char]
                else:
                    char_dict[char] = char_dict[char] - 1
            else:
                return False

        return not bool(char_dict)
