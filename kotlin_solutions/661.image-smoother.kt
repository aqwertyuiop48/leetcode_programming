/*
 * @lc app=leetcode id=661 lang=kotlin
 *
 * [661] Image Smoother
 */

class Solution { fun imageSmoother(img: Array<IntArray>): Array<IntArray> = Array(img.size) { i -> IntArray(img[0].size) { j -> (maxOf(0, i-1)..minOf(img.lastIndex, i+1)).flatMap { r -> (maxOf(0, j-1)..minOf(img[0].lastIndex, j+1)).map { img[r][it] } }.let { it.sum() / it.size } }} }

