import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L && Integer.valueOf(L.get(0).trim()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> Arrays.stream(L.get(i + 1).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new) instanceof int[][] st
            && new long[m] instanceof long[] cum && new long[1] instanceof long[] acc
            && IntStream.range(0, m).allMatch(i -> (cum[i] = acc[0] += st[i][0] == 1 ? 1 : (long) st[i][1] * st[i][2]) > 0)
            && new int[100001] instanceof int[] pre && new int[1] instanceof int[] len
            && IntStream.range(0, m).filter(i -> len[0] < 100000).allMatch(i -> st[i][0] == 1 ? (pre[len[0]++] = st[i][1]) > 0
                : Integer.valueOf((int) Math.min(100000 - len[0], (long) st[i][1] * st[i][2])) instanceof Integer add && IntStream.range(0, add).map(r -> pre[len[0] + r] = pre[r % st[i][1]]).sum() >= 0 && (len[0] += add) > 0)
            ? L.subList(m + 2, L.size()).stream().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong)
                .mapToObj(p -> Integer.valueOf(Arrays.binarySearch(cum, p)) instanceof Integer b0 && Integer.valueOf(b0 < 0 ? -b0 - 1 : b0) instanceof Integer j
                    ? String.valueOf(st[j][0] == 1 ? st[j][1] : pre[(int) ((p - (j > 0 ? cum[j - 1] : 0) - 1) % st[j][1])]) : "").collect(Collectors.joining(" ")) : "");
    }
}
