class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        alphabet =  "abcdefghijklmnopqrstuvwxyz" 
        for ch in alphabet:
            if ch not in sentence:
                return False
        return True