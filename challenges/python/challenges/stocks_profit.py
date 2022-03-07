def find_pairs(target, stocks_profit):
    """ Does not work for all test cases """
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
