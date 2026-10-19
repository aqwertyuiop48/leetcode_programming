import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer h
            && Long.valueOf(1000000009L) instanceof Long M && Integer.valueOf(h + 2) instanceof Integer B
            && new ArrayList<int[]>(List.of(new int[]{1, 1, 1, 1})) instanceof ArrayList<int[]> st && new HashMap<Integer, Integer>(Map.of(((1 * B + 1) * B + 1) * B + 1, 0)) instanceof HashMap<Integer, Integer> id
            && new ArrayList<int[]>() instanceof ArrayList<int[]> tr
            && IntStream.iterate(0, i -> i < st.size(), i -> i + 1).allMatch(i -> tr.add(IntStream.range(0, 4).map(j -> st.get(i) instanceof int[] t
                    && IntStream.range(0, 4).map(k -> k == j ? (t[k] <= h ? 1 : h + 1) : Math.min(t[k] + 1, h + 1)).sorted().toArray() instanceof int[] nt
                    ? id.computeIfAbsent(Arrays.stream(nt).reduce(0, (a, b) -> a * B + b), kk -> st.add(nt) ? st.size() - 1 : -1) : -1).toArray()))
            && Integer.valueOf(st.size()) instanceof Integer S && IntStream.range(0, 4 * S).map(x -> tr.get(x / 4)[x % 4]).toArray() instanceof int[] tf
            && new long[2][S] instanceof long[][] buf && (buf[0][0] = 1) == 1
            && IntStream.range(0, n).allMatch(step -> buf[step % 2] instanceof long[] from && buf[(step + 1) % 2] instanceof long[] to
                && IntStream.range(0, S).allMatch(s -> from[s] == 0 || (to[tf[4 * s]] += from[s]) >= 0 && (to[tf[4 * s + 1]] += from[s]) >= 0 && (to[tf[4 * s + 2]] += from[s]) >= 0 && (to[tf[4 * s + 3]] += from[s]) >= 0)
                && IntStream.range(0, S).allMatch(s -> (from[s] = 0) == 0 && (to[s] %= M) >= 0))
            ? IntStream.range(0, S).filter(s -> st.get(s)[0] <= h).mapToLong(s -> buf[n % 2][s]).sum() % M : "");
    }
}
