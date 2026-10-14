import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(card ->
                System.out.println(
                    IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), i + 1})
                        .filter(e -> e[0] > card[0] && e[1] > card[1])
                        .sorted(Comparator.comparingInt((int[] e) -> e[0]))
                        .collect(Collectors.toList()) instanceof List<int[]> filt
                    && new int[filt.size()] instanceof int[] dp
                    && new int[filt.size()] instanceof int[] pred
                    && IntStream.range(0, filt.size()).allMatch(i ->
                        IntStream.range(0, i).boxed()
                            .filter(j -> filt.get(j)[0] < filt.get(i)[0] && filt.get(j)[1] < filt.get(i)[1])
                            .max(Comparator.comparingInt(j -> dp[j])) instanceof Optional<Integer> best
                        && (dp[i] = (best.isPresent() ? dp[best.get()] : 0) + 1) == dp[i]
                        && (pred[i] = best.isPresent() ? best.get() : -1) == pred[i])
                    ? (filt.isEmpty()
                        ? "0"
                        : IntStream.range(0, filt.size()).boxed().max(Comparator.comparingInt(i -> dp[i])) instanceof Optional<Integer> bestFinal
                            ? Stream.iterate(bestFinal.get(), idx -> idx != -1, idx -> pred[idx]).map(idx -> filt.get(idx)[2]).collect(Collectors.toList()) instanceof List<Integer> chainRev
                                ? dp[bestFinal.get()] + "\n" + IntStream.range(0, chainRev.size()).map(k -> chainRev.get(chainRev.size() - 1 - k)).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                                : "0"
                            : "0")
                    : "0"
                ))));
    }
}

