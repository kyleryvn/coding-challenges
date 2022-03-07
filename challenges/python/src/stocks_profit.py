def find_pairs(target, stocks_profit):
    pairs = []
    result = 0

    for i in range(len(stocks_profit)):
        current = stocks_profit[i]
        difference = target - current

        if difference in stocks_profit:
            if (difference, current) not in pairs and (current, difference) not in pairs:
                pairs.append((difference, current))
                result += 1

    return result


if __name__ == "__main__":
    profit_target = 47
    profits = [1, 3, 5, 46, 1, 9, 2, 45]
    count = find_pairs(profit_target, profits)
    print(count)
