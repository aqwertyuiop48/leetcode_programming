/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */

class Solution { public String[] findRestaurant(String[] list1, String[] list2) { return Optional.of(IntStream.range(0, list2.length).boxed().collect(Collectors.toMap(i -> list2[i], i -> i))) .map(map -> IntStream.range(0, list1.length) .filter(i -> map.containsKey(list1[i])) .mapToObj(i -> new java.util.AbstractMap.SimpleEntry<>(list1[i], i + map.get(list1[i]))) .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))) .map(groups -> groups.get(Collections.min(groups.keySet()))) .get().toArray(String[]::new); } }
