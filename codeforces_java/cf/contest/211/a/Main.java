import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k && Integer.valueOf(sc.nextInt()) instanceof Integer t
            && IntStream.range(0, k).mapToObj(i -> new int[]{sc.nextInt() - 1, n + sc.nextInt() - 1}).toList() instanceof List<int[]> es
            && new int[n + m][t] instanceof int[][] cnt && new int[k] instanceof int[] col && IntStream.range(0, k).map(i -> -1).toArray() instanceof int[] mk
            && ((IntUnaryOperator) v -> IntStream.range(0, t).boxed().min(Comparator.comparingInt(c -> cnt[v][c])).get()) instanceof IntUnaryOperator am
            && ((Function<int[], int[]>) st -> Integer.valueOf(IntStream.range(0, k).filter(g -> mk[g] != st[3] && col[g] == st[1] && (es.get(g)[0] == st[0] || es.get(g)[1] == st[0])).findFirst().getAsInt()) instanceof Integer g
                && Integer.valueOf(es.get(g)[0] == st[0] ? es.get(g)[1] : es.get(g)[0]) instanceof Integer x
                && Boolean.valueOf(cnt[x][st[1]] - cnt[x][st[2]] == 1) instanceof Boolean stop
                && (mk[g] = st[3]) >= 0 && (col[g] = st[2]) >= 0 && cnt[st[0]][st[1]]-- >= 0 && cnt[st[0]][st[2]]++ >= 0 && cnt[x][st[1]]-- >= 0 && cnt[x][st[2]]++ >= 0
                ? stop ? new int[]{-1, 0, 0, 0} : new int[]{x, st[2], st[1], st[3]} : null) instanceof Function<int[], int[]> step
            && IntStream.range(0, k).allMatch(e -> Integer.valueOf(es.get(e)[0]) instanceof Integer u && Integer.valueOf(es.get(e)[1]) instanceof Integer v
                && Integer.valueOf(am.applyAsInt(u)) instanceof Integer a && Integer.valueOf(am.applyAsInt(v)) instanceof Integer b
                && (col[e] = a) == a && (mk[e] = e) >= 0 && cnt[u][a]++ >= 0 && cnt[v][a]++ >= 0
                && (a.equals(b) || cnt[v][a] - 1 == cnt[v][b] || Stream.iterate(new int[]{v, a, b, e}, st -> st[0] >= 0, step::apply).allMatch(st -> true)))
            ? IntStream.range(0, n + m).map(v -> Arrays.stream(cnt[v]).max().getAsInt() - Arrays.stream(cnt[v]).min().getAsInt()).sum()
                + "\n" + Arrays.stream(col).map(c -> c + 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
