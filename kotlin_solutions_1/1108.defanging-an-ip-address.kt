/*
 * @lc app=leetcode id=1108 lang=kotlin
 *
 * [1108] Defanging an IP Address
 */

class Solution { fun defangIPaddr(address: String): String = address.replace(".", "[.]") }