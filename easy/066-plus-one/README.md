## 66. Plus One
Given a **non-empty** array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

**Example 1:**
<pre><code><b>Input:</b> digits = [1,2,3]
<b>Output:</b> [1,2,4]
<b>Explanation:</b> The array represents the integer 123.
</code></pre>

**Example 2:**
<pre><code><b>Input:</b> digits = [4,3,2,1]
<b>Output:</b> [4,3,2,2]
<b>Explanation:</b> The array represents the integer 4321.
</code></pre>

**Example 3:**
<pre><code><b>Input:</b> digits = [0]
<b>Output:</b> [1]
</code></pre>

**Constraints:**
* `1 <= digits.length <= 100`
* `0 <= digits[i] <= 9`