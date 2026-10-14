import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLine().trim().split("[+=]")).ifPresent(p ->
            System.out.println(
                ((BiFunction<String, int[], Stream<int[]>>) (x, q) -> q[1] == 2 ? Stream.of(new int[]{-1, 0, 2})
                    : q[0] > 0 ? Stream.concat(Stream.of(new int[]{x.charAt(q[0] - 1) - '0', q[0] - 1, 0}), IntStream.range(0, 10).mapToObj(d -> new int[]{d, q[0], 0}))
                    : Stream.concat(q[1] == 0 ? Stream.of(new int[]{-1, 0, 2}) : Stream.<int[]>empty(), IntStream.range(0, 10).mapToObj(d -> new int[]{d, 0, d == 0 ? 1 : 0}))) instanceof BiFunction<String, int[], Stream<int[]>> opts
                && new HashMap<String, String>() instanceof HashMap<String, String> memo
                && new AtomicReference<Function<int[], String>>() instanceof AtomicReference<Function<int[], String>> r
                && Boolean.valueOf(r.compareAndSet(null, st -> memo.get(Arrays.toString(st)) instanceof String m0 ? m0
                    : (st[4] == 2 && st[5] == 2 && st[6] == 2 ? (st[3] == 0 ? "+=" : "") : st[7] >= 10 ? ""
                        : opts.apply(p[0], new int[]{st[0], st[4]}).flatMap(oa -> opts.apply(p[1], new int[]{st[1], st[5]}).flatMap(ob ->
                            Integer.valueOf(Math.max(oa[0], 0) + Math.max(ob[0], 0) + st[3]) instanceof Integer sum
                            ? opts.apply(p[2], new int[]{st[2], st[6]})
                                .filter(oc -> oc[0] == sum % 10 || oc[0] < 0 && sum % 10 == 0)
                                .map(oc -> r.get().apply(new int[]{oa[1], ob[1], oc[1], sum / 10, oa[2], ob[2], oc[2], st[7] + 1}) instanceof String nx
                                    && !nx.isEmpty() && nx.split("[+=]", -1) instanceof String[] q
                                    ? q[0] + (oa[0] < 0 ? "" : oa[0]) + "+" + q[1] + (ob[0] < 0 ? "" : ob[0]) + "=" + q[2] + (oc[0] < 0 ? "" : oc[0])
                                    : "")
                            : Stream.<String>empty()))
                            .filter(z -> !z.isEmpty()).min(Comparator.comparingInt(String::length)).orElse("")) instanceof String res
                        && memo.put(Arrays.toString(st), res) == null ? res : "")) instanceof Boolean ok
                ? r.get().apply(new int[]{p[0].length(), p[1].length(), p[2].length(), 0, 0, 0, 0, 0})
                : ""));
    }
}
