import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new int[n + 1] instanceof int[] a
                && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = s.nextInt()) == a[i])
                && new int[]{s.nextInt()} instanceof int[] mArr
                && new int[mArr[0] + 1] instanceof int[] b
                && IntStream.rangeClosed(1, mArr[0]).allMatch(j -> (b[j] = s.nextInt()) == b[j])
                && new int[n * mArr[0] + 2] instanceof int[] nodeVal
                && new int[n * mArr[0] + 2] instanceof int[] nodePar
                && new int[n * mArr[0] + 2] instanceof int[] nodeLen
                && new int[mArr[0] + 1] instanceof int[] dpNode
                && new int[]{0} instanceof int[] cnt
                && IntStream.rangeClosed(1, n).allMatch(i ->
                    new int[]{0, 0} instanceof int[] best
                    && IntStream.rangeClosed(1, mArr[0]).allMatch(j ->
                        a[i] == b[j]
                            ? (best[0] + 1 > nodeLen[dpNode[j]]
                                ? (nodeVal[++cnt[0]] = b[j]) >= 0 && (nodePar[cnt[0]] = best[1]) >= 0 && (nodeLen[cnt[0]] = best[0] + 1) > 0 && (dpNode[j] = cnt[0]) > 0
                                : true)
                            : (b[j] < a[i] && nodeLen[dpNode[j]] > best[0]
                                ? (best[0] = nodeLen[dpNode[j]]) > 0 && (best[1] = dpNode[j]) > 0
                                : true)))
                && IntStream.rangeClosed(1, mArr[0]).boxed()
                    .max(Comparator.<Integer>comparingInt(j -> nodeLen[dpNode[j]]).thenComparingInt(j -> -j))
                    .orElse(0) instanceof Integer jStar
                ? jStar == 0 || nodeLen[dpNode[jStar]] == 0
                    ? "0\n"
                    : Stream.iterate(dpNode[jStar], id -> id > 0, id -> nodePar[id]).map(id -> nodeVal[id]).toList() instanceof List<Integer> ch
                        ? nodeLen[dpNode[jStar]] + "\n" + IntStream.range(0, ch.size()).mapToObj(i -> String.valueOf(ch.get(ch.size() - 1 - i))).collect(Collectors.joining(" "))
                        : ""
                : "0\n")));
    }
}



