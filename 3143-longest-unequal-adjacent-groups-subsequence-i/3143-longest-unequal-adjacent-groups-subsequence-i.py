class Solution:
    def getLongestSubsequence(self, words: List[str], groups: List[int]) -> List[str]:
        my_list = []

        my_list.append(words[0])

        for i in range(1,len(groups)):
            if groups[i-1] != groups[i]:
                my_list.append(words[i])

        return my_list