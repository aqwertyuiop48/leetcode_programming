import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> in
            && Integer.valueOf(Integer.parseInt(in.next().trim())) instanceof Integer n
            && Stream.generate(in::next).limit(n).map(String::trim).toList() instanceof List<String> ss
            && Integer.valueOf(Integer.parseInt(in.next().trim())) instanceof Integer m
            && Arrays.stream(in.next().trim().split("\\s+")).mapToInt(x -> Integer.parseInt(x) - 1).toArray() instanceof int[] seq
            && in.next().trim() instanceof String q
            && Integer.valueOf(ss.stream().mapToInt(String::length).max().getAsInt() + 2) instanceof Integer w
            && ss.stream().map(st -> IntStream.rangeClosed(0, st.length()).mapToObj(p -> IntStream.generate(() -> -1).limit(26).toArray()).toArray(int[][]::new) instanceof int[][] arr
                && IntStream.iterate(st.length() - 1, p -> p >= 0, p -> p - 1).allMatch(p -> ((arr[p] = arr[p + 1].clone())[st.charAt(p) - 'a'] = p) >= 0) ? arr : null).toArray(int[][][]::new) instanceof int[][][] nxt
            && new int[m + 1][26] instanceof int[][] nextT
            && Arrays.stream(nextT[m]).allMatch(x -> true)
            && IntStream.range(0, 26).allMatch(c -> (nextT[m][c] = -1) == -1)
            && IntStream.iterate(m - 1, t -> t >= 0, t -> t - 1).allMatch(t -> IntStream.range(0, 26).allMatch(c -> (nextT[t][c] = nxt[seq[t]][0][c] >= 0 ? t : nextT[t + 1][c]) >= -1))
            && ((java.util.function.LongBinaryOperator) (pos, c) -> pos >= Long.MAX_VALUE / 4 ? Long.MAX_VALUE / 4
                : Long.valueOf(pos / w) instanceof Long t && Long.valueOf(pos % w) instanceof Long pp && Integer.valueOf(nxt[seq[(int) (long) t]][(int) (long) pp][(int) c]) instanceof Integer idx
                    ? idx >= 0 ? t * w + idx + 1
                        : Integer.valueOf(nextT[(int) (t + 1)][(int) c]) instanceof Integer t2 && t2 >= 0 ? (long) t2 * w + nxt[seq[t2]][0][(int) c] + 1 : Long.MAX_VALUE / 4
                    : Long.MAX_VALUE / 4) instanceof java.util.function.LongBinaryOperator next
            && LongStream.generate(() -> Long.MAX_VALUE / 4).limit(q.length() + 1).toArray() instanceof long[] f
            && (f[0] = 0) == 0
            && IntStream.range(0, q.length()).allMatch(i -> IntStream.iterate(i + 1, l -> l >= 1, l -> l - 1).allMatch(l -> next.applyAsLong(f[l - 1], q.charAt(i) - 'a') < f[l] ? (f[l] = next.applyAsLong(f[l - 1], q.charAt(i) - 'a')) >= 0 : true))
            ? IntStream.rangeClosed(0, q.length()).filter(l -> f[l] < Long.MAX_VALUE / 4).max().getAsInt()
            : 0);
    }
}
