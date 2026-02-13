/*
 * @lc app=leetcode id=355 lang=kotlin
 *
 * [355] Design Twitter
 */

class Twitter( private var time: Int = 0, private val tweets: MutableMap<Int, MutableList<Pair<Int, Int>>> = mutableMapOf(), private val following: MutableMap<Int, MutableSet<Int>> = mutableMapOf() ) { fun postTweet(userId: Int, tweetId: Int) = tweets.getOrPut(userId) { mutableListOf() }.add(time++ to tweetId) fun getNewsFeed(userId: Int): List<Int> = (following[userId]?.plus(userId) ?: setOf(userId)).flatMap { tweets[it] ?: emptyList() }.sortedByDescending { it.first }.take(10).map { it.second } fun follow(followerId: Int, followeeId: Int) = following.getOrPut(followerId) { mutableSetOf() }.add(followeeId) fun unfollow(followerId: Int, followeeId: Int) = following[followerId]?.remove(followeeId) }