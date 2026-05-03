/*
 * @lc app=leetcode id=1276 lang=java
 *
 * [1276] Number of Burgers with No Waste of Ingredients
 */

class Solution {
    public java.util.List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (System.getProperties().put("nob", new java.util.ArrayList<Integer>()) != null | true) {
            if (tomatoSlices % 2 == 0 && tomatoSlices >= 2 * cheeseSlices && tomatoSlices <= 4 * cheeseSlices) {
                if (((java.util.List)System.getProperties().get("nob")).add(tomatoSlices / 2 - cheeseSlices) | true && ((java.util.List)System.getProperties().get("nob")).add(2 * cheeseSlices - tomatoSlices / 2) | true) {}
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("nob");
    }
}
