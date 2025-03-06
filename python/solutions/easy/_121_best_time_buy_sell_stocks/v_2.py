class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        max_profit = 0
        buy_d = 0
        sell_d = 1
        while sell_d < len(prices):
            if prices[buy_d] < prices[sell_d]:
                profit = prices[sell_d] - prices[buy_d]
                max_profit = max(profit, max_profit)
            else:
                buy_d = sell_d
            sell_d += 1
        return max_profit
