/*
 * @lc app=leetcode id=690 lang=kotlin
 *
 * [690] Employee Importance
 */

class Solution { fun getImportance(employees: List<Employee?>, id: Int): Int = employees.filterNotNull().associateBy { it.id }.let { map -> DeepRecursiveFunction<Int, Int> { eid -> map[eid]!!.let { it.importance + it.subordinates.sumOf { callRecursive(it) } } }(id) } }
