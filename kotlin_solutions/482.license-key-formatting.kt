/*
 * @lc app=leetcode id=482 lang=kotlin
 *
 * [482] License Key Formatting
 */

class Solution {fun licenseKeyFormatting(s: String, k: Int): String =s.replace("-", "").uppercase().reversed().chunked(k).joinToString("-").reversed()}
