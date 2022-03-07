import unittest
import stocks_profit as sp


class TestStocksProfit(unittest.TestCase):

    def test_stocks_profit(self):
        target = 47
        stocks_profit = [1, 3, 6, 46, 1, 2, 45, 9]
        actual = sp.find_pairs(target, stocks_profit)
        self.assertEqual(2, actual)

    if __name__ == '__main__':
        unittest.main()
