import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer k
            ? (n == 4 || k < n + 1) ? "-1"
                : IntStream.rangeClosed(1, n).filter(v -> v != tok[2] && v != tok[3] && v != tok[4] && v != tok[5]).mapToObj(String::valueOf).collect(Collectors.joining(" ")) instanceof String rs
                ? String.format("%d %d %s %d %d\n%d %d %s %d %d", tok[2], tok[4], rs, tok[5], tok[3], tok[4], tok[2], rs, tok[3], tok[5]) : "" : "");
    }
}
