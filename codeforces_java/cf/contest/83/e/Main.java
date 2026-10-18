import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.toList()) instanceof List<String> L
            && Integer.valueOf(Integer.parseInt(L.get(0).trim())) instanceof Integer n
            && Integer.valueOf(L.get(1).trim().length()) instanceof Integer len
            && IntStream.range(0, n).map(i -> Integer.parseInt(L.get(1 + i).trim(), 2)).toArray() instanceof int[] v
            && new int[21][] instanceof int[][] best
            && IntStream.rangeClosed(0, len).allMatch(l -> (best[l] = new int[1 << l]) != null && IntStream.range(0, 1 << l).allMatch(x -> (best[l][x] = 500000000) > 0))
            && new int[]{0} instanceof int[] off
            && (best[0][0] = len) > 0
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(IntStream.rangeClosed(0, len).filter(l -> (v[i - 1] & ((1 << l) - 1)) == v[i] >> (len - l)).max().getAsInt()) instanceof Integer ov
                && Integer.valueOf(IntStream.rangeClosed(0, len).map(l -> best[l][v[i] >> (len - l)] - l).min().getAsInt() + off[0] + len) instanceof Integer nv
                && (off[0] += len - ov) >= 0
                && IntStream.rangeClosed(0, len).allMatch(l -> (best[l][v[i - 1] & ((1 << l) - 1)] = Math.min(best[l][v[i - 1] & ((1 << l) - 1)], nv - off[0])) > Integer.MIN_VALUE))
            ? best[0][0] + off[0] : "");
    }
}




