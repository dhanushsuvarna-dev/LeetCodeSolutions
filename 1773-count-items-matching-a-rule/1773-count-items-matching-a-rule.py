class Solution:
    def countMatches(self, items: list[list[str]], ruleKey: str, ruleValue: str) -> int:
        count = 0

        if ruleKey == "type":
            place = 0
        elif ruleKey == "color":
            place = 1
        else:
            place = 2

        for item in items:
            if item[place] == ruleValue:
                count += 1

        return count