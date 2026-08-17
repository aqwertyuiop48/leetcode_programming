/*
 * @lc app=leetcode id=1418 lang=kotlin
 *
 * [1418] Display Table of Food Orders in a Restaurant
 */

class Solution { fun displayTable(orders: List<List<String>>): List<List<String>> = orders.map { it[2] }.distinct().sorted().let { foods -> listOf(listOf("Table") + foods) + orders.groupBy { it[1].toInt() }.toSortedMap().map { (table, items) -> listOf(table.toString()) + foods.map { food -> items.count { it[2] == food }.toString() } } } }