class Solution:
    def isValid(self, word: str) -> bool:
        if len(word) < 3:
            return False

        vowels = "aeiouAEIOU"
        has_vowel = False
        has_consonant = False

        for c in word:
            if not (c.isalpha() or c.isdigit()):
                return False  # Invalid character found

        for c in word:
            if c.isalpha():
                if c in vowels:
                    has_vowel = True
                else:
                    has_consonant = True

        return has_vowel and has_consonant
