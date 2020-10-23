## 21. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new **sorted** list. The new list should be made by splicing together the nodes of the first two lists.

**Example 1:**

<img src="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg">
<pre><code><b>Input:</b> l1 = [1,2,4], l2 = [1,3,4]
<b>Output:</b> [1,1,2,3,4,4]
</code></pre>

**Example 2:**
<pre><code><b>Input:</b> l1 = [], l2 = []
<b>Output:</b> []
</code></pre>

**Example 3:**
<pre><code><b>Input:</b> l1 = [], l2 = [0]
<b>Output:</b> [0]
</code></pre>

**Constraints:**
* The number of nodes in both lists is in the range `[0, 50]`.
* `-100 <= Node.val <= 100`
* Both `l1` and `l2` are sorted in **non-decreasing** order.