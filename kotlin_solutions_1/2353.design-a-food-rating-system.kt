/* @lc app=leetcode id=2353 lang=kotlin */
class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {
    val f2c = mutableMapOf<String, String>().also { f -> foods.indices.forEach { i -> f[foods[i]] = cuisines[i] } }
    val f2r = mutableMapOf<String, Int>().also { r -> foods.indices.forEach { i -> r[foods[i]] = ratings[i] } }
    val c2q = mutableMapOf<String, java.util.TreeSet<Pair<Int, String>>>().also { q -> foods.indices.forEach { i -> q.getOrPut(cuisines[i]) { java.util.TreeSet(compareBy({ it.first }, { it.second })) }.add(-ratings[i] to foods[i]) } }
    fun changeRating(food: String, newRating: Int) = c2q[f2c[food]]?.remove(-f2r[food]!! to food).run { f2r[food] = newRating }.run { c2q[f2c[food]]?.add(-newRating to food) }
    fun highestRated(cuisine: String) = c2q[cuisine]?.first()?.second ?: ""
}