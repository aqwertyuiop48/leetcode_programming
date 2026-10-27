import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k && Integer.valueOf(sc.nextInt()) instanceof Integer t
            && IntStream.range(0, k).mapToObj(i -> new int[]{sc.nextInt() - 1, n + sc.nextInt() - 1}).toList() instanceof List<int[]> es
            && IntStream.range(0, n + m).mapToObj(v -> IntStream.range(0, t).mapToObj(c -> new LinkedHashSet<Integer>()).toList()).toList() instanceof List<List<LinkedHashSet<Integer>>> sets && new int[n + m][t] instanceof int[][] cnt && new int[k] instanceof int[] col && IntStream.range(0, k).map(i -> -1).toArray() instanceof int[] mk
            && ((IntUnaryOperator) v -> IntStream.range(0, t).boxed().min(Comparator.comparingInt(c -> cnt[v][c])).get()) instanceof IntUnaryOperator am
            && ((Function<int[], int[]>) st -> sets.get(st[0]).get(st[1]).stream().filter(g0 -> mk[g0] != st[3]).findFirst().get() instanceof Integer g
                && Integer.valueOf(es.get(g)[0] == st[0] ? es.get(g)[1] : es.get(g)[0]) instanceof Integer x
                && Boolean.valueOf(cnt[x][st[1]] - cnt[x][st[2]] == 1) instanceof Boolean stop
                && (mk[g] = st[3]) >= 0 && (col[g] = st[2]) >= 0 && sets.get(st[0]).get(st[1]).remove(g) && sets.get(x).get(st[1]).remove(g) && sets.get(st[0]).get(st[2]).add(g) && sets.get(x).get(st[2]).add(g) && cnt[st[0]][st[1]]-- >= 0 && cnt[st[0]][st[2]]++ >= 0 && cnt[x][st[1]]-- >= 0 && cnt[x][st[2]]++ >= 0
                ? stop ? new int[]{-1, 0, 0, 0} : new int[]{x, st[2], st[1], st[3]} : null) instanceof Function<int[], int[]> step
            && IntStream.range(0, k).allMatch(e -> Integer.valueOf(es.get(e)[0]) instanceof Integer u && Integer.valueOf(es.get(e)[1]) instanceof Integer v
                && Integer.valueOf(am.applyAsInt(u)) instanceof Integer a && Integer.valueOf(am.applyAsInt(v)) instanceof Integer b
                && (col[e] = a) == a && (mk[e] = e) >= 0 && sets.get(u).get(a).add(e) && sets.get(v).get(a).add(e) && cnt[u][a]++ >= 0 && cnt[v][a]++ >= 0
                && (a.equals(b) || cnt[v][a] - 1 == cnt[v][b] || Stream.iterate(new int[]{v, a, b, e}, st -> st[0] >= 0, step::apply).allMatch(st -> true)))
            ? IntStream.range(0, n + m).map(v -> Arrays.stream(cnt[v]).max().getAsInt() - Arrays.stream(cnt[v]).min().getAsInt()).sum()
                + "\n" + Arrays.stream(col).map(c -> c + 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

