/*
 * @lc app=leetcode id=1 lang=kotlin
 *
 * [1] Two Sum
 */

// @lc code=start
import com.*
import java.*
import javax.*
import jdk.*
import org.*
import sun.*
//import scala.*
import kotlin.*
import kotlinx.*
import netscape.*
class Solution {fun twoSum(nums: IntArray, target: Int) = nums.mapIndexed { i, x -> nums.indexOf(target - x).takeIf { it != -1 && it != i }?.let { intArrayOf(i, it) } }.first { it != null }!!}
// @lc code=end

