import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Integer) tk[1] instanceof Integer m
            && (Integer) tk[2] instanceof Integer p
            && IntStream.range(0, n).map(i -> tk[3 + i] % p).toArray() instanceof int[] xm
            && IntStream.range(0, m).map(i -> tk[3 + n + i] % p).toArray() instanceof int[] ym
            && (Integer) (n + m - 1) instanceof Integer dn
            && (Integer) 128 instanceof Integer bs
            && new int[][] {null, null} instanceof int[][] sw
            && new int[1] instanceof int[] dd
            && ((IntConsumer) a ->
                sw[1][a + 1] = (xm[a] + ym[dd[0] - a] >= p ? xm[a] + ym[dd[0] - a] - p : xm[a] + ym[dd[0] - a]) + Math.max(sw[0][a], sw[0][a + 1])) instanceof IntConsumer cell
            && new int[((dn + bs - 1) / bs)][] instanceof int[][] ck
            && new int[2][] instanceof int[][] w
            && (w[0] = IntStream.range(0, n + 3).map(i -> -1).toArray()) != null
            && (w[1] = IntStream.range(0, n + 3).map(i -> i == 1 ? 0 : -1).toArray()) != null
            && IntStream.range(0, dn).allMatch(d ->
                (d % bs != 0 || (ck[d / bs] = Arrays.copyOfRange(w[(d + 1) & 1], Math.max(0, d - m), Math.min(d - 1, n - 1) + 3)) != null)
                && (Integer) Math.max(0, d - m + 1) instanceof Integer lo
                && (Integer) Math.min(d, n - 1) instanceof Integer hi
                && (sw[0] = w[(d + 1) & 1]) != null
                && (sw[1] = w[d & 1]) != null
                && (dd[0] = d) >= 0
                && Stream.of(0).peek(u -> IntStream.rangeClosed(lo, hi).forEach(cell)).findFirst().isPresent()
                && (sw[1][lo] = -1) < 0
                && (sw[1][hi + 2] = -1) < 0)
            && (Integer) w[(dn - 1) & 1][n] instanceof Integer best
            && new int[bs + 1][n + 3] instanceof int[][] blk
            && new int[] {n - 1} instanceof int[] pos
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, ck.length).map(i -> ck.length - 1 - i).allMatch(c ->
                (Integer) (c * bs) instanceof Integer d0
                && (Integer) Math.min(dn, d0 + bs) instanceof Integer d1
                && Stream.of(0).peek(u -> System.arraycopy(ck[c], 0, blk[0], Math.max(0, d0 - m), ck[c].length)).findFirst().isPresent()
                && IntStream.range(d0, d1).allMatch(d ->
                    (Integer) Math.max(0, d - m + 1) instanceof Integer lo
                    && (Integer) Math.min(d, n - 1) instanceof Integer hi
                    && (sw[0] = blk[d - d0]) != null
                    && (sw[1] = blk[d - d0 + 1]) != null
                    && (dd[0] = d) >= 0
                    && Stream.of(0).peek(u -> IntStream.rangeClosed(lo, hi).forEach(cell)).findFirst().isPresent()
                    && (sw[1][lo] = -1) < 0
                    && (sw[1][hi + 2] = -1) < 0)
                && IntStream.range(0, d1 - d0).map(i -> d1 - 1 - i).allMatch(d ->
                    d == 0 || (blk[d - d0][pos[0]] >= blk[d - d0][pos[0] + 1]
                        ? sb.append('C') != null && --pos[0] >= -1
                        : sb.append('S') != null)))
            ? best + "\n" + sb.reverse() : "");
    }
}

