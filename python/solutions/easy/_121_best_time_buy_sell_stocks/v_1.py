class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        max_profit = 0
        for b, buy_price in enumerate(prices):
            for s, sell_price in enumerate(prices[b+1:], start=b+1):
                profit = sell_price - buy_price
                if profit > max_profit:
                    max_profit = profit
        return max_profit
