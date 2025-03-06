import unittest
import v_1, v_2, v_3

class RunTests():
    def run(self, vals, target, expected, methods):
        results = []
        expected_results = []
        for method in methods:
            results.append(method.Solution().twoSum(vals, target))
            expected_results.append(expected)
        return results, expected_results


class TestTwoSums(unittest.TestCase):
    methods = [v_1, v_2, v_3]

    def test_case_1(self):
        nums = [2, 7, 11, 15]
        target = 9
        expected = [0, 1]

        results, expected_results = RunTests().run(nums, target, expected, self.methods)
        self.assertEqual(results, expected_results)

    def test_case_2(self):
        nums = [3, 2, 4]
        target = 6
        expected = [1, 2]

        results, expected_results = RunTests().run(nums, target, expected, self.methods)
        self.assertEqual(results, expected_results)

    def test_case_3(self):
        nums = [3, 3]
        target = 6
        expected = [0, 1]

        results, expected_results = RunTests().run(nums, target, expected, self.methods)
        self.assertEqual(results, expected_results)

if __name__ == '__main__':
    unittest.main()
