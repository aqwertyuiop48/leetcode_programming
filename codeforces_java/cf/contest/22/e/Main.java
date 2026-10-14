import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt()} instanceof int[] nArr
            && new int[nArr[0] + 1] instanceof int[] f
            && IntStream.rangeClosed(1, nArr[0]).allMatch(i -> (f[i] = s.nextInt()) >= 0)
            && new int[nArr[0] + 1] instanceof int[] indeg
            && IntStream.rangeClosed(1, nArr[0]).allMatch(i -> (indeg[f[i]] += 1) >= 0)
            && new boolean[nArr[0] + 1] instanceof boolean[] isCycle
            && IntStream.rangeClosed(1, nArr[0]).allMatch(i -> (isCycle[i] = Stream.iterate(i, x -> f[x]).skip(1).limit(nArr[0]).anyMatch(x -> x == i)) || true)
            && new int[nArr[0] + 1] instanceof int[] key
            && IntStream.rangeClosed(1, nArr[0]).allMatch(i -> (key[i] = (isCycle[i] ? Stream.iterate(i, x -> f[x]).limit(nArr[0]).mapToInt(x -> x).min().getAsInt() : -1)) >= -1)
            && IntStream.rangeClosed(1, nArr[0]).filter(i -> isCycle[i]).map(i -> key[i]).distinct().toArray() instanceof int[] sinkReps
            && new boolean[sinkReps.length] instanceof boolean[] clean
            && IntStream.range(0, sinkReps.length).allMatch(idx -> (clean[idx] = IntStream.rangeClosed(1, nArr[0]).noneMatch(u -> key[f[u]] == sinkReps[idx] && key[u] != sinkReps[idx])) || true)
            && IntStream.concat(
                    IntStream.rangeClosed(1, nArr[0]).filter(i -> indeg[i] == 0),
                    IntStream.range(0, sinkReps.length).filter(idx -> clean[idx]).map(idx -> sinkReps[idx]))
                .toArray() instanceof int[] sourceArr
            ? (sourceArr.length == 0
                ? "0"
                : new int[]{Math.max(sourceArr.length, sinkReps.length)} instanceof int[] kArr
                    && IntStream.range(0, kArr[0]).mapToObj(i -> new int[]{sinkReps[i % sinkReps.length], sourceArr[(i + 1) % sourceArr.length]}).toArray(int[][]::new) instanceof int[][] edges
                ? kArr[0] + "\n" + Arrays.stream(edges).map(e -> e[0] + " " + e[1]).collect(Collectors.joining("\n"))
                : "0")
            : "0");
    }
}
