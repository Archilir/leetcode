## 3. Longest Substring Without Repeating Characters
Given a string `s`, find the length of the longest substring without repeating characters.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

**Example 1:**
<pre><code><b>Input:</b> s = "abcabcbb"
<b>Output:</b> 3
<b>Explanation:</b> The answer is "abc", with the length of 3.
</code></pre>

**Example 2:**
<pre><code><b>Input:</b> s = "bbbbb"
<b>Output:</b> 1
<b>Explanation:</b> The answer is "b", with the length of 1.
</code></pre>

**Example 3:**
<pre><code><b>Input:</b> s = "pwwkew"
<b>Output:</b> 3
<b>Explanation:</b> The answer is "wke", with the length of 3. Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
</code></pre>

**Example 4:**
<pre><code><b>Input:</b> s = ""
<b>Output:</b> 0
</code></pre>

**Example 5:**
<pre><code><b>Input:</b> s = " "
<b>Output:</b> 1
</code></pre>

**Example 6:**
<pre><code><b>Input:</b> s = "dvdf"
<b>Output:</b> 3
</code></pre>

**Constraints:**
* <pre><code>0 <= s.length <= 5 * 10<sup>4</sup></code></pre>
* `s` consists of English letters, digits, symbols and spaces.