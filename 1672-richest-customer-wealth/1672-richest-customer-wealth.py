class Solution:
    def maximumWealth(self, accounts: list[list[int]]) -> int:
        max = 0
        for account in accounts:
            sum_acc = sum(account)
            if max < sum_acc :
                max = sum_acc
        return max
        