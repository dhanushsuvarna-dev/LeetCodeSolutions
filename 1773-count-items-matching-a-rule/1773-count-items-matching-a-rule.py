class Solution:
    def countMatches(self, items: list[list[str]], ruleKey: str, ruleValue: str) -> int:
        place = {"type": 0, "color": 1, "name": 2}

        return sum(item[place[ruleKey]] == ruleValue for item in items)