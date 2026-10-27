import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((DoubleSupplier) () -> Double.parseDouble((String) it.next())) instanceof DoubleSupplier rd
            && Integer.valueOf((int) rd.getAsDouble()) instanceof Integer n0
            && Double.valueOf(rd.getAsDouble()) instanceof Double r
            && Stream.generate(() -> new double[]{rd.getAsDouble(), rd.getAsDouble()}).limit(n0).sorted((x, y) -> x[0] != y[0] ? Double.compare(x[0], y[0]) : Double.compare(x[1], y[1])).toList() instanceof List<double[]> raw
            && ((java.util.function.Function<List<double[]>, List<double[]>>) pts -> new ArrayList<double[]>() instanceof ArrayList<double[]> h
                && pts.stream().allMatch(pt -> Stream.generate(() -> 0).takeWhile(z -> h.size() >= 2 && (h.get(h.size() - 1)[0] - h.get(h.size() - 2)[0]) * (pt[1] - h.get(h.size() - 2)[1]) - (h.get(h.size() - 1)[1] - h.get(h.size() - 2)[1]) * (pt[0] - h.get(h.size() - 2)[0]) <= 0).allMatch(z -> h.remove(h.size() - 1) != null) && h.add(pt))
                ? h : null) instanceof java.util.function.Function<List<double[]>, List<double[]>> chain
            && chain.apply(raw) instanceof List<double[]> lower && chain.apply(raw.reversed()) instanceof List<double[]> upper
            && Stream.concat(lower.subList(0, lower.size() - 1).stream(), upper.subList(0, upper.size() - 1).stream()).toList() instanceof List<double[]> q
            && (Integer) q.size() instanceof Integer n
            && (IntStream.range(0, n).mapToDouble(i -> q.get(i)[0] * q.get((i + 1) % n)[1] - q.get((i + 1) % n)[0] * q.get(i)[1]).sum() < 0
                ? IntStream.range(0, n).mapToObj(i -> q.get(n - 1 - i)).toList() : q) instanceof List<double[]> p
            && IntStream.range(0, n).map(i -> (i + 1) % n).toArray() instanceof int[] nx
            && IntStream.range(0, n).map(i -> (i + n - 1) % n).toArray() instanceof int[] pv
            && new boolean[n] instanceof boolean[] dead
            && new int[]{n} instanceof int[] cnt
            && new ArrayDeque<Integer>(IntStream.range(0, n).boxed().toList()) instanceof ArrayDeque<Integer> dq
            && ((IntPredicate) v -> (Double) (p.get(pv[v])[0] - p.get(v)[0]) instanceof Double ax && (Double) (p.get(pv[v])[1] - p.get(v)[1]) instanceof Double ay
                && (Double) (p.get(nx[v])[0] - p.get(v)[0]) instanceof Double bx && (Double) (p.get(nx[v])[1] - p.get(v)[1]) instanceof Double by
                && ax * bx + ay * by < 0 && Math.hypot(ax, ay) * Math.hypot(bx, by) * Math.hypot(ax - bx, ay - by) >= 2 * r * Math.abs(ax * by - ay * bx) * (1 - 1e-12)) instanceof IntPredicate inside
            && Stream.generate(dq::pollLast).takeWhile(Objects::nonNull).filter(v -> !dead[v] && cnt[0] > 2 && inside.test(v))
                .allMatch(v -> (dead[v] = true) && --cnt[0] > 0 && (nx[pv[v]] = nx[v]) >= 0 && (pv[nx[v]] = pv[v]) >= 0 && dq.add(pv[v]) && dq.add(nx[v]))
            && Integer.valueOf(IntStream.range(0, n).filter(i -> !dead[i]).findFirst().getAsInt()) instanceof Integer st
            && Stream.iterate(st, v -> nx[v]).limit(cnt[0]).toList() instanceof List<Integer> hull
            ? String.format("%.10f", hull.stream().mapToDouble(v -> (p.get(v)[0] * p.get(nx[v])[1] - p.get(nx[v])[0] * p.get(v)[1]) / 2
                + r * r * (2 * Math.asin(Math.min(1, Math.hypot(p.get(nx[v])[0] - p.get(v)[0], p.get(nx[v])[1] - p.get(v)[1]) / (2 * r)))
                    - Math.sin(2 * Math.asin(Math.min(1, Math.hypot(p.get(nx[v])[0] - p.get(v)[0], p.get(nx[v])[1] - p.get(v)[1]) / (2 * r))))) / 2).sum())
            : "");
    }


}
