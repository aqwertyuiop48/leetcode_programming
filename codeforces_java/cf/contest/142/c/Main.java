import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            Optional.of(new int[]{sc.nextInt(), sc.nextInt()}).ifPresent(nm ->
                System.out.println(
                    Integer.valueOf(Math.max(nm[0], nm[1])) instanceof Integer N
                    && Integer.valueOf(Math.min(nm[0], nm[1])) instanceof Integer M
                    && Integer.valueOf(Character.digit("00000000000000000000112233400122344500224456700234567800345689a0034679ac004578acd".charAt((N - 1) * 9 + M - 1), 36)) instanceof Integer T
                    && new char[N * M] instanceof char[] g
                    && Stream.of("01247", "14678", "03456", "23458")
                        .map(sh -> sh.chars().map(ch -> (ch - '0') / 3 * M + (ch - '0') % 3).toArray())
                        .toArray(int[][]::new) instanceof int[][] offs
                    && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> d
                    && d.getAndSet(a ->
                        a[1] >= T
                            ? true
                            : (a[0] >= (N - 2) * M || a[1] + a[2] / 5 < T)
                                ? false
                                : (a[0] % M <= M - 3
                                    && IntStream.range(0, 4).anyMatch(o ->
                                        Arrays.stream(offs[o]).noneMatch(c -> g[a[0] + c] != 0)
                                        && Arrays.stream(offs[o]).allMatch(c -> (g[a[0] + c] = (char) ('A' + a[1])) > 0)
                                        && (d.get().test(new int[]{a[0] + 1, a[1] + 1, a[2] - 5 - (g[a[0]] == 0 ? 1 : 0)})
                                            || (Arrays.stream(offs[o]).allMatch(c -> (g[a[0] + c] = 0) == 0) && false))))
                                    || d.get().test(new int[]{a[0] + 1, a[1], a[2] - (g[a[0]] == 0 ? 1 : 0)})) == null
                    && d.get().test(new int[]{0, 0, N * M})
                        ? T + "\n" + IntStream.range(0, nm[0]).mapToObj(i ->
                            IntStream.range(0, nm[1]).mapToObj(j ->
                                String.valueOf(g[nm[0] < nm[1] ? j * M + i : i * M + j] == 0 ? '.' : g[nm[0] < nm[1] ? j * M + i : i * M + j]))
                                .collect(Collectors.joining())).collect(Collectors.joining("\n"))
                        : "")));
    }
}
