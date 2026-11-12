
import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && (Integer) IntStream.range(0, raw.length).filter(i -> raw[i] == 10).findFirst().orElse(raw.length - 1) instanceof Integer nl
            && Arrays.stream(new String(raw, 0, nl + 1).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] nm
            && (Integer) nm[0] instanceof Integer n && (Integer) nm[1] instanceof Integer m
            && (Integer) (IntStream.range(nl + 1 + m, raw.length).filter(i -> raw[i] == 46 || raw[i] == 42).findFirst().orElse(nl + 2 + m) - nl - 1) instanceof Integer w
            && (Integer) (w + 2) instanceof Integer off && (Integer) (off + nl + 1) instanceof Integer base
            && ByteBuffer.allocate(off + raw.length + w + 4).position(off).put(raw).array() instanceof byte[] g
            && new int[n * m + 5] instanceof int[] q && new int[]{0, 0} instanceof int[] st
            && ((IntPredicate) x -> g[x] == 42 && (g[x] = 46) == 46 && (q[st[1]++] = x) >= 0) instanceof IntPredicate fill
            && ((IntPredicate) b -> (g[b] == 46 ? 1 : 0) + (g[b + 1] == 46 ? 1 : 0) + (g[b + w] == 46 ? 1 : 0) + (g[b + w + 1] == 46 ? 1 : 0) == 3
                && fill.test(g[b] == 42 ? b : g[b + 1] == 42 ? b + 1 : g[b + w] == 42 ? b + w : b + w + 1)) instanceof IntPredicate chk
            && IntStream.range(base, base + n * w).filter(chk).count() >= 0
            && IntStream.range(0, n * m).allMatch(z -> st[0] >= st[1] || (chk.test(q[st[0]] - w - 1) | chk.test(q[st[0]] - w) | chk.test(q[st[0]] - 1) | chk.test(q[st[0]++])) || true)
            ? IntStream.range(0, n).mapToObj(i -> new String(g, base + i * w, m, StandardCharsets.ISO_8859_1)).collect(Collectors.joining("\n")) : "");
    }
}



