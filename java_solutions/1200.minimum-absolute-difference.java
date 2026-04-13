/*
 * @lc app=leetcode id=1200 lang=java
 *
 * [1200] Minimum Absolute Difference
 */

class Solution { public List<List<Integer>> minimumAbsDifference(int[] arr) { return Optional.of(Arrays.stream(arr).sorted().toArray()) .map(sortedArr -> IntStream.range(0, sortedArr.length - 1) .boxed() .collect(Collectors.groupingBy(i -> sortedArr[i + 1] - sortedArr[i], TreeMap::new, Collectors.toList())) .firstEntry() .getValue() .stream() .map(i -> List.of(sortedArr[i], sortedArr[i + 1])) .collect(Collectors.toList())) .get(); } }
