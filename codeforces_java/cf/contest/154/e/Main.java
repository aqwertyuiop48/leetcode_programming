import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((DoubleSupplier) () -> Double.parseDouble((String) it.next())) instanceof DoubleSupplier rd
            && Integer.valueOf((int) rd.getAsDouble()) instanceof Integer n
            && Double.valueOf(rd.getAsDouble()) instanceof Double r
            && Stream.generate(() -> new double[]{rd.getAsDouble(), rd.getAsDouble()}).limit(n).toList() instanceof List<double[]> q
            && (IntStream.range(0, n).mapToDouble(i -> q.get(i)[0] * q.get((i + 1) % n)[1] - q.get((i + 1) % n)[0] * q.get(i)[1]).sum() < 0
                ? IntStream.range(0, n).mapToObj(i -> q.get(n - 1 - i)).toList() : q) instanceof List<double[]> p
            && IntStream.range(0, n).map(i -> (i + 1) % n).toArray() instanceof int[] nx
            && IntStream.range(0, n).map(i -> (i + n - 1) % n).toArray() instanceof int[] pv
            && new boolean[n] instanceof boolean[] dead
            && new int[]{n} instanceof int[] cnt
            && new ArrayDeque<Integer>(IntStream.range(0, n).boxed().toList()) instanceof ArrayDeque<Integer> dq
            && ((IntPredicate) v -> Double.valueOf(Math.hypot(p.get(nx[v])[0] - p.get(pv[v])[0], p.get(nx[v])[1] - p.get(pv[v])[1])) instanceof Double len
                && Double.valueOf(Math.sqrt(Math.max(0, r * r - len * len / 4)) / len) instanceof Double h
                && Math.hypot(p.get(v)[0] - (p.get(pv[v])[0] + p.get(nx[v])[0]) / 2 + h * (p.get(nx[v])[1] - p.get(pv[v])[1]),
                    p.get(v)[1] - (p.get(pv[v])[1] + p.get(nx[v])[1]) / 2 - h * (p.get(nx[v])[0] - p.get(pv[v])[0])) <= r + 1e-9) instanceof IntPredicate inside
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
