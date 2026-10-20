import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new int[m] instanceof int[] s && new int[m] instanceof int[] e
            && IntStream.range(0, m).allMatch(i -> (s[i] = it.next()) > 0 && (e[i] = s[i] + it.next() - 1) > 0)
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingInt(i -> s[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[] {0} instanceof int[] cur && new int[] {-1} instanceof int[] best && new boolean[m] instanceof boolean[] chosen
            && IntStream.concat(Arrays.stream(ord), IntStream.of(-1)).allMatch(t -> t < 0
                ? best[0] < 0 || e[best[0]] <= cur[0] || (chosen[best[0]] = true)
                : (s[t] <= cur[0] + 1
                    || ((best[0] < 0 || e[best[0]] <= cur[0] || (chosen[best[0]] = true) && (cur[0] = e[best[0]]) >= 0)
                        && (best[0] = -1) < 0 && (s[t] <= cur[0] + 1 || (cur[0] = s[t] - 1) >= 0)))
                    && (best[0] >= 0 && e[t] <= e[best[0]] || (best[0] = t) >= 0))
            ? IntStream.range(0, m).filter(i -> !chosen[i]).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.collectingAndThen(Collectors.toList(), l -> l.size() + "\n" + String.join(" ", l))) : "");
    }
}
