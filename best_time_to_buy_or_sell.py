def maxprofit(prices):
  buy = float('-inf')
  maxprof = 0
  for p in prices:
    buy = min(buy, p)
    maxprof = max(maxprof, p - buy)
  
  return maxprof
