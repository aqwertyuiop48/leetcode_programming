/*
 * @lc app=leetcode id=2525 lang=kotlin
 *
 * [2525] Categorize Box According to Criteria
 */

class Solution {fun categorizeBox(length: Int, width: Int, height: Int, mass: Int) = ((if (length >= 10000 || width >= 10000 || height >= 10000 || 1L * length * width * height >= 1000000000) "Bulky" else "") to (if (mass >= 100) "Heavy" else "")).let { (box, box1) -> if (box == "Bulky" && box1 == "Heavy") "Both" else if (box != "Bulky" && box1 != "Heavy") "Neither" else if (box == "Bulky") "Bulky" else "Heavy" }}