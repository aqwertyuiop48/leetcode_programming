import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && (Integer) IntStream.range(0, raw.length).filter(i -> raw[i] == '\n').findFirst().orElse(raw.length) instanceof Integer nl
            && (Integer) Integer.parseInt(new String(raw, 0, nl).trim()) instanceof Integer n
            && new byte[n * n] instanceof byte[] m
            && new int[1] instanceof int[] cur
            && IntStream.range(nl, raw.length).allMatch(i -> raw[i] < '0' || ((m[cur[0]++] = (byte) (raw[i] - '0')) >= 0))
            && new int[n] instanceof int[] deg
            && IntStream.range(0, n).allMatch(u -> (deg[u] = IntStream.range(u * n, u * n + n).map(k -> m[k]).sum()) >= 0)
            && new int[]{-1, -1} instanceof int[] res
            && (IntStream.range(0, n).allMatch(u -> IntStream.range(0, n).allMatch(v ->
                !(m[u * n + v] == 1 && deg[v] >= deg[u]) || ((res[0] = u) >= 0 && (res[1] = v) >= 0 && res[0] < 0))) || res[0] >= 0)
            ? res[0] < 0
                ? "-1"
                : IntStream.range(0, n).filter(w -> m[res[1] * n + w] == 1 && m[w * n + res[0]] == 1)
                    .mapToObj(w -> (res[0] + 1) + " " + (res[1] + 1) + " " + (w + 1)).findFirst().orElse("-1")
            : "");
    }
}

