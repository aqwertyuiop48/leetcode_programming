/*
 * @lc app=leetcode id=1452 lang=kotlin
 *
 * [1452] People Whose List of Favorite Companies Is Not a Subset of Another List
 */

class Solution { fun peopleIndexes(favoriteCompanies: List<List<String>>): List<Int> = favoriteCompanies.map { it.toSet() }.let { sets -> sets.indices.filter { i -> sets.indices.none { j -> i != j && sets[j].containsAll(sets[i]) } } } }