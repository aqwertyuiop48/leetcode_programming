import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Integer.valueOf(3 * n + 10) instanceof Integer D
            && new int[n + 1] instanceof int[] head
            && new int[2 * n] instanceof int[] nxt
            && new int[2 * n] instanceof int[] to
            && new int[2 * n] instanceof int[] cw
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] pc
            && new int[n + 1] instanceof int[] order
            && new int[n + 1] instanceof int[] rank
            && new int[n + 1] instanceof int[] arr
            && new int[D] instanceof int[] uf
            && new int[D] instanceof int[] room
            && new int[n + 1][] instanceof int[][] mem
            && new int[]{1} instanceof int[] tl
            && IntStream.range(0, n - 1).allMatch(j -> Integer.valueOf((int) t[n + 1 + 3 * j]) instanceof Integer a
                && Integer.valueOf((int) t[n + 2 + 3 * j]) instanceof Integer b
                && Integer.valueOf((int) t[n + 3 + 3 * j]) instanceof Integer c
                && (to[2 * j + 1] = b) > 0 && (cw[2 * j + 1] = c) > 0 && (nxt[2 * j + 1] = head[a]) >= 0 && (head[a] = 2 * j + 1) > 0
                && (to[2 * j + 2] = a) > 0 && (cw[2 * j + 2] = c) > 0 && (nxt[2 * j + 2] = head[b]) >= 0 && (head[b] = 2 * j + 2) > 0)
            && IntStream.rangeClosed(1, n).boxed().sorted(Comparator.comparingLong((Integer i) -> t[i])).mapToInt(i -> i).toArray() instanceof int[] byRank
            && IntStream.range(0, n).allMatch(r -> (rank[byRank[r]] = r) >= 0)
            && (order[0] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> IntStream.iterate(head[order[i]], e -> e > 0, e -> nxt[e]).filter(e -> to[e] != par[order[i]])
                .allMatch(e -> (par[to[e]] = order[i]) > 0 && (pc[to[e]] = cw[e]) > 0 && (order[tl[0]++] = to[e]) > 0))
            && IntStream.range(1, n).map(i -> order[n - i]).allMatch(v -> (mem[v] = IntStream.concat(IntStream.of(rank[v]),
                    IntStream.iterate(head[v], e -> e > 0, e -> nxt[e]).filter(e -> to[e] != par[v]).flatMap(e -> IntStream.of(mem[to[e]]))).sorted().toArray()) != null
                && IntStream.iterate(head[v], e -> e > 0, e -> nxt[e]).filter(e -> to[e] != par[v]).allMatch(e -> (mem[to[e]] = null) == null)
                && Integer.valueOf(Arrays.stream(mem[v]).map(r -> arr[r]).max().getAsInt() + mem[v].length + 3) instanceof Integer lim
                && IntStream.range(0, lim).allMatch(d -> (uf[d] = d) >= 0 && (room[d] = pc[v]) > 0)
                && Arrays.stream(mem[v]).allMatch(r -> (arr[r] = 1 + (uf[arr[r]] == arr[r] ? arr[r] : IntStream.iterate(arr[r], x -> uf[x] == x ? x : (uf[x] = uf[uf[x]])).filter(x -> uf[x] == x).findFirst().getAsInt())) > 0
                    && (--room[arr[r] - 1] > 0 || (uf[arr[r] - 1] = arr[r]) > 0)))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(arr[rank[i]])).collect(Collectors.joining(" ")) : "");
    }
}
