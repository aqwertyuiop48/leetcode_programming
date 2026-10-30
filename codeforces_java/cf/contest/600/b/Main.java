import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && (Integer) o[0] instanceof Integer n && (Integer) o[1] instanceof Integer m
                && Arrays.stream(o, 2, 2 + n).mapToLong(x -> 2L * x).sorted().toArray() instanceof long[] c
                ? IntStream.range(0, m).mapToObj(i -> String.valueOf(-Arrays.binarySearch(c, 2L * o[2 + n + i] + 1) - 1)).collect(Collectors.joining(" ")) : "");
    }
}
