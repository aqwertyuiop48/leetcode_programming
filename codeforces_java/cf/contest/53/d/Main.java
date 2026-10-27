import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Arrays.copyOfRange(g, 1, 1 + n) instanceof int[] want
            && Arrays.copyOfRange(g, 1 + n, 1 + 2 * n) instanceof int[] cur
            && new ArrayList<String>() instanceof ArrayList<String> log
            && IntStream.range(0, n).allMatch(i ->
                IntStream.range(i, n).filter(j -> cur[j] == want[i]).findFirst().getAsInt() >= 0
                && Integer.valueOf(IntStream.range(i, n).filter(j -> cur[j] == want[i]).findFirst().getAsInt()) instanceof Integer from
                && IntStream.range(0, from - i).allMatch(step ->
                    Integer.valueOf(from - 1 - step) instanceof Integer k
                    && (cur[k] ^= cur[k + 1]) >= 0 && (cur[k + 1] ^= cur[k]) >= 0 && (cur[k] ^= cur[k + 1]) >= 0
                    && log.add((k + 1) + " " + (k + 2))))
            ? log.size() + (log.isEmpty() ? "" : "\n" + String.join("\n", log))
            : "");
    }
}

