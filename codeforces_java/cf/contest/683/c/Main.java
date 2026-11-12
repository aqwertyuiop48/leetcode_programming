import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] t && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length + 1).filter(i -> (i < raw.length && raw[i] > 47) ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (st[3] = 1) > 0
                : st[1] == 1 && (t[(int) st[2]++] = st[3] == 1 ? -st[0] : st[0]) * 0 + (st[0] = 0) + (st[1] = 0) + (st[3] = 0) == 0).count() >= 0
            && new TreeSet<Long>() instanceof TreeSet<Long> sa && new TreeSet<Long>() instanceof TreeSet<Long> sb
            && IntStream.range(0, (int) t[0]).filter(i -> sa.add(t[1 + i])).count() >= 0 && IntStream.range(0, (int) t[(int) t[0] + 1]).filter(i -> sb.add(t[(int) t[0] + 2 + i])).count() >= 0
            && Stream.concat(sa.stream().filter(v -> !sb.contains(v)), sb.stream().filter(v -> !sa.contains(v))).sorted().map(String::valueOf).collect(Collectors.toList()) instanceof List<String> r
            ? r.size() + (r.isEmpty() ? "" : " " + String.join(" ", r)) : "");
    }
}
