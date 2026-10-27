import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long s && Integer.valueOf(Math.min(sc.nextInt(), 40)) instanceof Integer k
            && new ArrayList<Long>(Collections.nCopies(k - 1, 0L)) instanceof ArrayList<Long> seq
            && seq.add(1L) && new long[]{1} instanceof long[] sum
            && Stream.generate(() -> sum[0]).takeWhile(next -> next <= s && seq.add(next) && (sum[0] += next - seq.get(seq.size() - 1 - k)) >= 0).count() >= 0
            && new long[]{s} instanceof long[] rem
            && seq.stream().filter(v -> v > 0).distinct().sorted(Comparator.reverseOrder()).filter(v -> v <= rem[0] && (rem[0] -= v) >= 0).sorted().toList() instanceof List<Long> picks
            ? (picks.size() == 1 ? Stream.concat(Stream.of(0L), picks.stream()).toList() : picks) instanceof List<Long> res
                ? res.size() + "\n" + res.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "" : "");
    }


}
