/*
 * @lc app=leetcode id=1268 lang=java
 *
 * [1268] Search Suggestions System
 */

class Solution {
    public java.util.List<java.util.List<String>> suggestedProducts(String[] products, String searchWord) {
        return java.util.Optional.of(java.util.Arrays.stream(products).sorted().toArray(String[]::new))
            .map(sorted -> new Object[]{sorted, new int[]{0, products.length - 1}})
            .map(state -> java.util.stream.IntStream.range(0, searchWord.length())
                .mapToObj(i -> java.util.Optional.of((int[]) state[1])
                    .map(p -> new int[]{
                        p[0] = java.util.stream.IntStream.range(p[0], p[1] + 1)
                            .filter(idx -> ((String[]) state[0])[idx].length() > i && ((String[]) state[0])[idx].charAt(i) == searchWord.charAt(i))
                            .findFirst().orElse(p[1] + 1),
                        p[1] = java.util.stream.IntStream.range(p[0], p[1] + 1)
                            .filter(idx -> ((String[]) state[0])[idx].length() > i && ((String[]) state[0])[idx].charAt(i) == searchWord.charAt(i))
                            .reduce((first, second) -> second).orElse(p[0] - 1)
                    })
                    .map(p -> java.util.stream.IntStream.range(p[0], Math.min(p[0] + 3, p[1] + 1))
                        .mapToObj(idx -> ((String[]) state[0])[idx])
                        .collect(java.util.stream.Collectors.toList()))
                    .orElse(new java.util.ArrayList<>()))
                .collect(java.util.stream.Collectors.toList()))
            .orElse(new java.util.ArrayList<>());
    }
}
