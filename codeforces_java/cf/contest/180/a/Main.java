import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.range(0, m).boxed().flatMap(f -> IntStream.generate(rd).limit(rd.getAsInt()).boxed()).toList() instanceof List<Integer> src
            && Integer.valueOf(src.size()) instanceof Integer k
            && IntStream.rangeClosed(0, k).map(t -> t == 0 ? 0 : src.get(t - 1)).toArray() instanceof int[] tgt
            && new boolean[n + 2] instanceof boolean[] occ
            && src.stream().allMatch(c -> (occ[c] = true))
            && new boolean[n + 2] instanceof boolean[] done
            && new ArrayList<String>() instanceof ArrayList<String> ops
            && new ArrayDeque<Integer>(IntStream.rangeClosed(1, k).filter(t -> tgt[t] != t && !occ[t]).boxed().toList()) instanceof ArrayDeque<Integer> dq
            && IntStream.rangeClosed(1, k).allMatch(t -> tgt[t] != t || (done[t] = true))
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(t -> ops.add(tgt[t] + " " + t) && !(occ[tgt[t]] = false) && (occ[t] = true) && (done[t] = true)
                && (tgt[t] > k || done[tgt[t]] || tgt[tgt[t]] == tgt[t] || occ[tgt[t]] || dq.add(tgt[t])))
            && IntStream.rangeClosed(1, k).filter(c -> !done[c]).allMatch(c -> done[c] ? true : Integer.valueOf(IntStream.rangeClosed(1, n).filter(x -> !occ[x]).findFirst().getAsInt()) instanceof Integer fr
                && ops.add(c + " " + fr) && new int[]{c} instanceof int[] q
                && IntStream.iterate(0, z -> tgt[q[0]] != c, z -> z + 1).allMatch(z -> ops.add(tgt[q[0]] + " " + q[0]) && (done[q[0]] = true) && (q[0] = tgt[q[0]]) > 0)
                && ops.add(fr + " " + q[0]) && (done[q[0]] = true))
            ? ops.size() + (ops.isEmpty() ? "" : "\n" + String.join("\n", ops))
            : "");
    }
}

