/*
 * @lc app=leetcode id=811 lang=java
 *
 * [811] Subdomain Visit Count
 */

record Solution() {
    public java.util.List<String> subdomainVisits(String[] cpdomains) {
        return java.util.Arrays.stream(cpdomains).flatMap(s -> java.util.Optional.of(s.split(" ")).map(parts -> java.util.stream.IntStream.range(0, parts[1].split("\\.").length).mapToObj(i -> java.util.Arrays.stream(parts[1].split("\\.")).skip(i).collect(java.util.stream.Collectors.joining("."))).map(sub -> new Object[]{sub, Integer.parseInt(parts[0])})).get()).collect(java.util.stream.Collectors.groupingBy(obj -> (String)obj[0], java.util.stream.Collectors.summingInt(obj -> (int)obj[1]))).entrySet().stream().map(e -> e.getValue() + " " + e.getKey()).toList();
    }
}
