import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[] {-1, 0} instanceof int[] cs
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (cs[0] = Math.max(cs[0], 0) * 10 + raw[i] - 48) >= 0 : cs[0] < 0 || ((v[cs[1]++] = cs[0]) >= 0 && (cs[0] = -1) < 0)).count() >= 0
            && new StringBuilder() instanceof StringBuilder sb
            && Arrays.stream(LongStream.range(0, v[0]).map(i -> ((long) (v[(int) (2 * i + 1)] / 1000) << 40) | ((long) ((v[(int) (2 * i + 1)] / 1000 & 1) == 0 ? v[(int) (2 * i + 2)] : 1000000 - v[(int) (2 * i + 2)]) << 20) | i).sorted().toArray())
                .filter(k -> sb.append((k & 1048575) + 1).append(' ') != null).count() >= 0
            ? sb : "");
    }
}
