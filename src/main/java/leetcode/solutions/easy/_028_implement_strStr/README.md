## 28. Implement strStr()
Implement [strStr()](http://www.cplusplus.com/reference/cstring/strstr).

Return the index of the first occurrence of needle in haystack, or `-1` if `needle` is not part of `haystack`.

**Clarification:**

What should we return when `needle` is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when `needle` is an empty string. This is consistent to C's [strStr()](http://www.cplusplus.com/reference/cstring/strstr) and Java's [indexOf()](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)).

**Example 1:**
<pre><code><b>Input:</b> haystack = "hello", needle = "ll"
<b>Output:</b> 2
</code></pre>

**Example 2:**
<pre><code><b>Input:</b> haystack = "aaaaa", needle = "bba
<b>Output:</b> -1
</code></pre>

**Example 3:**
<pre><code><b>Input:</b> haystack = "", needle = ""
<b>Output:</b> 0
</code></pre>

**Constraints:**
* <pre><code>0 <= haystack.length, needle.length <= 5 * 10<sup>4</sup></code></pre>
* `haystack` and `needle` consist of only lower-case English characters.