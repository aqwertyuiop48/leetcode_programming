import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m
            ? Math.max(0, Math.min(n - 1, IntStream.range(0, m).map(i -> Math.max(tok[2 + 2 * i], tok[3 + 2 * i]) - 1).min().orElse(n - 1)) - Math.max(1, IntStream.range(0, m).map(i -> Math.min(tok[2 + 2 * i], tok[3 + 2 * i])).max().orElse(1)) + 1) : "");
    }
}
