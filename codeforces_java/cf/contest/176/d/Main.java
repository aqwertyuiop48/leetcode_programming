import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> in
            && Integer.valueOf(Integer.parseInt(in.next().trim())) instanceof Integer n
            && Stream.generate(in::next).limit(n).map(String::trim).toList() instanceof List<String> ss
            && Integer.valueOf(Integer.parseInt(in.next().trim())) instanceof Integer m
            && Arrays.stream(in.next().trim().split("\s+")).mapToInt(x -> Integer.parseInt(x) - 1).toArray() instanceof int[] seq
            && in.next().trim() instanceof String q
            && Integer.valueOf(ss.stream().mapToInt(String::length).max().getAsInt() + 2) instanceof Integer w
            && ss.stream().map(st -> IntStream.range(0, st.length()).boxed().collect(Collectors.groupingBy(p -> st.charAt(p) - 'a')) instanceof Map<Integer, List<Integer>> g
                ? IntStream.range(0, 26).mapToObj(c -> g.getOrDefault(c, List.of()).stream().mapToInt(x -> x).toArray()).toArray(int[][]::new) : null).toArray(int[][][]::new) instanceof int[][][] occ
            && IntStream.generate(() -> -1).limit((m + 1) * 26).toArray() instanceof int[] nT
            && IntStream.iterate((m - 1) * 26 + 25, i -> i >= 0, i -> i - 1).allMatch(i -> (nT[i] = occ[seq[i / 26]][i % 26].length > 0 ? i / 26 : nT[i + 26]) >= -1)
            && ((LongBinaryOperator) (pos, c) -> pos >= Long.MAX_VALUE / 4 ? Long.MAX_VALUE / 4
                : Math.max(Arrays.binarySearch(occ[seq[(int) (pos / w)]][(int) c], (int) (pos % w)), ~Arrays.binarySearch(occ[seq[(int) (pos / w)]][(int) c], (int) (pos % w))) < occ[seq[(int) (pos / w)]][(int) c].length
                    ? pos / w * w + occ[seq[(int) (pos / w)]][(int) c][Math.max(Arrays.binarySearch(occ[seq[(int) (pos / w)]][(int) c], (int) (pos % w)), ~Arrays.binarySearch(occ[seq[(int) (pos / w)]][(int) c], (int) (pos % w)))] + 1
                : nT[(int) (pos / w + 1) * 26 + (int) c] >= 0 ? (long) nT[(int) (pos / w + 1) * 26 + (int) c] * w + occ[seq[nT[(int) (pos / w + 1) * 26 + (int) c]]][(int) c][0] + 1 : Long.MAX_VALUE / 4) instanceof LongBinaryOperator next
            && LongStream.generate(() -> Long.MAX_VALUE / 4).limit(q.length() + 1).toArray() instanceof long[] f
            && (f[0] = 0) == 0
            && IntStream.range(0, q.length()).allMatch(i -> IntStream.iterate(i + 1, l -> l >= 1, l -> l - 1).allMatch(l -> (f[l] = Math.min(f[l], next.applyAsLong(f[l - 1], q.charAt(i) - 'a'))) >= 0))
            ? IntStream.rangeClosed(0, q.length()).filter(l -> f[l] < Long.MAX_VALUE / 4).max().getAsInt()
            : 0);
    }
}


