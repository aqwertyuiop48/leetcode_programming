import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && new long[]{tk[1], tk[2]} instanceof long[] xy && Arrays.stream(tk, 3, 3 + n).sorted().toArray() instanceof long[] s
            ? IntStream.range(0, n).takeWhile(i -> ((s[i] & 1) == 0 || (xy[1] > 0 ? --xy[1] >= 0 : --xy[0] >= 0))
                && Long.valueOf(s[i] - (s[i] & 1)) instanceof Long b && Long.valueOf(Math.min(xy[0], b / 2)) instanceof Long d && (xy[0] -= d) >= 0
                && b - 2 * d <= xy[1] && (xy[1] -= b - 2 * d) >= 0).count() : "");
    }
}
