/*
 * @lc app=leetcode id=420 lang=kotlin
 *
 * [420] Strong Password Checker
 */

class Solution { fun strongPasswordChecker(password: String): Int = password.length.let { len -> password.indices.fold(listOf<Int>()) { acc, i -> if (i == 0) listOf(1) else if (password[i] == password[i - 1]) acc.dropLast(1) + (acc.last() + 1) else acc + 1 }.let { repeats -> listOf( password.any { it.isLowerCase() }, password.any { it.isUpperCase() }, password.any { it.isDigit() } ).count { !it }.let { missing -> if (len < 6) maxOf(6 - len, missing) else if (len <= 20) maxOf(missing, repeats.filter { it >= 3 }.sumOf { it / 3 }) else (len - 20).let { deletes -> repeats.toMutableList().also { reps -> listOf(0, 1, 2).fold(deletes) { opsLeft, mod -> reps.indices.filter { reps[it] >= 3 && reps[it] % 3 == mod }.fold(opsLeft) { ops, i -> if (ops >= mod + 1) reps[i].let { reps[i] -= mod + 1}.let{ops - (mod + 1) } else ops } }.let { opsLeft -> reps.indices.fold(opsLeft) { ops, i -> if (reps[i] >= 3 && ops > 0) minOf(ops, reps[i] - 2).also { canDelete -> reps[i] -= canDelete }.let { ops - it } else ops } } }.let { optimized -> deletes + maxOf(missing, optimized.filter { it >= 3 }.sumOf { it / 3 }) } } } } } }

