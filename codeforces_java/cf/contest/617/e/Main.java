import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer k
            && new int[n + 1] instanceof int[] p
            && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = p[i - 1] ^ t[2 + i]) >= 0)
            && Integer.valueOf(Math.max(1, (int) (n / Math.sqrt(m)))) instanceof Integer B
            && IntStream.range(0, m).mapToLong(q -> Integer.valueOf((t[3 + n + 2 * q] - 1) / B) instanceof Integer blk
                ? ((long) blk << 40) | ((long) ((blk & 1) == 0 ? t[4 + n + 2 * q] : 1048575 - t[4 + n + 2 * q]) << 20) | q : 0L).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, m + 1).map(i -> i < m ? (int) (keys[i] & 1048575) : 0).toArray() instanceof int[] qid
            && IntStream.range(0, m + 1).map(i -> i < m ? t[3 + n + 2 * qid[i]] - 1 : 0).toArray() instanceof int[] tl
            && IntStream.range(0, m + 1).map(i -> i < m ? t[4 + n + 2 * qid[i]] + 1 : 0).toArray() instanceof int[] tr
            && Integer.valueOf((int) IntStream.range(0, m).mapToLong(i -> Math.abs(tl[i] - (i == 0 ? 0 : tl[i - 1])) + Math.abs(tr[i] - (i == 0 ? 0 : tr[i - 1])) + 1).sum()) instanceof Integer total
            && new int[1 << 20] instanceof int[] cnt && new long[m] instanceof long[] res && new long[1] instanceof long[] ans && new int[3] instanceof int[] pos
            && ((IntPredicate) s -> pos[0] > tl[pos[2]] ? (ans[0] += cnt[p[--pos[0]] ^ k] + 0 * cnt[p[pos[0]]]++) >= 0
                : pos[1] < tr[pos[2]] ? (ans[0] += cnt[p[pos[1]++] ^ k] + 0 * cnt[p[pos[1] - 1]]++) >= 0
                : pos[0] < tl[pos[2]] ? (ans[0] -= 0 * --cnt[p[pos[0]++]] + cnt[p[pos[0] - 1] ^ k]) >= 0
                : pos[1] > tr[pos[2]] ? (ans[0] -= 0 * --cnt[p[--pos[1]]] + cnt[p[pos[1]] ^ k]) >= 0
                : (res[qid[pos[2]]] = ans[0]) >= 0 && ++pos[2] > 0) instanceof IntPredicate step
            && Stream.of(0).peek(z -> IntStream.range(0, total).forEach(s -> step.test(s))).findFirst().isPresent()
            ? LongStream.of(res).mapToObj(Long::toString).collect(Collectors.joining("\n")) : "");
    }
}
