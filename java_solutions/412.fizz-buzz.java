/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

class Solution {
    public List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(i -> i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i)).collect(Collectors.toList());
    }
}
