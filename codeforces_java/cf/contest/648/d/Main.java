import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer m
            && Arrays.stream(tk, 2, 2 + n).sorted().toArray() instanceof long[] d
            && IntStream.range(0, m).mapToLong(j -> ((tk[2 + n + 2 * j] - tk[3 + n + 2 * j] + (1L << 31)) << 21) | j).sorted().toArray() instanceof long[] ord
            && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq && new int[]{0} instanceof int[] ptr
            ? IntStream.range(0, n).filter(i -> Long.valueOf(d[i]) instanceof Long x
                && IntStream.iterate(ptr[0], j -> j < m && (ord[j] >> 21) - (1L << 31) <= x, j -> j + 1).filter(j -> pq.add(tk[2 + n + 2 * (int) (ord[j] & 2097151L)] + tk[3 + n + 2 * (int) (ord[j] & 2097151L)]) & ++ptr[0] > 0).count() >= 0
                && IntStream.iterate(0, z -> !pq.isEmpty() && pq.peek() < x, z -> z + 1).filter(z -> pq.poll() != null).count() >= 0
                && !pq.isEmpty() && pq.poll() != null).count() : "");
    }
}
