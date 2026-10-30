import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer h && Integer.valueOf(t[1]) instanceof Integer w && Integer.valueOf(t[2]) instanceof Integer k
            && IntStream.range(0, h).mapToObj(i -> w == 1 ? "" : t[3 + 2 * i]).toList() instanceof List<String> hz
            && IntStream.range(0, h - 1).mapToObj(i -> w == 1 ? t[3 + i] : t[4 + 2 * i]).toList() instanceof List<String> vz
            && Boolean.valueOf(h > w) instanceof Boolean tr
            ? k == 1 ? Stream.concat(hz.stream(), vz.stream()).mapToLong(z -> z.chars().filter(ch -> ch == 'E').count()).sum() * 4 >= 3L * ((long) h * (w - 1) + (long) (h - 1) * w)
                    ? "YES\n" + IntStream.range(0, h).mapToObj(i -> "1 ".repeat(w).trim()).collect(Collectors.joining("\n")) : "NO"
                : Integer.valueOf(tr ? w : h) instanceof Integer H && Integer.valueOf(tr ? h : w) instanceof Integer W
                    && (tr ? IntStream.range(0, w).mapToObj(a -> new String(IntStream.range(0, h - 1).map(i -> vz.get(i).charAt(a)).toArray(), 0, h - 1)).toList() : hz) instanceof List<String> hz2
                    && (tr ? IntStream.range(0, w - 1).mapToObj(a -> new String(IntStream.range(0, h).map(i -> hz.get(i).charAt(a)).toArray(), 0, h)).toList() : vz) instanceof List<String> vz2
                    && new int[H][W] instanceof int[][] c
                    && IntStream.range(0, H).allMatch(i -> IntStream.range(1, W).allMatch(j -> (c[i][j] = hz2.get(i).charAt(j - 1) == 'E' ? c[i][j - 1] : 1 - c[i][j - 1]) >= 0)
                        && (i == 0 || IntStream.range(0, W).filter(j -> (vz2.get(i - 1).charAt(j) == 'E') == (c[i - 1][j] == c[i][j])).count() * 2 >= W || IntStream.range(0, W).allMatch(j -> (c[i][j] = 1 - c[i][j]) >= 0)))
                    ? "YES\n" + IntStream.range(0, h).mapToObj(i -> new String(IntStream.range(0, 2 * w - 1).map(j -> j % 2 == 1 ? 32 : 49 + (tr ? c[j / 2][i] : c[i][j / 2])).toArray(), 0, 2 * w - 1)).collect(Collectors.joining("\n")) : "" : "");
    }
}
