/*
 * @lc app=leetcode id=804 lang=kotlin
 *
 * [804] Unique Morse Code Words
 */

class Solution { fun uniqueMorseRepresentations(words: Array<String>): Int = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..").let { m -> words.map { w -> w.map { m[it - 'a'] }.joinToString("") }.toSet().size } }
