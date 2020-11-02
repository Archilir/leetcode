## 35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

**Example 1:**
<pre><code><b>Input:</b> nums = [1,3,5,6], target = 5
<b>Output:</b> 2
</code></pre>

**Example 2:**
<pre><code><b>Input:</b> nums = [1,3,5,6], target = 2
<b>Output:</b> 1
</code></pre>

**Example 3:**
<pre><code><b>Input:</b> nums = [1,3,5,6], target = 7
<b>Output:</b> 4
</code></pre>

**Example 4:**
<pre><code><b>Input:</b> nums = [1,3,5,6], target = 0
<b>Output:</b> 0
</code></pre>

**Example 5:**
<pre><code><b>Input:</b> nums = [1], target = 0
<b>Output:</b> 0
</code></pre>

**Constraints:**
* <pre><code>1 <= nums.length <= 10<sup>4</sup></code></pre>
* <pre><code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code></pre>
* `nums` contains **distinct** values sorted in **ascending** order.
* <pre><code>-10<sup>4</sup> <= target <= 10<sup>4</sup></code></pre>