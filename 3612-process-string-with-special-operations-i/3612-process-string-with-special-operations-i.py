class Solution:
    def processStr(self, s: str) -> str:
        s1 = []
        for ch in s:
            match ch:
                case '#':
                    s1.extend(s1[:])
                case '*':
                    if s1:
                        s1.pop()
                case '%':
                    s1.reverse()
                case _:
                    s1.append(ch)
        return ''.join(s1)