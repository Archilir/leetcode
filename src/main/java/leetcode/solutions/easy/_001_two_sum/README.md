## 2. Two Sum
Given an array of integers `nums` and an integer `target`, return *indices of the two numbers such that they add up to `target`*.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

**Example 1:**
<pre><code><b>Input:</b> nums = [2,7,11,15], target = 9
<b>Output:</b> [0,1]
<b>Output:</b> Because nums[0] + nums[1] == 9, we return [0, 1].
</code></pre>

**Example 2:**
<pre><code><b>Input:</b> nums = [3,2,4], target = 6
<b>Output:</b> [1,2]
</code></pre>

**Example 3:**
<pre><code><b>Input:</b> nums = [3,3], target = 6
<b>Output:</b> [0,1]
</code></pre>

**Constraints:**
* <code>2 <= nums.length <= 10<sup>5</sup></code>
* <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
* <code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code>
* **Only one valid answer exists.**