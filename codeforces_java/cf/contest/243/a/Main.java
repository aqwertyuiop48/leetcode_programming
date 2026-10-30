import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 && raw[i] <= 57
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[1] = 1) > 0
                : st[1] == 0 || (v[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0)
            && new boolean[1 << 20] instanceof boolean[] seen
            && new int[2][24] instanceof int[][] buf
            && new int[3] instanceof int[] z
            && new int[1] instanceof int[] m
            && IntStream.range(0, v[0]).allMatch(i -> Integer.valueOf(v[i + 1]) instanceof Integer a
                && (buf[1 - z[1]][0] = a) >= 0 && (m[0] = 1) > 0 && (seen[a] || (seen[a] = true) && ++z[2] > 0)
                && IntStream.range(0, z[0]).allMatch(j -> Integer.valueOf(buf[z[1]][j] | a) instanceof Integer y
                    && (y == buf[1 - z[1]][m[0] - 1] || (buf[1 - z[1]][m[0]++] = y) >= 0 && (seen[y] || (seen[y] = true) && ++z[2] > 0)))
                && (z[0] = m[0]) > 0 && (z[1] = 1 - z[1]) >= 0)
            ? z[2] : "");
    }
}
