import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                new int[]{Math.max(1, (int) Math.sqrt(nm[0]))} instanceof int[] bs
                && new int[nm[0] + 1] instanceof int[] power
                && new int[nm[0] + 1] instanceof int[] lastHole
                && new int[nm[0] + 1] instanceof int[] jumpCount
                && new int[nm[0] + 1] instanceof int[] nextHole
                && new boolean[nm[0] + 1] instanceof boolean[] exits
                && IntStream.rangeClosed(1, nm[0]).allMatch(i -> (power[i] = s.nextInt()) >= 0)
                && ((Function<Integer, Boolean>) (a ->
                        new int[]{((a - 1) / bs[0]) * bs[0] + 1} instanceof int[] blockStart
                        && IntStream.iterate(a, i -> i >= blockStart[0], i -> i - 1).allMatch(i ->
                            new int[]{i + power[i]} instanceof int[] nxt
                            && (nxt[0] > nm[0] || ((nxt[0] - 1) / bs[0]) != ((i - 1) / bs[0])
                                ? ((lastHole[i] = i) == i
                                    && (jumpCount[i] = 1) == 1
                                    && ((exits[i] = nxt[0] > nm[0]) || true)
                                    && (nextHole[i] = nxt[0] > nm[0] ? 0 : nxt[0]) >= 0)
                                : ((lastHole[i] = lastHole[nxt[0]]) >= 0
                                    && (jumpCount[i] = 1 + jumpCount[nxt[0]]) >= 0
                                    && ((exits[i] = exits[nxt[0]]) || true)
                                    && (nextHole[i] = nextHole[nxt[0]]) >= 0))))) instanceof Function<Integer, Boolean> recomputeFrom
                && new int[]{(nm[0] + bs[0] - 1) / bs[0]} instanceof int[] numBlocks
                && IntStream.range(0, numBlocks[0]).allMatch(k -> recomputeFrom.apply(Math.min((k + 1) * bs[0], nm[0])))
                && new AtomicReference<Function<long[], long[]>>() instanceof AtomicReference<Function<long[], long[]>> qRef
                && qRef.getAndSet(st -> st[0] == 0 || st[0] > nm[0]
                        ? new long[]{st[1], st[2]}
                        : qRef.get().apply(new long[]{exits[(int) st[0]] ? 0 : nextHole[(int) st[0]], lastHole[(int) st[0]], st[2] + jumpCount[(int) st[0]]})) == null
                ? IntStream.range(0, nm[1]).mapToObj(qi ->
                        (new int[]{s.nextInt()} instanceof int[] typeArr && typeArr[0] == 1)
                        ? (qRef.get().apply(new long[]{s.nextInt(), 0, 0}) instanceof long[] res ? res[0] + " " + res[1] : null)
                        : (new int[]{s.nextInt(), s.nextInt()} instanceof int[] ab
                            && (power[ab[0]] = ab[1]) >= 0
                            && recomputeFrom.apply(ab[0])
                            ? null : null))
                    .filter(Objects::nonNull)
                    .collect(Collectors.joining("\n"))
                : "")));
    }
}
