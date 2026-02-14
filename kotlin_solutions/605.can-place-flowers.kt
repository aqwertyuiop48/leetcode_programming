/*
 * @lc app=leetcode id=605 lang=kotlin
 *
 * [605] Can Place Flowers
 */

class Solution { fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean = flowerbed.indices.count { i -> flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.lastIndex || flowerbed[i + 1] == 0) && flowerbed.apply { this[i] = 1 }.let { true } } >= n }
