import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.print(
                new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] nvc
                && new int[]{s.nextInt()} instanceof int[] qa
                && new boolean[nvc[0]] instanceof boolean[] occ
                && new int[qa[0]][2] instanceof int[][] cars
                && new int[]{0} instanceof int[] cnt
                && new StringBuilder() instanceof StringBuilder sb
                && IntStream.range(0, qa[0]).allMatch(qi ->
                    new int[]{s.nextInt(), s.nextInt()} instanceof int[] tv
                    && (tv[0] == 1
                        ? (IntStream.range(0, nvc[0]).boxed()
                            .flatMap(st -> IntStream.rangeClosed(st, nvc[0])
                                .filter(en -> en > st && (st == 0 || occ[st - 1]) && IntStream.range(st, en).noneMatch(k -> occ[k]) && (en == nvc[0] || occ[en]))
                                .mapToObj(en -> new int[]{st + (st == 0 ? 0 : 1), (en - st) - (st == 0 ? 0 : 1) - (en == nvc[0] ? 0 : 1)}))
                            .filter(r -> r[1] >= tv[1])
                            .collect(Collectors.toList()) instanceof List<int[]> valid
                           && (valid.isEmpty()
                                ? sb.append(-1).append('\n') instanceof StringBuilder
                                : (nvc[2] == 1
                                    ? valid.stream().min(Comparator.comparingInt((int[] r) -> r[0]))
                                    : valid.stream().max(Comparator.comparingInt((int[] r) -> r[1]).thenComparing((int[] r) -> -r[0]))
                                  ).get() instanceof int[] chosen
                                  && (cars[cnt[0]] = new int[]{chosen[0], tv[1]}) instanceof int[]
                                  && IntStream.range(chosen[0], chosen[0] + tv[1]).allMatch(k -> (occ[k] = true))
                                  && sb.append(chosen[0]).append('\n') instanceof StringBuilder))
                        : (cars[tv[1] - 1] instanceof int[] car
                            && IntStream.range(car[0], car[0] + car[1]).allMatch(k -> !(occ[k] = false))))
                    && (cnt[0] = cnt[0] + (tv[0] == 1 ? 1 : 0)) >= 0)
                ? sb.toString()
                : ""
            )
        );
    }
}
