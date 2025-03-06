## 88. Merge Sorted Array
Given two sorted integer arrays *nums1* and *nums2*, merge *nums2* into *nums1* as one sorted array.

**Note:**
* The number of elements initialized in *nums1* and *nums2* are *m* and *n* respectively.
* You may assume that *nums1* has enough space (size that is **equal** to *m* + *n*) to hold additional elements from *nums2*.

**Example:**
<pre><code><b>Input:</b>
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

<b>Output:</b> [1,2,2,3,5,6]
</code></pre>

**Constraints:**
* `-10^9 <= nums1[i], nums2[i] <= 10^9`
* `nums1.length == m + n`
* `nums2.length == n`