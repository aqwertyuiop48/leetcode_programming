import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(Arrays.stream(a).min().getAsInt()) instanceof Integer mn
            && Integer.valueOf(IntStream.rangeClosed(1, mn).map(x -> mn - x + 1).filter(R -> Arrays.stream(a).map(v -> v - R).sum() == 0
                || Arrays.stream(a).map(v -> v - R).max().getAsInt() * 2 <= Arrays.stream(a).map(v -> v - R).sum()).findFirst().orElse(0)) instanceof Integer R
            && Arrays.stream(a).map(v -> v - R).toArray() instanceof int[] d && new StringBuilder() instanceof StringBuilder sb && new int[]{0} instanceof int[] cnt
            && IntStream.range(0, 10001).allMatch(step -> Integer.valueOf(Arrays.stream(d).sum()) instanceof Integer D && D > 0
                && IntStream.range(0, n).boxed().sorted((x, y) -> d[y] - d[x]).limit(R > 0 && D % 2 == 1 ? 3 : 2).collect(Collectors.toList()) instanceof List<Integer> ch
                && sb.append(IntStream.range(0, n).mapToObj(i -> ch.contains(i) ? "1" : "0").collect(Collectors.joining())).append('\n') != null
                && ch.stream().filter(i -> (d[i] = Math.max(0, d[i] - 1)) >= 0).count() >= 0 && ++cnt[0] > 0 || true)
            ? R + "\n" + cnt[0] + (cnt[0] > 0 ? "\n" + sb.toString().trim() : "") : "");
    }
}
