import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()}).ifPresent(knm ->
            System.out.println(
                IntStream.range(0, knm[0] * knm[1]).mapToObj(i -> sc.next()).toList() instanceof List<String> g
                && Integer.valueOf(sc.nextInt() - 1) instanceof Integer x
                && Integer.valueOf(sc.nextInt() - 1) instanceof Integer y
                && new boolean[knm[0] * knm[1] * knm[2]] instanceof boolean[] vis
                && (vis[x * knm[2] + y] = true)
                ? Stream.iterate(List.of(x * knm[2] + y), f -> !f.isEmpty(),
                    f -> f.stream().flatMap(id -> Stream.of(new int[]{1, 0, 0}, new int[]{-1, 0, 0}, new int[]{0, 1, 0}, new int[]{0, -1, 0}, new int[]{0, 0, 1}, new int[]{0, 0, -1})
                        .map(d -> new int[]{id / (knm[1] * knm[2]) + d[0], id / knm[2] % knm[1] + d[1], id % knm[2] + d[2]}))
                        .filter(p -> p[0] >= 0 && p[0] < knm[0] && p[1] >= 0 && p[1] < knm[1] && p[2] >= 0 && p[2] < knm[2]
                            && g.get(p[0] * knm[1] + p[1]).charAt(p[2]) == '.'
                            && !vis[(p[0] * knm[1] + p[1]) * knm[2] + p[2]] && (vis[(p[0] * knm[1] + p[1]) * knm[2] + p[2]] = true))
                        .map(p -> (p[0] * knm[1] + p[1]) * knm[2] + p[2]).toList()).mapToInt(List::size).sum()
                : 0)));
    }
}




