import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer b
            && new long[n + 1] instanceof long[] en && new int[]{0, 0} instanceof int[] ptr
            ? IntStream.range(0, n).mapToObj(i -> Long.valueOf(tk[2 + 2 * i]) instanceof Long t && Long.valueOf(tk[3 + 2 * i]) instanceof Long d
                && IntStream.iterate(ptr[0], h -> h < ptr[1] && en[h] <= t, h -> h + 1).filter(h -> ++ptr[0] > 0).count() >= 0
                && ptr[1] - ptr[0] <= b
                && (en[ptr[1]] = Math.max(t, ptr[1] > 0 ? en[ptr[1] - 1] : 0) + d) > 0 && ++ptr[1] > 0
                ? String.valueOf(en[ptr[1] - 1]) : "-1").collect(Collectors.joining(" ")) : "");
    }
}
