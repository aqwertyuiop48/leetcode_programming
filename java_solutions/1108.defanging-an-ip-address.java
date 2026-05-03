/*
 * @lc app=leetcode id=1108 lang=java
 *
 * [1108] Defanging an IP Address
 */

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
