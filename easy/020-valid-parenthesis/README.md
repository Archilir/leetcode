## 20. Valid Parentheses
Given a string s containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

**Example 1:**
<pre><code><b>Input:</b> s = "()"
<b>Output:</b> true
</code></pre>

**Example 2:**
<pre><code><b>Input:</b> s = "()[]{}"
<b>Output:</b> true
</code></pre>

**Example 3:**
<pre><code><b>Input:</b> s = "(]"
<b>Output:</b> false
</code></pre>

**Example 4:**
<pre><code><b>Input:</b> s = "([)]"
<b>Output:</b> false
</code></pre>

**Example 5:**
<pre><code><b>Input:</b> s = {[]}"
<b>Output:</b> true
</code></pre>

**Constraints:**
* <pre><code>1 <= s.length <= 10<sup>4</sup></code></pre>
* `s` consits of parentheses only `()[]{}`.