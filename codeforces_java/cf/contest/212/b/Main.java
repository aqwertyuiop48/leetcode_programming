import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).split("\n") instanceof String[] ls
            && ls[0].trim().getBytes() instanceof byte[] sb && (Integer) sb.length instanceof Integer n && (Integer) Integer.parseInt(ls[1].trim()) instanceof Integer q
            && IntStream.range(0, q).map(i -> ls[2 + i].trim().chars().map(c -> 1 << (c - 'a')).reduce(0, (x, y) -> x | y)).toArray() instanceof int[] qm
            && new long[1 << 20] instanceof long[] bits && new int[1 << 20] instanceof int[] pre && new int[q + 2] instanceof int[] cnt && new long[2048] instanceof long[] filt
            && IntStream.of(qm).allMatch(m -> (filt[(m * 0x9E3779B1) >>> 21] |= 1L << ((m * 0x9E3779B1) >>> 15)) != 0)
            && IntStream.of(qm).allMatch(m -> (bits[m >>> 6] |= 1L << m) != 0)
            && IntStream.range(1, 1 << 20).allMatch(w -> (pre[w] = pre[w - 1] + Long.bitCount(bits[w - 1])) >= 0)
            && ((IntUnaryOperator) m -> pre[m >>> 6] + Long.bitCount(bits[m >>> 6] & ((1L << m) - 1))) instanceof IntUnaryOperator rk
            && (Integer) IntStream.of(qm).map(Integer::bitCount).max().orElse(0) instanceof Integer maxPop
            && new int[28] instanceof int[] nxt && new int[28] instanceof int[] prv && new int[5] instanceof int[] st
            && IntStream.range(0, 28).allMatch(j -> (nxt[j] = -1) < 0 && (prv[j] = -1) < 0) && (nxt[26] = 27) > 0 && (prv[27] = 26) > 0
            && new int[Math.min(26, maxPop)] instanceof int[] scratch
            && Stream.of(0).peek(z0 -> IntStream.range(0, n).forEach(i -> Optional.of(i).filter(z1 -> (Integer) (sb[i] - 'a') instanceof Integer c
                    && (st[4] = i + 1 < n ? sb[i + 1] - 'a' : -2) < 100
                    && (prv[c] == -1 || (nxt[prv[c]] = nxt[c]) >= 0 && (prv[nxt[c]] = prv[c]) >= 0)
                    && (nxt[c] = nxt[26]) >= 0 && (prv[nxt[26]] = c) >= 0 && (prv[c] = 26) >= 0 && (nxt[26] = c) >= 0
                    && (st[2] = 0) == 0 && (st[1] = c) >= 0).ifPresent(z2 -> Arrays.setAll(scratch, k -> st[1] != 27 && st[1] != st[4] && (st[2] |= 1 << st[1]) > 0
                    && (((filt[(st[2] * 0x9E3779B1) >>> 21] >>> ((st[2] * 0x9E3779B1) >>> 15)) & 1) == 0 || ((bits[st[2] >>> 6] >>> st[2]) & 1) == 0 || ++cnt[rk.applyAsInt(st[2])] > 0)
                    && (st[1] = nxt[st[1]]) >= 0 ? 1 : 0)))).findFirst().isPresent()
            ? IntStream.of(qm).mapToObj(m -> String.valueOf(cnt[rk.applyAsInt(m)])).collect(Collectors.joining("\n")) : "");
    }
}
