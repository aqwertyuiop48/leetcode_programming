import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && L.get(0).trim() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n && Integer.valueOf(L.get(1).trim()) instanceof Integer m
            && new int[3][n + 1] instanceof int[][] pc
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, 3).allMatch(c -> (pc[c][i + 1] = pc[c][i] + (s.charAt(i) - 'x' == c ? 1 : 0)) >= 0))
            ? IntStream.range(0, m).mapToObj(i -> new StringTokenizer(L.get(2 + i)) instanceof StringTokenizer st && Integer.valueOf(st.nextToken()) instanceof Integer l && Integer.valueOf(st.nextToken()) instanceof Integer r
                && IntStream.range(0, 3).map(c -> pc[c][r] - pc[c][l - 1]).toArray() instanceof int[] k
                ? r - l + 1 < 3 || Arrays.stream(k).max().getAsInt() - Arrays.stream(k).min().getAsInt() <= 1 ? "YES" : "NO" : "").collect(Collectors.joining("\n")) : "");
    }
}
