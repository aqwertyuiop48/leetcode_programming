import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && new int[n + 1] instanceof int[] p
            && new int[n + 1] instanceof int[] k
            && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = s.nextInt()) * 0 == (k[i] = s.nextInt()) * 0)
            && new int[n + 1] instanceof int[] lc
            && new int[n + 1] instanceof int[] rc
            && IntStream.rangeClosed(1, n).allMatch(i -> p[i] < 0 || (k[i] < k[p[i]] ? (lc[p[i]] = i) : (rc[p[i]] = i)) > 0)
            && (Integer) IntStream.rangeClosed(1, n).filter(i -> p[i] < 0).findFirst().getAsInt() instanceof Integer root
            && new ArrayDeque<Integer>(List.of(root)) instanceof ArrayDeque<Integer> q
            && new ArrayList<Integer>() instanceof ArrayList<Integer> ord
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(v -> ord.add(v) & (lc[v] == 0 || q.add(lc[v])) & (rc[v] == 0 || q.add(rc[v])))
            && new int[n + 1] instanceof int[] mn
            && new int[n + 1] instanceof int[] mx
            && IntStream.range(0, n).map(i -> ord.get(n - 1 - i)).allMatch(v -> lc[v] == 0
                ? (mn[v] = mx[v] = k[v]) >= 0
                : (mn[v] = mn[lc[v]]) >= 0 & (mx[v] = mx[rc[v]]) >= 0)
            && new long[n + 1] instanceof long[] sm
            && new int[n + 1] instanceof int[] ct
            && ord.stream().allMatch(v -> lc[v] == 0
                || ((sm[lc[v]] = sm[v] + mn[rc[v]]) >= 0 & (ct[lc[v]] = ct[v] + 1) > 0 & (sm[rc[v]] = sm[v] + mx[lc[v]]) >= 0 & (ct[rc[v]] = ct[v] + 1) > 0))
            && IntStream.rangeClosed(1, n).boxed().sorted(Comparator.comparingInt(i -> k[i])).mapToInt(i -> i).toArray() instanceof int[] by
            && Arrays.stream(by).map(i -> k[i]).toArray() instanceof int[] sk
            && (Integer) s.nextInt() instanceof Integer m
            ? IntStream.range(0, m).mapToObj(z -> (Integer) s.nextInt() instanceof Integer x
                && (Integer) (-Arrays.binarySearch(sk, x) - 1) instanceof Integer ins
                && (Integer) (ins > 0 && lc[by[ins - 1]] == 0 ? by[ins - 1] : by[ins]) instanceof Integer lf
                ? String.format(Locale.US, "%.10f", (double) sm[lf] / ct[lf])
                : "").collect(Collectors.joining("\n"))
            : ""));
    }
}



