## 53. Maximum Subarray
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return *its sum*.

**Follow up**: If you have figured out the `O(n)` solution, try coding another solution using the **divide and conquer** approach, which is more subtle.

**Example 1:**
<pre><code><b>Input:</b> nums = [-2,1,-3,4,-1,2,1,-5,4]
<b>Output:</b> 6
<b>Explanation:</b> [4,-1,2,1] has the largest sum = 6.
</code></pre>

**Example 2:**
<pre><code><b>Input:</b> nums = [1]
<b>Output:</b> 1
</code></pre>

**Example 3:**
<pre><code><b>Input:</b> nums = [0]
<b>Output:</b> 0
</code></pre>

**Example 4:**
<pre><code><b>Input:</b> nums = [-1]
<b>Output:</b> -1
</code></pre>

**Example 5:**
<pre><code><b>Input:</b> nums = [-2147483647]
<b>Output:</b> -2147483647
</code></pre>

**Constraints:**
* <pre><code>1 <= nums.length <= 10<sup>4</sup></code></pre>
* <pre><code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code></pre>