import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(card ->
                System.out.println(
                    IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), i + 1})
                        .filter(e -> e[0] > card[0] && e[1] > card[1])
                        .sorted(Comparator.comparingInt((int[] e) -> e[0]).thenComparing((int[] e) -> -e[1]))
                        .toArray(int[][]::new) instanceof int[][] f
                    && new int[f.length] instanceof int[] tailVal
                    && new int[f.length] instanceof int[] tailIdx
                    && new int[f.length] instanceof int[] pred
                    && new int[]{0} instanceof int[] len
                    && IntStream.range(0, f.length).allMatch(i ->
                        (Integer) Arrays.binarySearch(tailVal, 0, len[0], f[i][1]) instanceof Integer r
                        && (Integer) (r < 0 ? -r - 1 : r) instanceof Integer pos
                        && (pred[i] = pos > 0 ? tailIdx[pos - 1] : -1) >= -1
                        && (tailVal[pos] = f[i][1]) > 0
                        && (tailIdx[pos] = i) >= 0
                        && (pos < len[0] || ++len[0] > 0))
                    ? len[0] == 0
                        ? "0"
                        : Stream.iterate(tailIdx[len[0] - 1], k -> k != -1, k -> pred[k]).map(k -> f[k][2]).toList() instanceof List<Integer> chain
                            ? len[0] + "\n" + IntStream.range(0, chain.size()).map(k -> chain.get(chain.size() - 1 - k)).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                            : "0"
                    : "0"))));
    }
}


