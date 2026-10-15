import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && new char[n] instanceof char[] ty
            && new int[n] instanceof int[] v
            && IntStream.range(0, n).allMatch(i -> (ty[i] = s.next().charAt(1)) != 0 && (v[i] = ty[i] == 'u' ? 0 : s.nextInt()) >= 0)
            && IntStream.of(v).distinct().sorted().toArray() instanceof int[] xs
            && (Integer) (Integer.highestOneBit(xs.length) * 2) instanceof Integer size
            && new int[2 * size] instanceof int[] cnt
            && new long[10 * size] instanceof long[] sm
            ? IntStream.range(0, n).mapToObj(i -> ty[i] == 'u'
                ? String.valueOf(sm[7])
                : ((Integer) (size + Arrays.binarySearch(xs, v[i])) instanceof Integer leaf
                    && (cnt[leaf] = ty[i] == 'd' ? 1 : 0) >= 0
                    && (sm[leaf * 5] = ty[i] == 'd' ? v[i] : 0) >= 0
                    && IntStream.iterate(leaf / 2, u -> u >= 1, u -> u / 2).allMatch(u -> (cnt[u] = cnt[2 * u] + cnt[2 * u + 1]) >= 0
                        && IntStream.range(0, 5).allMatch(j -> (sm[u * 5 + j] = sm[2 * u * 5 + j] + sm[(2 * u + 1) * 5 + ((j - cnt[2 * u] % 5) + 5) % 5]) >= 0))
                    ? "" : ""))
                .filter(x -> !x.isEmpty()).collect(Collectors.joining("\n"))
            : ""));
    }
}

