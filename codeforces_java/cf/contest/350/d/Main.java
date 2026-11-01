import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw && new int[b0.length / 2 + 2] instanceof int[] nums && new int[4] instanceof int[] s
            && IntStream.range(0, raw.length).map(i -> raw[i] >= 48 ? (s[0] = s[0] * 10 + raw[i] - 48) * 0 + (s[2] = 1) * 0 : raw[i] == 45 ? (s[1] = 1) * 0 : s[2] == 1 ? (nums[s[3]++] = s[1] == 1 ? -s[0] : s[0]) * 0 + (s[0] = 0) * 0 + (s[1] = 0) * 0 + (s[2] = 0) * 0 : 0).sum() == 0
            && new int[] {0} instanceof int[] pos && ((IntSupplier) () -> nums[pos[0]++]) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] g && ((g[0] = (p, q) -> q == 0 ? p : g[0].applyAsInt(q, p % q)) != null)
            && new long[n] instanceof long[] ks && new long[n] instanceof long[] pl && new long[n] instanceof long[] ph
            && IntStream.range(0, n).map(i -> Integer.valueOf(ni.getAsInt()) instanceof Integer x1 && Integer.valueOf(ni.getAsInt()) instanceof Integer y1 && Integer.valueOf(ni.getAsInt()) instanceof Integer x2 && Integer.valueOf(ni.getAsInt()) instanceof Integer y2
                && Integer.valueOf(g[0].applyAsInt(Math.abs(y1 - y2), Math.abs(x2 - x1))) instanceof Integer gg && Integer.valueOf(y1 - y2 < 0 || y1 == y2 && x2 - x1 < 0 ? -1 : 1) instanceof Integer sg
                && Integer.valueOf(sg * (y1 - y2) / gg) instanceof Integer a && Integer.valueOf(sg * (x2 - x1) / gg) instanceof Integer b
                && Long.valueOf(((long) (a + 20001) << 47) | ((long) (b + 20001) << 31) | (2L * (a * x1 + b * y1) + (1L << 30))) instanceof Long key && Long.valueOf(ks[i] = key) != null
                && Long.valueOf(pl[i] = 4L * Math.min(b * x1 - a * y1, b * x2 - a * y2)) != null && Long.valueOf(ph[i] = 4L * Math.max(b * x1 - a * y1, b * x2 - a * y2)) != null ? 1 : 0).sum() >= 0
            && Arrays.stream(ks).sorted().distinct().toArray() instanceof long[] uk
            && IntStream.range(0, n).mapToLong(i -> ((long) Arrays.binarySearch(uk, ks[i]) << 32) | (pl[i] + (1L << 31))).sorted().toArray() instanceof long[] LO
            && IntStream.range(0, n).mapToLong(i -> ((long) Arrays.binarySearch(uk, ks[i]) << 32) | (ph[i] + (1L << 31))).sorted().toArray() instanceof long[] HI
            && IntStream.range(0, m).mapToObj(i -> new int[] {ni.getAsInt(), ni.getAsInt(), ni.getAsInt()}).toArray(int[][]::new) instanceof int[][] c)
            System.out.print(IntStream.range(0, m).mapToLong(i -> IntStream.range(i + 1, m).filter(j -> c[i][2] == c[j][2] && (c[i][0] - c[j][0]) * (c[i][0] - c[j][0]) + (c[i][1] - c[j][1]) * (c[i][1] - c[j][1]) > 4 * c[i][2] * c[i][2]).mapToLong(j ->
                Integer.valueOf(c[j][0] - c[i][0]) instanceof Integer dx && Integer.valueOf(c[j][1] - c[i][1]) instanceof Integer dy && Integer.valueOf(g[0].applyAsInt(Math.abs(dx), Math.abs(dy))) instanceof Integer gg && Integer.valueOf(dx < 0 || dx == 0 && dy < 0 ? -1 : 1) instanceof Integer sg
                && Integer.valueOf(sg * dx / gg) instanceof Integer a && Integer.valueOf(sg * dy / gg) instanceof Integer b && Integer.valueOf(c[i][0] + c[j][0]) instanceof Integer sx && Integer.valueOf(c[i][1] + c[j][1]) instanceof Integer sy
                && Integer.valueOf(Arrays.binarySearch(uk, ((long) (a + 20001) << 47) | ((long) (b + 20001) << 31) | (a * sx + b * sy + (1L << 30)))) instanceof Integer gid && gid >= 0 && Long.valueOf(b * sx - a * sy) instanceof Long x
                ? (long) (-Arrays.binarySearch(LO, ((long) gid << 32) | (2L * x + 1 + (1L << 31))) - 1) - (-Arrays.binarySearch(HI, ((long) gid << 32) | (2L * x - 1 + (1L << 31))) - 1) : 0L).sum()).sum());
    }
}

