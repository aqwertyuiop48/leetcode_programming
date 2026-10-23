import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[1]) >= 0 && (st[1] = st[2] = 0) == 0) || true)
                && (Integer) v[0] instanceof Integer n && (Integer) v[1 + n] instanceof Integer q
                && IntStream.range(0, q).map(j -> v[2 + n + j]).sorted().toArray() instanceof int[] sq
                && IntStream.range(0, q).filter(j -> j == 0 || sq[j] != sq[j - 1]).map(j -> sq[j]).toArray() instanceof int[] srt
                && new long[srt.length] instanceof long[] res && new int[2][40] instanceof int[][] G && new int[2][40] instanceof int[][] C && new int[2] instanceof int[] ln && new int[1] instanceof int[] cur
                && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> gr
                && gr.getAndSet((a, b) -> b == 0 ? a : gr.get().applyAsInt(b, a % b)) == null
                && IntStream.range(0, n).allMatch(r -> (Integer) (r & 1) instanceof Integer nw && (Integer) (nw ^ 1) instanceof Integer o && (G[nw][0] = v[1 + r]) > 0 && (C[nw][0] = 1) > 0 && (ln[nw] = 1) > 0 && (cur[0] = v[1 + r]) > 0
                        && IntStream.range(0, ln[o]).allMatch(k -> (cur[0] = gr.get().applyAsInt(G[o][k], cur[0])) > 0 && (cur[0] == G[nw][ln[nw] - 1] ? (C[nw][ln[nw] - 1] += C[o][k]) > 0 : (G[nw][ln[nw]] = cur[0]) > 0 && (C[nw][ln[nw]++] = C[o][k]) > 0))
                        && IntStream.range(0, ln[nw]).allMatch(k -> (Integer) Arrays.binarySearch(srt, G[nw][k]) instanceof Integer b && (b < 0 || (res[b] += C[nw][k]) > 0)))
                ? IntStream.range(0, q).mapToObj(j -> String.valueOf((Integer) Arrays.binarySearch(srt, v[2 + n + j]) instanceof Integer b ? res[b] : 0L)).collect(Collectors.joining("\n")) : "");
    }
}
