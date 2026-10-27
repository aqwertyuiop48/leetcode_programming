import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] m
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] v
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> m[i]).thenComparingInt(i -> v[i]).thenComparingInt(i -> i)).mapToInt(i -> i).toArray() instanceof int[] ord
            && ((DoubleFunction<IntStream>) t -> new int[]{0} instanceof int[] c ? IntStream.range(0, n).map(j -> ord[n - 1 - j]).filter(i -> c[0] < k && Math.fma((double) v[i], t, -((double) (k - c[0]) * h)) >= 0 && ++c[0] > 0) : IntStream.empty()) instanceof DoubleFunction<IntStream> pick
            && ((BiFunction<Long, Long, IntStream>) (a, b) -> new int[]{0} instanceof int[] c ? IntStream.range(0, n).map(j -> ord[n - 1 - j]).filter(i -> c[0] < k && (long) v[i] * a >= (long) (k - c[0]) * h * b && ++c[0] > 0) : IntStream.empty()) instanceof BiFunction<Long, Long, IntStream> pickQ
            && new double[]{0, 1e15} instanceof double[] range
            && IntStream.range(0, 120).allMatch(it -> pick.apply((range[0] + range[1]) / 2).count() >= k ? (range[1] = (range[0] + range[1]) / 2) >= 0 : (range[0] = (range[0] + range[1]) / 2) >= 0)
            && IntStream.range(0, n).boxed().flatMap(i -> LongStream.rangeClosed((long) Math.floor(range[1] * v[i] / h) - 1, (long) Math.floor(range[1] * v[i] / h) + 1)
                    .filter(j -> j >= 1 && j <= k && Math.abs(j * (double) h / v[i] - range[1]) <= range[1] * 1e-9).mapToObj(j -> new long[]{j * h, v[i]}))
                .sorted((x, y) -> Long.compare(x[0] * y[1], y[0] * x[1])).toArray(long[][]::new) instanceof long[][] cand
            && new int[]{0, cand.length - 1} instanceof int[] bs
            && IntStream.range(0, 40).takeWhile(z -> bs[0] < bs[1]).allMatch(z -> (Integer) ((bs[0] + bs[1]) / 2) instanceof Integer mid && (pickQ.apply(cand[mid][0], cand[mid][1]).count() >= k ? (bs[1] = mid) >= 0 : (bs[0] = mid + 1) > 0))
            ? IntStream.of((cand.length > 0 ? pickQ.apply(cand[bs[0]][0], cand[bs[0]][1]) : pick.apply(range[1])).toArray()).boxed().sorted(Comparator.comparingInt((Integer i) -> m[i]).thenComparingInt(i -> v[i]).thenComparingInt(i -> i)).map(i -> String.valueOf(i + 1)).collect(Collectors.joining(" "))
            : "");
    }
}

