import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out)).ifPresent(out ->
        Optional.of(new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in))).ifPresent(sc ->
            Optional.of(new int[]{sc.nextInt(), sc.nextInt()}).ifPresent(nt ->
                Optional.of(IntStream.range(0, nt[0]).mapToObj(i -> IntStream.range(0, 4).map(j -> sc.nextInt()).toArray()).toArray(int[][]::new)).ifPresent(ab ->
                    Optional.of(sc.nextInt()).ifPresent(m ->
                        Optional.of(IntStream.range(0, m).mapToObj(i -> new Object[]{sc.next(), sc.nextInt()}).toArray(Object[][]::new)).ifPresent(cards ->
                            Optional.of(new ArrayDeque<>(IntStream.range(0, m).boxed().toList())).ifPresent(deck ->
                                Optional.of(new int[nt[0]][m]).ifPresent(d ->
                                    Optional.of(IntStream.range(0, nt[0]).mapToObj(i -> new ArrayList<String>()).toList()).ifPresent(res ->
                                        out.println(IntStream.iterate(0, tau -> !deck.isEmpty(), tau -> tau + 1).allMatch(tau ->
                                            Stream.iterate(nt[1], rem -> rem > 0 && !deck.isEmpty(), rem ->
                                                (Integer) deck.pollFirst() instanceof Integer k
                                                && (Integer) Math.max(1, (Integer) cards[k][1]
                                                    - ab[tau % nt[0]][2 * (tau / nt[0] % 2)] - ab[tau % nt[0]][1 + 2 * (1 - tau / nt[0] % 2)]
                                                    - d[tau % nt[0]][k]) instanceof Integer cost
                                                ? (cost <= rem
                                                    ? (res.get(tau % nt[0]).add((String) cards[k][0]) ? rem - cost : 0)
                                                    : ((d[tau % nt[0]][k] += rem) >= 0 && deck.add(k) ? 0 : 0))
                                                : 0).count() >= 0)
                                            ? res.stream().map(l -> l.size() + (l.isEmpty() ? "" : " " + String.join(" ", l))).collect(Collectors.joining("\n"))
                                            : ""))))))))));
    }
}
