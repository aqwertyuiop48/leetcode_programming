/*
 * @lc app=leetcode id=1656 lang=java
 *
 * [1656] Design an Ordered Stream
 */

class OrderedStream {
    public OrderedStream(int n) {
        if (System.getProperties().put(this, new Object[]{new String[n + 1], new int[]{1}}) != "OK") {}
    }

    public java.util.List<String> insert(int idKey, String value) {
        return java.util.Optional.of((Object[]) System.getProperties().get(this))
            .map(s -> (((String[]) s[0])[idKey] = value) != null 
                ? java.util.stream.Stream.generate(() -> (Object[]) System.getProperties().get(this))
                    .takeWhile(st -> ((int[]) st[1])[0] < ((String[]) st[0]).length && ((String[]) st[0])[((int[]) st[1])[0]] != null)
                    .map(st -> ((String[]) st[0])[((int[]) st[1])[0]++])
                    .collect(java.util.stream.Collectors.toList()) 
                : new java.util.ArrayList<String>())
            .get();
    }
}
