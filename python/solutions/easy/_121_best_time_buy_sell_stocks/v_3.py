class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        max_profit = 0
        buy_price = prices[0]
        for price in prices:
            if price - buy_price > max_profit:
                max_profit = price - buy_price
            elif price < buy_price:
                buy_price = price
        return max_profit
