import unittest
import v_1, v_2, v_3

class RunTests():
    def run(self, vals, expected, methods):
        results = []
        expected_results = []
        for method in methods:
            results.append(method.Solution().containsDuplicate(vals))
            expected_results.append(expected)
        return results, expected_results


class TestContainsDuplicate(unittest.TestCase):
    methods = [v_1, v_2, v_3]

    def test_case_1(self):
        nums = [1, 2, 3, 1]
        expected = True

        results, expected_results = RunTests().run(nums, expected, self.methods)
        self.assertEqual(results, expected_results)

    def test_case_2(self):
        nums = [1, 2, 3, 4]
        expected = False

        results, expected_results = RunTests().run(nums, expected, self.methods)
        self.assertEqual(results, expected_results)

    def test_case_3(self):
        nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
        expected = True

        results, expected_results = RunTests().run(nums, expected, self.methods)
        self.assertEqual(results, expected_results)

if __name__ == '__main__':
    unittest.main()
