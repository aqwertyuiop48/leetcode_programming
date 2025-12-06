/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
// semicolons : 1
class Solution {
    public String intToRoman(int num) { return IntStream.range(0, String.valueOf(num).length()).mapToObj(i -> Map.ofEntries(Map.entry(0,""),Map.entry(1,"I"),Map.entry(2,"II"),Map.entry(3,"III"),Map.entry(4,"IV"),Map.entry(5,"V"),Map.entry(6,"VI"),Map.entry(7,"VII"),Map.entry(8,"VIII"),Map.entry(9,"IX"),Map.entry(10,"X"),Map.entry(20,"XX"),Map.entry(30,"XXX"),Map.entry(40,"XL"),Map.entry(50,"L"),Map.entry(60,"LX"),Map.entry(70,"LXX"),Map.entry(80,"LXXX"),Map.entry(90,"XC"),Map.entry(100,"C"),Map.entry(200,"CC"),Map.entry(300,"CCC"),Map.entry(400,"CD"),Map.entry(500,"D"),Map.entry(600,"DC"),Map.entry(700,"DCC"),Map.entry(800,"DCCC"),Map.entry(900,"CM"),Map.entry(1000,"M"),Map.entry(2000,"MM"),Map.entry(3000,"MMM")).get(Character.getNumericValue(String.valueOf(num).charAt(i)) * (int)Math.pow(10, String.valueOf(num).length() - i - 1))).collect(Collectors.joining()); }
}
// @lc code=end

