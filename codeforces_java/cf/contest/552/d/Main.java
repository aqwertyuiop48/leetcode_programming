import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n && new int[201][201] instanceof int[][] g
            && IntStream.range(0, 201).allMatch(b2 -> IntStream.range(0, 201).allMatch(a2 -> (g[a2][b2] = b2 == 0 ? a2 : g[b2][a2 % b2]) >= 0))
            ? (long) n * (n - 1) * (n - 2) / 6 - IntStream.range(0, n).mapToLong(i -> IntStream.range(i + 1, n).mapToLong(j ->
                (Integer) (int) (tk[1 + 2 * j] - tk[1 + 2 * i]) instanceof Integer dx && (Integer) (int) (tk[2 + 2 * j] - tk[2 + 2 * i]) instanceof Integer dy
                && (Integer) g[Math.abs(dx)][Math.abs(dy)] instanceof Integer gg && (Integer) (dx / gg) instanceof Integer ux && (Integer) (dy / gg) instanceof Integer uy
                ? (ux < 0 || ux == 0 && uy < 0 ? -1L : 1L) * (ux * 1000L + uy) : 0L).sorted().toArray() instanceof long[] keys && new long[1] instanceof long[] st
                ? IntStream.range(1, keys.length).mapToLong(p -> keys[p] == keys[p - 1] ? ++st[0] : (st[0] = 0)).sum() : 0L).sum() : 0);
    }
}
