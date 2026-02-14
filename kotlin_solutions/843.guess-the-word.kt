/*
 * @lc app=leetcode id=843 lang=kotlin
 *
 * [843] Guess the Word
 */

class Solution {fun findSecretWord(words: Array<String>, master: Master) { (words.isEmpty()).takeIf { !it }?.run { words[0].length.let { max -> ArrayList<String>().apply { addAll(words) }.let { pending -> generateSequence { (pending.size > 0).takeIf { it }?.run { (0 until pending.size).random().let { ran -> pending[ran].let { cur -> master.guess(cur).let { result -> (result == max).let { found -> if (found) null else pending.removeAt(ran).run {pending.filter { word -> (0..word.lastIndex).count { i -> word[i] == cur[i] } == result }.also { temp -> pending.clear() .run{pending.addAll(temp)} }.let { Unit } } } } } } } }.forEach { } } } } } }
