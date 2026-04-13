/*
 * @lc app=leetcode id=2586 lang=java
 *
 * [2586] Count the Number of Vowel Strings in Range
 */

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
       return Arrays.stream(words).collect(Collectors.toList()).subList(left,right+1).stream().filter(i-> "aeiou".contains(i.substring(0,1)) && "aeiou".contains(new StringBuilder(i).reverse().toString().substring(0,1))).collect(Collectors.toList()).size();
    }
}
