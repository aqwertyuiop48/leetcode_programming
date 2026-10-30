import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] v && (Integer) (int) Math.round(Math.sqrt(v[0] * v[1] + v[2] * v[3] + v[4] * v[5])) instanceof Integer n && n * n == v[0] * v[1] + v[2] * v[3] + v[4] * v[5] && new int[][]{{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}} instanceof int[][] P && IntStream.range(0, 48).mapToObj(code -> P[code / 8] instanceof int[] p && IntStream.range(0, 3).map(s -> v[2 * p[s] + (code >> s & 1)]).toArray() instanceof int[] w && IntStream.range(0, 3).map(s -> v[2 * p[s] + 1 - (code >> s & 1)]).toArray() instanceof int[] h && (Character) (char) ('A' + p[0]) instanceof Character a && (Character) (char) ('A' + p[1]) instanceof Character b && (Character) (char) ('A' + p[2]) instanceof Character c ? (h[0] == n && h[1] == n && h[2] == n ? n + "\n" + String.join("\n", Collections.nCopies(n, String.valueOf(a).repeat(w[0]) + String.valueOf(b).repeat(w[1]) + String.valueOf(c).repeat(w[2]))) : w[0] == n && h[1] == h[2] && h[0] + h[1] == n ? n + "\n" + String.join("\n", Collections.nCopies(h[0], String.valueOf(a).repeat(n))) + "\n" + String.join("\n", Collections.nCopies(h[1], String.valueOf(b).repeat(w[1]) + String.valueOf(c).repeat(w[2]))) : null) : null).filter(Objects::nonNull).findFirst() instanceof Optional<String> res ? res.get() : "-1");
    }
}
