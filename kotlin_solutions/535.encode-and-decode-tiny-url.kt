/*
 * @lc app=leetcode id=535 lang=kotlin
 *
 * [535] Encode and Decode TinyURL
 */

class Codec(val map: MutableMap<String, String> = mutableMapOf(), var id: Int = 0) { fun encode(longUrl: String) = "http://tinyurl.com/${id}".also { map[it] = longUrl.also{id++ }} fun decode(shortUrl: String) = map[shortUrl]!! }

