import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : st[2] == 0 || ((nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Integer.valueOf((int) nums[1]) instanceof Integer m
            && IntStream.range(0, m).map(i -> n + 1 - (int) nums[3 + 2 * i]).toArray() instanceof int[] L
            && IntStream.range(0, m).map(i -> (int) nums[2 + 2 * i]).toArray() instanceof int[] R
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingInt(i -> L[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[1] instanceof int[] ptr
            && new ArrayList<Integer>() instanceof ArrayList<Integer> res
            && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq
            && IntStream.rangeClosed(1, n).allMatch(x ->
                IntStream.iterate(0, k -> ptr[0] < m && L[ord[ptr[0]]] == x, k -> k + 1).allMatch(k ->
                    Integer.valueOf(ord[ptr[0]++]) instanceof Integer q && pq.add(R[q] * 131072L + q))
                && IntStream.iterate(0, k -> !pq.isEmpty() && pq.peek() / 131072 < x, k -> k + 1).allMatch(k -> pq.poll() != null)
                && (pq.isEmpty() || res.add((int) (pq.poll() % 131072) + 1)))
            ? res.size() + "\n" + res.stream().map(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}

