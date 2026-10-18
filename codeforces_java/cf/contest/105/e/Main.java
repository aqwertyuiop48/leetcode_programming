import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> new int[7] instanceof int[] st0 && new int[3] instanceof int[] mr && new int[3] instanceof int[] tr && IntStream.range(0, 3).allMatch(i -> (st0[i] = s.nextInt()) > 0 && (mr[i] = s.nextInt()) > 0 && (tr[i] = s.nextInt()) > 0) && IntStream.range(4, 7).allMatch(i -> (st0[i] = 3) > 0) && new HashSet<Long>() instanceof HashSet<Long> vis && new int[1] instanceof int[] best && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> dfs && dfs.compareAndSet(null, (Predicate<int[]>) st -> !vis.add(((((((long) st[0] * 128 + st[1]) * 128 + st[2]) * 512 + st[3]) * 4 + st[4]) * 4 + st[5]) * 4 + st[6]) || ((best[0] = Math.max(best[0], Math.max(st[0], Math.max(st[1], st[2])))) >= 0 && IntStream.range(0, 3).filter(i -> IntStream.range(0, 3).noneMatch(c -> st[4 + c] == i)).boxed().flatMap(i -> Stream.of(((st[3] >> (3 * i) & 1) == 0 && st[4 + i] == 3) ? IntStream.rangeClosed(st[i] - mr[i], st[i] + mr[i]).filter(np -> np >= 1 && IntStream.range(0, 3).noneMatch(c -> st[c] == np)).mapToObj(np -> st.clone() instanceof int[] ns && (ns[i] = np) > 0 && (ns[3] |= 1 << (3 * i)) > 0 ? ns : st) : Stream.<int[]>empty(), ((st[3] >> (3 * i + 1) & 1) == 0 && st[4 + i] == 3) ? IntStream.range(0, 3).filter(j -> j != i && Math.abs(st[j] - st[i]) == 1 && IntStream.range(0, 3).noneMatch(c -> st[4 + c] == j)).mapToObj(j -> st.clone() instanceof int[] ns && (ns[j] = st[i]) > 0 && (st[4 + j] == 3 || (ns[st[4 + j]] = st[i]) > 0) && (ns[4 + i] = j) >= 0 && (ns[3] |= 1 << (3 * i + 1)) > 0 ? ns : st) : Stream.<int[]>empty(), ((st[3] >> (3 * i + 2) & 1) == 0 && st[4 + i] != 3) ? IntStream.rangeClosed(st[i] - tr[i], st[i] + tr[i]).filter(np -> np >= 1 && IntStream.range(0, 3).noneMatch(c -> st[c] == np)).mapToObj(np -> st.clone() instanceof int[] ns && (ns[st[4 + i]] = np) > 0 && (st[4 + st[4 + i]] == 3 || (ns[st[4 + st[4 + i]]] = np) > 0) && (ns[4 + i] = 3) > 0 && (ns[3] |= 1 << (3 * i + 2)) > 0 ? ns : st) : Stream.<int[]>empty()).flatMap(Function.identity())).allMatch(ns -> dfs.get().test(ns)))) && dfs.get().test(st0) | true ? best[0] : -1).ifPresent(System.out::println);
    }
}
