import unittest
import wikipedia_article as wiki


class TestWikipediaArticle(unittest.TestCase):

    def test_wikipedia_article(self):
        target = 311
        actual = wiki.get_topic('pizza')
        self.assertEqual(target, actual)

    if __name__ == '__main__':
        unittest.main()
