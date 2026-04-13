/*
 * @lc app=leetcode id=3666 lang=java
 *
 * [3666] Minimum Operations to Equalize Binary String
 */

class Solution {
    public int minOperations(String s, int k) {
        return Stream.of((Object) new Object[] {
            new int[s.length() + 1], // [0] dp
            new TreeSet<Integer>(),  // [1] even set
            new TreeSet<Integer>(),  // [2] odd set
            new LinkedList<Integer>(), // [3] BFS queue
            (int) s.chars().filter(ch -> ch == '0').count() // [4] target
        })
        .peek(o -> Arrays.fill((int[]) ((Object[]) o)[0], -1))
        .peek(o -> IntStream.rangeClosed(1, s.length()).forEach(i -> ((TreeSet<Integer>) ((Object[]) o)[i % 2 == 0 ? 1 : 2]).add(i)))
        .peek(o -> ((int[]) ((Object[]) o)[0])[0] = 0)
        .peek(o -> ((Queue<Integer>) ((Object[]) o)[3]).add(0))
        .filter(o -> Stream.generate(() -> ((Queue<Integer>) ((Object[]) o)[3]).poll())
            .takeWhile(Objects::nonNull)
            .peek(x -> Stream.of(new int[]{
                x + k - 2 * Math.min(x, k), 
                x + k - 2 * Math.max(0, k - (s.length() - x))
            }).forEach(range -> Stream.iterate(((TreeSet<Integer>) ((Object[]) o)[range[0] % 2 == 0 ? 1 : 2]).ceiling(range[0]),
                next -> next != null && next <= range[1],
                next -> ((TreeSet<Integer>) ((Object[]) o)[range[0] % 2 == 0 ? 1 : 2]).higher(next))
                .forEach(next -> {
                    if ((((int[]) ((Object[]) o)[0])[next] = ((int[]) ((Object[]) o)[0])[x] + 1) > -1 
                        && ((Queue<Integer>) ((Object[]) o)[3]).add(next) 
                        && ((TreeSet<Integer>) ((Object[]) o)[range[0] % 2 == 0 ? 1 : 2]).remove(next)) {}
                })))
            .count() >= 0
        )
        .mapToInt(o -> ((int[]) ((Object[]) o)[0])[(int) ((Object[]) o)[4]])
        .findFirst()
        .getAsInt();
    }
}
