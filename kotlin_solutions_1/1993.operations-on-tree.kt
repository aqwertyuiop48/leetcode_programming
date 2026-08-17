/*
 * @lc app=leetcode id=1993 lang=kotlin
 *
 * [1993] Operations on Tree
 */

class LockingTree(val parent: IntArray) { val locked = IntArray(parent.size) fun lock(num: Int, user: Int): Boolean { return if (locked[num] == 0) locked.set(num, user).run { true } else false } fun unlock(num: Int, user: Int): Boolean { return if (locked[num] == user) locked.set(num, 0).run { true } else false } fun upgrade(num: Int, user: Int): Boolean { return (locked[num] == 0 && !generateSequence(parent[num]) { if (it == -1) null else parent[it] }.any { locked[it] != 0 }).let { ok -> if (ok) parent.indices.filter { i -> locked[i] != 0 && generateSequence(parent[i]) { if (it == -1) null else parent[it] }.any { it == num } }.takeIf { it.isNotEmpty() }?.forEach { locked[it] = 0 }?.run { locked.set(num, user).run { true } } ?: false else false } } }