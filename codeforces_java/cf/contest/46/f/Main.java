import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                (new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] nmk
                && new int[nmk[1] + 1] instanceof int[] du
                && new int[nmk[1] + 1] instanceof int[] dv
                && IntStream.rangeClosed(1, nmk[1]).allMatch(i -> (du[i] = s.nextInt()) >= 0 && (dv[i] = s.nextInt()) >= 0)
                && new int[nmk[0] + 1] instanceof int[] parent
                && IntStream.rangeClosed(0, nmk[0]).allMatch(i -> (parent[i] = i) == i)
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
                && fr.getAndSet(x -> parent[x] == x ? x : (parent[x] = fr.get().applyAsInt(parent[x]))) == null
                && new int[nmk[1] + 1] instanceof int[] keyTh
                && new int[nmk[1] + 1] instanceof int[] keyFr
                && new HashMap<String, Integer>() instanceof HashMap<String, Integer> roomTh
                && new HashMap<String, Integer>() instanceof HashMap<String, Integer> roomFr
                && IntStream.range(0, nmk[2]).allMatch(pi ->
                    s.next() instanceof String name
                    && new int[]{s.nextInt()} instanceof int[] room
                    && (roomTh.put(name, room[0]) == null || true)
                    && new int[]{s.nextInt()} instanceof int[] cnt
                    && IntStream.range(0, cnt[0]).allMatch(ci -> (keyTh[s.nextInt()] = room[0]) >= 0))
                && IntStream.range(0, nmk[2]).allMatch(pi ->
                    s.next() instanceof String name
                    && new int[]{s.nextInt()} instanceof int[] room
                    && (roomFr.put(name, room[0]) == null || true)
                    && new int[]{s.nextInt()} instanceof int[] cnt
                    && IntStream.range(0, cnt[0]).allMatch(ci -> (keyFr[s.nextInt()] = room[0]) >= 0))
                && IntStream.range(0, nmk[0] + 1).allMatch(rep ->
                    IntStream.rangeClosed(1, nmk[1]).allMatch(i ->
                        (fr.get().applyAsInt(keyTh[i]) == fr.get().applyAsInt(du[i]) || fr.get().applyAsInt(keyTh[i]) == fr.get().applyAsInt(dv[i]))
                            ? (parent[fr.get().applyAsInt(du[i])] = fr.get().applyAsInt(dv[i])) >= 0
                            : true))
                && roomTh.entrySet().stream().allMatch(e -> fr.get().applyAsInt(e.getValue()) == fr.get().applyAsInt(roomFr.get(e.getKey())))
                && IntStream.rangeClosed(1, nmk[1]).allMatch(i -> fr.get().applyAsInt(keyTh[i]) == fr.get().applyAsInt(keyFr[i])))
                ? "YES" : "NO"
            )
        );
    }
}

